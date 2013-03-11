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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'='", "'+='", "'-='", "'||'", "'&&'", "'=='", "'!='", "'==='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..<'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "','", "'('", "')'", "'#'", "'{'", "'}'", "'['", "']'", "'|'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'extends'", "'static'", "'import'", "'extension'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'&'"
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:76:1: ruleScript returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:79:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:80:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:80:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:80:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
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

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:86:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)||LA2_0==26||(LA2_0>=34 && LA2_0<=35)||LA2_0==40||LA2_0==46||(LA2_0>=48 && LA2_0<=49)||LA2_0==51||LA2_0==54||LA2_0==56||(LA2_0>=60 && LA2_0<=69)||(LA2_0>=71 && LA2_0<=78)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:86:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:86:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:87:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:87:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:88:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScriptAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleScript141);
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
            	            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleScript154); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getScriptAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

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


    // $ANTLR start "entryRuleXExpression"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:116:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:117:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:118:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression194);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression204); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:125:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:128:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:130:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression250);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:146:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:147:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:148:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment284);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment294); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:155:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:158:28: ( ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:159:1: ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:159:1: ( ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==14) ) {
                    alt4=1;
                }
                else if ( (LA4_1==EOF||(LA4_1>=RULE_STRING && LA4_1<=RULE_ID)||LA4_1==13||(LA4_1>=15 && LA4_1<=52)||(LA4_1>=54 && LA4_1<=80)) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 65:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==EOF||(LA4_2>=RULE_STRING && LA4_2<=RULE_ID)||LA4_2==13||(LA4_2>=15 && LA4_2<=52)||(LA4_2>=54 && LA4_2<=69)||(LA4_2>=71 && LA4_2<=80)) ) {
                    alt4=2;
                }
                else if ( (LA4_2==14) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 66:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==EOF||(LA4_3>=RULE_STRING && LA4_3<=RULE_ID)||LA4_3==13||(LA4_3>=15 && LA4_3<=52)||(LA4_3>=54 && LA4_3<=69)||(LA4_3>=71 && LA4_3<=80)) ) {
                    alt4=2;
                }
                else if ( (LA4_3==14) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 67:
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4==14) ) {
                    alt4=1;
                }
                else if ( (LA4_4==EOF||(LA4_4>=RULE_STRING && LA4_4<=RULE_ID)||LA4_4==13||(LA4_4>=15 && LA4_4<=52)||(LA4_4>=54 && LA4_4<=69)||(LA4_4>=71 && LA4_4<=80)) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case 68:
                {
                int LA4_5 = input.LA(2);

                if ( (LA4_5==14) ) {
                    alt4=1;
                }
                else if ( (LA4_5==EOF||(LA4_5>=RULE_STRING && LA4_5<=RULE_ID)||LA4_5==13||(LA4_5>=15 && LA4_5<=52)||(LA4_5>=54 && LA4_5<=69)||(LA4_5>=71 && LA4_5<=80)) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 26:
            case 34:
            case 35:
            case 40:
            case 46:
            case 48:
            case 49:
            case 51:
            case 54:
            case 56:
            case 60:
            case 61:
            case 62:
            case 69:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
                {
                alt4=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:159:2: ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:159:2: ( () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:159:3: () ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:159:3: ()
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:160:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:165:2: ( ( ruleFeatureCallID ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:166:1: ( ruleFeatureCallID )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:166:1: ( ruleFeatureCallID )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:167:3: ruleFeatureCallID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXAssignment352);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment368);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:188:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:189:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:189:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:190:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment388);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:207:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:207:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:208:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment418);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:216:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==15) ) {
                        int LA3_1 = input.LA(2);

                        if ( (synpred1_InternalScripting()) ) {
                            alt3=1;
                        }
                    }
                    else if ( (LA3_0==16) ) {
                        int LA3_2 = input.LA(2);

                        if ( (synpred1_InternalScripting()) ) {
                            alt3=1;
                        }
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:216:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:216:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:216:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:221:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:221:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:221:7: ()
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:222:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:227:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:228:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:228:1: ( ruleOpMultiAssign )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:229:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment471);
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

                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:242:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:243:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:243:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:244:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment494);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:268:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:269:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:270:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign534);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign545); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:277:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:280:28: (kw= '=' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:282:2: kw= '='
            {
            kw=(Token)match(input,14,FOLLOW_14_in_ruleOpSingleAssign582); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:295:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:296:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:297:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign622);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign633); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:304:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+=' | kw= '-=' ) ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:307:28: ( (kw= '+=' | kw= '-=' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:308:1: (kw= '+=' | kw= '-=' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:308:1: (kw= '+=' | kw= '-=' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:309:2: kw= '+='
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleOpMultiAssign671); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:316:2: kw= '-='
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleOpMultiAssign690); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:329:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:330:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:331:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression730);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression740); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:338:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:341:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:342:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:342:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:343:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression787);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:351:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    int LA6_2 = input.LA(2);

                    if ( (synpred2_InternalScripting()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:351:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:351:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:351:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:356:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:356:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:356:7: ()
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:357:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:362:2: ( ( ruleOpOr ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:363:1: ( ruleOpOr )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:363:1: ( ruleOpOr )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:364:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression840);
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

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:377:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:378:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:378:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:379:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression863);
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
            	    break loop6;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:403:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:404:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:405:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr902);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr913); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:412:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:415:28: (kw= '||' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:417:2: kw= '||'
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleOpOr950); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:430:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:431:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:432:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression989);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression999); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:439:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:442:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:443:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:443:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:444:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1046);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:452:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred3_InternalScripting()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:452:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:452:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:452:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:457:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:457:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:457:7: ()
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:458:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:463:2: ( ( ruleOpAnd ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:464:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:464:1: ( ruleOpAnd )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:465:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1099);
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

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:478:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:479:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:479:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:480:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1122);
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:504:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:505:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:506:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1161);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1172); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:513:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:516:28: (kw= '&&' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:518:2: kw= '&&'
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpAnd1209); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:531:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:532:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:533:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1248);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1258); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:540:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:543:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:544:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:544:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:545:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1305);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:553:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    int LA8_2 = input.LA(2);

                    if ( (synpred4_InternalScripting()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case 20:
                    {
                    int LA8_3 = input.LA(2);

                    if ( (synpred4_InternalScripting()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case 21:
                    {
                    int LA8_4 = input.LA(2);

                    if ( (synpred4_InternalScripting()) ) {
                        alt8=1;
                    }


                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:553:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:553:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:553:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:558:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:558:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:558:7: ()
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:559:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:564:2: ( ( ruleOpEquality ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:565:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:565:1: ( ruleOpEquality )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:566:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1358);
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

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:579:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:580:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:580:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:581:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1381);
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:605:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:606:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:607:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1420);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1431); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:614:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '===' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:617:28: ( (kw= '==' | kw= '!=' | kw= '===' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:618:1: (kw= '==' | kw= '!=' | kw= '===' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:618:1: (kw= '==' | kw= '!=' | kw= '===' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:619:2: kw= '=='
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleOpEquality1469); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:626:2: kw= '!='
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleOpEquality1488); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:633:2: kw= '==='
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOpEquality1507); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:646:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:647:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:648:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1547);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression1557); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:655:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:658:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:659:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:659:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:660:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1604);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:668:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop10:
            do {
                int alt10=3;
                switch ( input.LA(1) ) {
                case 25:
                    {
                    int LA10_2 = input.LA(2);

                    if ( (synpred6_InternalScripting()) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA10_3 = input.LA(2);

                    if ( (synpred6_InternalScripting()) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA10_4 = input.LA(2);

                    if ( (synpred5_InternalScripting()) ) {
                        alt10=1;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA10_5 = input.LA(2);

                    if ( (synpred6_InternalScripting()) ) {
                        alt10=2;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA10_6 = input.LA(2);

                    if ( (synpred6_InternalScripting()) ) {
                        alt10=2;
                    }


                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:668:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:668:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:668:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:668:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:668:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:670:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:670:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:670:6: ()
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:671:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXRelationalExpression1640); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:680:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:681:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:681:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:682:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1663);
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
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:699:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:699:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:699:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:699:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:699:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:704:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:704:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:704:7: ()
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:705:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:710:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:711:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:711:1: ( ruleOpCompare )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:712:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1724);
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

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:725:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:726:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:726:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:727:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1747);
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
            	    break loop10;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:751:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:752:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:753:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare1787);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare1798); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:760:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:763:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:764:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:764:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt11=1;
                }
                break;
            case 24:
                {
                alt11=2;
                }
                break;
            case 25:
                {
                alt11=3;
                }
                break;
            case 26:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:765:2: kw= '>='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpCompare1836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:772:2: kw= '<='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpCompare1855); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:779:2: kw= '>'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare1874); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:786:2: kw= '<'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare1893); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:799:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:800:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:801:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression1933);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression1943); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:808:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:811:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:812:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:812:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:813:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression1990);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:821:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:821:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:821:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:821:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:826:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:826:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:826:7: ()
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:827:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:832:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:833:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:833:1: ( ruleOpOther )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:834:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2043);
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

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:847:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:848:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:848:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:849:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2066);
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
            	    break loop12;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:873:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:874:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:875:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2105);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2116); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:882:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:885:28: ( (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:886:1: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:886:1: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt15=10;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:887:2: kw= '->'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2154); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:894:2: kw= '..<'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2173); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopLessThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:900:6: (kw= '>' kw= '..' )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:900:6: (kw= '>' kw= '..' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:901:2: kw= '>' kw= '..'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2193); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_2_0()); 
                          
                    }
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_2_1()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:914:2: kw= '..'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2226); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:921:2: kw= '=>'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2245); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:927:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:927:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:928:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2265); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_0()); 
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:933:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==25) ) {
                        int LA13_1 = input.LA(2);

                        if ( (LA13_1==25) && (synpred8_InternalScripting())) {
                            alt13=1;
                        }
                        else if ( (LA13_1==EOF||(LA13_1>=RULE_STRING && LA13_1<=RULE_ID)||LA13_1==26||(LA13_1>=34 && LA13_1<=35)||LA13_1==40||LA13_1==46||(LA13_1>=48 && LA13_1<=49)||LA13_1==51||LA13_1==54||LA13_1==56||(LA13_1>=60 && LA13_1<=62)||(LA13_1>=65 && LA13_1<=69)||(LA13_1>=71 && LA13_1<=78)) ) {
                            alt13=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:933:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:933:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:933:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:937:5: (kw= '>' kw= '>' )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:938:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2296); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2309); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_5_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:951:2: kw= '>'
                            {
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2330); if (state.failed) return current;
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:957:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:957:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:958:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2352); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_0()); 
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:963:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==26) ) {
                        int LA14_1 = input.LA(2);

                        if ( (synpred9_InternalScripting()) ) {
                            alt14=1;
                        }
                        else if ( (true) ) {
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
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:963:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:963:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:963:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:967:5: (kw= '<' kw= '<' )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:968:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2383); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2396); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_6_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:981:2: kw= '<'
                            {
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2417); if (state.failed) return current;
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:988:2: kw= '<>'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2438); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:995:2: kw= '?:'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2457); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1002:2: kw= '<=>'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2476); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1015:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1016:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1017:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2516);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2526); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1024:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1027:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1028:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1028:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1029:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2573);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1037:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred10_InternalScripting()) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==35) ) {
                    int LA16_3 = input.LA(2);

                    if ( (synpred10_InternalScripting()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1037:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1037:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1037:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1042:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1042:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1042:7: ()
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1043:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1048:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1049:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1049:1: ( ruleOpAdd )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1050:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2626);
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

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1063:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1064:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1064:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1065:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2649);
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
            	    break loop16;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1089:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1090:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1091:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2688);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2699); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1098:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1101:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1102:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1102:1: (kw= '+' | kw= '-' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            else if ( (LA17_0==35) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1103:2: kw= '+'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpAdd2737); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1110:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpAdd2756); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1123:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1124:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1125:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2796);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2806); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1132:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1135:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1136:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1136:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1137:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2853);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1145:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop18:
            do {
                int alt18=2;
                switch ( input.LA(1) ) {
                case 36:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (synpred11_InternalScripting()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (synpred11_InternalScripting()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (synpred11_InternalScripting()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA18_5 = input.LA(2);

                    if ( (synpred11_InternalScripting()) ) {
                        alt18=1;
                    }


                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1145:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1145:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1145:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1150:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1150:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1150:7: ()
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1151:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1156:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1157:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1157:1: ( ruleOpMulti )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1158:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2906);
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

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1171:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1172:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1172:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1173:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2929);
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
            	    break loop18;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1197:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1198:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1199:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti2968);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti2979); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1206:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1209:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1210:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1210:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt19=1;
                }
                break;
            case 37:
                {
                alt19=2;
                }
                break;
            case 38:
                {
                alt19=3;
                }
                break;
            case 39:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1211:2: kw= '*'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3017); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1218:2: kw= '**'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti3036); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1225:2: kw= '/'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpMulti3055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1232:2: kw= '%'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpMulti3074); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1245:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1246:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1247:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3114);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3124); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1254:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1257:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1258:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1258:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=34 && LA20_0<=35)||LA20_0==40) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)||LA20_0==26||LA20_0==46||(LA20_0>=48 && LA20_0<=49)||LA20_0==51||LA20_0==54||LA20_0==56||(LA20_0>=60 && LA20_0<=62)||(LA20_0>=65 && LA20_0<=69)||(LA20_0>=71 && LA20_0<=78)) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1258:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1258:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1258:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1258:3: ()
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1259:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1264:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1265:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1265:1: ( ruleOpUnary )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1266:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3182);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1279:2: ( (lv_operand_2_0= ruleXUnaryOperation ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1280:1: (lv_operand_2_0= ruleXUnaryOperation )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1280:1: (lv_operand_2_0= ruleXUnaryOperation )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1281:3: lv_operand_2_0= ruleXUnaryOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXUnaryOperationParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXUnaryOperation3203);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1299:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3232);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1315:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1316:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1317:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3268);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3279); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1324:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1327:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1328:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1328:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt21=1;
                }
                break;
            case 35:
                {
                alt21=2;
                }
                break;
            case 34:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1329:2: kw= '!'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpUnary3317); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1336:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpUnary3336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1343:2: kw= '+'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpUnary3355); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1356:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1357:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1358:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3395);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3405); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1365:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1368:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1369:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1369:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1370:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3452);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1378:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==41) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred12_InternalScripting()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1378:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1378:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1378:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1380:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1380:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1380:6: ()
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1381:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXCastedExpression3487); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1390:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1391:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1391:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1392:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3510);
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
            	    break loop22;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1416:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1417:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1418:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3548);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3558); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1425:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1428:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1429:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1429:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1430:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3605);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1438:1: ( ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop30:
            do {
                int alt30=3;
                switch ( input.LA(1) ) {
                case 42:
                    {
                    int LA30_2 = input.LA(2);

                    if ( (synpred13_InternalScripting()) ) {
                        alt30=1;
                    }
                    else if ( (synpred14_InternalScripting()) ) {
                        alt30=2;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA30_3 = input.LA(2);

                    if ( (synpred14_InternalScripting()) ) {
                        alt30=2;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA30_4 = input.LA(2);

                    if ( (synpred14_InternalScripting()) ) {
                        alt30=2;
                    }


                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1438:2: ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1438:2: ( ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1438:3: ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1438:3: ( ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1438:4: ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1444:25: ( () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1444:26: () otherlv_2= '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1444:26: ()
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1445:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall3654); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1454:1: ( ( ruleFeatureCallID ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1455:1: ( ruleFeatureCallID )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1455:1: ( ruleFeatureCallID )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1456:3: ruleFeatureCallID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall3677);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3693);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1477:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1478:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1478:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1479:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3715);
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
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1496:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1496:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1496:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleFeatureCallID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1496:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1496:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1512:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1512:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1512:8: ()
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1513:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1518:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt23=3;
            	    switch ( input.LA(1) ) {
            	    case 42:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1518:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall3801); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1523:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1523:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1524:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1524:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1525:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall3825); if (state.failed) return current;
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
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1539:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1539:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1540:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1540:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1541:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall3862); if (state.failed) return current;
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

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1554:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==26) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1554:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,26,FOLLOW_26_in_ruleXMemberFeatureCall3891); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1558:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1559:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1559:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1560:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3912);
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

            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1576:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop24:
            	            do {
            	                int alt24=2;
            	                int LA24_0 = input.LA(1);

            	                if ( (LA24_0==45) ) {
            	                    alt24=1;
            	                }


            	                switch (alt24) {
            	            	case 1 :
            	            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1576:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall3925); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1580:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1581:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1581:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1582:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3946);
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
            	            	    break loop24;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,25,FOLLOW_25_in_ruleXMemberFeatureCall3960); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1602:3: ( ( ruleFeatureCallID ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1603:1: ( ruleFeatureCallID )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1603:1: ( ruleFeatureCallID )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1604:3: ruleFeatureCallID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall3985);
            	    ruleFeatureCallID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1617:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt28=2;
            	    alt28 = dfa28.predict(input);
            	    switch (alt28) {
            	        case 1 :
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1617:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1617:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1617:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1624:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1625:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall4019); if (state.failed) return current;
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

            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1638:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt27=3;
            	            alt27 = dfa27.predict(input);
            	            switch (alt27) {
            	                case 1 :
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1638:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1638:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1638:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1655:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1656:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4104);
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
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1673:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1673:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1673:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1673:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1674:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1674:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1675:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4132);
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

            	                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1691:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop26:
            	                    do {
            	                        int alt26=2;
            	                        int LA26_0 = input.LA(1);

            	                        if ( (LA26_0==45) ) {
            	                            alt26=1;
            	                        }


            	                        switch (alt26) {
            	                    	case 1 :
            	                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1691:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4145); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1695:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1696:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1696:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1697:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4166);
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
            	                    	    break loop26;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall4183); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1717:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt29=2;
            	    alt29 = dfa29.predict(input);
            	    switch (alt29) {
            	        case 1 :
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1717:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1720:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1721:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4218);
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
            	    break loop30;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1745:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1746:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1747:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4258);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4268); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1754:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1757:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1758:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1758:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt31=13;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1759:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4315);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1769:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4342);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1779:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4369);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1789:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4396);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1799:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4423);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1809:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4450);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1819:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4477);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1829:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4504);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1839:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4531);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1849:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4558);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1859:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4585);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1869:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4612);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1879:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4639);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1895:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1896:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1897:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4674);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4684); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1904:1: ruleXLiteral returns [EObject current=null] : (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral ) ;
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
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1907:28: ( (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1908:1: (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1908:1: (this_XCollectionLiteral_0= ruleXCollectionLiteral | ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure ) | this_XBooleanLiteral_2= ruleXBooleanLiteral | this_XNumberLiteral_3= ruleXNumberLiteral | this_XNullLiteral_4= ruleXNullLiteral | this_XStringLiteral_5= ruleXStringLiteral | this_XTypeLiteral_6= ruleXTypeLiteral )
            int alt32=7;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==48) ) {
                alt32=1;
            }
            else if ( (LA32_0==51) && (synpred18_InternalScripting())) {
                alt32=2;
            }
            else if ( ((LA32_0>=72 && LA32_0<=73)) ) {
                alt32=3;
            }
            else if ( ((LA32_0>=RULE_HEX && LA32_0<=RULE_DECIMAL)) ) {
                alt32=4;
            }
            else if ( (LA32_0==74) ) {
                alt32=5;
            }
            else if ( (LA32_0==RULE_STRING) ) {
                alt32=6;
            }
            else if ( (LA32_0==75) ) {
                alt32=7;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1909:5: this_XCollectionLiteral_0= ruleXCollectionLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXCollectionLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCollectionLiteral_in_ruleXLiteral4731);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1918:6: ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1918:6: ( ( ( () '[' ) )=>this_XClosure_1= ruleXClosure )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1918:7: ( ( () '[' ) )=>this_XClosure_1= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4771);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1931:5: this_XBooleanLiteral_2= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4799);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1941:5: this_XNumberLiteral_3= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4826);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1951:5: this_XNullLiteral_4= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral4853);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1961:5: this_XStringLiteral_5= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral4880);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1971:5: this_XTypeLiteral_6= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4907);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1987:1: entryRuleXCollectionLiteral returns [EObject current=null] : iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF ;
    public final EObject entryRuleXCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCollectionLiteral = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1988:2: (iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1989:2: iv_ruleXCollectionLiteral= ruleXCollectionLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCollectionLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXCollectionLiteral_in_entryRuleXCollectionLiteral4942);
            iv_ruleXCollectionLiteral=ruleXCollectionLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCollectionLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCollectionLiteral4952); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1996:1: ruleXCollectionLiteral returns [EObject current=null] : (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral ) ;
    public final EObject ruleXCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XSetLiteral_0 = null;

        EObject this_XListLiteral_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1999:28: ( (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2000:1: (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2000:1: (this_XSetLiteral_0= ruleXSetLiteral | this_XListLiteral_1= ruleXListLiteral )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==51) ) {
                    alt33=2;
                }
                else if ( (LA33_1==49) ) {
                    alt33=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2001:5: this_XSetLiteral_0= ruleXSetLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXCollectionLiteralAccess().getXSetLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSetLiteral_in_ruleXCollectionLiteral4999);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2011:5: this_XListLiteral_1= ruleXListLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXCollectionLiteralAccess().getXListLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXListLiteral_in_ruleXCollectionLiteral5026);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2027:1: entryRuleXSetLiteral returns [EObject current=null] : iv_ruleXSetLiteral= ruleXSetLiteral EOF ;
    public final EObject entryRuleXSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSetLiteral = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2028:2: (iv_ruleXSetLiteral= ruleXSetLiteral EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2029:2: iv_ruleXSetLiteral= ruleXSetLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSetLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXSetLiteral_in_entryRuleXSetLiteral5061);
            iv_ruleXSetLiteral=ruleXSetLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSetLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSetLiteral5071); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2036:1: ruleXSetLiteral returns [EObject current=null] : ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' ) ;
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
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2039:28: ( ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2040:1: ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2040:1: ( () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2040:2: () otherlv_1= '#' otherlv_2= '{' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= '}'
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2040:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2041:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSetLiteralAccess().getXSetLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXSetLiteral5117); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSetLiteralAccess().getNumberSignKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXSetLiteral5129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXSetLiteralAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2054:1: ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_ID)||LA35_0==26||(LA35_0>=34 && LA35_0<=35)||LA35_0==40||LA35_0==46||(LA35_0>=48 && LA35_0<=49)||LA35_0==51||LA35_0==54||LA35_0==56||(LA35_0>=60 && LA35_0<=62)||(LA35_0>=65 && LA35_0<=69)||(LA35_0>=71 && LA35_0<=78)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2054:2: ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2054:2: ( (lv_elements_3_0= ruleXExpression ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2055:1: (lv_elements_3_0= ruleXExpression )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2055:1: (lv_elements_3_0= ruleXExpression )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2056:3: lv_elements_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSetLiteralAccess().getElementsXExpressionParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSetLiteral5151);
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

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2072:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==45) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2072:4: otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXSetLiteral5164); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXSetLiteralAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2076:1: ( (lv_elements_5_0= ruleXExpression ) )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2077:1: (lv_elements_5_0= ruleXExpression )
                    	    {
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2077:1: (lv_elements_5_0= ruleXExpression )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2078:3: lv_elements_5_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXSetLiteralAccess().getElementsXExpressionParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXSetLiteral5185);
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
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,50,FOLLOW_50_in_ruleXSetLiteral5201); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2106:1: entryRuleXListLiteral returns [EObject current=null] : iv_ruleXListLiteral= ruleXListLiteral EOF ;
    public final EObject entryRuleXListLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXListLiteral = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2107:2: (iv_ruleXListLiteral= ruleXListLiteral EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2108:2: iv_ruleXListLiteral= ruleXListLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXListLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXListLiteral_in_entryRuleXListLiteral5237);
            iv_ruleXListLiteral=ruleXListLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXListLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXListLiteral5247); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2115:1: ruleXListLiteral returns [EObject current=null] : ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' ) ;
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
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2118:28: ( ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2119:1: ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2119:1: ( () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2119:2: () otherlv_1= '#' otherlv_2= '[' ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )? otherlv_6= ']'
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2119:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2120:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXListLiteralAccess().getXListLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXListLiteral5293); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXListLiteralAccess().getNumberSignKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleXListLiteral5305); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXListLiteralAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2133:1: ( ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_ID)||LA37_0==26||(LA37_0>=34 && LA37_0<=35)||LA37_0==40||LA37_0==46||(LA37_0>=48 && LA37_0<=49)||LA37_0==51||LA37_0==54||LA37_0==56||(LA37_0>=60 && LA37_0<=62)||(LA37_0>=65 && LA37_0<=69)||(LA37_0>=71 && LA37_0<=78)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2133:2: ( (lv_elements_3_0= ruleXExpression ) ) (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2133:2: ( (lv_elements_3_0= ruleXExpression ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2134:1: (lv_elements_3_0= ruleXExpression )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2134:1: (lv_elements_3_0= ruleXExpression )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2135:3: lv_elements_3_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXListLiteralAccess().getElementsXExpressionParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXListLiteral5327);
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

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2151:2: (otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==45) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2151:4: otherlv_4= ',' ( (lv_elements_5_0= ruleXExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXListLiteral5340); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXListLiteralAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2155:1: ( (lv_elements_5_0= ruleXExpression ) )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2156:1: (lv_elements_5_0= ruleXExpression )
                    	    {
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2156:1: (lv_elements_5_0= ruleXExpression )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2157:3: lv_elements_5_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXListLiteralAccess().getElementsXExpressionParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXListLiteral5361);
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
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,52,FOLLOW_52_in_ruleXListLiteral5377); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2185:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2186:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2187:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5413);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5423); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2194:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2197:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2198:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2198:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2198:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2198:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2198:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2200:5: ( () otherlv_1= '[' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2200:6: () otherlv_1= '['
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2200:6: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2201:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXClosure5483); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2210:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2210:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2225:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2225:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2225:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_ID||LA39_0==30||LA39_0==46) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2225:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2225:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2226:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2226:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2227:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5556);
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

                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2243:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==45) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2243:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleXClosure5569); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2247:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2248:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2248:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2249:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5590);
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
                            	    break loop38;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2265:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2266:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2266:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2267:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,53,FOLLOW_53_in_ruleXClosure5612); if (state.failed) return current;
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

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2280:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2281:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2281:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2282:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5649);
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

            otherlv_7=(Token)match(input,52,FOLLOW_52_in_ruleXClosure5661); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2310:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2311:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2312:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5697);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5707); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2319:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2322:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2323:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2323:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2323:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2323:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2324:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2329:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_ID)||LA42_0==26||(LA42_0>=34 && LA42_0<=35)||LA42_0==40||LA42_0==46||(LA42_0>=48 && LA42_0<=49)||LA42_0==51||LA42_0==54||LA42_0==56||(LA42_0>=60 && LA42_0<=69)||(LA42_0>=71 && LA42_0<=78)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2329:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2329:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2330:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2330:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2331:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5763);
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

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2347:2: (otherlv_2= ';' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==13) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2347:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXExpressionInClosure5776); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2359:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2360:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2361:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5816);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5826); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2368:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2371:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2372:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2372:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2372:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2372:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2372:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2388:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2388:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2388:7: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2389:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2394:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID||LA44_0==30||LA44_0==46) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2394:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2394:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2395:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2395:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2396:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5934);
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

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2412:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==45) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2412:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXShortClosure5947); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2416:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2417:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2417:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2418:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5968);
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
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2434:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2435:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2435:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2436:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,53,FOLLOW_53_in_ruleXShortClosure5990); if (state.failed) return current;
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

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2449:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2450:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2450:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2451:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6026);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2475:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2476:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2477:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6062);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6072); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2484:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2487:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2488:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2488:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2488:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleXParenthesizedExpression6109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6131);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXParenthesizedExpression6142); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2513:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2514:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2515:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6178);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6188); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2522:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2525:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2526:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2526:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2526:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2526:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2527:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXIfExpression6234); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXIfExpression6246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2540:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2541:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2541:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2542:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6267);
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

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXIfExpression6279); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2562:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2563:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2563:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2564:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6300);
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

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2580:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==55) ) {
                int LA45_1 = input.LA(2);

                if ( (synpred22_InternalScripting()) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2580:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2580:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2580:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleXIfExpression6321); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2585:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2586:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2586:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2587:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6343);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2611:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2612:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2613:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6381);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6391); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2620:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2623:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2624:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2624:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2624:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2624:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2625:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6437); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2634:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_STRING && LA47_0<=RULE_ID)||LA47_0==26||(LA47_0>=34 && LA47_0<=35)||LA47_0==40||(LA47_0>=48 && LA47_0<=49)||LA47_0==51||LA47_0==54||LA47_0==56||(LA47_0>=60 && LA47_0<=62)||(LA47_0>=65 && LA47_0<=69)||(LA47_0>=71 && LA47_0<=78)) ) {
                alt47=1;
            }
            else if ( (LA47_0==46) ) {
                int LA47_2 = input.LA(2);

                if ( (LA47_2==RULE_ID) ) {
                    int LA47_3 = input.LA(3);

                    if ( ((LA47_3>=14 && LA47_3<=39)||(LA47_3>=41 && LA47_3<=44)||(LA47_3>=46 && LA47_3<=47)||LA47_3==51||LA47_3==70) ) {
                        alt47=1;
                    }
                    else if ( (LA47_3==57) && (synpred24_InternalScripting())) {
                        alt47=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA47_2>=RULE_STRING && LA47_2<=RULE_DECIMAL)||LA47_2==26||(LA47_2>=34 && LA47_2<=35)||LA47_2==40||LA47_2==46||(LA47_2>=48 && LA47_2<=49)||LA47_2==51||LA47_2==54||LA47_2==56||(LA47_2>=60 && LA47_2<=62)||(LA47_2>=65 && LA47_2<=69)||(LA47_2>=71 && LA47_2<=78)) ) {
                    alt47=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2634:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2634:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2634:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2634:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_ID) ) {
                        int LA46_1 = input.LA(2);

                        if ( (LA46_1==57) && (synpred23_InternalScripting())) {
                            alt46=1;
                        }
                    }
                    switch (alt46) {
                        case 1 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2634:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2639:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2639:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2639:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2640:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2640:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2641:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6480);
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

                            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6492); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2661:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2662:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2662:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2663:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6516);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2680:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2680:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2680:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2680:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2680:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2686:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2686:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleXSwitchExpression6560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2690:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2691:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2691:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2692:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6581);
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

                    otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6593); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2712:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2713:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2713:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2714:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6616);
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

                    otherlv_9=(Token)match(input,47,FOLLOW_47_in_ruleXSwitchExpression6628); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression6642); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2738:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID||LA48_0==30||LA48_0==46||LA48_0==57||LA48_0==59) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2739:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2739:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2740:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6663);
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
            	    if ( cnt48 >= 1 ) break loop48;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2756:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==58) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2756:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,58,FOLLOW_58_in_ruleXSwitchExpression6677); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6689); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2764:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2765:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2765:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2766:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6710);
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

            otherlv_15=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression6724); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2794:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2795:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2796:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6760);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6770); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2803:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2806:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2807:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2807:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2807:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2807:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID||LA50_0==30||LA50_0==46) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2808:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2808:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2809:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6816);
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

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2825:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==59) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2825:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXCasePart6830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2829:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2830:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2830:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2831:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6851);
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

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleXCasePart6865); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2851:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2852:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2852:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2853:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6886);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2877:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2878:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2879:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6922);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6932); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2886:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2889:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2890:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2890:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2890:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2890:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2891:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXForLoopExpression6978); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXForLoopExpression6990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2904:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2905:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2905:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2906:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7011);
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

            otherlv_4=(Token)match(input,57,FOLLOW_57_in_ruleXForLoopExpression7023); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2926:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2927:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2927:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2928:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7044);
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

            otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleXForLoopExpression7056); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2948:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2949:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2949:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2950:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7077);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2974:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2975:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2976:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7113);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7123); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2983:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2986:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2987:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2987:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2987:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2987:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2988:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXWhileExpression7169); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXWhileExpression7181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3001:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3002:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3002:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3003:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7202);
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

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXWhileExpression7214); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3023:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3024:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3024:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3025:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7235);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3049:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3050:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3051:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7271);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7281); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3058:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3061:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3062:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3062:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3062:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3062:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3063:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXDoWhileExpression7327); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3072:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3073:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3073:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3074:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7348);
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

            otherlv_3=(Token)match(input,61,FOLLOW_61_in_ruleXDoWhileExpression7360); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleXDoWhileExpression7372); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3098:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3099:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3099:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3100:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7393);
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

            otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleXDoWhileExpression7405); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3128:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3129:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3130:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7441);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7451); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3137:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3140:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3141:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3141:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3141:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3141:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3142:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXBlockExpression7497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3151:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=RULE_STRING && LA53_0<=RULE_ID)||LA53_0==26||(LA53_0>=34 && LA53_0<=35)||LA53_0==40||LA53_0==46||(LA53_0>=48 && LA53_0<=49)||LA53_0==51||LA53_0==54||LA53_0==56||(LA53_0>=60 && LA53_0<=69)||(LA53_0>=71 && LA53_0<=78)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3151:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3151:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3152:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3152:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3153:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7519);
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

            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3169:2: (otherlv_3= ';' )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==13) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3169:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleXBlockExpression7532); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleXBlockExpression7548); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3185:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3186:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3187:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7584);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7594); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3194:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3197:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3198:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3198:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=63 && LA54_0<=64)) ) {
                alt54=1;
            }
            else if ( ((LA54_0>=RULE_STRING && LA54_0<=RULE_ID)||LA54_0==26||(LA54_0>=34 && LA54_0<=35)||LA54_0==40||LA54_0==46||(LA54_0>=48 && LA54_0<=49)||LA54_0==51||LA54_0==54||LA54_0==56||(LA54_0>=60 && LA54_0<=62)||(LA54_0>=65 && LA54_0<=69)||(LA54_0>=71 && LA54_0<=78)) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3199:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7641);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3209:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7668);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3225:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3226:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3227:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7703);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7713); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3234:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3237:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3238:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3238:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3238:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3238:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3239:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3244:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==63) ) {
                alt55=1;
            }
            else if ( (LA55_0==64) ) {
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3244:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3244:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3245:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3245:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3246:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,63,FOLLOW_63_in_ruleXVariableDeclaration7766); if (state.failed) return current;
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3260:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleXVariableDeclaration7797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3264:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                int LA56_1 = input.LA(2);

                if ( (synpred25_InternalScripting()) ) {
                    alt56=1;
                }
                else if ( (true) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA56_0==46) && (synpred25_InternalScripting())) {
                alt56=1;
            }
            else if ( (LA56_0==30) && (synpred25_InternalScripting())) {
                alt56=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3264:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3264:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3264:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3272:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3272:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3272:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3273:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3273:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3274:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7845);
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

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3290:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3291:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3291:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3292:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7866);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3309:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3309:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3310:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3310:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3311:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7895);
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

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3327:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==14) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3327:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleXVariableDeclaration7909); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3331:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3332:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3332:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3333:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7930);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3357:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3358:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3359:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7968);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7978); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3366:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3369:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3370:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3370:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3370:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3370:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==RULE_ID||LA58_1==26||LA58_1==42||LA58_1==51) ) {
                    alt58=1;
                }
            }
            else if ( (LA58_0==30||LA58_0==46) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3371:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3371:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3372:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8024);
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

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3388:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3389:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3389:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3390:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8046);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3414:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3415:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3416:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8082);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8092); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3423:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3426:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3427:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3427:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3427:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3427:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3428:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3428:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3429:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8138);
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

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3445:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3446:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3446:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3447:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8159);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3471:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3472:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3473:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8195);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8205); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3480:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3483:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3484:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3484:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3484:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3484:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3485:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3490:2: ( ( ruleStaticQualifier ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==70) ) {
                    alt59=1;
                }
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3491:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3491:1: ( ruleStaticQualifier )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3492:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8262);
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

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3505:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==26) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3505:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleXFeatureCall8276); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3509:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3510:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3510:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3511:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8297);
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

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3527:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==45) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3527:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXFeatureCall8310); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3531:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3532:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3532:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3533:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8331);
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
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleXFeatureCall8345); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3553:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3554:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3554:1: ( ruleIdOrSuper )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3555:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8370);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3568:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3568:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3568:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3568:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3575:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3576:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,46,FOLLOW_46_in_ruleXFeatureCall8404); if (state.failed) return current;
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

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3589:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt63=3;
                    alt63 = dfa63.predict(input);
                    switch (alt63) {
                        case 1 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3589:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3589:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3589:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3606:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3607:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8489);
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
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3624:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3624:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3624:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3624:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3625:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3625:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3626:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8517);
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

                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3642:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop62:
                            do {
                                int alt62=2;
                                int LA62_0 = input.LA(1);

                                if ( (LA62_0==45) ) {
                                    alt62=1;
                                }


                                switch (alt62) {
                            	case 1 :
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3642:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,45,FOLLOW_45_in_ruleXFeatureCall8530); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3646:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3647:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3647:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3648:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8551);
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
                            	    break loop62;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,47,FOLLOW_47_in_ruleXFeatureCall8568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3668:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3668:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3671:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3672:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8603);
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


    // $ANTLR start "entryRuleFeatureCallID"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3696:1: entryRuleFeatureCallID returns [String current=null] : iv_ruleFeatureCallID= ruleFeatureCallID EOF ;
    public final String entryRuleFeatureCallID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeatureCallID = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3697:2: (iv_ruleFeatureCallID= ruleFeatureCallID EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3698:2: iv_ruleFeatureCallID= ruleFeatureCallID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallIDRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCallID_in_entryRuleFeatureCallID8641);
            iv_ruleFeatureCallID=ruleFeatureCallID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCallID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCallID8652); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3705:1: ruleFeatureCallID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' ) ;
    public final AntlrDatatypeRuleToken ruleFeatureCallID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3708:28: ( (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3709:1: (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3709:1: (this_ValidID_0= ruleValidID | kw= 'extends' | kw= 'static' | kw= 'import' | kw= 'extension' )
            int alt66=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt66=1;
                }
                break;
            case 65:
                {
                alt66=2;
                }
                break;
            case 66:
                {
                alt66=3;
                }
                break;
            case 67:
                {
                alt66=4;
                }
                break;
            case 68:
                {
                alt66=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3710:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureCallIDAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleFeatureCallID8699);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3722:2: kw= 'extends'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleFeatureCallID8723); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getExtendsKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3729:2: kw= 'static'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleFeatureCallID8742); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getStaticKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3736:2: kw= 'import'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleFeatureCallID8761); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getImportKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3743:2: kw= 'extension'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleFeatureCallID8780); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFeatureCallIDAccess().getExtensionKeyword_4()); 
                          
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


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3756:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3757:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3758:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8821);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8832); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3765:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FeatureCallID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3768:28: ( (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3769:1: (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3769:1: (this_FeatureCallID_0= ruleFeatureCallID | kw= 'super' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID||(LA67_0>=65 && LA67_0<=68)) ) {
                alt67=1;
            }
            else if ( (LA67_0==69) ) {
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3770:5: this_FeatureCallID_0= ruleFeatureCallID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getFeatureCallIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCallID_in_ruleIdOrSuper8879);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3782:2: kw= 'super'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleIdOrSuper8903); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3795:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3796:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3797:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8944);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8955); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3804:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3807:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3808:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3808:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_ID) ) {
                    int LA68_2 = input.LA(2);

                    if ( (LA68_2==70) ) {
                        alt68=1;
                    }


                }


                switch (alt68) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3809:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier9002);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,70,FOLLOW_70_in_ruleStaticQualifier9020); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3833:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3834:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3835:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9061);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9071); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3842:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3845:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3846:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3846:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3846:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3846:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3847:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXConstructorCall9117); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3856:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3857:1: ( ruleQualifiedName )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3857:1: ( ruleQualifiedName )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3858:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9140);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3871:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3871:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3871:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3871:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleXConstructorCall9161); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3876:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3877:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3877:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3878:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9183);
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

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3894:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==45) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3894:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleXConstructorCall9196); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3898:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3899:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3899:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3900:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9217);
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

                    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleXConstructorCall9231); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3920:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3920:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3920:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3920:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleXConstructorCall9254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3925:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt72=3;
                    alt72 = dfa72.predict(input);
                    switch (alt72) {
                        case 1 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3925:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3925:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3925:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3942:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3943:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9327);
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
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3960:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3960:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3960:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3960:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3961:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3961:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3962:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9355);
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

                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3978:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( (LA71_0==45) ) {
                                    alt71=1;
                                }


                                switch (alt71) {
                            	case 1 :
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3978:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,45,FOLLOW_45_in_ruleXConstructorCall9368); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3982:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3983:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3983:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3984:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9389);
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

                    otherlv_13=(Token)match(input,47,FOLLOW_47_in_ruleXConstructorCall9406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4004:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4004:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4007:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4008:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9441);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4032:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4033:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4034:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9478);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9488); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4041:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4044:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4045:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4045:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4045:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4045:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4046:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4051:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==72) ) {
                alt75=1;
            }
            else if ( (LA75_0==73) ) {
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4051:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXBooleanLiteral9535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4056:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4056:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4057:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4057:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4058:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,73,FOLLOW_73_in_ruleXBooleanLiteral9559); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4079:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4080:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4081:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9609);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9619); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4088:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4091:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4092:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4092:1: ( () otherlv_1= 'null' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4092:2: () otherlv_1= 'null'
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4092:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4093:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXNullLiteral9665); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4110:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4111:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4112:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9701);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9711); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4119:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4122:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4123:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4123:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4123:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4123:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4124:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4129:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4130:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4130:1: (lv_value_1_0= ruleNumber )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4131:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9766);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4155:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4156:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4157:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9802);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9812); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4164:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4167:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4168:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4168:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4168:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4168:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4169:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4174:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4175:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4175:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4176:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9863); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4200:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4201:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4202:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9904);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9914); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4209:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arrayDimensions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4212:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4213:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4213:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4213:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )* otherlv_5= ')'
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4213:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4214:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXTypeLiteral9960); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXTypeLiteral9972); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4227:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4228:1: ( ruleQualifiedName )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4228:1: ( ruleQualifiedName )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4229:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9995);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4242:2: ( (lv_arrayDimensions_4_0= ruleArrayBrackets ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==51) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4243:1: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4243:1: (lv_arrayDimensions_4_0= ruleArrayBrackets )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4244:3: lv_arrayDimensions_4_0= ruleArrayBrackets
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getArrayDimensionsArrayBracketsParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArrayBrackets_in_ruleXTypeLiteral10016);
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

            otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleXTypeLiteral10029); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4272:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4273:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4274:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10065);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10075); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4281:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4284:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4285:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4285:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4285:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4285:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4286:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleXThrowExpression10121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4295:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4296:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4296:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4297:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10142);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4321:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4322:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4323:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10178);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10188); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4330:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4333:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4334:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4334:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4334:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4334:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4335:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleXReturnExpression10234); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4344:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt77=2;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4344:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4349:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4350:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10265);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4374:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4375:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4376:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10302);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10312); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4383:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4386:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4387:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4387:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4387:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4387:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4388:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleXTryCatchFinallyExpression10358); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4397:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4398:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4398:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4399:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10379);
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

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4415:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==80) ) {
                alt80=1;
            }
            else if ( (LA80_0==79) ) {
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4415:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4415:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4415:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4415:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt78=0;
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==80) ) {
                            int LA78_2 = input.LA(2);

                            if ( (synpred34_InternalScripting()) ) {
                                alt78=1;
                            }


                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4415:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4417:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4418:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10409);
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

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4434:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==79) ) {
                        int LA79_1 = input.LA(2);

                        if ( (synpred35_InternalScripting()) ) {
                            alt79=1;
                        }
                    }
                    switch (alt79) {
                        case 1 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4434:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4434:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4434:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,79,FOLLOW_79_in_ruleXTryCatchFinallyExpression10431); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4439:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4440:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4440:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4441:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10453);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4458:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4458:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4458:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,79,FOLLOW_79_in_ruleXTryCatchFinallyExpression10475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4462:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4463:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4463:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4464:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10496);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4488:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4489:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4490:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10534);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10544); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4497:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4500:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4501:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4501:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4501:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4501:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4501:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleXCatchClause10589); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleXCatchClause10602); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4510:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4511:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4511:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4512:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10623);
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

            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleXCatchClause10635); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4532:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4533:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4533:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4534:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10656);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4558:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4559:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4560:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10693);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10704); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4567:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4570:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4571:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4571:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4572:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10751);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4582:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==42) ) {
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
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4582:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4582:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4582:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,42,FOLLOW_42_in_ruleQualifiedName10779); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10802);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4609:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4613:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4614:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10856);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10867); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4624:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4628:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4629:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4629:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4629:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10911); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4637:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4637:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4637:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4637:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
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
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4637:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10939); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4645:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10965); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4652:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==42) ) {
                        int LA84_1 = input.LA(2);

                        if ( ((LA84_1>=RULE_INT && LA84_1<=RULE_DECIMAL)) ) {
                            alt84=1;
                        }
                    }
                    switch (alt84) {
                        case 1 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4653:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,42,FOLLOW_42_in_ruleNumber10985); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4658:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
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
                                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4658:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11001); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4666:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11027); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4684:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4685:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4686:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11080);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference11090); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4693:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4696:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4697:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4697:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* ) | this_XFunctionTypeRef_3= ruleXFunctionTypeRef )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_ID) ) {
                alt87=1;
            }
            else if ( (LA87_0==30||LA87_0==46) ) {
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4697:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4697:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )* )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4698:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11138);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4706:1: ( ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==51) ) {
                            int LA86_2 = input.LA(2);

                            if ( (LA86_2==52) ) {
                                int LA86_3 = input.LA(3);

                                if ( (synpred38_InternalScripting()) ) {
                                    alt86=1;
                                }


                            }


                        }


                        switch (alt86) {
                    	case 1 :
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4706:2: ( ( () ruleArrayBrackets ) )=> ( () ruleArrayBrackets )
                    	    {
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4707:24: ( () ruleArrayBrackets )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4707:25: () ruleArrayBrackets
                    	    {
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4707:25: ()
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4708:5: 
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
                    	    pushFollow(FOLLOW_ruleArrayBrackets_in_ruleJvmTypeReference11174);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4723:5: this_XFunctionTypeRef_3= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11205);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4739:1: entryRuleArrayBrackets returns [String current=null] : iv_ruleArrayBrackets= ruleArrayBrackets EOF ;
    public final String entryRuleArrayBrackets() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayBrackets = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4740:2: (iv_ruleArrayBrackets= ruleArrayBrackets EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4741:2: iv_ruleArrayBrackets= ruleArrayBrackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayBracketsRule()); 
            }
            pushFollow(FOLLOW_ruleArrayBrackets_in_entryRuleArrayBrackets11241);
            iv_ruleArrayBrackets=ruleArrayBrackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayBrackets.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayBrackets11252); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4748:1: ruleArrayBrackets returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleArrayBrackets() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4751:28: ( (kw= '[' kw= ']' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4752:1: (kw= '[' kw= ']' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4752:1: (kw= '[' kw= ']' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4753:2: kw= '[' kw= ']'
            {
            kw=(Token)match(input,51,FOLLOW_51_in_ruleArrayBrackets11290); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getArrayBracketsAccess().getLeftSquareBracketKeyword_0()); 
                  
            }
            kw=(Token)match(input,52,FOLLOW_52_in_ruleArrayBrackets11303); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4772:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4773:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4774:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11343);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11353); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4781:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4784:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4785:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4785:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4785:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4785:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==46) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4785:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleXFunctionTypeRef11391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4789:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==RULE_ID||LA89_0==30||LA89_0==46) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4789:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4789:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4790:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4790:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4791:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11413);
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

                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4807:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop88:
                            do {
                                int alt88=2;
                                int LA88_0 = input.LA(1);

                                if ( (LA88_0==45) ) {
                                    alt88=1;
                                }


                                switch (alt88) {
                            	case 1 :
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4807:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXFunctionTypeRef11426); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4811:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4812:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4812:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4813:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11447);
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

                    otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXFunctionTypeRef11463); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleXFunctionTypeRef11477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4837:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4838:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4838:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4839:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11498);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4863:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4864:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4865:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11534);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11544); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4872:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4875:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4876:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4876:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4876:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4876:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4877:1: ( ruleQualifiedName )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4877:1: ( ruleQualifiedName )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4878:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11592);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4891:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt92=2;
            alt92 = dfa92.predict(input);
            switch (alt92) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4891:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4891:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4891:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleJvmParameterizedTypeReference11613); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4896:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4897:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4897:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4898:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11635);
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

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4914:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==45) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4914:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleJvmParameterizedTypeReference11648); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4918:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4919:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4919:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4920:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11669);
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

                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleJvmParameterizedTypeReference11683); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4948:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4949:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4950:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11721);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11731); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4957:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4960:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4961:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4961:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_ID||LA93_0==30||LA93_0==46) ) {
                alt93=1;
            }
            else if ( (LA93_0==81) ) {
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4962:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11778);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4972:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11805);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4988:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4989:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4990:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11840);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11850); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4997:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5000:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5001:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5001:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5001:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5001:2: ()
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5002:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,81,FOLLOW_81_in_ruleJvmWildcardTypeReference11896); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5011:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt94=3;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==65) ) {
                alt94=1;
            }
            else if ( (LA94_0==69) ) {
                alt94=2;
            }
            switch (alt94) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5011:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5011:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5012:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5012:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5013:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11918);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5030:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5030:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5031:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5031:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5032:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11945);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5056:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5057:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5058:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11983);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11993); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5065:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5068:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5069:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5069:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5069:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleJvmUpperBound12030); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5073:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5074:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5074:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5075:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12051);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5099:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5100:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5101:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12087);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12097); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5108:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5111:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5112:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5112:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5112:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleJvmUpperBoundAnded12134); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5116:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5117:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5117:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5118:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12155);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5142:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5143:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5144:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12191);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12201); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5151:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5154:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5155:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5155:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5155:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleJvmLowerBound12238); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5159:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5160:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5160:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5161:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12259);
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5187:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5188:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5189:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard12298);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard12309); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5196:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5199:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5200:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5200:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5201:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard12356);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,42,FOLLOW_42_in_ruleQualifiedNameWithWildcard12374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
                  
            }
            kw=(Token)match(input,36,FOLLOW_36_in_ruleQualifiedNameWithWildcard12387); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5231:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5232:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5233:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12428);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12439); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5240:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5243:28: (this_ID_0= RULE_ID )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5244:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12478); if (state.failed) return current;
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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5261:1: entryRuleXImportDeclaration returns [EObject current=null] : iv_ruleXImportDeclaration= ruleXImportDeclaration EOF ;
    public final EObject entryRuleXImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXImportDeclaration = null;


        try {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5262:2: (iv_ruleXImportDeclaration= ruleXImportDeclaration EOF )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5263:2: iv_ruleXImportDeclaration= ruleXImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXImportDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXImportDeclaration_in_entryRuleXImportDeclaration12524);
            iv_ruleXImportDeclaration=ruleXImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXImportDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXImportDeclaration12534); if (state.failed) return current;

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
    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5270:1: ruleXImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) ;
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
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5273:28: ( (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? ) )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5274:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            {
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5274:1: (otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )? )
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5274:3: otherlv_0= 'import' ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) ) (otherlv_8= ';' )?
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleXImportDeclaration12571); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXImportDeclarationAccess().getImportKeyword_0());
                  
            }
            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5278:1: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )
            int alt96=3;
            alt96 = dfa96.predict(input);
            switch (alt96) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5278:2: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5278:2: ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5278:3: ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*'
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5278:3: ( (lv_static_1_0= 'static' ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5279:1: (lv_static_1_0= 'static' )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5279:1: (lv_static_1_0= 'static' )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5280:3: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,66,FOLLOW_66_in_ruleXImportDeclaration12591); if (state.failed) return current;
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

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5293:2: ( (lv_extension_2_0= 'extension' ) )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==68) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5294:1: (lv_extension_2_0= 'extension' )
                            {
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5294:1: (lv_extension_2_0= 'extension' )
                            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5295:3: lv_extension_2_0= 'extension'
                            {
                            lv_extension_2_0=(Token)match(input,68,FOLLOW_68_in_ruleXImportDeclaration12622); if (state.failed) return current;
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

                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5308:3: ( ( ruleQualifiedName ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5309:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5309:1: ( ruleQualifiedName )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5310:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration12659);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleXImportDeclaration12671); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXImportDeclarationAccess().getFullStopKeyword_1_0_3());
                          
                    }
                    otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleXImportDeclaration12683); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXImportDeclarationAccess().getAsteriskKeyword_1_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5332:6: ( ( ruleQualifiedName ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5332:6: ( ( ruleQualifiedName ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5333:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5333:1: ( ruleQualifiedName )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5334:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXImportDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedTypeJvmDeclaredTypeCrossReference_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration12713);
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
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5348:6: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5348:6: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5349:1: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    {
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5349:1: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5350:3: lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleXImportDeclaration12740);
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

            // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5366:3: (otherlv_8= ';' )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==13) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:5366:5: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleXImportDeclaration12754); if (state.failed) return current;
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
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:216:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:216:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:216:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:216:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:216:5: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:217:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:217:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:218:1: ( ruleOpMultiAssign )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:218:1: ( ruleOpMultiAssign )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:219:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalScripting439);
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
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:351:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:351:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:351:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:351:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:351:5: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:352:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:352:2: ( ( ruleOpOr ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:353:1: ( ruleOpOr )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:353:1: ( ruleOpOr )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:354:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalScripting808);
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
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:452:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:452:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:452:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:452:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:452:5: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:453:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:453:2: ( ( ruleOpAnd ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:454:1: ( ruleOpAnd )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:454:1: ( ruleOpAnd )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:455:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalScripting1067);
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
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:553:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:553:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:553:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:553:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:553:5: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:554:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:554:2: ( ( ruleOpEquality ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:555:1: ( ruleOpEquality )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:555:1: ( ruleOpEquality )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:556:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalScripting1326);
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
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:668:4: ( ( () 'instanceof' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:668:5: ( () 'instanceof' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:668:5: ( () 'instanceof' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:668:6: () 'instanceof'
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:668:6: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:669:1: 
        {
        }

        match(input,22,FOLLOW_22_in_synpred5_InternalScripting1621); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalScripting

    // $ANTLR start synpred6_InternalScripting
    public final void synpred6_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:699:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:699:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:699:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:699:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:699:10: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:700:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:700:2: ( ( ruleOpCompare ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:701:1: ( ruleOpCompare )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:701:1: ( ruleOpCompare )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:702:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalScripting1692);
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
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:821:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:821:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:821:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:821:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:821:5: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:822:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:822:2: ( ( ruleOpOther ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:823:1: ( ruleOpOther )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:823:1: ( ruleOpOther )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:824:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalScripting2011);
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
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:933:3: ( ( '>' '>' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:933:4: ( '>' '>' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:933:4: ( '>' '>' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:934:2: '>' '>'
        {
        match(input,25,FOLLOW_25_in_synpred8_InternalScripting2280); if (state.failed) return ;
        match(input,25,FOLLOW_25_in_synpred8_InternalScripting2285); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalScripting

    // $ANTLR start synpred9_InternalScripting
    public final void synpred9_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:963:3: ( ( '<' '<' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:963:4: ( '<' '<' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:963:4: ( '<' '<' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:964:2: '<' '<'
        {
        match(input,26,FOLLOW_26_in_synpred9_InternalScripting2367); if (state.failed) return ;
        match(input,26,FOLLOW_26_in_synpred9_InternalScripting2372); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalScripting

    // $ANTLR start synpred10_InternalScripting
    public final void synpred10_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1037:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1037:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1037:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1037:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1037:5: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1038:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1038:2: ( ( ruleOpAdd ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1039:1: ( ruleOpAdd )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1039:1: ( ruleOpAdd )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1040:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalScripting2594);
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
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1145:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1145:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1145:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1145:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1145:5: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1146:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1146:2: ( ( ruleOpMulti ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1147:1: ( ruleOpMulti )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1147:1: ( ruleOpMulti )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1148:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalScripting2874);
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
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1378:3: ( ( () 'as' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1378:4: ( () 'as' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1378:4: ( () 'as' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1378:5: () 'as'
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1378:5: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1379:1: 
        {
        }

        match(input,41,FOLLOW_41_in_synpred12_InternalScripting3468); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalScripting

    // $ANTLR start synpred13_InternalScripting
    public final void synpred13_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1438:4: ( ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1438:5: ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1438:5: ( () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1438:6: () '.' ( ( ruleFeatureCallID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1438:6: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1439:1: 
        {
        }

        match(input,42,FOLLOW_42_in_synpred13_InternalScripting3622); if (state.failed) return ;
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1440:1: ( ( ruleFeatureCallID ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1441:1: ( ruleFeatureCallID )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1441:1: ( ruleFeatureCallID )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1442:3: ruleFeatureCallID
        {
        pushFollow(FOLLOW_ruleFeatureCallID_in_synpred13_InternalScripting3631);
        ruleFeatureCallID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalScripting3637);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalScripting

    // $ANTLR start synpred14_InternalScripting
    public final void synpred14_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1496:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1496:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1496:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1496:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1496:10: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1497:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1497:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt98=3;
        switch ( input.LA(1) ) {
        case 42:
            {
            alt98=1;
            }
            break;
        case 43:
            {
            alt98=2;
            }
            break;
        case 44:
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
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1497:4: '.'
                {
                match(input,42,FOLLOW_42_in_synpred14_InternalScripting3740); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1499:6: ( ( '?.' ) )
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1499:6: ( ( '?.' ) )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1500:1: ( '?.' )
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1500:1: ( '?.' )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1501:2: '?.'
                {
                match(input,43,FOLLOW_43_in_synpred14_InternalScripting3754); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1506:6: ( ( '*.' ) )
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1506:6: ( ( '*.' ) )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1507:1: ( '*.' )
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1507:1: ( '*.' )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1508:2: '*.'
                {
                match(input,44,FOLLOW_44_in_synpred14_InternalScripting3774); if (state.failed) return ;

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
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1617:4: ( ( '(' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1618:1: ( '(' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1618:1: ( '(' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1619:2: '('
        {
        match(input,46,FOLLOW_46_in_synpred15_InternalScripting4001); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalScripting

    // $ANTLR start synpred16_InternalScripting
    public final void synpred16_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1638:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1638:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1638:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1638:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1638:6: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1639:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1639:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt100=2;
        int LA100_0 = input.LA(1);

        if ( (LA100_0==RULE_ID||LA100_0==30||LA100_0==46) ) {
            alt100=1;
        }
        switch (alt100) {
            case 1 :
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1639:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1639:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1640:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1640:1: ( ruleJvmFormalParameter )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1641:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalScripting4053);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1643:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop99:
                do {
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==45) ) {
                        alt99=1;
                    }


                    switch (alt99) {
                	case 1 :
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1643:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,45,FOLLOW_45_in_synpred16_InternalScripting4060); if (state.failed) return ;
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1644:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1645:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1645:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1646:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalScripting4067);
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

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1648:6: ( ( '|' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1649:1: ( '|' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1649:1: ( '|' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1650:2: '|'
        {
        match(input,53,FOLLOW_53_in_synpred16_InternalScripting4081); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalScripting

    // $ANTLR start synpred17_InternalScripting
    public final void synpred17_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1717:4: ( ( () '[' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1717:5: ( () '[' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1717:5: ( () '[' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1717:6: () '['
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1717:6: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1718:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred17_InternalScripting4201); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalScripting

    // $ANTLR start synpred18_InternalScripting
    public final void synpred18_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1918:7: ( ( () '[' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1918:8: ( () '[' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1918:8: ( () '[' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1918:9: () '['
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1918:9: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:1919:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred18_InternalScripting4752); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalScripting

    // $ANTLR start synpred20_InternalScripting
    public final void synpred20_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2210:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2210:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2210:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2210:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2210:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt102=2;
        int LA102_0 = input.LA(1);

        if ( (LA102_0==RULE_ID||LA102_0==30||LA102_0==46) ) {
            alt102=1;
        }
        switch (alt102) {
            case 1 :
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2210:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2210:7: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2211:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2211:1: ( ruleJvmFormalParameter )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2212:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalScripting5502);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2214:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop101:
                do {
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==45) ) {
                        alt101=1;
                    }


                    switch (alt101) {
                	case 1 :
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2214:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,45,FOLLOW_45_in_synpred20_InternalScripting5509); if (state.failed) return ;
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2215:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2216:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2216:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2217:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalScripting5516);
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

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2219:6: ( ( '|' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2220:1: ( '|' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2220:1: ( '|' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2221:2: '|'
        {
        match(input,53,FOLLOW_53_in_synpred20_InternalScripting5530); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalScripting

    // $ANTLR start synpred22_InternalScripting
    public final void synpred22_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2580:4: ( 'else' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2580:6: 'else'
        {
        match(input,55,FOLLOW_55_in_synpred22_InternalScripting6313); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalScripting

    // $ANTLR start synpred23_InternalScripting
    public final void synpred23_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2634:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2634:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2634:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2634:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2634:6: ( ( ruleValidID ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2635:1: ( ruleValidID )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2635:1: ( ruleValidID )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2636:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalScripting6455);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,57,FOLLOW_57_in_synpred23_InternalScripting6461); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalScripting

    // $ANTLR start synpred24_InternalScripting
    public final void synpred24_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2680:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2680:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2680:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2680:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,46,FOLLOW_46_in_synpred24_InternalScripting6537); if (state.failed) return ;
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2681:1: ( ( ruleValidID ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2682:1: ( ruleValidID )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2682:1: ( ruleValidID )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:2683:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalScripting6544);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,57,FOLLOW_57_in_synpred24_InternalScripting6550); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalScripting

    // $ANTLR start synpred25_InternalScripting
    public final void synpred25_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3264:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3264:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3264:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3264:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3264:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3265:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3265:1: ( ruleJvmTypeReference )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3266:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalScripting7815);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3268:2: ( ( ruleValidID ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3269:1: ( ruleValidID )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3269:1: ( ruleValidID )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3270:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalScripting7824);
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
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3568:4: ( ( '(' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3569:1: ( '(' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3569:1: ( '(' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3570:2: '('
        {
        match(input,46,FOLLOW_46_in_synpred26_InternalScripting8386); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalScripting

    // $ANTLR start synpred27_InternalScripting
    public final void synpred27_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3589:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3589:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3589:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3589:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3589:6: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3590:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3590:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt106=2;
        int LA106_0 = input.LA(1);

        if ( (LA106_0==RULE_ID||LA106_0==30||LA106_0==46) ) {
            alt106=1;
        }
        switch (alt106) {
            case 1 :
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3590:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3590:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3591:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3591:1: ( ruleJvmFormalParameter )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3592:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalScripting8438);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3594:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop105:
                do {
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==45) ) {
                        alt105=1;
                    }


                    switch (alt105) {
                	case 1 :
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3594:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,45,FOLLOW_45_in_synpred27_InternalScripting8445); if (state.failed) return ;
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3595:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3596:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3596:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3597:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalScripting8452);
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

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3599:6: ( ( '|' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3600:1: ( '|' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3600:1: ( '|' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3601:2: '|'
        {
        match(input,53,FOLLOW_53_in_synpred27_InternalScripting8466); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalScripting

    // $ANTLR start synpred28_InternalScripting
    public final void synpred28_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3668:4: ( ( () '[' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3668:5: ( () '[' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3668:5: ( () '[' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3668:6: () '['
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3668:6: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3669:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred28_InternalScripting8586); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalScripting

    // $ANTLR start synpred29_InternalScripting
    public final void synpred29_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3871:4: ( '<' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3871:6: '<'
        {
        match(input,26,FOLLOW_26_in_synpred29_InternalScripting9153); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalScripting

    // $ANTLR start synpred30_InternalScripting
    public final void synpred30_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3920:5: ( '(' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3920:7: '('
        {
        match(input,46,FOLLOW_46_in_synpred30_InternalScripting9246); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalScripting

    // $ANTLR start synpred31_InternalScripting
    public final void synpred31_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3925:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3925:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3925:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3925:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3925:6: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3926:1: 
        {
        }

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3926:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt108=2;
        int LA108_0 = input.LA(1);

        if ( (LA108_0==RULE_ID||LA108_0==30||LA108_0==46) ) {
            alt108=1;
        }
        switch (alt108) {
            case 1 :
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3926:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3926:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3927:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3927:1: ( ruleJvmFormalParameter )
                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3928:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalScripting9276);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3930:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop107:
                do {
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==45) ) {
                        alt107=1;
                    }


                    switch (alt107) {
                	case 1 :
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3930:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,45,FOLLOW_45_in_synpred31_InternalScripting9283); if (state.failed) return ;
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3931:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3932:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3932:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3933:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalScripting9290);
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

        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3935:6: ( ( '|' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3936:1: ( '|' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3936:1: ( '|' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:3937:2: '|'
        {
        match(input,53,FOLLOW_53_in_synpred31_InternalScripting9304); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalScripting

    // $ANTLR start synpred32_InternalScripting
    public final void synpred32_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4004:4: ( ( () '[' ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4004:5: ( () '[' )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4004:5: ( () '[' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4004:6: () '['
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4004:6: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4005:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred32_InternalScripting9424); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalScripting

    // $ANTLR start synpred33_InternalScripting
    public final void synpred33_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4344:2: ( ( ruleXExpression ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4345:1: ( ruleXExpression )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4345:1: ( ruleXExpression )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4346:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalScripting10248);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalScripting

    // $ANTLR start synpred34_InternalScripting
    public final void synpred34_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4415:5: ( 'catch' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4415:7: 'catch'
        {
        match(input,80,FOLLOW_80_in_synpred34_InternalScripting10393); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalScripting

    // $ANTLR start synpred35_InternalScripting
    public final void synpred35_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4434:5: ( 'finally' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4434:7: 'finally'
        {
        match(input,79,FOLLOW_79_in_synpred35_InternalScripting10423); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalScripting

    // $ANTLR start synpred37_InternalScripting
    public final void synpred37_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4582:3: ( '.' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4583:2: '.'
        {
        match(input,42,FOLLOW_42_in_synpred37_InternalScripting10770); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalScripting

    // $ANTLR start synpred38_InternalScripting
    public final void synpred38_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4706:2: ( ( () ruleArrayBrackets ) )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4706:3: ( () ruleArrayBrackets )
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4706:3: ( () ruleArrayBrackets )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4706:4: () ruleArrayBrackets
        {
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4706:4: ()
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4707:1: 
        {
        }

        pushFollow(FOLLOW_ruleArrayBrackets_in_synpred38_InternalScripting11153);
        ruleArrayBrackets();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalScripting

    // $ANTLR start synpred39_InternalScripting
    public final void synpred39_InternalScripting_fragment() throws RecognitionException {   
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4891:4: ( '<' )
        // ../org.xtext.scripting/src-gen/org/xtext/scripting/parser/antlr/internal/InternalScripting.g:4891:6: '<'
        {
        match(input,26,FOLLOW_26_in_synpred39_InternalScripting11605); if (state.failed) return ;

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


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA92 dfa92 = new DFA92(this);
    protected DFA96 dfa96 = new DFA96(this);
    static final String DFA12_eotS =
        "\14\uffff";
    static final String DFA12_eofS =
        "\1\1\13\uffff";
    static final String DFA12_minS =
        "\1\4\1\uffff\11\0\1\uffff";
    static final String DFA12_maxS =
        "\1\120\1\uffff\11\0\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\2\11\uffff\1\1";
    static final String DFA12_specialS =
        "\2\uffff\1\10\1\2\1\0\1\1\1\4\1\7\1\3\1\5\1\6\1\uffff}>";
    static final String[] DFA12_transitionS = {
            "\5\1\4\uffff\1\1\1\uffff\12\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\23\1\1\uffff\20\1\1\uffff\12\1",
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

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "()* loopback of 821:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalScripting()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalScripting()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalScripting()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalScripting()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalScripting()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_9 = input.LA(1);

                         
                        int index12_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalScripting()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_10 = input.LA(1);

                         
                        int index12_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalScripting()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_10);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalScripting()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_7);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalScripting()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\14\uffff";
    static final String DFA15_eofS =
        "\14\uffff";
    static final String DFA15_minS =
        "\1\31\2\uffff\1\31\10\uffff";
    static final String DFA15_maxS =
        "\1\41\2\uffff\1\35\10\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\7\1\10\1\11\1\12\1\6\1\3";
    static final String DFA15_specialS =
        "\14\uffff}>";
    static final String[] DFA15_transitionS = {
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

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "886:1: (kw= '->' | kw= '..<' | (kw= '>' kw= '..' ) | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )";
        }
    }
    static final String DFA28_eotS =
        "\111\uffff";
    static final String DFA28_eofS =
        "\1\2\110\uffff";
    static final String DFA28_minS =
        "\1\4\1\0\107\uffff";
    static final String DFA28_maxS =
        "\1\120\1\0\107\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\105\uffff\1\1";
    static final String DFA28_specialS =
        "\1\uffff\1\0\107\uffff}>";
    static final String[] DFA28_transitionS = {
            "\5\2\4\uffff\1\2\1\uffff\37\2\1\1\6\2\1\uffff\20\2\1\uffff\12"+
            "\2",
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
            return "1617:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index28_1);
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
    static final String DFA27_eotS =
        "\43\uffff";
    static final String DFA27_eofS =
        "\43\uffff";
    static final String DFA27_minS =
        "\1\4\2\0\40\uffff";
    static final String DFA27_maxS =
        "\1\116\2\0\40\uffff";
    static final String DFA27_acceptS =
        "\3\uffff\2\1\1\2\34\uffff\1\3";
    static final String DFA27_specialS =
        "\1\0\1\1\1\2\40\uffff}>";
    static final String[] DFA27_transitionS = {
            "\4\5\1\1\21\uffff\1\5\3\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\42\2\5\1\uffff\1\5\1\uffff\1\4\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\5\5\1\uffff\10\5",
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
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1638:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_0 = input.LA(1);

                         
                        int index27_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_0==RULE_ID) ) {s = 1;}

                        else if ( (LA27_0==46) ) {s = 2;}

                        else if ( (LA27_0==30) && (synpred16_InternalScripting())) {s = 3;}

                        else if ( (LA27_0==53) && (synpred16_InternalScripting())) {s = 4;}

                        else if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_DECIMAL)||LA27_0==26||(LA27_0>=34 && LA27_0<=35)||LA27_0==40||(LA27_0>=48 && LA27_0<=49)||LA27_0==51||LA27_0==54||LA27_0==56||(LA27_0>=60 && LA27_0<=62)||(LA27_0>=65 && LA27_0<=69)||(LA27_0>=71 && LA27_0<=78)) ) {s = 5;}

                        else if ( (LA27_0==47) ) {s = 34;}

                         
                        input.seek(index27_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalScripting()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_2 = input.LA(1);

                         
                        int index27_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalScripting()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index27_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\111\uffff";
    static final String DFA29_eofS =
        "\1\2\110\uffff";
    static final String DFA29_minS =
        "\1\4\1\0\107\uffff";
    static final String DFA29_maxS =
        "\1\120\1\0\107\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\2\105\uffff\1\1";
    static final String DFA29_specialS =
        "\1\uffff\1\0\107\uffff}>";
    static final String[] DFA29_transitionS = {
            "\5\2\4\uffff\1\2\1\uffff\44\2\1\1\1\2\1\uffff\20\2\1\uffff\12"+
            "\2",
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
            return "1717:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
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
                        if ( (synpred17_InternalScripting()) ) {s = 72;}

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
    static final String DFA31_eotS =
        "\16\uffff";
    static final String DFA31_eofS =
        "\16\uffff";
    static final String DFA31_minS =
        "\1\4\15\uffff";
    static final String DFA31_maxS =
        "\1\116\15\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA31_specialS =
        "\16\uffff}>";
    static final String[] DFA31_transitionS = {
            "\4\5\1\4\21\uffff\1\4\23\uffff\1\15\1\uffff\1\5\1\2\1\uffff"+
            "\1\5\2\uffff\1\6\1\uffff\1\3\3\uffff\1\7\1\10\1\11\2\uffff\5"+
            "\4\1\uffff\1\1\4\5\1\12\1\13\1\14",
            "",
            "",
            "",
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

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1758:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA40_eotS =
        "\45\uffff";
    static final String DFA40_eofS =
        "\45\uffff";
    static final String DFA40_minS =
        "\1\4\2\0\42\uffff";
    static final String DFA40_maxS =
        "\1\116\2\0\42\uffff";
    static final String DFA40_acceptS =
        "\3\uffff\2\1\1\2\37\uffff";
    static final String DFA40_specialS =
        "\1\0\1\1\1\2\42\uffff}>";
    static final String[] DFA40_transitionS = {
            "\4\5\1\1\21\uffff\1\5\3\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\uffff\2\5\1\uffff\2\5\1\4\1\5\1\uffff\1\5\3\uffff"+
            "\12\5\1\uffff\10\5",
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
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "2210:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_0 = input.LA(1);

                         
                        int index40_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA40_0==RULE_ID) ) {s = 1;}

                        else if ( (LA40_0==46) ) {s = 2;}

                        else if ( (LA40_0==30) && (synpred20_InternalScripting())) {s = 3;}

                        else if ( (LA40_0==53) && (synpred20_InternalScripting())) {s = 4;}

                        else if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_DECIMAL)||LA40_0==26||(LA40_0>=34 && LA40_0<=35)||LA40_0==40||(LA40_0>=48 && LA40_0<=49)||(LA40_0>=51 && LA40_0<=52)||LA40_0==54||LA40_0==56||(LA40_0>=60 && LA40_0<=69)||(LA40_0>=71 && LA40_0<=78)) ) {s = 5;}

                         
                        input.seek(index40_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_1 = input.LA(1);

                         
                        int index40_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalScripting()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index40_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA40_2 = input.LA(1);

                         
                        int index40_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalScripting()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index40_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\111\uffff";
    static final String DFA64_eofS =
        "\1\2\110\uffff";
    static final String DFA64_minS =
        "\1\4\1\0\107\uffff";
    static final String DFA64_maxS =
        "\1\120\1\0\107\uffff";
    static final String DFA64_acceptS =
        "\2\uffff\1\2\105\uffff\1\1";
    static final String DFA64_specialS =
        "\1\uffff\1\0\107\uffff}>";
    static final String[] DFA64_transitionS = {
            "\5\2\4\uffff\1\2\1\uffff\37\2\1\1\6\2\1\uffff\20\2\1\uffff\12"+
            "\2",
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
            return "3568:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index64_1);
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
    static final String DFA63_eotS =
        "\43\uffff";
    static final String DFA63_eofS =
        "\43\uffff";
    static final String DFA63_minS =
        "\1\4\2\0\40\uffff";
    static final String DFA63_maxS =
        "\1\116\2\0\40\uffff";
    static final String DFA63_acceptS =
        "\3\uffff\2\1\1\2\34\uffff\1\3";
    static final String DFA63_specialS =
        "\1\0\1\1\1\2\40\uffff}>";
    static final String[] DFA63_transitionS = {
            "\4\5\1\1\21\uffff\1\5\3\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\42\2\5\1\uffff\1\5\1\uffff\1\4\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\5\5\1\uffff\10\5",
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
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "3589:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_0 = input.LA(1);

                         
                        int index63_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA63_0==RULE_ID) ) {s = 1;}

                        else if ( (LA63_0==46) ) {s = 2;}

                        else if ( (LA63_0==30) && (synpred27_InternalScripting())) {s = 3;}

                        else if ( (LA63_0==53) && (synpred27_InternalScripting())) {s = 4;}

                        else if ( ((LA63_0>=RULE_STRING && LA63_0<=RULE_DECIMAL)||LA63_0==26||(LA63_0>=34 && LA63_0<=35)||LA63_0==40||(LA63_0>=48 && LA63_0<=49)||LA63_0==51||LA63_0==54||LA63_0==56||(LA63_0>=60 && LA63_0<=62)||(LA63_0>=65 && LA63_0<=69)||(LA63_0>=71 && LA63_0<=78)) ) {s = 5;}

                        else if ( (LA63_0==47) ) {s = 34;}

                         
                        input.seek(index63_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA63_1 = input.LA(1);

                         
                        int index63_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalScripting()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index63_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA63_2 = input.LA(1);

                         
                        int index63_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalScripting()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index63_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
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
        "\1\120\1\0\107\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\105\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\107\uffff}>";
    static final String[] DFA65_transitionS = {
            "\5\2\4\uffff\1\2\1\uffff\44\2\1\1\1\2\1\uffff\20\2\1\uffff\12"+
            "\2",
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
            return "3668:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred28_InternalScripting()) ) {s = 72;}

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
    static final String DFA70_eotS =
        "\111\uffff";
    static final String DFA70_eofS =
        "\1\2\110\uffff";
    static final String DFA70_minS =
        "\1\4\1\0\107\uffff";
    static final String DFA70_maxS =
        "\1\120\1\0\107\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\105\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\107\uffff}>";
    static final String[] DFA70_transitionS = {
            "\5\2\4\uffff\1\2\1\uffff\13\2\1\1\32\2\1\uffff\20\2\1\uffff"+
            "\12\2",
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
            return "3871:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
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
        "\1\120\1\0\107\uffff";
    static final String DFA73_acceptS =
        "\2\uffff\1\2\105\uffff\1\1";
    static final String DFA73_specialS =
        "\1\uffff\1\0\107\uffff}>";
    static final String[] DFA73_transitionS = {
            "\5\2\4\uffff\1\2\1\uffff\37\2\1\1\6\2\1\uffff\20\2\1\uffff\12"+
            "\2",
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
            return "3920:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
        "\43\uffff";
    static final String DFA72_eofS =
        "\43\uffff";
    static final String DFA72_minS =
        "\1\4\2\0\40\uffff";
    static final String DFA72_maxS =
        "\1\116\2\0\40\uffff";
    static final String DFA72_acceptS =
        "\3\uffff\2\1\1\2\34\uffff\1\3";
    static final String DFA72_specialS =
        "\1\0\1\1\1\2\40\uffff}>";
    static final String[] DFA72_transitionS = {
            "\4\5\1\1\21\uffff\1\5\3\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\42\2\5\1\uffff\1\5\1\uffff\1\4\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\5\5\1\uffff\10\5",
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
            return "3925:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA72_0==46) ) {s = 2;}

                        else if ( (LA72_0==30) && (synpred31_InternalScripting())) {s = 3;}

                        else if ( (LA72_0==53) && (synpred31_InternalScripting())) {s = 4;}

                        else if ( ((LA72_0>=RULE_STRING && LA72_0<=RULE_DECIMAL)||LA72_0==26||(LA72_0>=34 && LA72_0<=35)||LA72_0==40||(LA72_0>=48 && LA72_0<=49)||LA72_0==51||LA72_0==54||LA72_0==56||(LA72_0>=60 && LA72_0<=62)||(LA72_0>=65 && LA72_0<=69)||(LA72_0>=71 && LA72_0<=78)) ) {s = 5;}

                        else if ( (LA72_0==47) ) {s = 34;}

                         
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
        "\1\120\1\0\107\uffff";
    static final String DFA74_acceptS =
        "\2\uffff\1\2\105\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\107\uffff}>";
    static final String[] DFA74_transitionS = {
            "\5\2\4\uffff\1\2\1\uffff\44\2\1\1\1\2\1\uffff\20\2\1\uffff\12"+
            "\2",
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
            return "4004:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
        "\1\40\110\uffff";
    static final String DFA77_minS =
        "\1\4\37\0\51\uffff";
    static final String DFA77_maxS =
        "\1\120\37\0\51\uffff";
    static final String DFA77_acceptS =
        "\40\uffff\1\2\47\uffff\1\1";
    static final String DFA77_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34\1\35\1\36\51\uffff}>";
    static final String[] DFA77_transitionS = {
            "\1\26\1\22\1\23\1\24\1\1\4\uffff\1\40\1\uffff\13\40\1\14\7\40"+
            "\1\10\1\7\4\40\1\6\5\40\1\37\1\40\1\16\1\12\1\40\1\17\1\40\1"+
            "\uffff\1\30\1\40\1\13\3\40\1\31\1\32\1\33\2\40\1\2\1\3\1\4\1"+
            "\5\1\15\1\uffff\1\11\1\20\1\21\1\25\1\27\1\34\1\35\1\36\2\40",
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
            return "4344:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA77_2 = input.LA(1);

                         
                        int index77_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA77_3 = input.LA(1);

                         
                        int index77_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA77_4 = input.LA(1);

                         
                        int index77_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA77_5 = input.LA(1);

                         
                        int index77_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA77_6 = input.LA(1);

                         
                        int index77_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA77_7 = input.LA(1);

                         
                        int index77_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA77_8 = input.LA(1);

                         
                        int index77_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA77_9 = input.LA(1);

                         
                        int index77_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA77_10 = input.LA(1);

                         
                        int index77_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA77_11 = input.LA(1);

                         
                        int index77_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA77_12 = input.LA(1);

                         
                        int index77_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA77_13 = input.LA(1);

                         
                        int index77_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA77_14 = input.LA(1);

                         
                        int index77_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA77_15 = input.LA(1);

                         
                        int index77_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA77_16 = input.LA(1);

                         
                        int index77_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA77_17 = input.LA(1);

                         
                        int index77_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA77_18 = input.LA(1);

                         
                        int index77_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA77_19 = input.LA(1);

                         
                        int index77_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA77_20 = input.LA(1);

                         
                        int index77_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA77_21 = input.LA(1);

                         
                        int index77_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA77_22 = input.LA(1);

                         
                        int index77_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA77_23 = input.LA(1);

                         
                        int index77_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA77_24 = input.LA(1);

                         
                        int index77_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA77_25 = input.LA(1);

                         
                        int index77_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA77_26 = input.LA(1);

                         
                        int index77_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA77_27 = input.LA(1);

                         
                        int index77_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA77_28 = input.LA(1);

                         
                        int index77_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA77_29 = input.LA(1);

                         
                        int index77_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA77_30 = input.LA(1);

                         
                        int index77_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA77_31 = input.LA(1);

                         
                        int index77_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalScripting()) ) {s = 72;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index77_31);
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
        "\1\120\1\0\107\uffff";
    static final String DFA92_acceptS =
        "\2\uffff\1\2\105\uffff\1\1";
    static final String DFA92_specialS =
        "\1\uffff\1\0\107\uffff}>";
    static final String[] DFA92_transitionS = {
            "\5\2\4\uffff\1\2\1\uffff\13\2\1\1\32\2\1\uffff\20\2\1\uffff"+
            "\12\2",
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
            return "4891:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
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
        "\2\uffff\1\4\3\uffff\1\4";
    static final String DFA96_minS =
        "\1\10\1\uffff\1\15\1\10\2\uffff\1\15";
    static final String DFA96_maxS =
        "\1\102\1\uffff\1\52\1\44\2\uffff\1\52";
    static final String DFA96_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String DFA96_specialS =
        "\7\uffff}>";
    static final String[] DFA96_transitionS = {
            "\1\2\71\uffff\1\1",
            "",
            "\1\4\34\uffff\1\3",
            "\1\6\33\uffff\1\5",
            "",
            "",
            "\1\4\34\uffff\1\3"
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
            return "5278:1: ( ( ( (lv_static_1_0= 'static' ) ) ( (lv_extension_2_0= 'extension' ) )? ( ( ruleQualifiedName ) ) otherlv_4= '.' otherlv_5= '*' ) | ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleScript141 = new BitSet(new long[]{0xF14B410C040021F2L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_13_in_ruleScript154 = new BitSet(new long[]{0xF14B410C040021F2L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXAssignment352 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment368 = new BitSet(new long[]{0xF14B410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment418 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment471 = new BitSet(new long[]{0xF14B410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOpSingleAssign582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOpMultiAssign671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpMultiAssign690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression787 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression840 = new BitSet(new long[]{0xF14B410C040221F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression863 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpOr950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1046 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1099 = new BitSet(new long[]{0xF14B410C040421F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1122 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpAnd1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1305 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1358 = new BitSet(new long[]{0xF14B410C043821F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1381 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpEquality1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpEquality1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpEquality1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1604 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_22_in_ruleXRelationalExpression1640 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1663 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1724 = new BitSet(new long[]{0xF14B410C07C021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1747 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare1787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpCompare1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpCompare1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression1933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression1990 = new BitSet(new long[]{0x00000003FE000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2043 = new BitSet(new long[]{0xF14B410FFE0021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2066 = new BitSet(new long[]{0x00000003FE000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2193 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2265 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2296 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2352 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2383 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2573 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2626 = new BitSet(new long[]{0xF14B410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2649 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpAdd2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpAdd2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2853 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2906 = new BitSet(new long[]{0xF14B41FC040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2929 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti2968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpMulti3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpMulti3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3182 = new BitSet(new long[]{0xF14B410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXUnaryOperation3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpUnary3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpUnary3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpUnary3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3452 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleXCastedExpression3487 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3510 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3605 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall3654 = new BitSet(new long[]{0x0000000000000100L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall3677 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3693 = new BitSet(new long[]{0xF14B5D0C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3715 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall3801 = new BitSet(new long[]{0x0000000004000100L,0x000000000000001EL});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall3825 = new BitSet(new long[]{0x0000000004000100L,0x000000000000001EL});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall3862 = new BitSet(new long[]{0x0000000004000100L,0x000000000000001EL});
    public static final BitSet FOLLOW_26_in_ruleXMemberFeatureCall3891 = new BitSet(new long[]{0x0000400040000100L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3912 = new BitSet(new long[]{0x0000200002000000L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall3925 = new BitSet(new long[]{0x0000400040000100L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3946 = new BitSet(new long[]{0x0000200002000000L});
    public static final BitSet FOLLOW_25_in_ruleXMemberFeatureCall3960 = new BitSet(new long[]{0x0000000000000100L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleXMemberFeatureCall3985 = new BitSet(new long[]{0x00085C0000000002L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall4019 = new BitSet(new long[]{0xF16BE10C440021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4104 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4132 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4145 = new BitSet(new long[]{0xF14BE10C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4166 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall4183 = new BitSet(new long[]{0x00081C0000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4218 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCollectionLiteral_in_ruleXLiteral4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral4853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral4880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCollectionLiteral_in_entryRuleXCollectionLiteral4942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCollectionLiteral4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSetLiteral_in_ruleXCollectionLiteral4999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXListLiteral_in_ruleXCollectionLiteral5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSetLiteral_in_entryRuleXSetLiteral5061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSetLiteral5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXSetLiteral5117 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXSetLiteral5129 = new BitSet(new long[]{0xF14F610C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSetLiteral5151 = new BitSet(new long[]{0x0004200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXSetLiteral5164 = new BitSet(new long[]{0xF14F610C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSetLiteral5185 = new BitSet(new long[]{0x0004200000000000L});
    public static final BitSet FOLLOW_50_in_ruleXSetLiteral5201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXListLiteral_in_entryRuleXListLiteral5237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXListLiteral5247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXListLiteral5293 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXListLiteral5305 = new BitSet(new long[]{0xF15B610C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXListLiteral5327 = new BitSet(new long[]{0x0010200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXListLiteral5340 = new BitSet(new long[]{0xF15B610C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXListLiteral5361 = new BitSet(new long[]{0x0010200000000000L});
    public static final BitSet FOLLOW_52_in_ruleXListLiteral5377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXClosure5483 = new BitSet(new long[]{0xF16B410C440021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5556 = new BitSet(new long[]{0x0020200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXClosure5569 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5590 = new BitSet(new long[]{0x0020200000000000L});
    public static final BitSet FOLLOW_53_in_ruleXClosure5612 = new BitSet(new long[]{0xF16B410C440021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5649 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXClosure5661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5763 = new BitSet(new long[]{0xF14B410C040021F2L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_13_in_ruleXExpressionInClosure5776 = new BitSet(new long[]{0xF14B410C040021F2L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5934 = new BitSet(new long[]{0x0020200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXShortClosure5947 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5968 = new BitSet(new long[]{0x0020200000000000L});
    public static final BitSet FOLLOW_53_in_ruleXShortClosure5990 = new BitSet(new long[]{0xF14B410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXParenthesizedExpression6109 = new BitSet(new long[]{0xF14BC10C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6131 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXParenthesizedExpression6142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXIfExpression6234 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXIfExpression6246 = new BitSet(new long[]{0xF14BC10C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6267 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXIfExpression6279 = new BitSet(new long[]{0xF1CB410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6300 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXIfExpression6321 = new BitSet(new long[]{0xF14B410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6437 = new BitSet(new long[]{0xF14B410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6480 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6492 = new BitSet(new long[]{0xF14B410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6516 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_46_in_ruleXSwitchExpression6560 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6581 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6593 = new BitSet(new long[]{0xF14BC10C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6616 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXSwitchExpression6628 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression6642 = new BitSet(new long[]{0x0A00400040000100L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6663 = new BitSet(new long[]{0x0E04400040000100L});
    public static final BitSet FOLLOW_58_in_ruleXSwitchExpression6677 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6689 = new BitSet(new long[]{0xF14F410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6710 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression6724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6816 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_59_in_ruleXCasePart6830 = new BitSet(new long[]{0xF34B410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6851 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXCasePart6865 = new BitSet(new long[]{0xF14B410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXForLoopExpression6978 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXForLoopExpression6990 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7011 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXForLoopExpression7023 = new BitSet(new long[]{0xF14BC10C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7044 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXForLoopExpression7056 = new BitSet(new long[]{0xF14B410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXWhileExpression7169 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXWhileExpression7181 = new BitSet(new long[]{0xF14BC10C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7202 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXWhileExpression7214 = new BitSet(new long[]{0xF14B410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXDoWhileExpression7327 = new BitSet(new long[]{0xF14B410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7348 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleXDoWhileExpression7360 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXDoWhileExpression7372 = new BitSet(new long[]{0xF14BC10C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7393 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXDoWhileExpression7405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXBlockExpression7497 = new BitSet(new long[]{0xF14F410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7519 = new BitSet(new long[]{0xF14F410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_13_in_ruleXBlockExpression7532 = new BitSet(new long[]{0xF14F410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_50_in_ruleXBlockExpression7548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXVariableDeclaration7766 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_64_in_ruleXVariableDeclaration7797 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7845 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7866 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7895 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleXVariableDeclaration7909 = new BitSet(new long[]{0xF14B410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8024 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8138 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8262 = new BitSet(new long[]{0x0000000004000100L,0x000000000000003EL});
    public static final BitSet FOLLOW_26_in_ruleXFeatureCall8276 = new BitSet(new long[]{0x0000400040000100L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8297 = new BitSet(new long[]{0x0000200002000000L});
    public static final BitSet FOLLOW_45_in_ruleXFeatureCall8310 = new BitSet(new long[]{0x0000400040000100L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8331 = new BitSet(new long[]{0x0000200002000000L});
    public static final BitSet FOLLOW_25_in_ruleXFeatureCall8345 = new BitSet(new long[]{0x0000000004000100L,0x000000000000003EL});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8370 = new BitSet(new long[]{0x0008400000000002L});
    public static final BitSet FOLLOW_46_in_ruleXFeatureCall8404 = new BitSet(new long[]{0xF16BE10C440021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8489 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8517 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFeatureCall8530 = new BitSet(new long[]{0xF14BE10C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8551 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_47_in_ruleXFeatureCall8568 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_entryRuleFeatureCallID8641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCallID8652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFeatureCallID8699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleFeatureCallID8723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleFeatureCallID8742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleFeatureCallID8761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleFeatureCallID8780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_ruleIdOrSuper8879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleIdOrSuper8903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier9002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleStaticQualifier9020 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXConstructorCall9117 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9140 = new BitSet(new long[]{0x0008400004000002L});
    public static final BitSet FOLLOW_26_in_ruleXConstructorCall9161 = new BitSet(new long[]{0x0000400040000100L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9183 = new BitSet(new long[]{0x0000200002000000L});
    public static final BitSet FOLLOW_45_in_ruleXConstructorCall9196 = new BitSet(new long[]{0x0000400040000100L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9217 = new BitSet(new long[]{0x0000200002000000L});
    public static final BitSet FOLLOW_25_in_ruleXConstructorCall9231 = new BitSet(new long[]{0x0008400000000002L});
    public static final BitSet FOLLOW_46_in_ruleXConstructorCall9254 = new BitSet(new long[]{0xF16BE10C440021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9327 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9355 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_45_in_ruleXConstructorCall9368 = new BitSet(new long[]{0xF14BE10C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9389 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_47_in_ruleXConstructorCall9406 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXBooleanLiteral9535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXBooleanLiteral9559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXNullLiteral9665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXTypeLiteral9960 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXTypeLiteral9972 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9995 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_ruleXTypeLiteral10016 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXTypeLiteral10029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXThrowExpression10121 = new BitSet(new long[]{0xF14B410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXReturnExpression10234 = new BitSet(new long[]{0xF14B410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleXTryCatchFinallyExpression10358 = new BitSet(new long[]{0xF14B410C040021F0L,0x000000000001FFBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10409 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L});
    public static final BitSet FOLLOW_79_in_ruleXTryCatchFinallyExpression10431 = new BitSet(new long[]{0xF14B410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleXTryCatchFinallyExpression10475 = new BitSet(new long[]{0xF14B410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleXCatchClause10589 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXCatchClause10602 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10623 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXCatchClause10635 = new BitSet(new long[]{0xF14B410C040021F0L,0x0000000000007FBFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10751 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleQualifiedName10779 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10802 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10939 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10965 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleNumber10985 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference11090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11138 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_ruleJvmTypeReference11174 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_entryRuleArrayBrackets11241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayBrackets11252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleArrayBrackets11290 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleArrayBrackets11303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXFunctionTypeRef11391 = new BitSet(new long[]{0x0000C00040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11413 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFunctionTypeRef11426 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11447 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_47_in_ruleXFunctionTypeRef11463 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXFunctionTypeRef11477 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11592 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleJvmParameterizedTypeReference11613 = new BitSet(new long[]{0x0000400040000100L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11635 = new BitSet(new long[]{0x0000200002000000L});
    public static final BitSet FOLLOW_45_in_ruleJvmParameterizedTypeReference11648 = new BitSet(new long[]{0x0000400040000100L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11669 = new BitSet(new long[]{0x0000200002000000L});
    public static final BitSet FOLLOW_25_in_ruleJvmParameterizedTypeReference11683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleJvmWildcardTypeReference11896 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000022L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleJvmUpperBound12030 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleJvmUpperBoundAnded12134 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleJvmLowerBound12238 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard12298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard12309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard12356 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleQualifiedNameWithWildcard12374 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleQualifiedNameWithWildcard12387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXImportDeclaration_in_entryRuleXImportDeclaration12524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXImportDeclaration12534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXImportDeclaration12571 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleXImportDeclaration12591 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleXImportDeclaration12622 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration12659 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleXImportDeclaration12671 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleXImportDeclaration12683 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXImportDeclaration12713 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleXImportDeclaration12740 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleXImportDeclaration12754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalScripting439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalScripting808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalScripting1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalScripting1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred5_InternalScripting1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalScripting1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalScripting2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred8_InternalScripting2280 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_synpred8_InternalScripting2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred9_InternalScripting2367 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_synpred9_InternalScripting2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalScripting2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalScripting2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred12_InternalScripting3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred13_InternalScripting3622 = new BitSet(new long[]{0x0000000000000100L,0x000000000000001EL});
    public static final BitSet FOLLOW_ruleFeatureCallID_in_synpred13_InternalScripting3631 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalScripting3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred14_InternalScripting3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred14_InternalScripting3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred14_InternalScripting3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred15_InternalScripting4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalScripting4053 = new BitSet(new long[]{0x0020200000000000L});
    public static final BitSet FOLLOW_45_in_synpred16_InternalScripting4060 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalScripting4067 = new BitSet(new long[]{0x0020200000000000L});
    public static final BitSet FOLLOW_53_in_synpred16_InternalScripting4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred17_InternalScripting4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred18_InternalScripting4752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalScripting5502 = new BitSet(new long[]{0x0020200000000000L});
    public static final BitSet FOLLOW_45_in_synpred20_InternalScripting5509 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalScripting5516 = new BitSet(new long[]{0x0020200000000000L});
    public static final BitSet FOLLOW_53_in_synpred20_InternalScripting5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred22_InternalScripting6313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalScripting6455 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred23_InternalScripting6461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred24_InternalScripting6537 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalScripting6544 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred24_InternalScripting6550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalScripting7815 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalScripting7824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred26_InternalScripting8386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalScripting8438 = new BitSet(new long[]{0x0020200000000000L});
    public static final BitSet FOLLOW_45_in_synpred27_InternalScripting8445 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalScripting8452 = new BitSet(new long[]{0x0020200000000000L});
    public static final BitSet FOLLOW_53_in_synpred27_InternalScripting8466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred28_InternalScripting8586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred29_InternalScripting9153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred30_InternalScripting9246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalScripting9276 = new BitSet(new long[]{0x0020200000000000L});
    public static final BitSet FOLLOW_45_in_synpred31_InternalScripting9283 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalScripting9290 = new BitSet(new long[]{0x0020200000000000L});
    public static final BitSet FOLLOW_53_in_synpred31_InternalScripting9304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred32_InternalScripting9424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalScripting10248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_synpred34_InternalScripting10393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_synpred35_InternalScripting10423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred37_InternalScripting10770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayBrackets_in_synpred38_InternalScripting11153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred39_InternalScripting11605 = new BitSet(new long[]{0x0000000000000002L});

}