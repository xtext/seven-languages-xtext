package org.xtext.scripting.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.scripting.services.ScriptingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalScriptingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'extends'", "'static'", "'extension'", "'='", "'+='", "'-='", "'||'", "'&&'", "'=='", "'!='", "'==='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..<'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "','", "'('", "')'", "'#'", "'{'", "'}'", "'['", "']'", "'|'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'&'", "'import'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=8;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=5;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int RULE_DECIMAL=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalScriptingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalScriptingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalScriptingParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g"; }



     	private ScriptingGrammarAccess grammarAccess;
     	
        public InternalScriptingParser(TokenStream input, ScriptingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Script";	
       	}
       	
       	@Override
       	protected ScriptingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleScript"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:67:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:68:2: (iv_ruleScript= ruleScript EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:69:2: iv_ruleScript= ruleScript EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScriptRule()); 
            }
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript75);
            iv_ruleScript=ruleScript();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScript; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:76:1: ruleScript returns [EObject current=null] : ( () ( ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? ) | ( (lv_imports_3_0= ruleXImportDeclaration ) ) )* ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_imports_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:79:28: ( ( () ( ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? ) | ( (lv_imports_3_0= ruleXImportDeclaration ) ) )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:80:1: ( () ( ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? ) | ( (lv_imports_3_0= ruleXImportDeclaration ) ) )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:80:1: ( () ( ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? ) | ( (lv_imports_3_0= ruleXImportDeclaration ) ) )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:80:2: () ( ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? ) | ( (lv_imports_3_0= ruleXImportDeclaration ) ) )*
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:80:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:81:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getScriptAccess().getScriptAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:86:2: ( ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? ) | ( (lv_imports_3_0= ruleXImportDeclaration ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)||(LA2_0>=14 && LA2_0<=16)||LA2_0==29||(LA2_0>=37 && LA2_0<=38)||LA2_0==43||LA2_0==49||(LA2_0>=51 && LA2_0<=52)||LA2_0==54||LA2_0==57||LA2_0==59||(LA2_0>=63 && LA2_0<=68)||(LA2_0>=70 && LA2_0<=77)) ) {
                    alt2=1;
                }
                else if ( (LA2_0==82) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:86:3: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:86:3: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:86:4: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:86:4: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:87:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:87:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:88:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScriptAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleScript142);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:104:2: (otherlv_2= ';' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==13) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:104:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleScript155); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getScriptAccess().getSemicolonKeyword_1_0_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:109:6: ( (lv_imports_3_0= ruleXImportDeclaration ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:109:6: ( (lv_imports_3_0= ruleXImportDeclaration ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:110:1: (lv_imports_3_0= ruleXImportDeclaration )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:110:1: (lv_imports_3_0= ruleXImportDeclaration )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:111:3: lv_imports_3_0= ruleXImportDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScriptAccess().getImportsXImportDeclarationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXImportDeclaration_in_ruleScript185);
            	    lv_imports_3_0=ruleXImportDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_3_0, 
            	              		"XImportDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleFeatureCallID"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:135:1: entryRuleFeatureCallID returns [String current=null] : iv_ruleFeatureCallID= ruleFeatureCallID EOF ;
    public final String entryRuleFeatureCallID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureCallID = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:136:2: (iv_ruleFeatureCallID= ruleFeatureCallID EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:137:2: iv_ruleFeatureCallID= ruleFeatureCallID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallIDRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCallID_in_entryRuleFeatureCallID224);
            iv_ruleFeatureCallID=ruleFeatureCallID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCallID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCallID235); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureCallID"


    // $ANTLR start "ruleFeatureCallID"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:144:1: ruleFeatureCallID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'extension' ) ;
    public final AntlrDatatypeRuleToken ruleFeatureCallID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:147:28: ( (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'extension' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:148:1: (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'extension' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:148:1: (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'extension' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:149:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureCallIDAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleFeatureCallID282);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:161:2: kw= 'extends'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleFeatureCallID306); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getExtendsKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:168:2: kw= 'static'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleFeatureCallID325); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getStaticKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:175:2: kw= 'extension'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleFeatureCallID344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getExtensionKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureCallID"


    // $ANTLR start "entryRuleXExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:188:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:189:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:190:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression384);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression394); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:197:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:200:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:202:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression440);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:218:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:219:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:220:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment474);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment484); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:227:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:230:28: ( ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:231:1: ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:231:1: ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt5=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==17) ) {
                    alt5=1;
                }
                else if ( (LA5_1==EOF||(LA5_1>=RULE_STRING && LA5_1<=RULE_ID)||(LA5_1>=13 && LA5_1<=16)||(LA5_1>=18 && LA5_1<=55)||(LA5_1>=57 && LA5_1<=79)||LA5_1==82) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==EOF||(LA5_2>=RULE_STRING && LA5_2<=RULE_ID)||(LA5_2>=13 && LA5_2<=16)||(LA5_2>=18 && LA5_2<=55)||(LA5_2>=57 && LA5_2<=68)||(LA5_2>=70 && LA5_2<=79)||LA5_2==82) ) {
                    alt5=2;
                }
                else if ( (LA5_2==17) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==17) ) {
                    alt5=1;
                }
                else if ( (LA5_3==EOF||(LA5_3>=RULE_STRING && LA5_3<=RULE_ID)||(LA5_3>=13 && LA5_3<=16)||(LA5_3>=18 && LA5_3<=55)||(LA5_3>=57 && LA5_3<=68)||(LA5_3>=70 && LA5_3<=79)||LA5_3==82) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4==EOF||(LA5_4>=RULE_STRING && LA5_4<=RULE_ID)||(LA5_4>=13 && LA5_4<=16)||(LA5_4>=18 && LA5_4<=55)||(LA5_4>=57 && LA5_4<=68)||(LA5_4>=70 && LA5_4<=79)||LA5_4==82) ) {
                    alt5=2;
                }
                else if ( (LA5_4==17) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 29:
            case 37:
            case 38:
            case 43:
            case 49:
            case 51:
            case 52:
            case 54:
            case 57:
            case 59:
            case 63:
            case 64:
            case 65:
            case 68:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                {
                alt5=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:231:2: ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:231:2: ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:231:3: () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:231:3: ()
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:232:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:237:2: ( ( ruleFeatureCallID ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:238:1: ( ruleFeatureCallID )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:238:1: ( ruleFeatureCallID )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:239:3: ruleFeatureCallID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXAssignment542);
                    ruleFeatureCallID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment558);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:260:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:261:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:261:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:262:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment578);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:279:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:279:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:280:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment608);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:288:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==18) ) {
                        int LA4_1 = input.LA(2);

                        if ( (synpred1_InternalScripting()) ) {
                            alt4=1;
                        }
                    }
                    else if ( (LA4_0==19) ) {
                        int LA4_2 = input.LA(2);

                        if ( (synpred1_InternalScripting()) ) {
                            alt4=1;
                        }
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:288:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:288:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:288:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:293:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:293:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:293:7: ()
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:294:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:299:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:300:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:300:1: ( ruleOpMultiAssign )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:301:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment661);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:314:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:315:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:315:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:316:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment684);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:340:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:341:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:342:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign724);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign735); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:349:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:352:28: (kw= '=' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:354:2: kw= '='
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleOpSingleAssign772); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:367:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:368:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:369:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign812);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign823); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:376:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+=' | kw= '-=' ) ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:379:28: ( (kw= '+=' | kw= '-=' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:380:1: (kw= '+=' | kw= '-=' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:380:1: (kw= '+=' | kw= '-=' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:381:2: kw= '+='
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleOpMultiAssign861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:388:2: kw= '-='
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleOpMultiAssign880); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getHyphenMinusEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:401:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:402:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:403:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression920);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression930); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:410:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:413:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:414:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:414:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:415:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression977);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:423:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred2_InternalScripting()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:423:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:423:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:423:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:428:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:428:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:428:7: ()
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:429:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:434:2: ( ( ruleOpOr ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:435:1: ( ruleOpOr )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:435:1: ( ruleOpOr )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:436:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1030);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:449:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:450:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:450:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:451:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1053);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:475:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:476:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:477:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1092);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1103); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:484:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:487:28: (kw= '||' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:489:2: kw= '||'
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpOr1140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:502:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:503:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:504:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1179);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1189); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:511:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:514:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:515:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:515:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:516:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1236);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:524:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred3_InternalScripting()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:524:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:524:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:524:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:529:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:529:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:529:7: ()
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:530:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:535:2: ( ( ruleOpAnd ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:536:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:536:1: ( ruleOpAnd )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:537:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1289);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:550:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:551:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:551:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:552:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1312);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:576:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:577:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:578:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1351);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1362); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:585:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:588:28: (kw= '&&' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:590:2: kw= '&&'
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleOpAnd1399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:603:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:604:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:605:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1438);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1448); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:612:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:615:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:616:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:616:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:617:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1495);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:625:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                switch ( input.LA(1) ) {
                case 22:
                    {
                    int LA9_2 = input.LA(2);

                    if ( (synpred4_InternalScripting()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA9_3 = input.LA(2);

                    if ( (synpred4_InternalScripting()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA9_4 = input.LA(2);

                    if ( (synpred4_InternalScripting()) ) {
                        alt9=1;
                    }


                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:625:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:625:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:625:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:630:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:630:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:630:7: ()
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:631:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:636:2: ( ( ruleOpEquality ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:637:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:637:1: ( ruleOpEquality )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:638:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1548);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:651:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:652:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:652:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:653:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1571);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:677:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:678:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:679:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1610);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1621); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:686:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '===' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:689:28: ( (kw= '==' | kw= '!=' | kw= '===' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:690:1: (kw= '==' | kw= '!=' | kw= '===' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:690:1: (kw= '==' | kw= '!=' | kw= '===' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt10=1;
                }
                break;
            case 23:
                {
                alt10=2;
                }
                break;
            case 24:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:691:2: kw= '=='
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleOpEquality1659); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:698:2: kw= '!='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpEquality1678); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:705:2: kw= '==='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpEquality1697); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:718:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:719:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:720:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1737);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression1747); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:727:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:730:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:731:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:731:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:732:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1794);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:740:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop11:
            do {
                int alt11=3;
                switch ( input.LA(1) ) {
                case 28:
                    {
                    int LA11_2 = input.LA(2);

                    if ( (synpred6_InternalScripting()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA11_3 = input.LA(2);

                    if ( (synpred6_InternalScripting()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA11_4 = input.LA(2);

                    if ( (synpred5_InternalScripting()) ) {
                        alt11=1;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA11_5 = input.LA(2);

                    if ( (synpred6_InternalScripting()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA11_6 = input.LA(2);

                    if ( (synpred6_InternalScripting()) ) {
                        alt11=2;
                    }


                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:740:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:740:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:740:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:740:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:740:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:742:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:742:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:742:6: ()
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:743:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXRelationalExpression1830); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:752:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:753:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:753:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:754:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1853);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:771:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:771:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:771:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:771:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:771:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:776:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:776:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:776:7: ()
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:777:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:782:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:783:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:783:1: ( ruleOpCompare )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:784:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1914);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:797:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:798:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:798:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:799:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1937);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:823:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:824:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:825:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare1977);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare1988); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:832:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:835:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:836:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:836:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt12=1;
                }
                break;
            case 27:
                {
                alt12=2;
                }
                break;
            case 28:
                {
                alt12=3;
                }
                break;
            case 29:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:837:2: kw= '>='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2026); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:844:2: kw= '<='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2045); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:851:2: kw= '>'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpCompare2064); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:858:2: kw= '<'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpCompare2083); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:871:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:872:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:873:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2123);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2133); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:880:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:883:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:884:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:884:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:885:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2180);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:893:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:893:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:893:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:893:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:898:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:898:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:898:7: ()
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:899:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:904:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:905:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:905:1: ( ruleOpOther )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:906:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2233);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:919:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:920:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:920:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:921:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2256);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:945:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:946:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:947:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2295);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2306); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:954:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:957:28: ( (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:958:1: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:958:1: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt16=10;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:959:2: kw= '->'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:966:2: kw= '..<'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2363); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopLessThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:972:6: (kw= '>' kw= '..' )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:972:6: (kw= '>' kw= '..' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:973:2: kw= '>' kw= '..'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2383); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_2_0()); 
                          
                    }
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2396); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_2_1()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:986:2: kw= '..'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2416); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:993:2: kw= '=>'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2435); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:999:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:999:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1000:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2455); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_0()); 
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1005:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==28) ) {
                        int LA14_1 = input.LA(2);

                        if ( (LA14_1==28) && (synpred8_InternalScripting())) {
                            alt14=1;
                        }
                        else if ( (LA14_1==EOF||(LA14_1>=RULE_STRING && LA14_1<=RULE_ID)||(LA14_1>=14 && LA14_1<=16)||LA14_1==29||(LA14_1>=37 && LA14_1<=38)||LA14_1==43||LA14_1==49||(LA14_1>=51 && LA14_1<=52)||LA14_1==54||LA14_1==57||LA14_1==59||(LA14_1>=63 && LA14_1<=65)||LA14_1==68||(LA14_1>=70 && LA14_1<=77)) ) {
                            alt14=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1005:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1005:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1005:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1009:5: (kw= '>' kw= '>' )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1010:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2486); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2499); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1023:2: kw= '>'
                            {
                            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2520); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1029:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1029:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1030:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2542); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_0()); 
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1035:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==29) ) {
                        int LA15_1 = input.LA(2);

                        if ( (synpred9_InternalScripting()) ) {
                            alt15=1;
                        }
                        else if ( (true) ) {
                            alt15=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1035:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1035:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1035:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1039:5: (kw= '<' kw= '<' )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1040:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2573); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2586); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1053:2: kw= '<'
                            {
                            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2607); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1060:2: kw= '<>'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpOther2628); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1067:2: kw= '?:'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther2647); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1074:2: kw= '<=>'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther2666); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_9()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1087:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1088:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1089:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2706);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2716); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1096:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1099:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1100:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1100:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1101:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2763);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1109:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==37) ) {
                    int LA17_2 = input.LA(2);

                    if ( (synpred10_InternalScripting()) ) {
                        alt17=1;
                    }


                }
                else if ( (LA17_0==38) ) {
                    int LA17_3 = input.LA(2);

                    if ( (synpred10_InternalScripting()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1109:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1109:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1109:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1114:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1114:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1114:7: ()
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1115:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1120:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1121:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1121:1: ( ruleOpAdd )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1122:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2816);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1135:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1136:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1136:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1137:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2839);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1161:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1162:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1163:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2878);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2889); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1170:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1173:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1174:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1174:1: (kw= '+' | kw= '-' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            else if ( (LA18_0==38) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1175:2: kw= '+'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpAdd2927); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1182:2: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpAdd2946); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1195:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1196:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1197:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2986);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2996); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1204:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1207:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1208:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1208:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1209:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3043);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1217:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop19:
            do {
                int alt19=2;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    int LA19_2 = input.LA(2);

                    if ( (synpred11_InternalScripting()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA19_3 = input.LA(2);

                    if ( (synpred11_InternalScripting()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA19_4 = input.LA(2);

                    if ( (synpred11_InternalScripting()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA19_5 = input.LA(2);

                    if ( (synpred11_InternalScripting()) ) {
                        alt19=1;
                    }


                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1217:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1217:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1217:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1222:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1222:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1222:7: ()
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1223:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1228:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1229:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1229:1: ( ruleOpMulti )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1230:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3096);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1243:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1244:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1244:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1245:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3119);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1269:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1270:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1271:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3158);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3169); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1278:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1281:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1282:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1282:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt20=1;
                }
                break;
            case 40:
                {
                alt20=2;
                }
                break;
            case 41:
                {
                alt20=3;
                }
                break;
            case 42:
                {
                alt20=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1283:2: kw= '*'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpMulti3207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1290:2: kw= '**'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpMulti3226); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1297:2: kw= '/'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpMulti3245); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1304:2: kw= '%'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpMulti3264); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1317:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1318:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1319:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3304);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3314); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1326:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1329:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1330:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1330:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=37 && LA21_0<=38)||LA21_0==43) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)||(LA21_0>=14 && LA21_0<=16)||LA21_0==29||LA21_0==49||(LA21_0>=51 && LA21_0<=52)||LA21_0==54||LA21_0==57||LA21_0==59||(LA21_0>=63 && LA21_0<=65)||LA21_0==68||(LA21_0>=70 && LA21_0<=77)) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1330:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1330:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1330:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1330:3: ()
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1331:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1336:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1337:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1337:1: ( ruleOpUnary )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1338:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3372);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1351:2: ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1352:1: (lv_operand_2_0= ruleXUnaryOperation )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1352:1: (lv_operand_2_0= ruleXUnaryOperation )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1353:3: lv_operand_2_0= ruleXUnaryOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXUnaryOperationParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXUnaryOperation3393);
                    lv_operand_2_0=ruleXUnaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XUnaryOperation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1371:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3422);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1387:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1388:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1389:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3458);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3469); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1396:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1399:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1400:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1400:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt22=1;
                }
                break;
            case 38:
                {
                alt22=2;
                }
                break;
            case 37:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1401:2: kw= '!'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpUnary3507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1408:2: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpUnary3526); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1415:2: kw= '+'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpUnary3545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1428:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1429:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1430:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3585);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3595); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1437:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1440:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1441:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1441:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1442:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3642);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1450:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==44) ) {
                    int LA23_2 = input.LA(2);

                    if ( (synpred12_InternalScripting()) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1450:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1450:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1450:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1452:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1452:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1452:6: ()
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1453:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXCastedExpression3677); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1462:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1463:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1463:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1464:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3700);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1488:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1489:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1490:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3738);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3748); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1497:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1500:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1501:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1501:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1502:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3795);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1510:1: ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop31:
            do {
                int alt31=3;
                switch ( input.LA(1) ) {
                case 45:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (synpred13_InternalScripting()) ) {
                        alt31=1;
                    }
                    else if ( (synpred14_InternalScripting()) ) {
                        alt31=2;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA31_3 = input.LA(2);

                    if ( (synpred14_InternalScripting()) ) {
                        alt31=2;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA31_4 = input.LA(2);

                    if ( (synpred14_InternalScripting()) ) {
                        alt31=2;
                    }


                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1510:2: ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1510:2: ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1510:3: ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1510:3: ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1510:4: ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1516:25: ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1516:26: () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1516:26: ()
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1517:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall3844); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1526:1: ( ( ruleFeatureCallID ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1527:1: ( ruleFeatureCallID )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1527:1: ( ruleFeatureCallID )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1528:3: ruleFeatureCallID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall3867);
            	    ruleFeatureCallID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3883);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1549:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1550:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1550:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1551:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3905);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1568:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1568:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1568:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1568:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1568:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1584:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1584:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1584:8: ()
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1585:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1590:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt24=3;
            	    switch ( input.LA(1) ) {
            	    case 45:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1590:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall3991); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1595:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1595:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1596:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1596:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1597:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall4015); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1611:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1611:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1612:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1612:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1613:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall4052); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1626:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==29) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1626:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,29,FOLLOW_29_in_ruleXMemberFeatureCall4081); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1630:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1631:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1631:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1632:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4102);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1648:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop25:
            	            do {
            	                int alt25=2;
            	                int LA25_0 = input.LA(1);

            	                if ( (LA25_0==48) ) {
            	                    alt25=1;
            	                }


            	                switch (alt25) {
            	            	case 1 :
            	            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1648:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall4115); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1652:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1653:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1653:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1654:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4136);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop25;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall4150); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1674:3: ( ( ruleFeatureCallID ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1675:1: ( ruleFeatureCallID )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1675:1: ( ruleFeatureCallID )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1676:3: ruleFeatureCallID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall4175);
            	    ruleFeatureCallID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1689:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt29=2;
            	    alt29 = dfa29.predict(input);
            	    switch (alt29) {
            	        case 1 :
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1689:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1689:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1689:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1696:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1697:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,49,FOLLOW_49_in_ruleXMemberFeatureCall4209); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1710:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt28=3;
            	            alt28 = dfa28.predict(input);
            	            switch (alt28) {
            	                case 1 :
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1710:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1710:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1710:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1727:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1728:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4294);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1745:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1745:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1745:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1745:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1746:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1746:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1747:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4322);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1763:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop27:
            	                    do {
            	                        int alt27=2;
            	                        int LA27_0 = input.LA(1);

            	                        if ( (LA27_0==48) ) {
            	                            alt27=1;
            	                        }


            	                        switch (alt27) {
            	                    	case 1 :
            	                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1763:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall4335); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1767:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1768:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1768:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1769:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4356);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop27;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,50,FOLLOW_50_in_ruleXMemberFeatureCall4373); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1789:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt30=2;
            	    alt30 = dfa30.predict(input);
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1789:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1792:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1793:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4408);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1817:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1818:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1819:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4448);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4458); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1826:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1829:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1830:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1830:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt32=13;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1831:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4505);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1841:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4532);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1851:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4559);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1861:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4586);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1871:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4613);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1881:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4640);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1891:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4667);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1901:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4694);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1911:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4721);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1921:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4748);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1931:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4775);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1941:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4802);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1951:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4829);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1967:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1968:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1969:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4864);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4874); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1976:1: ruleXLiteral returns [EObject current=null] : (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XCollectionLiteral_0 = null;

        EObject this_XClosure_1 = null;

        EObject this_XBooleanLiteral_2 = null;

        EObject this_XNumberLiteral_3 = null;

        EObject this_XNullLiteral_4 = null;

        EObject this_XStringLiteral_5 = null;

        EObject this_XTypeLiteral_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1979:28: ( (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1980:1: (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1980:1: (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral )
            int alt33=7;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==51) ) {
                alt33=1;
            }
            else if ( (LA33_0==54) && (synpred18_InternalScripting())) {
                alt33=2;
            }
            else if ( ((LA33_0>=71 && LA33_0<=72)) ) {
                alt33=3;
            }
            else if ( ((LA33_0>=RULE_HEX && LA33_0<=RULE_DECIMAL)) ) {
                alt33=4;
            }
            else if ( (LA33_0==73) ) {
                alt33=5;
            }
            else if ( (LA33_0==RULE_STRING) ) {
                alt33=6;
            }
            else if ( (LA33_0==74) ) {
                alt33=7;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1981:5: this_XCollectionLiteral_0= ruleXCollectionLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXCollectionLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCollectionLiteral_in_ruleXLiteral4921);
                    this_XCollectionLiteral_0=ruleXCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCollectionLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1990:6: ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1990:6: ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1990:7: ( ( () '[' ) )=>this_XClosure_1= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4961);
                    this_XClosure_1=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2003:5: this_XBooleanLiteral_2= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4989);
                    this_XBooleanLiteral_2=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2013:5: this_XNumberLiteral_3= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5016);
                    this_XNumberLiteral_3=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2023:5: this_XNullLiteral_4= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5043);
                    this_XNullLiteral_4=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2033:5: this_XStringLiteral_5= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5070);
                    this_XStringLiteral_5=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2043:5: this_XTypeLiteral_6= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5097);
                    this_XTypeLiteral_6=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXCollectionLiteral"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2059:1: entryRuleXCollectionLiteral returns [EObject current=null] : iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF ;
    public final EObject entryRuleXCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCollectionLiteral = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2060:2: (iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2061:2: iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCollectionLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXCollectionLiteral_in_entryRuleXCollectionLiteral5132);
            iv_ruleXCollectionLiteral=ruleXCollectionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCollectionLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCollectionLiteral5142); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCollectionLiteral"


    // $ANTLR start "ruleXCollectionLiteral"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2068:1: ruleXCollectionLiteral returns [EObject current=null] : (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral ) ;
    public final EObject ruleXCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XSetLiteral_0 = null;

        EObject this_XListLiteral_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2071:28: ( (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2072:1: (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2072:1: (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==52) ) {
                    alt34=1;
                }
                else if ( (LA34_1==54) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2073:5: this_XSetLiteral_0= ruleXSetLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXCollectionLiteralAccess().getXSetLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSetLiteral_in_ruleXCollectionLiteral5189);
                    this_XSetLiteral_0=ruleXSetLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSetLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2083:5: this_XListLiteral_1= ruleXListLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXCollectionLiteralAccess().getXListLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXListLiteral_in_ruleXCollectionLiteral5216);
                    this_XListLiteral_1=ruleXListLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XListLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCollectionLiteral"


    // $ANTLR start "entryRuleXSetLiteral"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2099:1: entryRuleXSetLiteral returns [EObject current=null] : iv_ruleXSetLiteral= ruleXSetLiteral EOF ;
    public final EObject entryRuleXSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSetLiteral = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2100:2: (iv_ruleXSetLiteral= ruleXSetLiteral EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2101:2: iv_ruleXSetLiteral= ruleXSetLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSetLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXSetLiteral_in_entryRuleXSetLiteral5251);
            iv_ruleXSetLiteral=ruleXSetLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSetLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSetLiteral5261); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSetLiteral"


    // $ANTLR start "ruleXSetLiteral"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2108:1: ruleXSetLiteral returns [EObject current=null] : ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleXSetLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2111:28: ( ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2112:1: ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2112:1: ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2112:2: () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}'
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2112:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2113:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSetLiteralAccess().getXSetLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXSetLiteral5307); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSetLiteralAccess().getNumberSignKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleXSetLiteral5319); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXSetLiteralAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2126:1: ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_ID)||(LA36_0>=14 && LA36_0<=16)||LA36_0==29||(LA36_0>=37 && LA36_0<=38)||LA36_0==43||LA36_0==49||(LA36_0>=51 && LA36_0<=52)||LA36_0==54||LA36_0==57||LA36_0==59||(LA36_0>=63 && LA36_0<=65)||LA36_0==68||(LA36_0>=70 && LA36_0<=77)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2126:2: ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2126:2: ( (lv_elements_3_0= ruleXExpression ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2127:1: (lv_elements_3_0= ruleXExpression )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2127:1: (lv_elements_3_0= ruleXExpression )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2128:3: lv_elements_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSetLiteralAccess().getElementsXExpressionParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSetLiteral5341);
                    lv_elements_3_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSetLiteralRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_3_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2144:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==48) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2144:4: otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXSetLiteral5354); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXSetLiteralAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2148:1: ( (lv_elements_5_0= ruleXExpression ) )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2149:1: (lv_elements_5_0= ruleXExpression )
                    	    {
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2149:1: (lv_elements_5_0= ruleXExpression )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2150:3: lv_elements_5_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXSetLiteralAccess().getElementsXExpressionParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXSetLiteral5375);
                    	    lv_elements_5_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXSetLiteralRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_5_0, 
                    	              		"XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,53,FOLLOW_53_in_ruleXSetLiteral5391); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXSetLiteralAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSetLiteral"


    // $ANTLR start "entryRuleXListLiteral"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2178:1: entryRuleXListLiteral returns [EObject current=null] : iv_ruleXListLiteral= ruleXListLiteral EOF ;
    public final EObject entryRuleXListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXListLiteral = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2179:2: (iv_ruleXListLiteral= ruleXListLiteral EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2180:2: iv_ruleXListLiteral= ruleXListLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXListLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXListLiteral_in_entryRuleXListLiteral5427);
            iv_ruleXListLiteral=ruleXListLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXListLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXListLiteral5437); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXListLiteral"


    // $ANTLR start "ruleXListLiteral"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2187:1: ruleXListLiteral returns [EObject current=null] : ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' ) ;
    public final EObject ruleXListLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2190:28: ( ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2191:1: ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2191:1: ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2191:2: () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']'
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2191:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2192:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXListLiteralAccess().getXListLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXListLiteral5483); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXListLiteralAccess().getNumberSignKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleXListLiteral5495); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXListLiteralAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2205:1: ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_ID)||(LA38_0>=14 && LA38_0<=16)||LA38_0==29||(LA38_0>=37 && LA38_0<=38)||LA38_0==43||LA38_0==49||(LA38_0>=51 && LA38_0<=52)||LA38_0==54||LA38_0==57||LA38_0==59||(LA38_0>=63 && LA38_0<=65)||LA38_0==68||(LA38_0>=70 && LA38_0<=77)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2205:2: ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2205:2: ( (lv_elements_3_0= ruleXExpression ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2206:1: (lv_elements_3_0= ruleXExpression )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2206:1: (lv_elements_3_0= ruleXExpression )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2207:3: lv_elements_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXListLiteralAccess().getElementsXExpressionParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXListLiteral5517);
                    lv_elements_3_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXListLiteralRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_3_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2223:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==48) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2223:4: otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXListLiteral5530); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXListLiteralAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2227:1: ( (lv_elements_5_0= ruleXExpression ) )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2228:1: (lv_elements_5_0= ruleXExpression )
                    	    {
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2228:1: (lv_elements_5_0= ruleXExpression )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2229:3: lv_elements_5_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXListLiteralAccess().getElementsXExpressionParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXListLiteral5551);
                    	    lv_elements_5_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXListLiteralRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_5_0, 
                    	              		"XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleXListLiteral5567); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXListLiteralAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXListLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2257:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2258:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2259:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5603);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5613); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2266:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2269:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2270:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2270:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2270:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2270:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2270:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2272:5: ( () otherlv_1= '[' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2272:6: () otherlv_1= '['
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2272:6: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2273:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXClosure5673); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2282:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2282:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2297:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2297:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2297:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID||LA40_0==33||LA40_0==49) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2297:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2297:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2298:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2298:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2299:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5746);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2315:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==48) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
                            	case 1 :
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2315:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleXClosure5759); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2319:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2320:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2320:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2321:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5780);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop39;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2337:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2338:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2338:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2339:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,56,FOLLOW_56_in_ruleXClosure5802); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_1_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2352:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2353:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2353:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2354:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5839);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,55,FOLLOW_55_in_ruleXClosure5851); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2382:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2383:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2384:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5887);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5897); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2391:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2394:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2395:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2395:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2395:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2395:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2396:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2401:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_ID)||(LA43_0>=14 && LA43_0<=16)||LA43_0==29||(LA43_0>=37 && LA43_0<=38)||LA43_0==43||LA43_0==49||(LA43_0>=51 && LA43_0<=52)||LA43_0==54||LA43_0==57||LA43_0==59||(LA43_0>=63 && LA43_0<=68)||(LA43_0>=70 && LA43_0<=77)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2401:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2401:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2402:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2402:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2403:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5953);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2419:2: (otherlv_2= ';' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==13) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2419:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXExpressionInClosure5966); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2431:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2432:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2433:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6006);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6016); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2440:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2443:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2444:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2444:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2444:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2444:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2444:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2460:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2460:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2460:7: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2461:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2466:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==33||LA45_0==49) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2466:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2466:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2467:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2467:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2468:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6124);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2484:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==48) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2484:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXShortClosure6137); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2488:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2489:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2489:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2490:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6158);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2506:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2507:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2507:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2508:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,56,FOLLOW_56_in_ruleXShortClosure6180); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2521:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2522:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2522:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2523:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6216);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2547:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2548:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2549:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6252);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6262); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2556:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2559:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2560:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2560:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2560:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleXParenthesizedExpression6299); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6321);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleXParenthesizedExpression6332); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2585:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2586:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2587:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6368);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6378); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2594:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2597:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2598:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2598:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2598:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2598:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2599:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXIfExpression6424); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXIfExpression6436); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2612:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2613:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2613:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2614:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6457);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleXIfExpression6469); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2634:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2635:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2635:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2636:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6490);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2652:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==58) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred22_InternalScripting()) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2652:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2652:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2652:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,58,FOLLOW_58_in_ruleXIfExpression6511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2657:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2658:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2658:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2659:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6533);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2683:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2684:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2685:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6571);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6581); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2692:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        AntlrDatatypeRuleToken lv_localVarName_6_0 = null;

        EObject lv_switch_8_0 = null;

        EObject lv_cases_11_0 = null;

        EObject lv_default_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2695:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2696:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2696:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2696:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2696:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2697:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXSwitchExpression6627); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2706:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_STRING && LA48_0<=RULE_ID)||(LA48_0>=14 && LA48_0<=16)||LA48_0==29||(LA48_0>=37 && LA48_0<=38)||LA48_0==43||(LA48_0>=51 && LA48_0<=52)||LA48_0==54||LA48_0==57||LA48_0==59||(LA48_0>=63 && LA48_0<=65)||LA48_0==68||(LA48_0>=70 && LA48_0<=77)) ) {
                alt48=1;
            }
            else if ( (LA48_0==49) ) {
                int LA48_2 = input.LA(2);

                if ( (LA48_2==RULE_ID) ) {
                    int LA48_3 = input.LA(3);

                    if ( ((LA48_3>=17 && LA48_3<=42)||(LA48_3>=44 && LA48_3<=47)||(LA48_3>=49 && LA48_3<=50)||LA48_3==54||LA48_3==69) ) {
                        alt48=1;
                    }
                    else if ( (LA48_3==60) && (synpred24_InternalScripting())) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA48_2>=RULE_STRING && LA48_2<=RULE_DECIMAL)||(LA48_2>=14 && LA48_2<=16)||LA48_2==29||(LA48_2>=37 && LA48_2<=38)||LA48_2==43||LA48_2==49||(LA48_2>=51 && LA48_2<=52)||LA48_2==54||LA48_2==57||LA48_2==59||(LA48_2>=63 && LA48_2<=65)||LA48_2==68||(LA48_2>=70 && LA48_2<=77)) ) {
                    alt48=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2706:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2706:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2706:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2706:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_ID) ) {
                        int LA47_1 = input.LA(2);

                        if ( (LA47_1==60) && (synpred23_InternalScripting())) {
                            alt47=1;
                        }
                    }
                    switch (alt47) {
                        case 1 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2706:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2711:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2711:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2711:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2712:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2712:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2713:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6670);
                            lv_localVarName_2_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"localVarName",
                                      		lv_localVarName_2_0, 
                                      		"ValidID");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleXSwitchExpression6682); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2733:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2734:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2734:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2735:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6706);
                    lv_switch_4_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_4_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2752:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2752:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2752:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2752:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2752:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2758:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2758:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression6750); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2762:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2763:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2763:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2764:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6771);
                    lv_localVarName_6_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_6_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,60,FOLLOW_60_in_ruleXSwitchExpression6783); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2784:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2785:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2785:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2786:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6806);
                    lv_switch_8_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_8_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression6818); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6832); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2810:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID||LA49_0==33||LA49_0==49||LA49_0==60||LA49_0==62) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2811:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2811:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2812:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6853);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_11_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2828:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==61) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2828:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,61,FOLLOW_61_in_ruleXSwitchExpression6867); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,60,FOLLOW_60_in_ruleXSwitchExpression6879); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2836:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2837:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2837:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2838:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6900);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_14_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6914); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2866:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2867:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2868:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6950);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6960); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2875:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2878:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2879:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2879:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2879:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2879:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||LA51_0==33||LA51_0==49) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2880:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2880:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2881:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7006);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2897:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==62) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2897:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXCasePart7020); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2901:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2902:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2902:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2903:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7041);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleXCasePart7055); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2923:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2924:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2924:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2925:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7076);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2949:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2950:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2951:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7112);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7122); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2958:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2961:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2962:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2962:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2962:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2962:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2963:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXForLoopExpression7168); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXForLoopExpression7180); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2976:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2977:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2977:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2978:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7201);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,60,FOLLOW_60_in_ruleXForLoopExpression7213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2998:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2999:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2999:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3000:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7234);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,50,FOLLOW_50_in_ruleXForLoopExpression7246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3020:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3021:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3021:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3022:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7267);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3046:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3047:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3048:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7303);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7313); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3055:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3058:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3059:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3059:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3059:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3059:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3060:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXWhileExpression7359); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXWhileExpression7371); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3073:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3074:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3074:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3075:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7392);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleXWhileExpression7404); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3095:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3096:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3096:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3097:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7425);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3121:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3122:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3123:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7461);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7471); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3130:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3133:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3134:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3134:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3134:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3134:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3135:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXDoWhileExpression7517); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3144:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3145:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3145:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3146:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7538);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,64,FOLLOW_64_in_ruleXDoWhileExpression7550); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXDoWhileExpression7562); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3170:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3171:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3171:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3172:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7583);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,50,FOLLOW_50_in_ruleXDoWhileExpression7595); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3200:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3201:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3202:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7631);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7641); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3209:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3212:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3213:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3213:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3213:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3213:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3214:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXBlockExpression7687); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3223:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_STRING && LA54_0<=RULE_ID)||(LA54_0>=14 && LA54_0<=16)||LA54_0==29||(LA54_0>=37 && LA54_0<=38)||LA54_0==43||LA54_0==49||(LA54_0>=51 && LA54_0<=52)||LA54_0==54||LA54_0==57||LA54_0==59||(LA54_0>=63 && LA54_0<=68)||(LA54_0>=70 && LA54_0<=77)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3223:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3223:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3224:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3224:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3225:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7709);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3241:2: (otherlv_3= ';' )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==13) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3241:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleXBlockExpression7722); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_4=(Token)match(input,53,FOLLOW_53_in_ruleXBlockExpression7738); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3257:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3258:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3259:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7774);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7784); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3266:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3269:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3270:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3270:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=66 && LA55_0<=67)) ) {
                alt55=1;
            }
            else if ( ((LA55_0>=RULE_STRING && LA55_0<=RULE_ID)||(LA55_0>=14 && LA55_0<=16)||LA55_0==29||(LA55_0>=37 && LA55_0<=38)||LA55_0==43||LA55_0==49||(LA55_0>=51 && LA55_0<=52)||LA55_0==54||LA55_0==57||LA55_0==59||(LA55_0>=63 && LA55_0<=65)||LA55_0==68||(LA55_0>=70 && LA55_0<=77)) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3271:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7831);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3281:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7858);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3297:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3298:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3299:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7893);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7903); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3306:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3309:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3310:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3310:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3310:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3310:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3311:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3316:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==66) ) {
                alt56=1;
            }
            else if ( (LA56_0==67) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3316:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3316:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3317:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3317:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3318:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,66,FOLLOW_66_in_ruleXVariableDeclaration7956); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3332:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleXVariableDeclaration7987); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3336:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (synpred25_InternalScripting()) ) {
                    alt57=1;
                }
                else if ( (true) ) {
                    alt57=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA57_0==49) && (synpred25_InternalScripting())) {
                alt57=1;
            }
            else if ( (LA57_0==33) && (synpred25_InternalScripting())) {
                alt57=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3336:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3336:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3336:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3344:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3344:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3344:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3345:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3345:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3346:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8035);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3362:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3363:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3363:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3364:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8056);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3381:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3381:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3382:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3382:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3383:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8085);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3399:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==17) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3399:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleXVariableDeclaration8099); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3403:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3404:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3404:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3405:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8120);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3429:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3430:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3431:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8158);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8168); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3438:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3441:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3442:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3442:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3442:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3442:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==RULE_ID||LA59_1==29||LA59_1==45||LA59_1==54) ) {
                    alt59=1;
                }
            }
            else if ( (LA59_0==33||LA59_0==49) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3443:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3443:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3444:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8214);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3460:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3461:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3461:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3462:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8236);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3486:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3487:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3488:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8272);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8282); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3495:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3498:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3499:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3499:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3499:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3499:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3500:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3500:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3501:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8328);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3517:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3518:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3518:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3519:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8349);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3543:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3544:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3545:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8385);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8395); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3552:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3555:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3556:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3556:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3556:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3556:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3557:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3562:2: ( ( ruleStaticQualifier ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==69) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3563:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3563:1: ( ruleStaticQualifier )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3564:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8452);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3577:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==29) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3577:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleXFeatureCall8466); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3581:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3582:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3582:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3583:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8487);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3599:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==48) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3599:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXFeatureCall8500); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3603:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3604:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3604:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3605:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8521);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleXFeatureCall8535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3625:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3626:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3626:1: ( ruleIdOrSuper )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3627:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8560);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3640:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3640:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3640:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3640:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3647:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3648:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,49,FOLLOW_49_in_ruleXFeatureCall8594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3661:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt64=3;
                    alt64 = dfa64.predict(input);
                    switch (alt64) {
                        case 1 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3661:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3661:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3661:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3678:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3679:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8679);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3696:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3696:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3696:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3696:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3697:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3697:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3698:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8707);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3714:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==48) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3714:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,48,FOLLOW_48_in_ruleXFeatureCall8720); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3718:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3719:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3719:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3720:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8741);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop63;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,50,FOLLOW_50_in_ruleXFeatureCall8758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3740:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3740:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3743:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3744:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8793);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3768:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3769:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3770:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8831);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8842); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3777:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FeatureCallID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3780:28: ( (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3781:1: (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3781:1: (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID||(LA67_0>=14 && LA67_0<=16)) ) {
                alt67=1;
            }
            else if ( (LA67_0==68) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3782:5: this_FeatureCallID_0= ruleFeatureCallID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getFeatureCallIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleIdOrSuper8889);
                    this_FeatureCallID_0=ruleFeatureCallID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FeatureCallID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3794:2: kw= 'super'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleIdOrSuper8913); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3807:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3808:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3809:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8954);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8965); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3816:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3819:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3820:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3820:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_ID) ) {
                    int LA68_2 = input.LA(2);

                    if ( (LA68_2==69) ) {
                        alt68=1;
                    }


                }


                switch (alt68) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3821:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier9012);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,69,FOLLOW_69_in_ruleStaticQualifier9030); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt68 >= 1 ) break loop68;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(68, input);
                        throw eee;
                }
                cnt68++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3845:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3846:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3847:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9071);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9081); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3854:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3857:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3858:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3858:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3858:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3858:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3859:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXConstructorCall9127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3868:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3869:1: ( ruleQualifiedName )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3869:1: ( ruleQualifiedName )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3870:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9150);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3883:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3883:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3883:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3883:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleXConstructorCall9171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3888:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3889:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3889:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3890:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9193);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3906:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==48) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3906:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleXConstructorCall9206); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3910:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3911:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3911:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3912:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9227);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleXConstructorCall9241); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3932:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3932:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3932:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3932:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,49,FOLLOW_49_in_ruleXConstructorCall9264); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3937:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt72=3;
                    alt72 = dfa72.predict(input);
                    switch (alt72) {
                        case 1 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3937:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3937:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3937:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3954:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3955:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9337);
                            lv_arguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3972:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3972:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3972:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3972:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3973:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3973:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3974:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9365);
                            lv_arguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3990:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( (LA71_0==48) ) {
                                    alt71=1;
                                }


                                switch (alt71) {
                            	case 1 :
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3990:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,48,FOLLOW_48_in_ruleXConstructorCall9378); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3994:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3995:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3995:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3996:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9399);
                            	    lv_arguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop71;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,50,FOLLOW_50_in_ruleXConstructorCall9416); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4016:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4016:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4019:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4020:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9451);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4044:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4045:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4046:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9488);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9498); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4053:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4056:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4057:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4057:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4057:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4057:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4058:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4063:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==71) ) {
                alt75=1;
            }
            else if ( (LA75_0==72) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4063:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXBooleanLiteral9545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4068:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4068:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4069:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4069:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4070:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,72,FOLLOW_72_in_ruleXBooleanLiteral9569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4091:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4092:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4093:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9619);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9629); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4100:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4103:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4104:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4104:1: ( () otherlv_1= 'null' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4104:2: () otherlv_1= 'null'
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4104:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4105:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXNullLiteral9675); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXNumberLiteral"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4122:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4123:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4124:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9711);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9721); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4131:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4134:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4135:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4135:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4135:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4135:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4136:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4141:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4142:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4142:1: (lv_value_1_0= ruleNumber )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4143:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9776);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Number");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4167:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4168:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4169:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9812);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9822); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4176:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4179:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4180:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4180:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4180:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4180:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4181:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4186:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4187:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4187:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4188:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9873); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4212:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4213:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4214:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9914);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9924); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4221:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arrayDimensions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4224:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4225:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4225:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4225:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')'
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4225:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4226:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXTypeLiteral9970); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXTypeLiteral9982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4239:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4240:1: ( ruleQualifiedName )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4240:1: ( ruleQualifiedName )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4241:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10005);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4254:2: ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==54) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4255:1: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4255:1: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4256:3: lv_arrayDimensions_4_0= ruleArrayBrackets
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getArrayDimensionsArrayBracketsParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArrayBrackets_in_ruleXTypeLiteral10026);
            	    lv_arrayDimensions_4_0=ruleArrayBrackets();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXTypeLiteralRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"arrayDimensions",
            	              		lv_arrayDimensions_4_0, 
            	              		"ArrayBrackets");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            otherlv_5=(Token)match(input,50,FOLLOW_50_in_ruleXTypeLiteral10039); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4284:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4285:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4286:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10075);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10085); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4293:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4296:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4297:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4297:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4297:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4297:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4298:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXThrowExpression10131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4307:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4308:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4308:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4309:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10152);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4333:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4334:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4335:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10188);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10198); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4342:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4345:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4346:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4346:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4346:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4346:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4347:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleXReturnExpression10244); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4356:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt77=2;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4356:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4361:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4362:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10275);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4386:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4387:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4388:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10312);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10322); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4395:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4398:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4399:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4399:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4399:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4399:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4400:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleXTryCatchFinallyExpression10368); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4409:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4410:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4410:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4411:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10389);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4427:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==79) ) {
                alt80=1;
            }
            else if ( (LA80_0==78) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4427:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4427:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4427:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4427:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt78=0;
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==79) ) {
                            int LA78_2 = input.LA(2);

                            if ( (synpred34_InternalScripting()) ) {
                                alt78=1;
                            }


                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4427:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4429:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4430:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10419);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt78 >= 1 ) break loop78;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(78, input);
                                throw eee;
                        }
                        cnt78++;
                    } while (true);

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4446:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==78) ) {
                        int LA79_1 = input.LA(2);

                        if ( (synpred35_InternalScripting()) ) {
                            alt79=1;
                        }
                    }
                    switch (alt79) {
                        case 1 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4446:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4446:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4446:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,78,FOLLOW_78_in_ruleXTryCatchFinallyExpression10441); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4451:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4452:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4452:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4453:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10463);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4470:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4470:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4470:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,78,FOLLOW_78_in_ruleXTryCatchFinallyExpression10485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4474:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4475:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4475:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4476:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10506);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4500:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4501:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4502:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10544);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10554); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4509:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4512:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4513:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4513:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4513:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4513:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4513:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleXCatchClause10599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXCatchClause10612); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4522:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4523:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4523:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4524:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10633);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleXCatchClause10645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4544:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4545:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4545:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4546:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10666);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4570:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4571:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4572:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10703);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10714); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4579:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4582:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4583:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4583:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4584:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10761);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4594:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==45) ) {
                    int LA81_2 = input.LA(2);

                    if ( (LA81_2==RULE_ID) ) {
                        int LA81_3 = input.LA(3);

                        if ( (synpred37_InternalScripting()) ) {
                            alt81=1;
                        }


                    }


                }


                switch (alt81) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4594:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4594:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4594:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,45,FOLLOW_45_in_ruleQualifiedName10789); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10812);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleNumber"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4621:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4625:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4626:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10866);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10877); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4636:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4640:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4641:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4641:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_HEX) ) {
                alt85=1;
            }
            else if ( ((LA85_0>=RULE_INT && LA85_0<=RULE_DECIMAL)) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4641:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4649:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4649:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4649:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4649:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==RULE_INT) ) {
                        alt82=1;
                    }
                    else if ( (LA82_0==RULE_DECIMAL) ) {
                        alt82=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 0, input);

                        throw nvae;
                    }
                    switch (alt82) {
                        case 1 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4649:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10949); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4657:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10975); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4664:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==45) ) {
                        int LA84_1 = input.LA(2);

                        if ( ((LA84_1>=RULE_INT && LA84_1<=RULE_DECIMAL)) ) {
                            alt84=1;
                        }
                    }
                    switch (alt84) {
                        case 1 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4665:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,45,FOLLOW_45_in_ruleNumber10995); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4670:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt83=2;
                            int LA83_0 = input.LA(1);

                            if ( (LA83_0==RULE_INT) ) {
                                alt83=1;
                            }
                            else if ( (LA83_0==RULE_DECIMAL) ) {
                                alt83=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 83, 0, input);

                                throw nvae;
                            }
                            switch (alt83) {
                                case 1 :
                                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4670:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11011); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4678:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11037); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_DECIMAL_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4696:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4697:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4698:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11090);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference11100); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4705:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4708:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4709:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4709:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_ID) ) {
                alt87=1;
            }
            else if ( (LA87_0==33||LA87_0==49) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4709:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4709:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4710:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11148);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4718:1: ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==54) ) {
                            int LA86_2 = input.LA(2);

                            if ( (LA86_2==55) ) {
                                int LA86_3 = input.LA(3);

                                if ( (synpred38_InternalScripting()) ) {
                                    alt86=1;
                                }


                            }


                        }


                        switch (alt86) {
                    	case 1 :
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4718:2: ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets )
                    	    {
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4719:24: ( () ruleArrayBrackets )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4719:25: () ruleArrayBrackets
                    	    {
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4719:25: ()
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4720:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getArrayBracketsParserRuleCall_0_1_0_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleArrayBrackets_in_ruleJvmTypeReference11184);
                    	    ruleArrayBrackets();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4735:5: this_XFunctionTypeRef_3= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11215);
                    this_XFunctionTypeRef_3=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleArrayBrackets"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4751:1: entryRuleArrayBrackets returns [String current=null] : iv_ruleArrayBrackets= ruleArrayBrackets EOF ;
    public final String entryRuleArrayBrackets() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayBrackets = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4752:2: (iv_ruleArrayBrackets= ruleArrayBrackets EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4753:2: iv_ruleArrayBrackets= ruleArrayBrackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayBracketsRule()); 
            }
            pushFollow(FOLLOW_ruleArrayBrackets_in_entryRuleArrayBrackets11251);
            iv_ruleArrayBrackets=ruleArrayBrackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayBrackets.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayBrackets11262); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayBrackets"


    // $ANTLR start "ruleArrayBrackets"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4760:1: ruleArrayBrackets returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleArrayBrackets() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4763:28: ( (kw= '[' kw= ']' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4764:1: (kw= '[' kw= ']' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4764:1: (kw= '[' kw= ']' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4765:2: kw= '[' kw= ']'
            {
            kw=(Token)match(input,54,FOLLOW_54_in_ruleArrayBrackets11300); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0()); 
                  
            }
            kw=(Token)match(input,55,FOLLOW_55_in_ruleArrayBrackets11313); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getRightSquareBracketKeyword_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayBrackets"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4784:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4785:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4786:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11353);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11363); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4793:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4796:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4797:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4797:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4797:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4797:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==49) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4797:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleXFunctionTypeRef11401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4801:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==RULE_ID||LA89_0==33||LA89_0==49) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4801:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4801:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4802:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4802:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4803:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11423);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"paramTypes",
                                      		lv_paramTypes_1_0, 
                                      		"JvmTypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4819:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop88:
                            do {
                                int alt88=2;
                                int LA88_0 = input.LA(1);

                                if ( (LA88_0==48) ) {
                                    alt88=1;
                                }


                                switch (alt88) {
                            	case 1 :
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4819:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXFunctionTypeRef11436); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4823:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4824:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4824:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4825:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11457);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"paramTypes",
                            	              		lv_paramTypes_3_0, 
                            	              		"JvmTypeReference");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop88;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleXFunctionTypeRef11473); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleXFunctionTypeRef11487); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4849:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4850:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4850:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4851:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11508);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4875:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4876:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4877:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11544);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11554); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4884:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4887:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4888:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4888:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4888:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4888:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4889:1: ( ruleQualifiedName )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4889:1: ( ruleQualifiedName )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4890:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11602);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4903:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt92=2;
            alt92 = dfa92.predict(input);
            switch (alt92) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4903:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4903:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4903:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleJvmParameterizedTypeReference11623); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4908:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4909:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4909:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4910:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11645);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4926:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==48) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4926:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleJvmParameterizedTypeReference11658); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4930:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4931:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4931:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4932:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11679);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleJvmParameterizedTypeReference11693); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4960:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4961:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4962:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11731);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11741); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4969:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4972:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4973:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4973:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_ID||LA93_0==33||LA93_0==49) ) {
                alt93=1;
            }
            else if ( (LA93_0==80) ) {
                alt93=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4974:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11788);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4984:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11815);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5000:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5001:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5002:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11850);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11860); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5009:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5012:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5013:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5013:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5013:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5013:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5014:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleJvmWildcardTypeReference11906); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5023:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt94=3;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==14) ) {
                alt94=1;
            }
            else if ( (LA94_0==68) ) {
                alt94=2;
            }
            switch (alt94) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5023:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5023:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5024:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5024:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5025:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11928);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5042:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5042:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5043:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5043:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5044:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11955);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5068:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5069:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5070:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11993);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound12003); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5077:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5080:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5081:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5081:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5081:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleJvmUpperBound12040); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5085:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5086:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5086:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5087:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12061);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5111:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5112:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5113:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12097);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12107); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5120:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5123:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5124:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5124:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5124:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleJvmUpperBoundAnded12144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5128:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5129:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5129:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5130:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12165);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5154:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5155:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5156:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12201);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12211); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5163:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5166:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5167:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5167:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5167:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleJvmLowerBound12248); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5171:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5172:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5172:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5173:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12269);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5199:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5200:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5201:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard12308);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard12319); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5208:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5211:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5212:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5212:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5213:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard12366);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,45,FOLLOW_45_in_ruleQualifiedNameWithWildcard12384); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
                  
            }
            kw=(Token)match(input,39,FOLLOW_39_in_ruleQualifiedNameWithWildcard12397); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleValidID"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5243:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5244:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5245:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12438);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12449); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5252:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5255:28: (this_ID_0= RULE_ID )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5256:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12488); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleXImportDeclaration"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5273:1: entryRuleXImportDeclaration returns [EObject current=null] : iv_ruleXImportDeclaration= ruleXImportDeclaration EOF ;
    public final EObject entryRuleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImportDeclaration = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5274:2: (iv_ruleXImportDeclaration= ruleXImportDeclaration EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5275:2: iv_ruleXImportDeclaration= ruleXImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXImportDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXImportDeclaration_in_entryRuleXImportDeclaration12534);
            iv_ruleXImportDeclaration=ruleXImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImportDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXImportDeclaration12544); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXImportDeclaration"


    // $ANTLR start "ruleXImportDeclaration"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5282:1: ruleXImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) ;
    public final EObject ruleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_static_1_0=null;
        Token lv_extension_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_importedNamespace_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5285:28: ( (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5286:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5286:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5286:3: otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )?
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleXImportDeclaration12581); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXImportDeclarationAccess().getImportKeyword_0());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5290:1: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )
            int alt96=3;
            alt96 = dfa96.predict(input);
            switch (alt96) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5290:2: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5290:2: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5290:3: ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*'
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5290:3: ( (lv_static_1_0= 'static' ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5291:1: (lv_static_1_0= 'static' )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5291:1: (lv_static_1_0= 'static' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5292:3: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,15,FOLLOW_15_in_ruleXImportDeclaration12601); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_1_0, grammarAccess.getXImportDeclarationAccess().getStaticStaticKeyword_1_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5305:2: ( (lv_extension_2_0= 'extension' ) )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==16) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5306:1: (lv_extension_2_0= 'extension' )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5306:1: (lv_extension_2_0= 'extension' )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5307:3: lv_extension_2_0= 'extension'
                            {
                            lv_extension_2_0=(Token)match(input,16,FOLLOW_16_in_ruleXImportDeclaration12632); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_extension_2_0, grammarAccess.getXImportDeclarationAccess().getExtensionExtensionKeyword_1_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                              	        }
                                     		setWithLastConsumed(current, "extension", true, "extension");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5320:3: ( ( ruleQualifiedName ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5321:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5321:1: ( ruleQualifiedName )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5322:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration12669);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXImportDeclaration12681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXImportDeclarationAccess().getFullStopKeyword_1_0_3());
                          
                    }
                    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleXImportDeclaration12693); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXImportDeclarationAccess().getAsteriskKeyword_1_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5344:6: ( ( ruleQualifiedName ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5344:6: ( ( ruleQualifiedName ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5345:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5345:1: ( ruleQualifiedName )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5346:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration12723);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5360:6: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5360:6: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5361:1: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5361:1: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5362:3: lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleXImportDeclaration12750);
                    lv_importedNamespace_7_0=ruleQualifiedNameWithWildcard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXImportDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"importedNamespace",
                              		lv_importedNamespace_7_0, 
                              		"QualifiedNameWithWildcard");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5378:3: (otherlv_8= ';' )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==13) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5378:5: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleXImportDeclaration12764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXImportDeclaration"

    // $ANTLR start synpred1_InternalScripting
    public final void synpred1_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:288:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:288:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:288:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:288:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:288:5: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:289:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:289:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:290:1: ( ruleOpMultiAssign )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:290:1: ( ruleOpMultiAssign )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:291:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalScripting629);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalScripting

    // $ANTLR start synpred2_InternalScripting
    public final void synpred2_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:423:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:423:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:423:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:423:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:423:5: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:424:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:424:2: ( ( ruleOpOr ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:425:1: ( ruleOpOr )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:425:1: ( ruleOpOr )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:426:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalScripting998);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalScripting

    // $ANTLR start synpred3_InternalScripting
    public final void synpred3_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:524:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:524:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:524:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:524:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:524:5: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:525:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:525:2: ( ( ruleOpAnd ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:526:1: ( ruleOpAnd )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:526:1: ( ruleOpAnd )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:527:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalScripting1257);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalScripting

    // $ANTLR start synpred4_InternalScripting
    public final void synpred4_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:625:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:625:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:625:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:625:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:625:5: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:626:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:626:2: ( ( ruleOpEquality ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:627:1: ( ruleOpEquality )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:627:1: ( ruleOpEquality )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:628:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalScripting1516);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalScripting

    // $ANTLR start synpred5_InternalScripting
    public final void synpred5_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:740:4: ( ( () 'instanceof' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:740:5: ( () 'instanceof' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:740:5: ( () 'instanceof' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:740:6: () 'instanceof'
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:740:6: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:741:1: 
        {
        }

        match(input,25,FOLLOW_25_in_synpred5_InternalScripting1811); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalScripting

    // $ANTLR start synpred6_InternalScripting
    public final void synpred6_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:771:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:771:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:771:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:771:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:771:10: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:772:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:772:2: ( ( ruleOpCompare ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:773:1: ( ruleOpCompare )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:773:1: ( ruleOpCompare )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:774:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalScripting1882);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalScripting

    // $ANTLR start synpred7_InternalScripting
    public final void synpred7_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:893:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:893:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:893:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:893:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:893:5: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:894:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:894:2: ( ( ruleOpOther ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:895:1: ( ruleOpOther )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:895:1: ( ruleOpOther )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:896:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalScripting2201);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalScripting

    // $ANTLR start synpred8_InternalScripting
    public final void synpred8_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1005:3: ( ( '>' '>' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1005:4: ( '>' '>' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1005:4: ( '>' '>' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1006:2: '>' '>'
        {
        match(input,28,FOLLOW_28_in_synpred8_InternalScripting2470); if (state.failed) return ;
        match(input,28,FOLLOW_28_in_synpred8_InternalScripting2475); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalScripting

    // $ANTLR start synpred9_InternalScripting
    public final void synpred9_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1035:3: ( ( '<' '<' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1035:4: ( '<' '<' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1035:4: ( '<' '<' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1036:2: '<' '<'
        {
        match(input,29,FOLLOW_29_in_synpred9_InternalScripting2557); if (state.failed) return ;
        match(input,29,FOLLOW_29_in_synpred9_InternalScripting2562); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalScripting

    // $ANTLR start synpred10_InternalScripting
    public final void synpred10_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1109:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1109:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1109:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1109:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1109:5: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1110:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1110:2: ( ( ruleOpAdd ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1111:1: ( ruleOpAdd )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1111:1: ( ruleOpAdd )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1112:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalScripting2784);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalScripting

    // $ANTLR start synpred11_InternalScripting
    public final void synpred11_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1217:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1217:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1217:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1217:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1217:5: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1218:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1218:2: ( ( ruleOpMulti ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1219:1: ( ruleOpMulti )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1219:1: ( ruleOpMulti )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1220:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalScripting3064);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalScripting

    // $ANTLR start synpred12_InternalScripting
    public final void synpred12_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1450:3: ( ( () 'as' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1450:4: ( () 'as' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1450:4: ( () 'as' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1450:5: () 'as'
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1450:5: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1451:1: 
        {
        }

        match(input,44,FOLLOW_44_in_synpred12_InternalScripting3658); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalScripting

    // $ANTLR start synpred13_InternalScripting
    public final void synpred13_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1510:4: ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1510:5: ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1510:5: ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1510:6: () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1510:6: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1511:1: 
        {
        }

        match(input,45,FOLLOW_45_in_synpred13_InternalScripting3812); if (state.failed) return ;
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1512:1: ( ( ruleFeatureCallID ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1513:1: ( ruleFeatureCallID )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1513:1: ( ruleFeatureCallID )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1514:3: ruleFeatureCallID
        {
        pushFollow(FOLLOW_ruleFeatureCallID_in_synpred13_InternalScripting3821);
        ruleFeatureCallID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalScripting3827);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalScripting

    // $ANTLR start synpred14_InternalScripting
    public final void synpred14_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1568:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1568:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1568:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1568:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1568:10: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1569:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1569:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt98=3;
        switch ( input.LA(1) ) {
        case 45:
            {
            alt98=1;
            }
            break;
        case 46:
            {
            alt98=2;
            }
            break;
        case 47:
            {
            alt98=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 98, 0, input);

            throw nvae;
        }

        switch (alt98) {
            case 1 :
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1569:4: '.'
                {
                match(input,45,FOLLOW_45_in_synpred14_InternalScripting3930); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1571:6: ( ( '?.' ) )
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1571:6: ( ( '?.' ) )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1572:1: ( '?.' )
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1572:1: ( '?.' )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1573:2: '?.'
                {
                match(input,46,FOLLOW_46_in_synpred14_InternalScripting3944); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1578:6: ( ( '*.' ) )
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1578:6: ( ( '*.' ) )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1579:1: ( '*.' )
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1579:1: ( '*.' )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1580:2: '*.'
                {
                match(input,47,FOLLOW_47_in_synpred14_InternalScripting3964); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalScripting

    // $ANTLR start synpred15_InternalScripting
    public final void synpred15_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1689:4: ( ( '(' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1690:1: ( '(' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1690:1: ( '(' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1691:2: '('
        {
        match(input,49,FOLLOW_49_in_synpred15_InternalScripting4191); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalScripting

    // $ANTLR start synpred16_InternalScripting
    public final void synpred16_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1710:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1710:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1710:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1710:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1710:6: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1711:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1711:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt100=2;
        int LA100_0 = input.LA(1);

        if ( (LA100_0==RULE_ID||LA100_0==33||LA100_0==49) ) {
            alt100=1;
        }
        switch (alt100) {
            case 1 :
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1711:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1711:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1712:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1712:1: ( ruleJvmFormalParameter )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1713:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalScripting4243);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1715:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop99:
                do {
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==48) ) {
                        alt99=1;
                    }


                    switch (alt99) {
                	case 1 :
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1715:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,48,FOLLOW_48_in_synpred16_InternalScripting4250); if (state.failed) return ;
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1716:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1717:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1717:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1718:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalScripting4257);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop99;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1720:6: ( ( '|' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1721:1: ( '|' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1721:1: ( '|' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1722:2: '|'
        {
        match(input,56,FOLLOW_56_in_synpred16_InternalScripting4271); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalScripting

    // $ANTLR start synpred17_InternalScripting
    public final void synpred17_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1789:4: ( ( () '[' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1789:5: ( () '[' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1789:5: ( () '[' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1789:6: () '['
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1789:6: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1790:1: 
        {
        }

        match(input,54,FOLLOW_54_in_synpred17_InternalScripting4391); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalScripting

    // $ANTLR start synpred18_InternalScripting
    public final void synpred18_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1990:7: ( ( () '[' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1990:8: ( () '[' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1990:8: ( () '[' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1990:9: () '['
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1990:9: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1991:1: 
        {
        }

        match(input,54,FOLLOW_54_in_synpred18_InternalScripting4942); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalScripting

    // $ANTLR start synpred20_InternalScripting
    public final void synpred20_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2282:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2282:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2282:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2282:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2282:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt102=2;
        int LA102_0 = input.LA(1);

        if ( (LA102_0==RULE_ID||LA102_0==33||LA102_0==49) ) {
            alt102=1;
        }
        switch (alt102) {
            case 1 :
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2282:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2282:7: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2283:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2283:1: ( ruleJvmFormalParameter )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2284:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalScripting5692);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2286:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop101:
                do {
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==48) ) {
                        alt101=1;
                    }


                    switch (alt101) {
                	case 1 :
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2286:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,48,FOLLOW_48_in_synpred20_InternalScripting5699); if (state.failed) return ;
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2287:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2288:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2288:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2289:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalScripting5706);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop101;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2291:6: ( ( '|' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2292:1: ( '|' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2292:1: ( '|' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2293:2: '|'
        {
        match(input,56,FOLLOW_56_in_synpred20_InternalScripting5720); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalScripting

    // $ANTLR start synpred22_InternalScripting
    public final void synpred22_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2652:4: ( 'else' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2652:6: 'else'
        {
        match(input,58,FOLLOW_58_in_synpred22_InternalScripting6503); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalScripting

    // $ANTLR start synpred23_InternalScripting
    public final void synpred23_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2706:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2706:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2706:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2706:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2706:6: ( ( ruleValidID ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2707:1: ( ruleValidID )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2707:1: ( ruleValidID )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2708:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalScripting6645);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,60,FOLLOW_60_in_synpred23_InternalScripting6651); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalScripting

    // $ANTLR start synpred24_InternalScripting
    public final void synpred24_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2752:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2752:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2752:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2752:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,49,FOLLOW_49_in_synpred24_InternalScripting6727); if (state.failed) return ;
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2753:1: ( ( ruleValidID ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2754:1: ( ruleValidID )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2754:1: ( ruleValidID )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2755:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalScripting6734);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,60,FOLLOW_60_in_synpred24_InternalScripting6740); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalScripting

    // $ANTLR start synpred25_InternalScripting
    public final void synpred25_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3336:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3336:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3336:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3336:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3336:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3337:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3337:1: ( ruleJvmTypeReference )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3338:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalScripting8005);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3340:2: ( ( ruleValidID ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3341:1: ( ruleValidID )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3341:1: ( ruleValidID )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3342:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalScripting8014);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalScripting

    // $ANTLR start synpred26_InternalScripting
    public final void synpred26_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3640:4: ( ( '(' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3641:1: ( '(' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3641:1: ( '(' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3642:2: '('
        {
        match(input,49,FOLLOW_49_in_synpred26_InternalScripting8576); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalScripting

    // $ANTLR start synpred27_InternalScripting
    public final void synpred27_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3661:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3661:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3661:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3661:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3661:6: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3662:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3662:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt106=2;
        int LA106_0 = input.LA(1);

        if ( (LA106_0==RULE_ID||LA106_0==33||LA106_0==49) ) {
            alt106=1;
        }
        switch (alt106) {
            case 1 :
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3662:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3662:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3663:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3663:1: ( ruleJvmFormalParameter )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3664:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalScripting8628);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3666:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop105:
                do {
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==48) ) {
                        alt105=1;
                    }


                    switch (alt105) {
                	case 1 :
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3666:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,48,FOLLOW_48_in_synpred27_InternalScripting8635); if (state.failed) return ;
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3667:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3668:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3668:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3669:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalScripting8642);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop105;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3671:6: ( ( '|' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3672:1: ( '|' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3672:1: ( '|' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3673:2: '|'
        {
        match(input,56,FOLLOW_56_in_synpred27_InternalScripting8656); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalScripting

    // $ANTLR start synpred28_InternalScripting
    public final void synpred28_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3740:4: ( ( () '[' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3740:5: ( () '[' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3740:5: ( () '[' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3740:6: () '['
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3740:6: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3741:1: 
        {
        }

        match(input,54,FOLLOW_54_in_synpred28_InternalScripting8776); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalScripting

    // $ANTLR start synpred29_InternalScripting
    public final void synpred29_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3883:4: ( '<' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3883:6: '<'
        {
        match(input,29,FOLLOW_29_in_synpred29_InternalScripting9163); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalScripting

    // $ANTLR start synpred30_InternalScripting
    public final void synpred30_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3932:5: ( '(' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3932:7: '('
        {
        match(input,49,FOLLOW_49_in_synpred30_InternalScripting9256); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalScripting

    // $ANTLR start synpred31_InternalScripting
    public final void synpred31_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3937:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3937:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3937:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3937:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3937:6: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3938:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3938:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt108=2;
        int LA108_0 = input.LA(1);

        if ( (LA108_0==RULE_ID||LA108_0==33||LA108_0==49) ) {
            alt108=1;
        }
        switch (alt108) {
            case 1 :
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3938:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3938:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3939:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3939:1: ( ruleJvmFormalParameter )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3940:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalScripting9286);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3942:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop107:
                do {
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==48) ) {
                        alt107=1;
                    }


                    switch (alt107) {
                	case 1 :
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3942:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,48,FOLLOW_48_in_synpred31_InternalScripting9293); if (state.failed) return ;
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3943:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3944:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3944:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3945:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalScripting9300);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop107;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3947:6: ( ( '|' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3948:1: ( '|' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3948:1: ( '|' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3949:2: '|'
        {
        match(input,56,FOLLOW_56_in_synpred31_InternalScripting9314); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalScripting

    // $ANTLR start synpred32_InternalScripting
    public final void synpred32_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4016:4: ( ( () '[' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4016:5: ( () '[' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4016:5: ( () '[' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4016:6: () '['
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4016:6: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4017:1: 
        {
        }

        match(input,54,FOLLOW_54_in_synpred32_InternalScripting9434); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalScripting

    // $ANTLR start synpred33_InternalScripting
    public final void synpred33_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4356:2: ( ( ruleXExpression ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4357:1: ( ruleXExpression )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4357:1: ( ruleXExpression )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4358:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalScripting10258);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalScripting

    // $ANTLR start synpred34_InternalScripting
    public final void synpred34_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4427:5: ( 'catch' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4427:7: 'catch'
        {
        match(input,79,FOLLOW_79_in_synpred34_InternalScripting10403); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalScripting

    // $ANTLR start synpred35_InternalScripting
    public final void synpred35_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4446:5: ( 'finally' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4446:7: 'finally'
        {
        match(input,78,FOLLOW_78_in_synpred35_InternalScripting10433); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalScripting

    // $ANTLR start synpred37_InternalScripting
    public final void synpred37_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4594:3: ( '.' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4595:2: '.'
        {
        match(input,45,FOLLOW_45_in_synpred37_InternalScripting10780); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalScripting

    // $ANTLR start synpred38_InternalScripting
    public final void synpred38_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4718:2: ( ( () ruleArrayBrackets ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4718:3: ( () ruleArrayBrackets )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4718:3: ( () ruleArrayBrackets )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4718:4: () ruleArrayBrackets
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4718:4: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4719:1: 
        {
        }

        pushFollow(FOLLOW_ruleArrayBrackets_in_synpred38_InternalScripting11163);
        ruleArrayBrackets();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalScripting

    // $ANTLR start synpred39_InternalScripting
    public final void synpred39_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4903:4: ( '<' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4903:6: '<'
        {
        match(input,29,FOLLOW_29_in_synpred39_InternalScripting11615); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalScripting

    // Delegated rules

    public final boolean synpred10_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalScripting() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalScripting_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA92 dfa92 = new DFA92(this);
    protected DFA96 dfa96 = new DFA96(this);
    static final String DFA13_eotS =
        "\14\uffff";
    static final String DFA13_eofS =
        "\1\1\13\uffff";
    static final String DFA13_minS =
        "\1\4\1\uffff\11\0\1\uffff";
    static final String DFA13_maxS =
        "\1\122\1\uffff\11\0\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA13_specialS =
        "\2\uffff\1\6\1\5\1\2\1\4\1\10\1\1\1\0\1\3\1\7\1\uffff}>";
    static final String[] DFA13_transitionS = {
            "\5\1\4\uffff\4\1\1\uffff\12\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\23\1\1\uffff\14\1\1\uffff\12\1\2\uffff\1\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "()* loopback of 893:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_8 = input.LA(1);

                         
                        int index13_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalScripting()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_7 = input.LA(1);

                         
                        int index13_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalScripting()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_4 = input.LA(1);

                         
                        int index13_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalScripting()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_9 = input.LA(1);

                         
                        int index13_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalScripting()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_5 = input.LA(1);

                         
                        int index13_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalScripting()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_3 = input.LA(1);

                         
                        int index13_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalScripting()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_2 = input.LA(1);

                         
                        int index13_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalScripting()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_2);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_10 = input.LA(1);

                         
                        int index13_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalScripting()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_10);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA13_6 = input.LA(1);

                         
                        int index13_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalScripting()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA16_eotS =
        "\14\uffff";
    static final String DFA16_eofS =
        "\14\uffff";
    static final String DFA16_minS =
        "\1\34\2\uffff\1\34\10\uffff";
    static final String DFA16_maxS =
        "\1\44\2\uffff\1\40\10\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\7\1\10\1\11\1\12\1\6\1\3";
    static final String DFA16_specialS =
        "\14\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\3\1\6\1\1\1\2\1\4\1\5\1\7\1\10\1\11",
            "",
            "",
            "\1\12\3\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "958:1: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )";
        }
    }
    static final String DFA29_eotS =
        "\111\uffff";
    static final String DFA29_eofS =
        "\1\2\110\uffff";
    static final String DFA29_minS =
        "\1\4\1\0\107\uffff";
    static final String DFA29_maxS =
        "\1\122\1\0\107\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\2\105\uffff\1\1";
    static final String DFA29_specialS =
        "\1\uffff\1\0\107\uffff}>";
    static final String[] DFA29_transitionS = {
            "\5\2\4\uffff\4\2\1\uffff\37\2\1\1\6\2\1\uffff\14\2\1\uffff\12"+
            "\2\2\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1689:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\42\uffff";
    static final String DFA28_eofS =
        "\42\uffff";
    static final String DFA28_minS =
        "\1\4\2\0\37\uffff";
    static final String DFA28_maxS =
        "\1\115\2\0\37\uffff";
    static final String DFA28_acceptS =
        "\3\uffff\2\1\1\2\33\uffff\1\3";
    static final String DFA28_specialS =
        "\1\0\1\1\1\2\37\uffff}>";
    static final String[] DFA28_transitionS = {
            "\4\5\1\1\5\uffff\3\5\14\uffff\1\5\3\uffff\1\3\3\uffff\2\5\4"+
            "\uffff\1\5\5\uffff\1\2\1\41\2\5\1\uffff\1\5\1\uffff\1\4\1\5"+
            "\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1710:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_0 = input.LA(1);

                         
                        int index28_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA28_0==RULE_ID) ) {s = 1;}

                        else if ( (LA28_0==49) ) {s = 2;}

                        else if ( (LA28_0==33) && (synpred16_InternalScripting())) {s = 3;}

                        else if ( (LA28_0==56) && (synpred16_InternalScripting())) {s = 4;}

                        else if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_DECIMAL)||(LA28_0>=14 && LA28_0<=16)||LA28_0==29||(LA28_0>=37 && LA28_0<=38)||LA28_0==43||(LA28_0>=51 && LA28_0<=52)||LA28_0==54||LA28_0==57||LA28_0==59||(LA28_0>=63 && LA28_0<=65)||LA28_0==68||(LA28_0>=70 && LA28_0<=77)) ) {s = 5;}

                        else if ( (LA28_0==50) ) {s = 33;}

                         
                        input.seek(index28_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalScripting()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_2 = input.LA(1);

                         
                        int index28_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalScripting()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index28_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA30_eotS =
        "\111\uffff";
    static final String DFA30_eofS =
        "\1\2\110\uffff";
    static final String DFA30_minS =
        "\1\4\1\0\107\uffff";
    static final String DFA30_maxS =
        "\1\122\1\0\107\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\105\uffff\1\1";
    static final String DFA30_specialS =
        "\1\uffff\1\0\107\uffff}>";
    static final String[] DFA30_transitionS = {
            "\5\2\4\uffff\4\2\1\uffff\44\2\1\1\1\2\1\uffff\14\2\1\uffff\12"+
            "\2\2\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1789:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA32_eotS =
        "\16\uffff";
    static final String DFA32_eofS =
        "\16\uffff";
    static final String DFA32_minS =
        "\1\4\15\uffff";
    static final String DFA32_maxS =
        "\1\115\15\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA32_specialS =
        "\16\uffff}>";
    static final String[] DFA32_transitionS = {
            "\4\5\1\4\5\uffff\3\4\14\uffff\1\4\23\uffff\1\15\1\uffff\1\5"+
            "\1\2\1\uffff\1\5\2\uffff\1\6\1\uffff\1\3\3\uffff\1\7\1\10\1"+
            "\11\2\uffff\1\4\1\uffff\1\1\4\5\1\12\1\13\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "1830:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA41_eotS =
        "\44\uffff";
    static final String DFA41_eofS =
        "\44\uffff";
    static final String DFA41_minS =
        "\1\4\2\0\41\uffff";
    static final String DFA41_maxS =
        "\1\115\2\0\41\uffff";
    static final String DFA41_acceptS =
        "\3\uffff\2\1\1\2\36\uffff";
    static final String DFA41_specialS =
        "\1\0\1\1\1\2\41\uffff}>";
    static final String[] DFA41_transitionS = {
            "\4\5\1\1\5\uffff\3\5\14\uffff\1\5\3\uffff\1\3\3\uffff\2\5\4"+
            "\uffff\1\5\5\uffff\1\2\1\uffff\2\5\1\uffff\2\5\1\4\1\5\1\uffff"+
            "\1\5\3\uffff\6\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "2282:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_0 = input.LA(1);

                         
                        int index41_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA41_0==RULE_ID) ) {s = 1;}

                        else if ( (LA41_0==49) ) {s = 2;}

                        else if ( (LA41_0==33) && (synpred20_InternalScripting())) {s = 3;}

                        else if ( (LA41_0==56) && (synpred20_InternalScripting())) {s = 4;}

                        else if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_DECIMAL)||(LA41_0>=14 && LA41_0<=16)||LA41_0==29||(LA41_0>=37 && LA41_0<=38)||LA41_0==43||(LA41_0>=51 && LA41_0<=52)||(LA41_0>=54 && LA41_0<=55)||LA41_0==57||LA41_0==59||(LA41_0>=63 && LA41_0<=68)||(LA41_0>=70 && LA41_0<=77)) ) {s = 5;}

                         
                        input.seek(index41_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_1 = input.LA(1);

                         
                        int index41_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalScripting()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index41_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA41_2 = input.LA(1);

                         
                        int index41_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalScripting()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index41_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\111\uffff";
    static final String DFA65_eofS =
        "\1\2\110\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\107\uffff";
    static final String DFA65_maxS =
        "\1\122\1\0\107\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\105\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\107\uffff}>";
    static final String[] DFA65_transitionS = {
            "\5\2\4\uffff\4\2\1\uffff\37\2\1\1\6\2\1\uffff\14\2\1\uffff\12"+
            "\2\2\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "3640:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\42\uffff";
    static final String DFA64_eofS =
        "\42\uffff";
    static final String DFA64_minS =
        "\1\4\2\0\37\uffff";
    static final String DFA64_maxS =
        "\1\115\2\0\37\uffff";
    static final String DFA64_acceptS =
        "\3\uffff\2\1\1\2\33\uffff\1\3";
    static final String DFA64_specialS =
        "\1\0\1\1\1\2\37\uffff}>";
    static final String[] DFA64_transitionS = {
            "\4\5\1\1\5\uffff\3\5\14\uffff\1\5\3\uffff\1\3\3\uffff\2\5\4"+
            "\uffff\1\5\5\uffff\1\2\1\41\2\5\1\uffff\1\5\1\uffff\1\4\1\5"+
            "\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "3661:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_0 = input.LA(1);

                         
                        int index64_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA64_0==RULE_ID) ) {s = 1;}

                        else if ( (LA64_0==49) ) {s = 2;}

                        else if ( (LA64_0==33) && (synpred27_InternalScripting())) {s = 3;}

                        else if ( (LA64_0==56) && (synpred27_InternalScripting())) {s = 4;}

                        else if ( ((LA64_0>=RULE_STRING && LA64_0<=RULE_DECIMAL)||(LA64_0>=14 && LA64_0<=16)||LA64_0==29||(LA64_0>=37 && LA64_0<=38)||LA64_0==43||(LA64_0>=51 && LA64_0<=52)||LA64_0==54||LA64_0==57||LA64_0==59||(LA64_0>=63 && LA64_0<=65)||LA64_0==68||(LA64_0>=70 && LA64_0<=77)) ) {s = 5;}

                        else if ( (LA64_0==50) ) {s = 33;}

                         
                        input.seek(index64_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalScripting()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalScripting()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA66_eotS =
        "\111\uffff";
    static final String DFA66_eofS =
        "\1\2\110\uffff";
    static final String DFA66_minS =
        "\1\4\1\0\107\uffff";
    static final String DFA66_maxS =
        "\1\122\1\0\107\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\105\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\107\uffff}>";
    static final String[] DFA66_transitionS = {
            "\5\2\4\uffff\4\2\1\uffff\44\2\1\1\1\2\1\uffff\14\2\1\uffff\12"+
            "\2\2\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "3740:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA70_eotS =
        "\111\uffff";
    static final String DFA70_eofS =
        "\1\2\110\uffff";
    static final String DFA70_minS =
        "\1\4\1\0\107\uffff";
    static final String DFA70_maxS =
        "\1\122\1\0\107\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\105\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\107\uffff}>";
    static final String[] DFA70_transitionS = {
            "\5\2\4\uffff\4\2\1\uffff\13\2\1\1\32\2\1\uffff\14\2\1\uffff"+
            "\12\2\2\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "3883:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA73_eotS =
        "\111\uffff";
    static final String DFA73_eofS =
        "\1\2\110\uffff";
    static final String DFA73_minS =
        "\1\4\1\0\107\uffff";
    static final String DFA73_maxS =
        "\1\122\1\0\107\uffff";
    static final String DFA73_acceptS =
        "\2\uffff\1\2\105\uffff\1\1";
    static final String DFA73_specialS =
        "\1\uffff\1\0\107\uffff}>";
    static final String[] DFA73_transitionS = {
            "\5\2\4\uffff\4\2\1\uffff\37\2\1\1\6\2\1\uffff\14\2\1\uffff\12"+
            "\2\2\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "3932:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA72_eotS =
        "\42\uffff";
    static final String DFA72_eofS =
        "\42\uffff";
    static final String DFA72_minS =
        "\1\4\2\0\37\uffff";
    static final String DFA72_maxS =
        "\1\115\2\0\37\uffff";
    static final String DFA72_acceptS =
        "\3\uffff\2\1\1\2\33\uffff\1\3";
    static final String DFA72_specialS =
        "\1\0\1\1\1\2\37\uffff}>";
    static final String[] DFA72_transitionS = {
            "\4\5\1\1\5\uffff\3\5\14\uffff\1\5\3\uffff\1\3\3\uffff\2\5\4"+
            "\uffff\1\5\5\uffff\1\2\1\41\2\5\1\uffff\1\5\1\uffff\1\4\1\5"+
            "\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "3937:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_0 = input.LA(1);

                         
                        int index72_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA72_0==RULE_ID) ) {s = 1;}

                        else if ( (LA72_0==49) ) {s = 2;}

                        else if ( (LA72_0==33) && (synpred31_InternalScripting())) {s = 3;}

                        else if ( (LA72_0==56) && (synpred31_InternalScripting())) {s = 4;}

                        else if ( ((LA72_0>=RULE_STRING && LA72_0<=RULE_DECIMAL)||(LA72_0>=14 && LA72_0<=16)||LA72_0==29||(LA72_0>=37 && LA72_0<=38)||LA72_0==43||(LA72_0>=51 && LA72_0<=52)||LA72_0==54||LA72_0==57||LA72_0==59||(LA72_0>=63 && LA72_0<=65)||LA72_0==68||(LA72_0>=70 && LA72_0<=77)) ) {s = 5;}

                        else if ( (LA72_0==50) ) {s = 33;}

                         
                        input.seek(index72_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalScripting()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA72_2 = input.LA(1);

                         
                        int index72_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalScripting()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index72_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA74_eotS =
        "\111\uffff";
    static final String DFA74_eofS =
        "\1\2\110\uffff";
    static final String DFA74_minS =
        "\1\4\1\0\107\uffff";
    static final String DFA74_maxS =
        "\1\122\1\0\107\uffff";
    static final String DFA74_acceptS =
        "\2\uffff\1\2\105\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\107\uffff}>";
    static final String[] DFA74_transitionS = {
            "\5\2\4\uffff\4\2\1\uffff\44\2\1\1\1\2\1\uffff\14\2\1\uffff\12"+
            "\2\2\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "4016:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_1 = input.LA(1);

                         
                        int index74_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA77_eotS =
        "\111\uffff";
    static final String DFA77_eofS =
        "\1\37\110\uffff";
    static final String DFA77_minS =
        "\1\4\36\0\52\uffff";
    static final String DFA77_maxS =
        "\1\122\36\0\52\uffff";
    static final String DFA77_acceptS =
        "\37\uffff\1\2\50\uffff\1\1";
    static final String DFA77_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34\1\35\52\uffff}>";
    static final String[] DFA77_transitionS = {
            "\1\25\1\21\1\22\1\23\1\1\4\uffff\1\37\1\2\1\3\1\4\1\uffff\13"+
            "\37\1\13\7\37\1\7\1\6\4\37\1\5\5\37\1\36\1\37\1\15\1\11\1\37"+
            "\1\16\1\37\1\uffff\1\27\1\37\1\12\3\37\1\30\1\31\1\32\2\37\1"+
            "\14\1\uffff\1\10\1\17\1\20\1\24\1\26\1\33\1\34\1\35\2\37\2\uffff"+
            "\1\37",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
    static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
    static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
    static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
    static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
    static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
    static final short[][] DFA77_transition;

    static {
        int numStates = DFA77_transitionS.length;
        DFA77_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
        }
    }

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = DFA77_eot;
            this.eof = DFA77_eof;
            this.min = DFA77_min;
            this.max = DFA77_max;
            this.accept = DFA77_accept;
            this.special = DFA77_special;
            this.transition = DFA77_transition;
        }
        public String getDescription() {
            return "4356:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA77_1 = input.LA(1);

                         
                        int index77_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA77_2 = input.LA(1);

                         
                        int index77_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA77_3 = input.LA(1);

                         
                        int index77_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA77_4 = input.LA(1);

                         
                        int index77_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA77_5 = input.LA(1);

                         
                        int index77_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA77_6 = input.LA(1);

                         
                        int index77_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA77_7 = input.LA(1);

                         
                        int index77_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA77_8 = input.LA(1);

                         
                        int index77_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA77_9 = input.LA(1);

                         
                        int index77_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA77_10 = input.LA(1);

                         
                        int index77_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA77_11 = input.LA(1);

                         
                        int index77_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA77_12 = input.LA(1);

                         
                        int index77_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA77_13 = input.LA(1);

                         
                        int index77_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA77_14 = input.LA(1);

                         
                        int index77_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA77_15 = input.LA(1);

                         
                        int index77_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA77_16 = input.LA(1);

                         
                        int index77_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA77_17 = input.LA(1);

                         
                        int index77_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA77_18 = input.LA(1);

                         
                        int index77_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA77_19 = input.LA(1);

                         
                        int index77_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA77_20 = input.LA(1);

                         
                        int index77_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA77_21 = input.LA(1);

                         
                        int index77_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA77_22 = input.LA(1);

                         
                        int index77_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA77_23 = input.LA(1);

                         
                        int index77_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA77_24 = input.LA(1);

                         
                        int index77_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA77_25 = input.LA(1);

                         
                        int index77_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA77_26 = input.LA(1);

                         
                        int index77_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA77_27 = input.LA(1);

                         
                        int index77_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA77_28 = input.LA(1);

                         
                        int index77_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA77_29 = input.LA(1);

                         
                        int index77_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA77_30 = input.LA(1);

                         
                        int index77_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index77_30);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 77, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA92_eotS =
        "\111\uffff";
    static final String DFA92_eofS =
        "\1\2\110\uffff";
    static final String DFA92_minS =
        "\1\4\1\0\107\uffff";
    static final String DFA92_maxS =
        "\1\122\1\0\107\uffff";
    static final String DFA92_acceptS =
        "\2\uffff\1\2\105\uffff\1\1";
    static final String DFA92_specialS =
        "\1\uffff\1\0\107\uffff}>";
    static final String[] DFA92_transitionS = {
            "\5\2\4\uffff\4\2\1\uffff\13\2\1\1\32\2\1\uffff\14\2\1\uffff"+
            "\12\2\2\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA92_eot = DFA.unpackEncodedString(DFA92_eotS);
    static final short[] DFA92_eof = DFA.unpackEncodedString(DFA92_eofS);
    static final char[] DFA92_min = DFA.unpackEncodedStringToUnsignedChars(DFA92_minS);
    static final char[] DFA92_max = DFA.unpackEncodedStringToUnsignedChars(DFA92_maxS);
    static final short[] DFA92_accept = DFA.unpackEncodedString(DFA92_acceptS);
    static final short[] DFA92_special = DFA.unpackEncodedString(DFA92_specialS);
    static final short[][] DFA92_transition;

    static {
        int numStates = DFA92_transitionS.length;
        DFA92_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA92_transition[i] = DFA.unpackEncodedString(DFA92_transitionS[i]);
        }
    }

    class DFA92 extends DFA {

        public DFA92(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 92;
            this.eot = DFA92_eot;
            this.eof = DFA92_eof;
            this.min = DFA92_min;
            this.max = DFA92_max;
            this.accept = DFA92_accept;
            this.special = DFA92_special;
            this.transition = DFA92_transition;
        }
        public String getDescription() {
            return "4903:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA92_1 = input.LA(1);

                         
                        int index92_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index92_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 92, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA96_eotS =
        "\7\uffff";
    static final String DFA96_eofS =
        "\2\uffff\1\4\2\uffff\1\4\1\uffff";
    static final String DFA96_minS =
        "\1\10\1\uffff\1\4\1\10\1\uffff\1\4\1\uffff";
    static final String DFA96_maxS =
        "\1\17\1\uffff\1\122\1\47\1\uffff\1\122\1\uffff";
    static final String DFA96_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff\1\3";
    static final String DFA96_specialS =
        "\7\uffff}>";
    static final String[] DFA96_transitionS = {
            "\1\2\6\uffff\1\1",
            "",
            "\5\4\4\uffff\4\4\14\uffff\1\4\7\uffff\2\4\4\uffff\1\4\1\uffff"+
            "\1\3\3\uffff\1\4\1\uffff\2\4\1\uffff\1\4\2\uffff\1\4\1\uffff"+
            "\1\4\3\uffff\6\4\1\uffff\10\4\4\uffff\1\4",
            "\1\5\36\uffff\1\6",
            "",
            "\5\4\4\uffff\4\4\14\uffff\1\4\7\uffff\2\4\4\uffff\1\4\1\uffff"+
            "\1\3\3\uffff\1\4\1\uffff\2\4\1\uffff\1\4\2\uffff\1\4\1\uffff"+
            "\1\4\3\uffff\6\4\1\uffff\10\4\4\uffff\1\4",
            ""
    };

    static final short[] DFA96_eot = DFA.unpackEncodedString(DFA96_eotS);
    static final short[] DFA96_eof = DFA.unpackEncodedString(DFA96_eofS);
    static final char[] DFA96_min = DFA.unpackEncodedStringToUnsignedChars(DFA96_minS);
    static final char[] DFA96_max = DFA.unpackEncodedStringToUnsignedChars(DFA96_maxS);
    static final short[] DFA96_accept = DFA.unpackEncodedString(DFA96_acceptS);
    static final short[] DFA96_special = DFA.unpackEncodedString(DFA96_specialS);
    static final short[][] DFA96_transition;

    static {
        int numStates = DFA96_transitionS.length;
        DFA96_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA96_transition[i] = DFA.unpackEncodedString(DFA96_transitionS[i]);
        }
    }

    class DFA96 extends DFA {

        public DFA96(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 96;
            this.eot = DFA96_eot;
            this.eof = DFA96_eof;
            this.min = DFA96_min;
            this.max = DFA96_max;
            this.accept = DFA96_accept;
            this.special = DFA96_special;
            this.transition = DFA96_transition;
        }
        public String getDescription() {
            return "5290:1: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleScript142 = new BitSet(new long[]{0x8A5A08602001E1F2L,0x0000000000043FDFL});
    public static final BitSet FOLLOW_13_in_ruleScript155 = new BitSet(new long[]{0x8A5A08602001E1F2L,0x0000000000043FDFL});
    public static final BitSet FOLLOW_ruleXImportDeclaration_in_ruleScript185 = new BitSet(new long[]{0x8A5A08602001E1F2L,0x0000000000043FDFL});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_entryRuleFeatureCallID224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCallID235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFeatureCallID282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleFeatureCallID306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleFeatureCallID325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleFeatureCallID344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXAssignment542 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment558 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment608 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment661 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpSingleAssign772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpMultiAssign861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpMultiAssign880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression977 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1030 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1053 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpOr1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1236 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1289 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1312 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpAnd1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1495 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1548 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1571 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpEquality1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpEquality1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpEquality1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1794 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_25_in_ruleXRelationalExpression1830 = new BitSet(new long[]{0x0002000200000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1853 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1914 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1937 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare1977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpCompare2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2180 = new BitSet(new long[]{0x0000001FF0000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2233 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2256 = new BitSet(new long[]{0x0000001FF0000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2383 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2455 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2486 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2542 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2573 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpOther2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOther2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpOther2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2763 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2816 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2839 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpAdd2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpAdd2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3043 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3096 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3119 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpMulti3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpMulti3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpMulti3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpMulti3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3372 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXUnaryOperation3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpUnary3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpUnary3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpUnary3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3642 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleXCastedExpression3677 = new BitSet(new long[]{0x0002000200000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3700 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3795 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall3844 = new BitSet(new long[]{0x000000000001C100L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall3867 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3883 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3905 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall3991 = new BitSet(new long[]{0x000000002001C100L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall4015 = new BitSet(new long[]{0x000000002001C100L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall4052 = new BitSet(new long[]{0x000000002001C100L});
    public static final BitSet FOLLOW_29_in_ruleXMemberFeatureCall4081 = new BitSet(new long[]{0x0002000200000100L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4102 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall4115 = new BitSet(new long[]{0x0002000200000100L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4136 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall4150 = new BitSet(new long[]{0x000000000001C100L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall4175 = new BitSet(new long[]{0x0042E00000000002L});
    public static final BitSet FOLLOW_49_in_ruleXMemberFeatureCall4209 = new BitSet(new long[]{0x8B5E08622001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4294 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4322 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall4335 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4356 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXMemberFeatureCall4373 = new BitSet(new long[]{0x0040E00000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4408 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCollectionLiteral_in_ruleXLiteral4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCollectionLiteral_in_entryRuleXCollectionLiteral5132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCollectionLiteral5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSetLiteral_in_ruleXCollectionLiteral5189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXListLiteral_in_ruleXCollectionLiteral5216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSetLiteral_in_entryRuleXSetLiteral5251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSetLiteral5261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXSetLiteral5307 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSetLiteral5319 = new BitSet(new long[]{0x8A7A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSetLiteral5341 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXSetLiteral5354 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSetLiteral5375 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSetLiteral5391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXListLiteral_in_entryRuleXListLiteral5427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXListLiteral5437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXListLiteral5483 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXListLiteral5495 = new BitSet(new long[]{0x8ADA08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXListLiteral5517 = new BitSet(new long[]{0x0081000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXListLiteral5530 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXListLiteral5551 = new BitSet(new long[]{0x0081000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXListLiteral5567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXClosure5673 = new BitSet(new long[]{0x8BDA08622001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5746 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXClosure5759 = new BitSet(new long[]{0x0002000200000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5780 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXClosure5802 = new BitSet(new long[]{0x8ADA08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5839 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXClosure5851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5953 = new BitSet(new long[]{0x8A5A08602001E1F2L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_13_in_ruleXExpressionInClosure5966 = new BitSet(new long[]{0x8A5A08602001C1F2L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6124 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXShortClosure6137 = new BitSet(new long[]{0x0002000200000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6158 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXShortClosure6180 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXParenthesizedExpression6299 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6321 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXParenthesizedExpression6332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXIfExpression6424 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXIfExpression6436 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6457 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXIfExpression6469 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6490 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXIfExpression6511 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXSwitchExpression6627 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6670 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXSwitchExpression6682 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6706 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression6750 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6771 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXSwitchExpression6783 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6806 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression6818 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6832 = new BitSet(new long[]{0x5002000200000100L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6853 = new BitSet(new long[]{0x7022000200000100L});
    public static final BitSet FOLLOW_61_in_ruleXSwitchExpression6867 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXSwitchExpression6879 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6900 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7006 = new BitSet(new long[]{0x5000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleXCasePart7020 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7041 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXCasePart7055 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXForLoopExpression7168 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXForLoopExpression7180 = new BitSet(new long[]{0x0002000200000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7201 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXForLoopExpression7213 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7234 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXForLoopExpression7246 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXWhileExpression7359 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXWhileExpression7371 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7392 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXWhileExpression7404 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXDoWhileExpression7517 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleXDoWhileExpression7550 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXDoWhileExpression7562 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7583 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXDoWhileExpression7595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXBlockExpression7687 = new BitSet(new long[]{0x8A7A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7709 = new BitSet(new long[]{0x8A7A08602001E1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_13_in_ruleXBlockExpression7722 = new BitSet(new long[]{0x8A7A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_53_in_ruleXBlockExpression7738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXVariableDeclaration7956 = new BitSet(new long[]{0x0002000200000100L});
    public static final BitSet FOLLOW_67_in_ruleXVariableDeclaration7987 = new BitSet(new long[]{0x0002000200000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8035 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8056 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8085 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleXVariableDeclaration8099 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8214 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8328 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8452 = new BitSet(new long[]{0x000000002001C100L,0x0000000000000010L});
    public static final BitSet FOLLOW_29_in_ruleXFeatureCall8466 = new BitSet(new long[]{0x0002000200000100L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8487 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_48_in_ruleXFeatureCall8500 = new BitSet(new long[]{0x0002000200000100L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8521 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall8535 = new BitSet(new long[]{0x000000002001C100L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8560 = new BitSet(new long[]{0x0042000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXFeatureCall8594 = new BitSet(new long[]{0x8B5E08622001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8679 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8707 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXFeatureCall8720 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8741 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXFeatureCall8758 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleIdOrSuper8889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleIdOrSuper8913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier9012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleStaticQualifier9030 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXConstructorCall9127 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9150 = new BitSet(new long[]{0x0042000020000002L});
    public static final BitSet FOLLOW_29_in_ruleXConstructorCall9171 = new BitSet(new long[]{0x0002000200000100L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9193 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_48_in_ruleXConstructorCall9206 = new BitSet(new long[]{0x0002000200000100L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9227 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXConstructorCall9241 = new BitSet(new long[]{0x0042000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXConstructorCall9264 = new BitSet(new long[]{0x8B5E08622001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9337 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9365 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXConstructorCall9378 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9399 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXConstructorCall9416 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXBooleanLiteral9545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXBooleanLiteral9569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXNullLiteral9675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXTypeLiteral9970 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXTypeLiteral9982 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10005 = new BitSet(new long[]{0x0044000000000000L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_ruleXTypeLiteral10026 = new BitSet(new long[]{0x0044000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXTypeLiteral10039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXThrowExpression10131 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXReturnExpression10244 = new BitSet(new long[]{0x8A5A08602001C1F2L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXTryCatchFinallyExpression10368 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10389 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10419 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_78_in_ruleXTryCatchFinallyExpression10441 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleXTryCatchFinallyExpression10485 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleXCatchClause10599 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXCatchClause10612 = new BitSet(new long[]{0x0002000200000100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10633 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXCatchClause10645 = new BitSet(new long[]{0x8A5A08602001C1F0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10761 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleQualifiedName10789 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10812 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10949 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10975 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleNumber10995 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference11100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11148 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_ruleJvmTypeReference11184 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_entryRuleArrayBrackets11251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayBrackets11262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleArrayBrackets11300 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleArrayBrackets11313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXFunctionTypeRef11401 = new BitSet(new long[]{0x0006000200000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11423 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXFunctionTypeRef11436 = new BitSet(new long[]{0x0002000200000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11457 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXFunctionTypeRef11473 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleXFunctionTypeRef11487 = new BitSet(new long[]{0x0002000200000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11602 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleJvmParameterizedTypeReference11623 = new BitSet(new long[]{0x0002000200000100L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11645 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_48_in_ruleJvmParameterizedTypeReference11658 = new BitSet(new long[]{0x0002000200000100L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11679 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_28_in_ruleJvmParameterizedTypeReference11693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleJvmWildcardTypeReference11906 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound12003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleJvmUpperBound12040 = new BitSet(new long[]{0x0002000200000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleJvmUpperBoundAnded12144 = new BitSet(new long[]{0x0002000200000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleJvmLowerBound12248 = new BitSet(new long[]{0x0002000200000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard12308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard12319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard12366 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleQualifiedNameWithWildcard12384 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleQualifiedNameWithWildcard12397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXImportDeclaration_in_entryRuleXImportDeclaration12534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXImportDeclaration12544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleXImportDeclaration12581 = new BitSet(new long[]{0x0000000000008100L});
    public static final BitSet FOLLOW_15_in_ruleXImportDeclaration12601 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_16_in_ruleXImportDeclaration12632 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration12669 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXImportDeclaration12681 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXImportDeclaration12693 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration12723 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleXImportDeclaration12750 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleXImportDeclaration12764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalScripting629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalScripting998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalScripting1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalScripting1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred5_InternalScripting1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalScripting1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalScripting2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred8_InternalScripting2470 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_synpred8_InternalScripting2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred9_InternalScripting2557 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_synpred9_InternalScripting2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalScripting2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalScripting3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred12_InternalScripting3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred13_InternalScripting3812 = new BitSet(new long[]{0x000000000001C100L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_synpred13_InternalScripting3821 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalScripting3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred14_InternalScripting3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred14_InternalScripting3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred14_InternalScripting3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred15_InternalScripting4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalScripting4243 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_48_in_synpred16_InternalScripting4250 = new BitSet(new long[]{0x0002000200000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalScripting4257 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_56_in_synpred16_InternalScripting4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred17_InternalScripting4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred18_InternalScripting4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalScripting5692 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_48_in_synpred20_InternalScripting5699 = new BitSet(new long[]{0x0002000200000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalScripting5706 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_56_in_synpred20_InternalScripting5720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_synpred22_InternalScripting6503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalScripting6645 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_synpred23_InternalScripting6651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred24_InternalScripting6727 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalScripting6734 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_synpred24_InternalScripting6740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalScripting8005 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalScripting8014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred26_InternalScripting8576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalScripting8628 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_48_in_synpred27_InternalScripting8635 = new BitSet(new long[]{0x0002000200000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalScripting8642 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_56_in_synpred27_InternalScripting8656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred28_InternalScripting8776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred29_InternalScripting9163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred30_InternalScripting9256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalScripting9286 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_48_in_synpred31_InternalScripting9293 = new BitSet(new long[]{0x0002000200000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalScripting9300 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_56_in_synpred31_InternalScripting9314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred32_InternalScripting9434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalScripting10258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_synpred34_InternalScripting10403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_synpred35_InternalScripting10433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred37_InternalScripting10780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_synpred38_InternalScripting11163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred39_InternalScripting11615 = new BitSet(new long[]{0x0000000000000002L});

}