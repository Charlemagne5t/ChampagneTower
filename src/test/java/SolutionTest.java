import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void champagneTowerTest1() {
        int poured = 1;
        int queryRow = 1;
        int queryGlass = 1;
        double delta = 1e-5;
        double expected = 0.00000;
        double actual = new Solution().champagneTower(poured, queryRow, queryGlass);

        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void champagneTowerTest2() {
        int poured = 2;
        int queryRow = 1;
        int queryGlass = 1;
        double delta = 1e-5;
        double expected = 0.50000;
        double actual = new Solution().champagneTower(poured, queryRow, queryGlass);

        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void champagneTowerTest3() {
        int poured = 100000009;
        int queryRow = 33;
        int queryGlass = 17;
        double delta = 1e-5;
        double expected = 1.00000;
        double actual = new Solution().champagneTower(poured, queryRow, queryGlass);

        Assert.assertEquals(expected, actual, delta);
    }

}
