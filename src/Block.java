
import java.util.Arrays;

public class Block {
    private String [] transaction;   
    private int blockHash;
    private int preBlockHash;

    public Block(String[] transaction, int preBlockHash) {
        this.transaction = transaction;
        this.preBlockHash = preBlockHash;
        this.blockHash = Arrays.hashCode(new int[] {Arrays.hashCode(transaction), this.preBlockHash});
    }
    
    

    public String[] getTransaction() {
        return transaction;
    }

    public void setTransaction(String[] transaction) {
        this.transaction = transaction;
    }

    public int getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(int blockHash) {
        this.blockHash = blockHash;
    }

    public int getPreBlockHash() {
        return preBlockHash;
    }

    public void setPreBlockHash(int preBlockHash) {
        this.preBlockHash = preBlockHash;
    }

    @Override
    public String toString() {
        return "Block{" + "transaction=" + Arrays.toString(transaction) + ", blockHash=" + blockHash + ", preBlockHash=" + preBlockHash + '}';
    }
    
    
    
}
