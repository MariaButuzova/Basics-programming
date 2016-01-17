package mytasks;

import java.util.*;

/**
 *
 * @author Maria
 */
abstract class TriangleTasks extends Task{
    protected int a;
    protected int b;
    protected int c;

    TriangleTasks() {
        Random random = new Random();
        a = random.nextInt(10) +1;
        b = random.nextInt(10) +1;
        c = random.nextInt(10) +1;
    }
}
