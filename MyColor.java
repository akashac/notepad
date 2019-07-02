import javax.swing.*;
import java.awt.*;
import javax.swing.text.*;
public 	class MyColor extends DefaultStyledDocument 
{
		String java="(\\W)*(abstract|continue|for|new|switch|assert|default|goto|package|synchronized|boolean|do|if|private|this|break|double|implements|protected|throw|byte|else|import|public|throws|case|enum|instanceof|return|transient|catch|extends|int|short|try|char|final|interface|static|void|class|finally|long|strictfp|volatile|const|float|native|super|while)";
		String c="(\\W)*(auto|double|int|struct|break|else|long|switch|case|enum|register|typedef|char|extern|return|union|const|float|short|unsigned|continue|for|signed|void|default|goto|sizeof|volatile|do|if|static|while)";
		String cpp= "(\\W)*(Asm|auto|bool|break|case|catch|char|class|const_cast|continue|default|delete|do|double|else|enum|dynamic_cast|extern|false|float|for|union|unsigned|using|friend|goto|if|inline|int|long|mutable|virtual|namespace|new|operator|private|protected|public|register|void|reinterpret_cast|return|short|signed|sizeof|static|static_cast|volatile|struct|switch|template|this|throw|true|try|typedef|typeid|unsigned|wchar_t|while)";
		String Main="";
		String ext="";
		Color high,text=Color.BLACK;
		
		final StyleContext cont = StyleContext.getDefaultStyleContext();
    	public AttributeSet attr=cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground,Color.RED);
    	public AttributeSet attrBlack = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.BLACK); 
    	void setext(String e)
		{	ext=e;
			if(ext.contains(".java"))
				{	Main=java;
					//attr=cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground,Color.BLUE);
				}
	        if(ext.contains(".c"))
	        	{
	        		Main=c;
	        		//attr=cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground,Color.GREEN);
	        	}
	        if(ext.contains(".cpp"))
	        	{
	        		Main=cpp;
	        		//attr=cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground,Color.PINK);
	          	}
		}
    	void settextcol(Color A)
    	{attrBlack = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground,A);
    	}	
    	void sethighlight(Color A)
    	{
    		attr = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, A);
    	}
		
    	private int findLastNonWordChar (String text, int index) {
	        while (--index >= 0) {
	            if (String.valueOf(text.charAt(index)).matches("\\W")) {
	                break;
	            }
	        }
	        return index;
	    }
	   
	    private int findFirstNonWordChar (String text, int index) {
	        while (index < text.length()) {
	            if (String.valueOf(text.charAt(index)).matches("\\W")) {
	                break;
	            }
	            index++;
	        }
	        return index;
	    }

	    public void insertString (int offset, String str, AttributeSet a) throws BadLocationException {
	   	    	super.insertString(offset, str, a);
	        String text = getText(0, getLength());
	        int before = findLastNonWordChar(text, offset);
	        if (before < 0) before = 0;
	        int after = findFirstNonWordChar(text, offset + str.length());
	        int wordL = before;
	        int wordR = before;
	        
	        while (wordR <= after) {
	        	
	            if (wordR == after || String.valueOf(text.charAt(wordR)).matches("\\W")) {
	            	
	                if (Main.length()!=0&&text.substring(wordL, wordR).matches(Main))
	                    {
	                		//System.out.println("'"+text.charAt(wordL)+"'\t '"+text.charAt(wordR)+"'");
	                		setCharacterAttributes(wordL, wordR - wordL, attr, false);
	                    }
	                else
	                    setCharacterAttributes(wordL, wordR - wordL, attrBlack, false);
	                wordL = wordR;
	            }
	            wordR++;
	        }
	    }

	    public void remove (int offs, int len) throws BadLocationException {
	        super.remove(offs, len);

	        String text = getText(0, getLength());
	        int before = findLastNonWordChar(text, offs);
	        if (before < 0) before = 0;
	        int after = findFirstNonWordChar(text, offs);

	        if (Main.length()!=0&&text.substring(before, after).matches(Main)) {
	            setCharacterAttributes(before, after - before, attr, false);
	        } else {
	            setCharacterAttributes(before, after - before, attrBlack, false);
	        }
	    }
		
	}

