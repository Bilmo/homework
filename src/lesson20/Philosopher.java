package lesson20;

import org.h2.engine.Session;
import org.h2.index.Index;
import org.h2.index.IndexType;
import org.h2.result.Row;
import org.h2.table.IndexColumn;
import org.h2.table.Table;
import org.h2.table.TableType;

import java.util.ArrayList;
import java.util.Scanner;

public class Philosopher implements Runnable {
    private static Philosopher[] philosophers = new Philosopher[5];
    private static int counter = 1;
    private static Table table = new Table() {
        @Override
        public String getCreateSQL() {
            return null;
        }

        @Override
        public String getDropSQL() {
            return null;
        }

        @Override
        public void checkRename() {

        }

        @Override
        public boolean lock(Session session, boolean b, boolean b1) {
            return false;
        }

        @Override
        public void close(Session session) {

        }

        @Override
        public void unlock(Session session) {

        }

        @Override
        public Index addIndex(Session session, String s, int i, IndexColumn[] indexColumns, IndexType indexType, boolean b, String s1) {
            return null;
        }

        @Override
        public void removeRow(Session session, Row row) {

        }

        @Override
        public void truncate(Session session) {

        }

        @Override
        public void addRow(Session session, Row row) {

        }

        @Override
        public void checkSupportAlter() {

        }

        @Override
        public TableType getTableType() {
            return null;
        }

        @Override
        public Index getScanIndex(Session session) {
            return null;
        }

        @Override
        public Index getUniqueIndex() {
            return null;
        }

        @Override
        public ArrayList<Index> getIndexes() {
            return null;
        }

        @Override
        public boolean isLockedExclusively() {
            return false;
        }

        @Override
        public long getMaxDataModificationId() {
            return 0;
        }

        @Override
        public boolean isDeterministic() {
            return false;
        }

        @Override
        public boolean canGetRowCount() {
            return false;
        }

        @Override
        public boolean canDrop() {
            return false;
        }

        @Override
        public long getRowCount(Session session) {
            return 0;
        }

        @Override
        public long getRowCountApproximation() {
            return 0;
        }

        @Override
        public long getDiskSpaceUsed() {
            return 0;
        }
    };
    private final int phlsphrsNmbr = counter++;
    private boolean isEating;
    private Fork left;
    private Fork right;

    private Philosopher() {
    }

    public static void getStates() {
        for (Philosopher p : philosophers) {
            System.out.println(p.getState());
        }
    }

    private static int getCounter() {
        return counter;
    }

    public static Thread[] create5PhilosopherThreads() {
        if (Philosopher.getCounter() <= 5) {
            return new Thread[]{
                    new Thread(philosophers[0] = new Philosopher(), philosophers[0].getPhlsphrsNmbr() + ""),
                    new Thread(philosophers[1] = new Philosopher(), philosophers[1].getPhlsphrsNmbr() + ""),
                    new Thread(philosophers[2] = new Philosopher(), philosophers[2].getPhlsphrsNmbr() + ""),
                    new Thread(philosophers[3] = new Philosopher(), philosophers[3].getPhlsphrsNmbr() + ""),
                    new Thread(philosophers[4] = new Philosopher(), philosophers[4].getPhlsphrsNmbr() + "")};
        } else {
            return null;
        }
    }

    public int getPhlsphrsNmbr() {
        return phlsphrsNmbr;
    }

    private void toThink() {
        if (left != null && right != null) {
            left.setOnTable(true);
            right.setOnTable(true);
        }
        isEating = false;
    }

    private void tryToEat() {
        isEating = getForks();
    }

    private boolean getForks() {
        Fork[] f = table.get(this);
        if (f != null) {
            left = f[0];
            right = f[1];
            return true;
        }
        return false;
    }

    private void action() {
        if (Math.random() < 0.5) {
            tryToEat();
        } else {
            toThink();
        }
    }

    private String getState() {
        if (isEating) {
            return Thread.currentThread().getName() + " кушает ";
        } else {
            return Thread.currentThread().getName() + " думает ";
        }
    }

    @Override
    public void run() {
        Scanner s = new Scanner(System.in);
        while (true) {
            action();
            System.out.println(getState());
            s.nextLine();
        }
    }
}
