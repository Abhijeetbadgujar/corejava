package com.xworkz.overrideScammers;

import com.xworkz.override.Material;
import com.xworkz.override.Size;
import com.xworkz.override.Sock;
import com.xworkz.override.SockType;

public class SockScammer {

	public static void main(String[] args) {

		Sock sock=new Sock();
		Sock sock1=new Sock();
		Sock sock2=new Sock();
		
		System.out.println(sock.toString());
		
		System.out.println(sock.hashCode());
		
		sock.setMaterial(Material.COTTAN);
		sock1.setMaterial(Material.COTTAN);
		sock2.setMaterial(Material.COTTAN);
		sock.setSize(Size.X);
		sock1.setSize(Size.X);
		sock2.setSize(Size.X);
		sock.setType(SockType.MIDIUM);
		sock1.setType(SockType.MIDIUM);
		sock2.setType(SockType.MIDIUM);
		System.out.println(sock.equals(sock1.equals(sock2)));
		
	}

}
