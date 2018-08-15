package util;

import org.jcommon.encryption.SimpleMD5;

import entity.Usuario;

public class Criptografia {

	public static void criptografar(Usuario u) {
		SimpleMD5 md5 = new SimpleMD5(u.getSenha(), "acn@gmail.com*&@#126578)(@!");
		u.setSenha(md5.toHexString());
	}

}
