package gnots.models;
// Generated 9 f�vr. 2021 09:45:32 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NotesId generated by hbm2java
 */
@Embeddable
public class NotesId  implements java.io.Serializable {


     private long idEx;
     private long idE;

    public NotesId() {
    }

    public NotesId(long idEx, long idE) {
       this.idEx = idEx;
       this.idE = idE;
    }
   


    @Column(name="ID_EX", nullable=false, precision=10, scale=0)
    public long getIdEx() {
        return this.idEx;
    }
    
    public void setIdEx(long idEx) {
        this.idEx = idEx;
    }


    @Column(name="ID_E", nullable=false, precision=10, scale=0)
    public long getIdE() {
        return this.idE;
    }
    
    public void setIdE(long idE) {
        this.idE = idE;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof NotesId) ) return false;
		 NotesId castOther = ( NotesId ) other; 
         
		 return (this.getIdEx()==castOther.getIdEx())
 && (this.getIdE()==castOther.getIdE());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getIdEx();
         result = 37 * result + (int) this.getIdE();
         return result;
   }   


}


