package java8;



interface NewInterface {


static void hello()
{
System.out.println("Hello, this is static");
}


void overrideMethod(String str);
}


public class StaticMethodInInterface implements NewInterface {

public static void main(String[] args)
{
	StaticMethodInInterface interfaceDemo = new StaticMethodInInterface();


NewInterface.hello();


interfaceDemo.overrideMethod("Hello, this is override method");
}

// Implementing interface method

@Override
public void overrideMethod(String str)
{
System.out.println(str);
}
}
