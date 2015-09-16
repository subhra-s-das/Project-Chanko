package com.bmc.artestdata.qa;

import com.bmc.arsys.api.ARException;
import com.bmc.arsys.api.ARServerUser;
import com.bmc.arsys.api.Form;
import com.bmc.arsys.api.ServerInfoMap;


public class ComCompany {

	public static void main(String[] args) {

		ARConn connection = new ARConn("sudas", "bmcAdm1n", "en",
				"vl-pun-atm-dv16", 0);
		ARServerUser Connection = connection.arConnection();
		
		String serverinfo = Connection.getServerInfoStr();
		System.out.println(serverinfo);
	String serverVersion=Connection.getServerVersionPatch();
System.out.println(serverVersion);

// create form
Form form = new Form() {
};




	}

}
