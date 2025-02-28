

package ec.edu.espe.stockbill.model;

import ec.edu.espe.stockbill.model.Record;
import ec.edu.espe.stockbill.model.Voucher;
import java.util.ArrayList;

/**
 *
 * @author Lucas Gongora
 */
public class VouchersRecord extends Record{
    private static String collection="vouchers";

    
    public VouchersRecord() {
        super();
    }
    
    public ArrayList<Voucher> getVouchers(){
        return super.getDatabase().readAllData(collection, Voucher.class);
    }

    public void add(Voucher voucher) {
        super.getDatabase().insertData(collection, voucher);
    }

    public void delete(String voucherId) {
        super.getDatabase().deleteData(collection, voucherId);
    }

    public void update(String voucherId,Voucher voucher) {
        super.getDatabase().updateData(collection, voucherId, voucher);

    }
    
    
    public Voucher findVoucherById(String voucherId){
        for (Voucher voucher : this.getVouchers()) {
            if (voucher.getId().equals(voucherId)) {
                return voucher;
            }
        }
        return null;
    }
}
