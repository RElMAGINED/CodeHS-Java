public class Pyramid extends ConsoleProgram
{
    public void run()
    {
        int numBlocks = readInt("Enter the number of blocks used to build the pyramid: ");
        System.out.println("The pyramid weighs " + 2.5 * numBlocks + " tons");
    }
}
