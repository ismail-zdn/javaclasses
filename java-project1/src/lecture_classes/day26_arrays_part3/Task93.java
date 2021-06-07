package lecture_classes.day26_arrays_part3;

public class Task93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Derlenen kitapta sözlük etiketleri olduğunda kitap mobi7 formatında,
olmadığında ise KF8 formatında derleniyor. KF8 ile bir sorunumuz yok.
Ancak mobi7 olarak derlenen sözlük açıldığında Osmanlıca/Arapça kelimeler ters sırada gösteriliyor.
En sağda görünmesi gereken kelime en solda, en solda görünmesi gereken kelime en sağda.
Kindle'ı atlatabilmek için Osmanlıca kelimelerin sırasını değiştiren bir fonksiyon yazdım.
Ancak herhangi bir kitabın içinde lookup özelliği ile kelime arattığınızda
karşınıza çıkan pencere içindeki Osmanlıca kelimeler doğru sırada çıkıyor.
Sözlüğü açarsanız ters, lookup penceresini açarsanız düz sırada görüyorsunuz.
Eğer kelimelerin sırasını değiştirmişseniz tam tersi.
Yani iki yerde birden doğru gösteremiyorsunuz. Nasıl ama?
		 * */
		
//		String metin = "Derlenen kitapta sözlük etiketleri olduğunda kitap mobi7 formatında,\r\n" + 
//				"olmadığında ise KF8 formatında derleniyor. KF8 ile bir sorunumuz yok.\r\n" + 
//				"Ancak mobi7 olarak derlenen sözlük açıldığında Osmanlıca/Arapça kelimeler ters sırada gösteriliyor.\r\n" + 
//				"En sağda görünmesi gereken kelime en solda, en solda görünmesi gereken kelime en sağda.\r\n" + 
//				"Kindle'ı atlatabilmek için Osmanlıca kelimelerin sırasını değiştiren bir fonksiyon yazdım.\r\n" + 
//				"Ancak herhangi bir kitabın içinde lookup özelliği ile kelime arattığınızda\r\n" + 
//				"karşınıza çıkan pencere içindeki Osmanlıca kelimeler doğru sırada çıkıyor.\r\n" + 
//				"Sözlüğü açarsanız ters, lookup penceresini açarsanız düz sırada görüyorsunuz.\r\n" + 
//				"Eğer kelimelerin sırasını değiştirmişseniz tam tersi.\r\n" + 
//				"Yani iki yerde birden doğru gösteremiyorsunuz. Nasıl ama?";
//		
//		String[] met = metin.split(" ");
//		
//		System.out.println(met.length);
//		
//		for (String string : met) {
//			System.out.print(string +" ");
//		}
//		
//		System.out.println("---------------");
		
		String info1 ="This is your password: xxxxHGAIRAxxx";
		String info2 ="This is your password: xxxxVM$&JAxxx";
		
		String[] array1 = info1.split("password: ");
		String[] array2 = info2.split("password: ");
		
		String pass1 = array1[1].substring(4,10);
		String pass2 = array2[1].substring(4,10);
		
		System.out.println(pass1+pass2);

	}

}
