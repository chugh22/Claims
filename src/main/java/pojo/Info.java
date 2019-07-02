package pojo;
import java.util.* ;


public class Info {
	Claim[] info ;

	public Claim[] getInfo() {
		return info;
	}

	public void setInfo(Claim[] info) {
		this.info = info;
	}
	@Override
	public String toString() {
		String s = "" ;
		for(int i = 0 ; i < info.length ; i++){
			s += info[i].id + " \n" ;
		}
		return s ;
	}
	
}
