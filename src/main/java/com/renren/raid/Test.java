/**
 * 
 */
package com.renren.raid;

import java.nio.charset.CharacterCodingException;

import org.apache.hadoop.io.Text;

/**
 * @author jicheng.song
 * @since 2014年9月14日
 */
public class Test {
	public static void main(String[] args) {
		
		try {
			System.out.println(Text.encode("aaa",false).toString());
		} catch (CharacterCodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
