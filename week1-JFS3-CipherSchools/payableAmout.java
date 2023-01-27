public class payableAmout {
    public static void main(String args[]) {
        amazon customer = new amazon();
        float payableAmount = customer. Transaction( 100) ;
        
        System.out.println("Total Payable " + payableAmount);
    }
}
class amazon{
        float Transaction(float amt) {
        GPay gpay0bj = new GPay();
        float totalAmount=amt +(amt* gpay0bj.getTxnCharge());
        return totalAmount;
        }
    }
class GPay{
        private float txnCharge=0.05f;
        public void setTxnCharge(float newCharge){
            if(newCharge<=0.05f){
                System.out.println("Invaild TxnCharge");
                return;
            }
            txnCharge=newCharge;
        }
        public float getTxnCharge(){
            return txnCharge;
        }
    }

