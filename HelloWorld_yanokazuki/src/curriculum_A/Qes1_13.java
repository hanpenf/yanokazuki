package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// 問1--------------------------------------------
		
		// バイト型
		byte byteVar;
		
		// 短整数型
		short shortIntVar;
		
		// 整数型
		int intVar;
		
		// 長整数型
		long longIntVar;
		
		// 短精度浮動小数点数型
		float floatVar;
		
		// 倍精度浮動小数点数型
		double doubleVar;
		
		// 文字型
		char charVar;
		
		// 文字列型
		String stringVar;
		
		// ブーリアン型
		boolean boolVar;
		
		
		//問2--------------------------------------------
		
		// バイト型　初期値を代入
		byteVar = 0;
		
		// 短整数型　初期値を代入
		shortIntVar = 0;
		
		// 整数型　初期値を代入
		intVar = 0;
		
		// 長整数型　初期値を代入
		longIntVar = 0L;
		
		// 短精度浮動小数点数型　初期値を代入
		floatVar = 0.0F;
		
		// 倍精度浮動小数点数型　初期値を代入
		doubleVar = 0.0;
		
		// 文字型　初期値を代入
		charVar = '\u0000';
		
		// 文字列型　初期値を代入
		stringVar = null;
		
		// ブーリアン型　初期値を代入
		boolVar = false;
		
		
		// 問3--------------------------------------------
		
		// バイト型に初期値10を代入
		byteVar = 10;
		
		// 短整数型に初期値100を代入
		shortIntVar = 100;
		
		// 整数型に初期値1000を代入
		intVar = 1000;
		
		// 長整数型に初期値10000を代入
		longIntVar = 10000L;
		
		// 短精度浮動小数点数型に初期値9.5を代入
		floatVar = 9.5F;
		
		// 倍精度浮動小数点数型に初期値10.5を代入
		doubleVar = 10.5;
		
		// 文字型に初期値aを代入
		charVar = 'a';
		
		// 文字列型に初期値ハローを代入
		stringVar = "ハロー";
		
		// ブーリアン型に初期値trueを代入
		boolVar = true;
		
		
		// 問4--------------------------------------------
		
		// コンソール上に11110を表示させる
		System.out.println(longIntVar + intVar + shortIntVar + byteVar);
		
		// double型の変数sumにfloatVarとdoubleVarを足したものを代入
		double sum = floatVar + doubleVar;
		// double型の変数sumを整数intに変換し、int型の変数resultに代入
		int result = (int)sum;
		// コンソール上に20を表示させる
		System.out.println(result);
		
		// コンソール上に[a ハロー true]を表示させる
		System.out.println(charVar + stringVar + boolVar);
		
		// コンソール上に11130を表示させる
		System.out.println(longIntVar + intVar + shortIntVar + byteVar + result);
		
		// コンソール上に10000000000を表示させる
		System.out.println(longIntVar * intVar * shortIntVar * byteVar);
		
		// コンソール上に0.105を表示させる
		System.out.println(doubleVar / shortIntVar);
		
		// コンソール上に-90を表示させる
		System.out.println(byteVar - shortIntVar);
		
		
		// 問5--------------------------------------------
		//コンソール上に[ハローJAVA43]で表示させる
		
		// 文字列型numに"20"を代入
		String num="20";
		// Integer.parseInt()メソッドを使用し、文字列であるnumを整数に変換し、intValueに代入
		int intValue = Integer.parseInt(num);
		// 整数num1に23を代入
		int num1=23;
		// コンソール上に[ハローJAVA43]を表示
		System.out.println("ハローJAVA"+(intValue+num1));
		
		
		//問6--------------------------------------------
		
		// 文字列型の変数nameに山田太郎を代入
		String name = "山田太郎";
		
		// 整数型の変数ageに18を代入
		int age = 18;
		
		// 倍精度浮動小数点数型の変数heightに170.5を代入
		double height = 170.5;
		
		// 倍精度浮動小数点数型の変数weightに62.2を代入
		double weight = 62.2;
		
		// 文字列型の変数sushiに寿司を代入
		String favorite = "寿司";
		
		// コンソール上に「初めまして山田太郎です」と表示
		System.out.println("初めまして" + name + "です");
		
		// コンソール上に「年齢は18歳です」と表示
		System.out.println("年齢は" + age + "歳です");
		
		// コンソール上に「身長は170.5cmです」と表示
		System.out.println("身長は" + height + "cmです");
		
		// コンソール上に「体重は62.2kgです」と表示
		System.out.println("体重は" + weight + "kgです");
		
		// コンソール上に「好きな食べ物は寿司です」と表示
		System.out.println("好きな食べ物は" + favorite + "です");
		
		
		// 問7--------------------------------------------
		
		// 170.5cmを1.705mに変換し倍精度浮動小数点数型の変数heightInMetersに代入
		double heightInMeters = height / 100.0;
		
		// BMIの計算式：体重 / (身長m * 身長m)　計算が終わったものを倍精度浮動小数点数型の変数bmiに代入
		double bmi = weight / (heightInMeters * heightInMeters);
		
		// printfメソッドを使用し、指定したフォーマットに合わせてコンソール上に表示させる。
		// %.2fのフォーマット指定子を使い、変数bmiの小数点第1位までを表示させる
		System.out.printf("BMIは%.1fです%n", bmi);
		
		
		// 問8--------------------------------------------
		
		// 変数nameに鈴木一郎を再代入
		name = "鈴木一郎";
		
		// 変数ageに24を再代入
		age = 24;
		
		// 変数heightに168.5を再代入
		height = 168.5;
		
		// 変数weightに64.2を再代入
		weight = 64.2;
		
		// 変数favoriteにオムライスを再代入
		favorite = "オムライス";
		
		// コンソール上に「初めまして鈴木一郎です」と表示
		System.out.println("初めまして" + name + "です");
		
		// コンソール上に「年齢は24歳です」と表示
		System.out.println("年齢は" + age + "歳です");
		
		// コンソール上に「身長は168.5cmです」と表示
		System.out.println("身長は" + height + "cmです");
		
		// コンソール上に「体重は64.2kgです」と表示
		System.out.println("体重は" + weight + "kgです");
		
		// コンソール上に「好きな食べ物はオムライスです」と表示
		System.out.println("好きな食べ物は" + favorite + "です");
		
		// 168.5を1.685に変換しdouble型の変数heightInMeters1に代入
		double heightInMeters1 = height / 100.0;
		
		// BMIを計算した後、double型の変数bmi1に代入
		double bmi1 = weight / (heightInMeters1 * heightInMeters1);
		
		// 指定子に合わせたフォーマットでコンソール上に「BMIは22.6です」と表示
		System.out.printf("BMIは%.1fです%n",bmi1);
		
		
		// 問9--------------------------------------------
						
		// 変数ageに24を自己代入
		age += 24;
				
		// 変数heightに168.5を自己代入
		height += 168.5;
				
		// weightに64.2を自己代入
		weight += 64.2;
		
		// 自己代入した変数heightの337.0を3.370に変換してdouble型の変数heightInMeters2に代入
		double heightInMeters2 = height / 100.0;
		
		// BMIを計算した後、double型の変数bmi2に代入
		double bmi2 = weight / (heightInMeters2 * heightInMeters2);
		
		// コンソール上に「初めまして鈴木一郎です」と表示
		System.out.println("初めまして" + name + "です");
		
		// コンソール上に「年齢は48歳です」と表示
		System.out.println("年齢は" + age + "歳です");
		
		// コンソール上に「身長は337.0cmです」と表示
		System.out.println("身長は" + height + "cmです");
		
		// コンソール上に「体重は128.4kgです」と表示
		System.out.println("体重は" + weight + "kgです");
		
		// コンソール上に「好きな食べ物はオムライスです」と表示
		System.out.println("好きな食べ物は" + favorite + "です");
		
		// 指定子に合わせたフォーマットでコンソール上に「BMIは11.31です」と表示
		System.out.printf("BMIは%.2fです%n",bmi2);
		
		
		// 問10--------------------------------------------
		
		// 問8の値をそれぞれ再代入
		age = 24;
		height = 168.5;
		weight = 64.2;
		
		// 変数ageが25以上ならtrue、それより下ならfalseを返す。boolean型の変数over25YearsOldに代入
		boolean over25YearsOld = (age >= 25) ? true : false;
		
		// コンソール上に出力結果が25以上だったので「true」を表示
		System.out.println(over25YearsOld);
		
		
		// 問11--------------------------------------------
		
		// 整数型の変数ageを文字列型に変換しstringAgeに代入
		String stringAge = Integer.toString(age);
		
		// 倍精度浮動小数点数型の変数heightを文字列型に変換し、stringHeightに代入
		String stringHeight = Double.toString(height);
		
		// 倍精度浮動小数点数型の変数weightを文字列型に変換し、stringWeightに代入
		String stringWeight = Double.toString(weight);
		
		// コンソール上に文字列型を繋げて出力
		System.out.println(stringAge + stringHeight + stringWeight);
		
		
		// 問12--------------------------------------------
		
		// 文字列型を倍精度浮動小数点数型に変換しdoubleAgeに代入
		double doubleAge = Double.parseDouble(stringAge);
		
		// 文字列型を倍精度浮動小数点数型に変換しdoubleHeightに代入
		double doubleHeight = Double.parseDouble(stringHeight);
		
		// 倍精度浮動小数点数型を整数型に変換しintAgeに代入
		int intAge = (int) doubleAge;
		
		// 倍精度浮動小数点数型を整数型に変換しintHeightに代入
		int intHeight = (int) doubleHeight;
		
		// コンソール上に「24」を出力
		System.out.println(intAge);
		
		// コンソール上に「168」を出力
		System.out.println(intHeight);
		
		
		// 問13--------------------------------------------
		
		// 変数ageが25、または変数heightが160以上ならtrueを返す。boolean型age_heightに代入
		boolean age_height = (age == 25) || (height >= 160) ? true : false;
		
		// コンソール上に「age_height」の結果を出力
		System.out.println(age_height);
		
	}

}
