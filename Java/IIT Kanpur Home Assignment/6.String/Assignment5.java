//WAP to enter a sentence which contain some occurrence of 'cat' and 'dog'.
//Enter a cat and dog name and replace each occurrence of cat and dog in the entered sentence.
class Assignment5
{
	public static void main(String[] arg)
	{
		String s1="The dog is not a cat, & the cat is not a dog.";
		s1=s1.replaceAll("dog", "cat");
		s1=s1.replaceAll("cat", "dog");
		System.out.println(s1);
	}
}