import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		int flags = (int) Math.pow(2,Math.floor(Math.random()*14));
		boolean flag[] = new boolean[14];
		for(int i =0;i<flag.length;i++) {
			flag[i] = false;
		}
		flags=5465;
		System.out.println(flags);
		/**
		 * 1			1
		 * 2			2
		 * 4			3
		 * 8			4
		 * 16			5
		 * 32			6
		 * 64			7
		 * 128			8
		 * 256			9
		 * 512			10
		 * 1024			11
		 * 2048			12
		 * 4096			13
		 * 8192			14
		 * 16384-1 =	Maximum		
		 */
		
		if((flags-8192)>-1) {
			flags = flags - 8192;
			flag[13] = true;
		}
		if((flags-4096)>-1) {
			flags = flags - 4096;
			flag[12] = true;
		}
		if((flags-2048)>-1) {
			flags = flags - 2048;
			flag[11] = true;
		}
		if((flags-1024)>-1) {
			flags = flags - 1024;
			flag[10] = true;
		}
		if((flags-512)>-1) {
			flags = flags - 512;
			flag[9] = true;
		}
		if((flags-256)>-1) {
			flags = flags - 256;
			flag[8] = true;
		}
		if((flags-128)>-1) {
			flags = flags - 128;
			flag[7] = true;
		}
		if((flags-64)>-1) {
			flags = flags - 64;
			flag[6] = true;
		}
		if((flags-32)>-1) {
			flags = flags - 32;
			flag[5] = true;
		}
		if((flags-16)>-1) {
			flags = flags - 16;
			flag[4] = true;
		}
		if((flags-8)>-1) {
			flags = flags - 8;
			flag[3] = true;
		}
		if((flags-4)>-1) {
			flags = flags - 4;
			flag[2] = true;
		}
		if((flags-2)>-1) {
			flags = flags - 2;
			flag[1] = true;
		}
		if((flags-1)>-1) {
			flags = flags - 1;
			flag[0] = true;
		}
		//OUtput
		for(int j=0;j<flag.length;j++) {
			System.out.println(flag[j]);
		}
		System.out.println(flags);
		
		
		
		
	}
}
