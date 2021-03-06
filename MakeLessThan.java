import java.util.Stack;
import java.util.ArrayList;

public class MakeLessThan extends SemanticAction
{
  public MakeLessThan(){
    type = TYPE.LESSTHAN;
  }
  
  public MakeLessThan( MakeLessThan mi ){
    branches = new ArrayList<SemanticAction>(mi.getBranches());
    
    type = mi.type;
    name = mi.name;
  }
  
  public void updateAST( Stack semanticStack, Stack nameStack ){
    if( Compiler.extendedDebug )
      System.out.println( "Pushing Less Than" );
    
    addNodes( semanticStack, 2 );
    
    semanticStack.push( this );
  }
  
  public SemanticAction copy(){
    return new MakeLessThan( this );
  }
}