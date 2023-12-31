public class tree {
    protected class Element{
        protected int Data;
        protected Element Left;
        protected Element Right;

        public Element(int data) {
            Data = data;
            Left=null;
            Right=null;
            System.out.println("EConstructor:\t" + Integer.toHexString(hashCode()));
        }
        @Override
        protected void finalize(){
            /*super.finalize();*/
            System.out.println("EDestructor: "+Integer.toHexString(hashCode()));
        }

    }
    protected Element Root;
    public Element getRoot() {
        return Root;
    }

    public tree(){
        Root=null;
        System.out.println("TConstructor: \t"+ Integer.toHexString(hashCode()));
    }
public void insert(int Data){
        insert(Data,Root);
}
    private void insert(int Data,Element Root){
        if(this.Root==null)this.Root=new Element(Data);
        if(Root==null)return;
        if(Data < Root.Data){
            if(Root.Left==null)Root.Left=new Element(Data);
            else insert(Data,Root.Left);
        }
        else {
            if(Root.Right==null)Root.Right=new Element(Data);
            else insert(Data,Root.Right);
        }
    }


    public void clear(){
        Root=null;
        System.gc();
    }

    public int sum(){
        sum(Root);
        System.out.println();
        return Root==null?0:sum(Root.Left)+ sum(Root.Right)+ Root.Data;
    }

public int sum(Element Root){
        /*if(Root==null)return 0;
        else return sum(Root.Left) + sum(Root.Right)+Root.Data;*/
    return Root==null?0:sum(Root.Left)+ sum(Root.Right)+ Root.Data;
}
public int count(){
        return count(Root);
}
private int count(Element Root){
        /*if (Root==null)return 0;
        else return count(Root.Left)+count(Root.Right)+1;*/
    return Root==null?0:count(Root.Left)+count(Root.Right)+1;
}
public double avg(){
        return avg(Root);
}
private double avg(Element Root){
        return (double)sum()/count();
}


public int minValue(){
        if(Root==null)return 0;
    return minValue(Root);
}

    private int minValue(Element Root){
        /*if(Root.Left==null)return Root.Data;
        else return minValue(Root.Left);*/

        return Root.Left==null?Root.Data:minValue(Root.Left);
    }
   public int maxValue(){
        if(Root==null) return 0;
        return maxValue(Root);
    }

    private int maxValue(Element Root){
        /*if(Root.Right==null)return Root.Data;
       else return maxValue(Root.Right);*/

        return Root.Right==null?Root.Data:maxValue(Root.Right);
    }
    public void print(){
        print(Root);
        System.out.println();
    }
    private void print(Element Root){
        if(Root==null)return;
        print(Root.Left);
        System.out.print(Root.Data + "\t");
        print(Root.Right);
    }
}
