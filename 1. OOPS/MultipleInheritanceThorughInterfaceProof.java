package com.corejava.oops;

public class MultipleInheritanceThorughInterfaceProof {

}
//Example-1--Muliple inheritance through interfaces--Working
interface IParent1{
}

interface IParent2{
}

interface IChild extends IParent1, IParent2{
}

class CChild implements IParent1, IParent2{
}

//Example-2--Multiple inheritance through classes, which is throwing error--not working
class CParent1{
}

class CParent2{
}

/*class CCChild extends CParent1, CParent2{
}

*/