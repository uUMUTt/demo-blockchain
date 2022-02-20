
import java.util.ArrayList;



public class Main {
    
    public static void main(String[] args) {
        ArrayList<Block> blockchain = new ArrayList<Block>();
        
        String [] initalValues = {"Bob has 2 bitcoin", "Alice has 1 bitcoin"};
        String [] initalValues1 = {"Bob has 0 bitcoin", "Alice has 3 bitcoin" ,"Tom has 6 bitcoin"};
        String [] initalValues2 = {"Bob has 2 bitcoin", "Alice has 6 bitcoin" ,"Tom has 1 bitcoin"};
        
        Block block1 = new Block(initalValues, 0); // First hash of previous block is zero.
        Block block2 = new Block(initalValues1, block1.getBlockHash()); 
        Block block3 = new Block(initalValues2, block2.getBlockHash()); 
        
        blockchain.add(block1);
        blockchain.add(block2);
        blockchain.add(block3);
        
        System.out.println(block1.toString());
        System.out.println(block2.toString());
        System.out.println(block3.toString());
        
        System.out.println(blockchain);
        
    } 
    
}
