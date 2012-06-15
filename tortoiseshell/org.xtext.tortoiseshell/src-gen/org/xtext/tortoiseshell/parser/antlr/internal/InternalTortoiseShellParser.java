package org.xtext.tortoiseshell.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.tortoiseshell.services.TortoiseShellGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTortoiseShellParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sub'", "'begin'", "';'", "'end'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
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
    public static final int T__15=15;
    public static final int T__52=52;
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
    public static final int T__46=46;
    public static final int T__47=47;
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
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalTortoiseShellParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTortoiseShellParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTortoiseShellParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g"; }



     	private TortoiseShellGrammarAccess grammarAccess;
     	
        public InternalTortoiseShellParser(TokenStream input, TortoiseShellGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected TortoiseShellGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:69:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:76:1: ruleProgram returns [EObject current=null] : ( ( (lv_body_0_0= ruleBody ) ) ( (lv_functions_1_0= ruleFunction ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_body_0_0 = null;

        EObject lv_functions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:79:28: ( ( ( (lv_body_0_0= ruleBody ) ) ( (lv_functions_1_0= ruleFunction ) )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:80:1: ( ( (lv_body_0_0= ruleBody ) ) ( (lv_functions_1_0= ruleFunction ) )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:80:1: ( ( (lv_body_0_0= ruleBody ) ) ( (lv_functions_1_0= ruleFunction ) )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:80:2: ( (lv_body_0_0= ruleBody ) ) ( (lv_functions_1_0= ruleFunction ) )*
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:80:2: ( (lv_body_0_0= ruleBody ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:81:1: (lv_body_0_0= ruleBody )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:81:1: (lv_body_0_0= ruleBody )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:82:3: lv_body_0_0= ruleBody
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProgramAccess().getBodyBodyParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBody_in_ruleProgram131);
            lv_body_0_0=ruleBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getProgramRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_0_0, 
                      		"Body");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:98:2: ( (lv_functions_1_0= ruleFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:99:1: (lv_functions_1_0= ruleFunction )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:99:1: (lv_functions_1_0= ruleFunction )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:100:3: lv_functions_1_0= ruleFunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFunction_in_ruleProgram152);
            	    lv_functions_1_0=ruleFunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"functions",
            	              		lv_functions_1_0, 
            	              		"Function");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFunction"
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:124:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:125:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:126:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction189);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction199); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:133:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'sub' ( (lv_name_1_0= ruleValidID ) ) ( (lv_parameters_2_0= ruleFullJvmFormalParameter ) )* ( (lv_body_3_0= ruleBody ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameters_2_0 = null;

        EObject lv_body_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:136:28: ( (otherlv_0= 'sub' ( (lv_name_1_0= ruleValidID ) ) ( (lv_parameters_2_0= ruleFullJvmFormalParameter ) )* ( (lv_body_3_0= ruleBody ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:137:1: (otherlv_0= 'sub' ( (lv_name_1_0= ruleValidID ) ) ( (lv_parameters_2_0= ruleFullJvmFormalParameter ) )* ( (lv_body_3_0= ruleBody ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:137:1: (otherlv_0= 'sub' ( (lv_name_1_0= ruleValidID ) ) ( (lv_parameters_2_0= ruleFullJvmFormalParameter ) )* ( (lv_body_3_0= ruleBody ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:137:3: otherlv_0= 'sub' ( (lv_name_1_0= ruleValidID ) ) ( (lv_parameters_2_0= ruleFullJvmFormalParameter ) )* ( (lv_body_3_0= ruleBody ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleFunction236); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getSubKeyword_0());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:141:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:142:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:142:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:143:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFunction257);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionRule());
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

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:159:2: ( (lv_parameters_2_0= ruleFullJvmFormalParameter ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==30||LA2_0==46) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:160:1: (lv_parameters_2_0= ruleFullJvmFormalParameter )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:160:1: (lv_parameters_2_0= ruleFullJvmFormalParameter )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:161:3: lv_parameters_2_0= ruleFullJvmFormalParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionAccess().getParametersFullJvmFormalParameterParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleFunction278);
            	    lv_parameters_2_0=ruleFullJvmFormalParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFunctionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameters",
            	              		lv_parameters_2_0, 
            	              		"FullJvmFormalParameter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:177:3: ( (lv_body_3_0= ruleBody ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:178:1: (lv_body_3_0= ruleBody )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:178:1: (lv_body_3_0= ruleBody )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:179:3: lv_body_3_0= ruleBody
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionAccess().getBodyBodyParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBody_in_ruleFunction300);
            lv_body_3_0=ruleBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_3_0, 
                      		"Body");
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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleBody"
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:203:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:204:2: (iv_ruleBody= ruleBody EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:205:2: iv_ruleBody= ruleBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBodyRule()); 
            }
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody336);
            iv_ruleBody=ruleBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody346); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:212:1: ruleBody returns [EObject current=null] : ( () otherlv_1= 'begin' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= 'end' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:215:28: ( ( () otherlv_1= 'begin' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= 'end' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:216:1: ( () otherlv_1= 'begin' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= 'end' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:216:1: ( () otherlv_1= 'begin' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= 'end' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:216:2: () otherlv_1= 'begin' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= 'end'
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:216:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:217:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBodyAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleBody392); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBodyAccess().getBeginKeyword_1());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:226:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)||LA4_0==27||(LA4_0>=34 && LA4_0<=35)||LA4_0==40||LA4_0==46||LA4_0==48||LA4_0==51||LA4_0==53||LA4_0==55||(LA4_0>=59 && LA4_0<=64)||(LA4_0>=66 && LA4_0<=73)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:226:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:226:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:227:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:227:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:228:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBodyAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleBody414);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBodyRule());
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

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:244:2: (otherlv_3= ';' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==15) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:244:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleBody427); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getBodyAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleBody443); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBodyAccess().getEndKeyword_3());
                  
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
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleXExpression"
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:260:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:261:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:262:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression479);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression489); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:269:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:272:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:274:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression535);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:290:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:291:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:292:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment569);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment579); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:299:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:302:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:303:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:303:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||(LA6_1>=RULE_STRING && LA6_1<=RULE_ID)||(LA6_1>=15 && LA6_1<=16)||(LA6_1>=18 && LA6_1<=48)||(LA6_1>=50 && LA6_1<=75)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==17) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_DECIMAL)||LA6_0==27||(LA6_0>=34 && LA6_0<=35)||LA6_0==40||LA6_0==46||LA6_0==48||LA6_0==51||LA6_0==53||LA6_0==55||(LA6_0>=59 && LA6_0<=61)||LA6_0==64||(LA6_0>=66 && LA6_0<=73)) ) {
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:303:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:303:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:303:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:303:3: ()
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:304:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:309:2: ( ( ruleValidID ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:310:1: ( ruleValidID )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:310:1: ( ruleValidID )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:311:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment637);
                    ruleValidID();

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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment653);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:332:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:333:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:333:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:334:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment673);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:351:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:351:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:352:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment703);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:360:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==18) ) {
                        int LA5_1 = input.LA(2);

                        if ( (synpred1_InternalTortoiseShell()) ) {
                            alt5=1;
                        }
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:360:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:360:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:360:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:365:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:365:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:365:7: ()
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:366:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:371:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:372:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:372:1: ( ruleOpMultiAssign )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:373:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment756);
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

                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:386:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:387:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:387:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:388:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment779);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:412:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:413:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:414:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign819);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign830); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:421:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:424:28: (kw= '=' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:426:2: kw= '='
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleOpSingleAssign867); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:439:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:440:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:441:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign907);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign918); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:448:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:451:28: (kw= '+=' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:453:2: kw= '+='
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpMultiAssign955); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:466:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:467:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:468:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression994);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1004); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:475:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:478:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:479:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:479:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:480:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1051);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:488:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred2_InternalTortoiseShell()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:488:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:488:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:488:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:493:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:493:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:493:7: ()
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:494:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:499:2: ( ( ruleOpOr ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:500:1: ( ruleOpOr )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:500:1: ( ruleOpOr )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:501:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1104);
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

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:514:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:515:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:515:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:516:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1127);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:540:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:541:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:542:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1166);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1177); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:549:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:552:28: (kw= '||' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:554:2: kw= '||'
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpOr1214); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:567:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:568:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:569:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1253);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1263); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:576:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:579:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:580:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:580:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:581:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1310);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:589:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred3_InternalTortoiseShell()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:589:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:589:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:589:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:594:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:594:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:594:7: ()
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:595:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:600:2: ( ( ruleOpAnd ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:601:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:601:1: ( ruleOpAnd )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:602:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1363);
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

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:615:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:616:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:616:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:617:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1386);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:641:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:642:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:643:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1425);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1436); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:650:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:653:28: (kw= '&&' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:655:2: kw= '&&'
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpAnd1473); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:668:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:669:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:670:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1512);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1522); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:677:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:680:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:681:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:681:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:682:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1569);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:690:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred4_InternalTortoiseShell()) ) {
                        alt9=1;
                    }


                }
                else if ( (LA9_0==22) ) {
                    int LA9_3 = input.LA(2);

                    if ( (synpred4_InternalTortoiseShell()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:690:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:690:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:690:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:695:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:695:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:695:7: ()
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:696:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:701:2: ( ( ruleOpEquality ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:702:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:702:1: ( ruleOpEquality )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:703:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1622);
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

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:716:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:717:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:717:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:718:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1645);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:742:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:743:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:744:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1684);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1695); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:751:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:754:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:755:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:755:1: (kw= '==' | kw= '!=' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==22) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:756:2: kw= '=='
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOpEquality1733); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:763:2: kw= '!='
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleOpEquality1752); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:776:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:777:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:778:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1792);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression1802); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:785:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:788:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:789:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:789:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:790:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1849);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:798:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop11:
            do {
                int alt11=3;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    int LA11_2 = input.LA(2);

                    if ( (synpred6_InternalTortoiseShell()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA11_3 = input.LA(2);

                    if ( (synpred6_InternalTortoiseShell()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA11_4 = input.LA(2);

                    if ( (synpred5_InternalTortoiseShell()) ) {
                        alt11=1;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA11_5 = input.LA(2);

                    if ( (synpred6_InternalTortoiseShell()) ) {
                        alt11=2;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA11_6 = input.LA(2);

                    if ( (synpred6_InternalTortoiseShell()) ) {
                        alt11=2;
                    }


                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:798:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:798:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:798:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:798:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:798:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:800:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:800:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:800:6: ()
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:801:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleXRelationalExpression1885); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:810:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:811:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:811:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:812:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1908);
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
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:829:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:829:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:829:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:829:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:829:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:834:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:834:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:834:7: ()
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:835:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:840:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:841:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:841:1: ( ruleOpCompare )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:842:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1969);
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

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:855:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:856:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:856:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:857:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1992);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:881:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:882:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:883:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2032);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2043); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:890:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:893:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:894:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:894:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt12=1;
                }
                break;
            case 25:
                {
                alt12=2;
                }
                break;
            case 26:
                {
                alt12=3;
                }
                break;
            case 27:
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:895:2: kw= '>='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpCompare2081); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:902:2: kw= '<='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare2100); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:909:2: kw= '>'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2119); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:916:2: kw= '<'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2138); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:929:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:930:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:931:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2178);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2188); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:938:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:941:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:942:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:942:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:943:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2235);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:951:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:951:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:951:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:951:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:956:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:956:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:956:7: ()
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:957:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:962:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:963:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:963:1: ( ruleOpOther )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:964:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2288);
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

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:977:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:978:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:978:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:979:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2311);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1003:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1004:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1005:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2350);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2361); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1012:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1015:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1016:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1016:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt16=8;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt16=1;
                }
                break;
            case 29:
                {
                alt16=2;
                }
                break;
            case 30:
                {
                alt16=3;
                }
                break;
            case 26:
                {
                alt16=4;
                }
                break;
            case 27:
                {
                alt16=5;
                }
                break;
            case 31:
                {
                alt16=6;
                }
                break;
            case 32:
                {
                alt16=7;
                }
                break;
            case 33:
                {
                alt16=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1017:2: kw= '->'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2399); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1024:2: kw= '..'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1031:2: kw= '=>'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2437); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1037:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1037:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1038:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2457); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1043:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==26) ) {
                        int LA14_1 = input.LA(2);

                        if ( (LA14_1==EOF||(LA14_1>=RULE_STRING && LA14_1<=RULE_ID)||LA14_1==27||(LA14_1>=34 && LA14_1<=35)||LA14_1==40||LA14_1==46||LA14_1==48||LA14_1==51||LA14_1==53||LA14_1==55||(LA14_1>=59 && LA14_1<=61)||LA14_1==64||(LA14_1>=66 && LA14_1<=73)) ) {
                            alt14=2;
                        }
                        else if ( (LA14_1==26) && (synpred8_InternalTortoiseShell())) {
                            alt14=1;
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
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1043:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1043:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1043:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1047:5: (kw= '>' kw= '>' )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1048:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2488); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2501); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1061:2: kw= '>'
                            {
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2522); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1067:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1067:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1068:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2544); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1073:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==27) ) {
                        int LA15_1 = input.LA(2);

                        if ( (synpred9_InternalTortoiseShell()) ) {
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
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1073:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1073:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1073:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1077:5: (kw= '<' kw= '<' )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1078:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2575); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2588); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1091:2: kw= '<'
                            {
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2609); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1098:2: kw= '<>'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2630); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1105:2: kw= '?:'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2649); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1112:2: kw= '<=>'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2668); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_7()); 
                          
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1125:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1126:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1127:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2708);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2718); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1134:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1137:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1138:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1138:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1139:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2765);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1147:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    int LA17_2 = input.LA(2);

                    if ( (synpred10_InternalTortoiseShell()) ) {
                        alt17=1;
                    }


                }
                else if ( (LA17_0==35) ) {
                    int LA17_3 = input.LA(2);

                    if ( (synpred10_InternalTortoiseShell()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1147:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1147:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1147:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1152:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1152:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1152:7: ()
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1153:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1158:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1159:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1159:1: ( ruleOpAdd )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1160:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2818);
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

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1173:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1174:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1174:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1175:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2841);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1199:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1200:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1201:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2880);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2891); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1208:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1211:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1212:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1212:1: (kw= '+' | kw= '-' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            else if ( (LA18_0==35) ) {
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1213:2: kw= '+'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpAdd2929); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1220:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpAdd2948); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1233:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1234:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1235:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2988);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2998); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1242:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1245:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1246:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1246:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1247:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3045);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1255:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop19:
            do {
                int alt19=2;
                switch ( input.LA(1) ) {
                case 36:
                    {
                    int LA19_2 = input.LA(2);

                    if ( (synpred11_InternalTortoiseShell()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA19_3 = input.LA(2);

                    if ( (synpred11_InternalTortoiseShell()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA19_4 = input.LA(2);

                    if ( (synpred11_InternalTortoiseShell()) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA19_5 = input.LA(2);

                    if ( (synpred11_InternalTortoiseShell()) ) {
                        alt19=1;
                    }


                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1255:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1255:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1255:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1260:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1260:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1260:7: ()
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1261:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1266:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1267:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1267:1: ( ruleOpMulti )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1268:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3098);
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

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1281:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1282:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1282:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1283:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3121);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1307:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1308:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1309:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3160);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3171); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1316:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1319:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1320:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1320:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt20=1;
                }
                break;
            case 37:
                {
                alt20=2;
                }
                break;
            case 38:
                {
                alt20=3;
                }
                break;
            case 39:
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1321:2: kw= '*'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3209); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1328:2: kw= '**'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti3228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1335:2: kw= '/'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpMulti3247); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1342:2: kw= '%'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpMulti3266); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1355:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1356:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1357:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3306);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3316); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1364:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1367:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1368:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1368:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=34 && LA21_0<=35)||LA21_0==40) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)||LA21_0==27||LA21_0==46||LA21_0==48||LA21_0==51||LA21_0==53||LA21_0==55||(LA21_0>=59 && LA21_0<=61)||LA21_0==64||(LA21_0>=66 && LA21_0<=73)) ) {
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1368:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1368:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1368:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1368:3: ()
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1369:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1374:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1375:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1375:1: ( ruleOpUnary )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1376:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3374);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1389:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1390:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1390:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1391:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3395);
                    lv_operand_2_0=ruleXCastedExpression();

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
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1409:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3424);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1425:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1426:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1427:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3460);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3471); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1434:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1437:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1438:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1438:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt22=1;
                }
                break;
            case 35:
                {
                alt22=2;
                }
                break;
            case 34:
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1439:2: kw= '!'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpUnary3509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1446:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpUnary3528); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1453:2: kw= '+'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpUnary3547); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1466:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1467:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1468:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3587);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3597); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1475:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1478:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1479:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1479:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1480:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3644);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1488:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==41) ) {
                    int LA23_2 = input.LA(2);

                    if ( (synpred12_InternalTortoiseShell()) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1488:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1488:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1488:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1490:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1490:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1490:6: ()
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1491:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXCastedExpression3679); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1500:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1501:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1501:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1502:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3702);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1526:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1527:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1528:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3740);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3750); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1535:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1538:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1539:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1539:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1540:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3797);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1548:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop31:
            do {
                int alt31=3;
                switch ( input.LA(1) ) {
                case 42:
                    {
                    int LA31_2 = input.LA(2);

                    if ( (synpred13_InternalTortoiseShell()) ) {
                        alt31=1;
                    }
                    else if ( (synpred14_InternalTortoiseShell()) ) {
                        alt31=2;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA31_3 = input.LA(2);

                    if ( (synpred14_InternalTortoiseShell()) ) {
                        alt31=2;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA31_4 = input.LA(2);

                    if ( (synpred14_InternalTortoiseShell()) ) {
                        alt31=2;
                    }


                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1548:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1548:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1548:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1548:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1548:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1554:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1554:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1554:26: ()
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1555:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall3846); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1564:1: ( ( ruleValidID ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1565:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1565:1: ( ruleValidID )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1566:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3869);
            	    ruleValidID();

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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3885);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1587:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1588:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1588:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1589:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3907);
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
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1606:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1606:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1606:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1606:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1606:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1622:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1622:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1622:8: ()
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1623:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1628:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt24=3;
            	    switch ( input.LA(1) ) {
            	    case 42:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 44:
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
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1628:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall3993); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1633:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1633:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1634:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1634:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1635:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4017); if (state.failed) return current;
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
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1649:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1649:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1650:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1650:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1651:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4054); if (state.failed) return current;
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

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1664:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==27) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1664:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall4083); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1668:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1669:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1669:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1670:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4104);
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

            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1686:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop25:
            	            do {
            	                int alt25=2;
            	                int LA25_0 = input.LA(1);

            	                if ( (LA25_0==45) ) {
            	                    alt25=1;
            	                }


            	                switch (alt25) {
            	            	case 1 :
            	            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1686:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4117); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1690:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1691:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1691:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1692:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4138);
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

            	            otherlv_14=(Token)match(input,26,FOLLOW_26_in_ruleXMemberFeatureCall4152); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1712:3: ( ( ruleValidID ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1713:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1713:1: ( ruleValidID )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1714:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4177);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1727:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt29=2;
            	    alt29 = dfa29.predict(input);
            	    switch (alt29) {
            	        case 1 :
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1727:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1727:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1727:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1734:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1735:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall4211); if (state.failed) return current;
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

            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1748:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt28=3;
            	            alt28 = dfa28.predict(input);
            	            switch (alt28) {
            	                case 1 :
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1748:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1748:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1748:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1765:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1766:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4296);
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
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1783:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1783:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1783:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1783:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1784:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1784:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1785:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4324);
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

            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1801:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop27:
            	                    do {
            	                        int alt27=2;
            	                        int LA27_0 = input.LA(1);

            	                        if ( (LA27_0==45) ) {
            	                            alt27=1;
            	                        }


            	                        switch (alt27) {
            	                    	case 1 :
            	                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1801:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4337); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1805:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1806:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1806:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1807:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4358);
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

            	            otherlv_21=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall4375); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1827:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt30=2;
            	    alt30 = dfa30.predict(input);
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1827:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1830:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1831:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4410);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1855:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1856:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1857:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4450);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4460); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1864:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1867:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1868:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1868:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt32=13;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1869:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4507);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1879:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4534);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1889:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4561);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1899:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4588);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1909:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4615);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1919:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4642);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1929:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4669);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1939:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4696);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1949:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4723);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1959:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4750);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1969:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4777);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1979:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4804);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1989:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4831);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2005:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2006:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2007:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4866);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4876); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2014:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XNumberLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2017:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2018:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2018:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt33=6;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) && (synpred18_InternalTortoiseShell())) {
                alt33=1;
            }
            else if ( ((LA33_0>=67 && LA33_0<=68)) ) {
                alt33=2;
            }
            else if ( ((LA33_0>=RULE_HEX && LA33_0<=RULE_DECIMAL)) ) {
                alt33=3;
            }
            else if ( (LA33_0==69) ) {
                alt33=4;
            }
            else if ( (LA33_0==RULE_STRING) ) {
                alt33=5;
            }
            else if ( (LA33_0==70) ) {
                alt33=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2018:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2018:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2018:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4936);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2031:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4964);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2041:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4991);
                    this_XNumberLiteral_2=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2051:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5018);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2061:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5045);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2071:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5072);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
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


    // $ANTLR start "entryRuleXClosure"
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2087:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2088:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2089:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5107);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5117); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2096:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2099:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2100:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2100:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2100:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2100:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2100:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2102:5: ( () otherlv_1= '[' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2102:6: () otherlv_1= '['
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2102:6: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2103:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXClosure5177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2112:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2112:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2127:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2127:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2127:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_ID||LA35_0==30||LA35_0==46) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2127:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2127:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2128:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2128:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2129:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5250);
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

                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2145:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==45) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2145:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleXClosure5263); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2149:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2150:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2150:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2151:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5284);
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
                            	    break loop34;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2167:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2168:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2168:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2169:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,49,FOLLOW_49_in_ruleXClosure5306); if (state.failed) return current;
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

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2182:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2183:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2183:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2184:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5343);
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

            otherlv_7=(Token)match(input,50,FOLLOW_50_in_ruleXClosure5355); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2212:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2213:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2214:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5391);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5401); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2221:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2224:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2225:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2225:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2225:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2225:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2226:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2231:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_ID)||LA38_0==27||(LA38_0>=34 && LA38_0<=35)||LA38_0==40||LA38_0==46||LA38_0==48||LA38_0==51||LA38_0==53||LA38_0==55||(LA38_0>=59 && LA38_0<=64)||(LA38_0>=66 && LA38_0<=73)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2231:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2231:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2232:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2232:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2233:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5457);
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

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2249:2: (otherlv_2= ';' )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==15) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2249:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleXExpressionInClosure5470); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2261:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2262:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2263:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5510);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5520); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2270:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2273:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2274:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2274:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2274:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2274:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2274:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2290:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2290:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2290:7: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2291:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2296:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID||LA40_0==30||LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2296:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2296:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2297:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2297:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2298:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5628);
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

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2314:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==45) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2314:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXShortClosure5641); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2318:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2319:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2319:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2320:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5662);
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
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2336:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2337:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2337:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2338:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,49,FOLLOW_49_in_ruleXShortClosure5684); if (state.failed) return current;
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

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2351:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2352:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2352:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2353:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5720);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2377:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2378:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2379:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5756);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5766); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2386:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2389:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2390:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2390:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2390:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleXParenthesizedExpression5803); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5825);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXParenthesizedExpression5836); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2415:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2416:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2417:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5872);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5882); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2424:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2427:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2428:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2428:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2428:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2428:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2429:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXIfExpression5928); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXIfExpression5940); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2442:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2443:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2443:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2444:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5961);
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

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXIfExpression5973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2464:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2465:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2465:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2466:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5994);
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

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2482:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==52) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred22_InternalTortoiseShell()) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2482:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2482:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2482:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,52,FOLLOW_52_in_ruleXIfExpression6015); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2487:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2488:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2488:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2489:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6037);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2513:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2514:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2515:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6075);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6085); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2522:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2525:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2526:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2526:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2526:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2526:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2527:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2536:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_ID)||LA43_0==27||(LA43_0>=34 && LA43_0<=35)||LA43_0==40||LA43_0==48||LA43_0==51||LA43_0==53||LA43_0==55||(LA43_0>=59 && LA43_0<=61)||LA43_0==64||(LA43_0>=66 && LA43_0<=73)) ) {
                alt43=1;
            }
            else if ( (LA43_0==46) ) {
                int LA43_2 = input.LA(2);

                if ( (LA43_2==RULE_ID) ) {
                    int LA43_3 = input.LA(3);

                    if ( ((LA43_3>=17 && LA43_3<=39)||(LA43_3>=41 && LA43_3<=44)||(LA43_3>=46 && LA43_3<=48)||LA43_3==65) ) {
                        alt43=1;
                    }
                    else if ( (LA43_3==54) && (synpred24_InternalTortoiseShell())) {
                        alt43=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA43_2>=RULE_STRING && LA43_2<=RULE_DECIMAL)||LA43_2==27||(LA43_2>=34 && LA43_2<=35)||LA43_2==40||LA43_2==46||LA43_2==48||LA43_2==51||LA43_2==53||LA43_2==55||(LA43_2>=59 && LA43_2<=61)||LA43_2==64||(LA43_2>=66 && LA43_2<=73)) ) {
                    alt43=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2536:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2536:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2536:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2536:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_ID) ) {
                        int LA42_1 = input.LA(2);

                        if ( (LA42_1==54) && (synpred23_InternalTortoiseShell())) {
                            alt42=1;
                        }
                    }
                    switch (alt42) {
                        case 1 :
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2536:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2541:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2541:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2541:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2542:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2542:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2543:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6174);
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

                            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6186); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2563:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2564:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2564:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2565:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6210);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2582:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2582:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2582:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2582:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2582:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2588:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2588:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleXSwitchExpression6254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2592:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2593:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2593:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2594:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6275);
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

                    otherlv_7=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6287); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2614:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2615:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2615:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2616:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6310);
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

                    otherlv_9=(Token)match(input,47,FOLLOW_47_in_ruleXSwitchExpression6322); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6336); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2640:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID||LA44_0==30||LA44_0==46||LA44_0==54||LA44_0==58) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2641:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2641:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2642:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6357);
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
            	    if ( cnt44 >= 1 ) break loop44;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2658:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==56) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2658:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6383); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2666:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2667:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2667:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2668:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6404);
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

            otherlv_15=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6418); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2696:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2697:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2698:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6454);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6464); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2705:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2708:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2709:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2709:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2709:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2709:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==30||LA46_0==46) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2710:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2710:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2711:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6510);
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

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2727:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==58) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2727:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXCasePart6524); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2731:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2732:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2732:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2733:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6545);
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

            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXCasePart6559); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2753:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2754:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2754:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2755:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6580);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2779:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2780:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2781:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6616);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6626); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2788:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2791:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2792:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2792:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2792:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2792:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2793:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXForLoopExpression6672); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXForLoopExpression6684); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2806:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2807:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2807:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2808:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6705);
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

            otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleXForLoopExpression6717); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2828:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2829:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2829:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2830:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6738);
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

            otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleXForLoopExpression6750); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2850:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2851:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2851:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2852:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6771);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2876:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2877:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2878:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6807);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6817); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2885:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2888:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2889:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2889:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2889:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2889:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2890:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXWhileExpression6863); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXWhileExpression6875); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2903:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2904:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2904:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2905:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6896);
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

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXWhileExpression6908); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2925:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2926:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2926:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2927:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6929);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2951:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2952:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2953:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6965);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6975); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2960:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2963:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2964:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2964:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2964:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2964:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2965:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXDoWhileExpression7021); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2974:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2975:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2975:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2976:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7042);
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

            otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleXDoWhileExpression7054); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleXDoWhileExpression7066); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3000:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3001:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3001:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3002:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7087);
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

            otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleXDoWhileExpression7099); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3030:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3031:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3032:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7135);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7145); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3039:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3042:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3043:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3043:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3043:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3043:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3044:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXBlockExpression7191); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3053:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_ID)||LA49_0==27||(LA49_0>=34 && LA49_0<=35)||LA49_0==40||LA49_0==46||LA49_0==48||LA49_0==51||LA49_0==53||LA49_0==55||(LA49_0>=59 && LA49_0<=64)||(LA49_0>=66 && LA49_0<=73)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3053:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3053:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3054:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3054:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3055:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7213);
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

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3071:2: (otherlv_3= ';' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==15) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3071:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleXBlockExpression7226); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_4=(Token)match(input,57,FOLLOW_57_in_ruleXBlockExpression7242); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3087:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3088:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3089:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7278);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7288); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3096:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3099:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3100:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3100:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=62 && LA50_0<=63)) ) {
                alt50=1;
            }
            else if ( ((LA50_0>=RULE_STRING && LA50_0<=RULE_ID)||LA50_0==27||(LA50_0>=34 && LA50_0<=35)||LA50_0==40||LA50_0==46||LA50_0==48||LA50_0==51||LA50_0==53||LA50_0==55||(LA50_0>=59 && LA50_0<=61)||LA50_0==64||(LA50_0>=66 && LA50_0<=73)) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3101:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7335);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3111:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7362);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3127:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3128:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3129:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7397);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7407); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3136:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3139:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3140:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3140:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3140:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3140:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3141:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3146:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==62) ) {
                alt51=1;
            }
            else if ( (LA51_0==63) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3146:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3146:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3147:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3147:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3148:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,62,FOLLOW_62_in_ruleXVariableDeclaration7460); if (state.failed) return current;
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3162:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleXVariableDeclaration7491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3166:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (synpred25_InternalTortoiseShell()) ) {
                    alt52=1;
                }
                else if ( (true) ) {
                    alt52=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA52_0==46) && (synpred25_InternalTortoiseShell())) {
                alt52=1;
            }
            else if ( (LA52_0==30) && (synpred25_InternalTortoiseShell())) {
                alt52=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3166:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3166:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3166:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3174:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3174:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3174:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3175:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3175:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3176:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7539);
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

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3192:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3193:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3193:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3194:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7560);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3211:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3211:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3212:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3212:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3213:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7589);
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

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3229:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==17) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3229:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleXVariableDeclaration7603); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3233:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3234:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3234:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3235:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7624);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3259:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3260:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3261:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7662);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7672); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3268:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3271:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3272:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3272:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3272:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3272:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==RULE_ID||LA54_1==27||LA54_1==42||LA54_1==48) ) {
                    alt54=1;
                }
            }
            else if ( (LA54_0==30||LA54_0==46) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3273:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3273:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3274:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7718);
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

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3290:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3291:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3291:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3292:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7740);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3316:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3317:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3318:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7776);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7786); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3325:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3328:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3329:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3329:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3329:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3329:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3330:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3330:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3331:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7832);
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

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3347:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3348:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3348:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3349:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7853);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3373:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3374:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3375:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7889);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7899); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3382:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3385:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3386:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3386:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3386:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3386:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3387:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3392:2: ( ( ruleStaticQualifier ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==65) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3393:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3393:1: ( ruleStaticQualifier )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3394:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7956);
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

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3407:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==27) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3407:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXFeatureCall7970); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3411:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3412:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3412:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3413:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7991);
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

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3429:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==45) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3429:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXFeatureCall8004); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3433:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3434:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3434:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3435:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8025);
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
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleXFeatureCall8039); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3455:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3456:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3456:1: ( ruleIdOrSuper )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3457:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8064);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3470:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3470:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3470:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3470:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3477:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3478:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,46,FOLLOW_46_in_ruleXFeatureCall8098); if (state.failed) return current;
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

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3491:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt59=3;
                    alt59 = dfa59.predict(input);
                    switch (alt59) {
                        case 1 :
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3491:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3491:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3491:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3508:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3509:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8183);
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
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3526:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3526:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3526:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3526:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3527:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3527:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3528:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8211);
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

                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3544:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==45) ) {
                                    alt58=1;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3544:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,45,FOLLOW_45_in_ruleXFeatureCall8224); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3548:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3549:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3549:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3550:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8245);
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
                            	    break loop58;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,47,FOLLOW_47_in_ruleXFeatureCall8262); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3570:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3570:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3573:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3574:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8297);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3598:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3599:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3600:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8335);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8346); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3607:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3610:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3611:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3611:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            else if ( (LA62_0==64) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3612:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8393);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3624:2: kw= 'super'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleIdOrSuper8417); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3637:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3638:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3639:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8458);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8469); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3646:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3649:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3650:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3650:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_ID) ) {
                    int LA63_2 = input.LA(2);

                    if ( (LA63_2==65) ) {
                        alt63=1;
                    }


                }


                switch (alt63) {
            	case 1 :
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3651:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8516);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,65,FOLLOW_65_in_ruleStaticQualifier8534); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3675:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3676:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3677:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8575);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8585); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3684:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3687:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3688:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3688:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3688:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3688:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3689:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXConstructorCall8631); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3698:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3699:1: ( ruleQualifiedName )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3699:1: ( ruleQualifiedName )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3700:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8654);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3713:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3713:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3713:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3713:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleXConstructorCall8675); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3718:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3719:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3719:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3720:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8697);
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

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3736:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==45) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3736:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleXConstructorCall8710); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3740:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3741:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3741:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3742:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8731);
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
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleXConstructorCall8745); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3762:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3762:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3762:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3762:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleXConstructorCall8768); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3767:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt67=3;
                    alt67 = dfa67.predict(input);
                    switch (alt67) {
                        case 1 :
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3767:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3767:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3767:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3784:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3785:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8841);
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
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3802:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3802:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3802:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3802:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3803:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3803:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3804:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8869);
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

                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3820:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop66:
                            do {
                                int alt66=2;
                                int LA66_0 = input.LA(1);

                                if ( (LA66_0==45) ) {
                                    alt66=1;
                                }


                                switch (alt66) {
                            	case 1 :
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3820:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,45,FOLLOW_45_in_ruleXConstructorCall8882); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3824:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3825:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3825:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3826:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8903);
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
                            	    break loop66;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,47,FOLLOW_47_in_ruleXConstructorCall8920); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3846:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3846:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3849:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3850:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall8955);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3874:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3875:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3876:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8992);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9002); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3883:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3886:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3887:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3887:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3887:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3887:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3888:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3893:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==67) ) {
                alt70=1;
            }
            else if ( (LA70_0==68) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3893:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXBooleanLiteral9049); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3898:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3898:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3899:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3899:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3900:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,68,FOLLOW_68_in_ruleXBooleanLiteral9073); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3921:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3922:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3923:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9123);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9133); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3930:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3933:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3934:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3934:1: ( () otherlv_1= 'null' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3934:2: () otherlv_1= 'null'
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3934:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3935:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXNullLiteral9179); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3952:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3953:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3954:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9215);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9225); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3961:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3964:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3965:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3965:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3965:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3965:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3966:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3971:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3972:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3972:1: (lv_value_1_0= ruleNumber )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3973:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9280);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3997:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3998:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3999:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9316);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9326); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4006:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4009:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4010:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4010:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4010:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4010:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4011:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4016:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4017:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4017:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4018:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9377); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4042:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4043:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4044:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9418);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9428); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4051:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4054:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4055:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4055:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4055:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4055:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4056:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXTypeLiteral9474); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXTypeLiteral9486); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4069:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4070:1: ( ruleQualifiedName )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4070:1: ( ruleQualifiedName )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4071:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9509);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXTypeLiteral9521); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4096:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4097:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4098:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9557);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9567); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4105:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4108:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4109:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4109:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4109:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4109:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4110:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXThrowExpression9613); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4119:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4120:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4120:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4121:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9634);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4145:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4146:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4147:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9670);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9680); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4154:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4157:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4158:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4158:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4158:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4158:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4159:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXReturnExpression9726); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4168:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4168:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4173:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4174:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9757);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4198:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4199:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4200:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9794);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9804); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4207:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4210:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4211:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4211:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4211:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4211:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4212:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXTryCatchFinallyExpression9850); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4221:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4222:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4222:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4223:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9871);
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

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4239:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==75) ) {
                alt74=1;
            }
            else if ( (LA74_0==74) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4239:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4239:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4239:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4239:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt72=0;
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==75) ) {
                            int LA72_2 = input.LA(2);

                            if ( (synpred34_InternalTortoiseShell()) ) {
                                alt72=1;
                            }


                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4239:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4241:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4242:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9901);
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
                    	    if ( cnt72 >= 1 ) break loop72;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(72, input);
                                throw eee;
                        }
                        cnt72++;
                    } while (true);

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4258:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==74) ) {
                        int LA73_1 = input.LA(2);

                        if ( (synpred35_InternalTortoiseShell()) ) {
                            alt73=1;
                        }
                    }
                    switch (alt73) {
                        case 1 :
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4258:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4258:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4258:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleXTryCatchFinallyExpression9923); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4263:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4264:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4264:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4265:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9945);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4282:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4282:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4282:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,74,FOLLOW_74_in_ruleXTryCatchFinallyExpression9967); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4286:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4287:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4287:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4288:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9988);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4312:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4313:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4314:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10026);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10036); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4321:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4324:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4325:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4325:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4325:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4325:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4325:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleXCatchClause10081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleXCatchClause10094); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4334:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4335:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4335:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4336:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10115);
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

            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleXCatchClause10127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4356:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4357:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4357:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4358:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10148);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4382:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4383:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4384:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10185);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10196); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4391:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4394:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4395:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4395:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4396:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10243);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4406:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==42) ) {
                    int LA75_2 = input.LA(2);

                    if ( (LA75_2==RULE_ID) ) {
                        int LA75_3 = input.LA(3);

                        if ( (synpred37_InternalTortoiseShell()) ) {
                            alt75=1;
                        }


                    }


                }


                switch (alt75) {
            	case 1 :
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4406:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4406:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4406:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,42,FOLLOW_42_in_ruleQualifiedName10271); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10294);
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
            	    break loop75;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4433:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4437:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4438:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10348);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10359); if (state.failed) return current;

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4448:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4452:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4453:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4453:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_HEX) ) {
                alt79=1;
            }
            else if ( ((LA79_0>=RULE_INT && LA79_0<=RULE_DECIMAL)) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4453:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10403); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4461:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4461:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4461:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4461:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==RULE_INT) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==RULE_DECIMAL) ) {
                        alt76=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4461:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10431); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4469:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10457); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4476:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==42) ) {
                        int LA78_1 = input.LA(2);

                        if ( ((LA78_1>=RULE_INT && LA78_1<=RULE_DECIMAL)) ) {
                            alt78=1;
                        }
                    }
                    switch (alt78) {
                        case 1 :
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4477:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,42,FOLLOW_42_in_ruleNumber10477); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4482:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt77=2;
                            int LA77_0 = input.LA(1);

                            if ( (LA77_0==RULE_INT) ) {
                                alt77=1;
                            }
                            else if ( (LA77_0==RULE_DECIMAL) ) {
                                alt77=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 77, 0, input);

                                throw nvae;
                            }
                            switch (alt77) {
                                case 1 :
                                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4482:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10493); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4490:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10519); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4508:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4509:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4510:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10572);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10582); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4517:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4520:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4521:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4521:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID) ) {
                alt81=1;
            }
            else if ( (LA81_0==30||LA81_0==46) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4521:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4521:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4522:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10630);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4530:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==48) ) {
                            int LA80_2 = input.LA(2);

                            if ( (LA80_2==50) ) {
                                int LA80_3 = input.LA(3);

                                if ( (synpred38_InternalTortoiseShell()) ) {
                                    alt80=1;
                                }


                            }


                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4530:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4533:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4533:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4533:6: ()
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4534:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleJvmTypeReference10668); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleJvmTypeReference10680); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4549:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10712);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
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


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4565:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4566:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4567:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10747);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10757); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4574:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4577:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4578:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4578:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4578:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4578:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==46) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4578:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleXFunctionTypeRef10795); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4582:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==RULE_ID||LA83_0==30||LA83_0==46) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4582:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4582:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4583:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4583:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4584:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10817);
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

                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4600:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop82:
                            do {
                                int alt82=2;
                                int LA82_0 = input.LA(1);

                                if ( (LA82_0==45) ) {
                                    alt82=1;
                                }


                                switch (alt82) {
                            	case 1 :
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4600:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXFunctionTypeRef10830); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4604:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4605:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4605:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4606:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10851);
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
                            	    break loop82;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXFunctionTypeRef10867); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleXFunctionTypeRef10881); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4630:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4631:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4631:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4632:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10902);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4656:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4657:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4658:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10938);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10948); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4665:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4668:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4669:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4669:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4669:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4669:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4670:1: ( ruleQualifiedName )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4670:1: ( ruleQualifiedName )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4671:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10996);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4684:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt86=2;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4684:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4684:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4684:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleJvmParameterizedTypeReference11017); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4689:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4690:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4690:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4691:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11039);
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

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4707:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==45) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4707:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleJvmParameterizedTypeReference11052); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4711:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4712:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4712:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4713:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11073);
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
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleJvmParameterizedTypeReference11087); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4741:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4742:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4743:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11125);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11135); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4750:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4753:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4754:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4754:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_ID||LA87_0==30||LA87_0==46) ) {
                alt87=1;
            }
            else if ( (LA87_0==76) ) {
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4755:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11182);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4765:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11209);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4781:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4782:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4783:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11244);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11254); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4790:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4793:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4794:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4794:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4794:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4794:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4795:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleJvmWildcardTypeReference11300); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4804:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt88=3;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==77) ) {
                alt88=1;
            }
            else if ( (LA88_0==64) ) {
                alt88=2;
            }
            switch (alt88) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4804:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4804:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4805:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4805:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4806:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11322);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4823:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4823:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4824:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4824:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4825:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11349);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4849:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4850:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4851:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11387);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11397); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4858:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4861:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4862:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4862:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4862:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleJvmUpperBound11434); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4866:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4867:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4867:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4868:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11455);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4892:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4893:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4894:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11491);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11501); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4901:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4904:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4905:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4905:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4905:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleJvmUpperBoundAnded11538); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4909:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4910:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4910:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4911:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11559);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4935:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4936:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4937:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11595);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11605); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4944:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4947:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4948:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4948:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4948:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleJvmLowerBound11642); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4952:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4953:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4953:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4954:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11663);
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


    // $ANTLR start "entryRuleValidID"
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4980:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4981:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4982:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11702);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11713); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4989:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4992:28: (this_ID_0= RULE_ID )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4993:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11752); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalTortoiseShell
    public final void synpred1_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:360:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:360:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:360:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:360:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:360:5: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:361:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:361:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:362:1: ( ruleOpMultiAssign )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:362:1: ( ruleOpMultiAssign )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:363:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalTortoiseShell724);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalTortoiseShell

    // $ANTLR start synpred2_InternalTortoiseShell
    public final void synpred2_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:488:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:488:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:488:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:488:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:488:5: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:489:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:489:2: ( ( ruleOpOr ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:490:1: ( ruleOpOr )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:490:1: ( ruleOpOr )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:491:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalTortoiseShell1072);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalTortoiseShell

    // $ANTLR start synpred3_InternalTortoiseShell
    public final void synpred3_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:589:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:589:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:589:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:589:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:589:5: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:590:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:590:2: ( ( ruleOpAnd ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:591:1: ( ruleOpAnd )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:591:1: ( ruleOpAnd )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:592:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalTortoiseShell1331);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalTortoiseShell

    // $ANTLR start synpred4_InternalTortoiseShell
    public final void synpred4_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:690:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:690:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:690:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:690:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:690:5: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:691:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:691:2: ( ( ruleOpEquality ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:692:1: ( ruleOpEquality )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:692:1: ( ruleOpEquality )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:693:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalTortoiseShell1590);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalTortoiseShell

    // $ANTLR start synpred5_InternalTortoiseShell
    public final void synpred5_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:798:4: ( ( () 'instanceof' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:798:5: ( () 'instanceof' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:798:5: ( () 'instanceof' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:798:6: () 'instanceof'
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:798:6: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:799:1: 
        {
        }

        match(input,23,FOLLOW_23_in_synpred5_InternalTortoiseShell1866); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalTortoiseShell

    // $ANTLR start synpred6_InternalTortoiseShell
    public final void synpred6_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:829:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:829:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:829:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:829:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:829:10: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:830:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:830:2: ( ( ruleOpCompare ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:831:1: ( ruleOpCompare )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:831:1: ( ruleOpCompare )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:832:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalTortoiseShell1937);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalTortoiseShell

    // $ANTLR start synpred7_InternalTortoiseShell
    public final void synpred7_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:951:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:951:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:951:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:951:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:951:5: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:952:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:952:2: ( ( ruleOpOther ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:953:1: ( ruleOpOther )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:953:1: ( ruleOpOther )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:954:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalTortoiseShell2256);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalTortoiseShell

    // $ANTLR start synpred8_InternalTortoiseShell
    public final void synpred8_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1043:3: ( ( '>' '>' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1043:4: ( '>' '>' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1043:4: ( '>' '>' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1044:2: '>' '>'
        {
        match(input,26,FOLLOW_26_in_synpred8_InternalTortoiseShell2472); if (state.failed) return ;
        match(input,26,FOLLOW_26_in_synpred8_InternalTortoiseShell2477); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalTortoiseShell

    // $ANTLR start synpred9_InternalTortoiseShell
    public final void synpred9_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1073:3: ( ( '<' '<' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1073:4: ( '<' '<' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1073:4: ( '<' '<' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1074:2: '<' '<'
        {
        match(input,27,FOLLOW_27_in_synpred9_InternalTortoiseShell2559); if (state.failed) return ;
        match(input,27,FOLLOW_27_in_synpred9_InternalTortoiseShell2564); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalTortoiseShell

    // $ANTLR start synpred10_InternalTortoiseShell
    public final void synpred10_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1147:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1147:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1147:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1147:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1147:5: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1148:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1148:2: ( ( ruleOpAdd ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1149:1: ( ruleOpAdd )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1149:1: ( ruleOpAdd )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1150:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalTortoiseShell2786);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalTortoiseShell

    // $ANTLR start synpred11_InternalTortoiseShell
    public final void synpred11_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1255:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1255:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1255:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1255:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1255:5: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1256:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1256:2: ( ( ruleOpMulti ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1257:1: ( ruleOpMulti )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1257:1: ( ruleOpMulti )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1258:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalTortoiseShell3066);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalTortoiseShell

    // $ANTLR start synpred12_InternalTortoiseShell
    public final void synpred12_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1488:3: ( ( () 'as' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1488:4: ( () 'as' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1488:4: ( () 'as' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1488:5: () 'as'
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1488:5: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1489:1: 
        {
        }

        match(input,41,FOLLOW_41_in_synpred12_InternalTortoiseShell3660); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalTortoiseShell

    // $ANTLR start synpred13_InternalTortoiseShell
    public final void synpred13_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1548:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1548:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1548:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1548:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1548:6: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1549:1: 
        {
        }

        match(input,42,FOLLOW_42_in_synpred13_InternalTortoiseShell3814); if (state.failed) return ;
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1550:1: ( ( ruleValidID ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1551:1: ( ruleValidID )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1551:1: ( ruleValidID )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1552:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred13_InternalTortoiseShell3823);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalTortoiseShell3829);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalTortoiseShell

    // $ANTLR start synpred14_InternalTortoiseShell
    public final void synpred14_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1606:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1606:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1606:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1606:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1606:10: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1607:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1607:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt89=3;
        switch ( input.LA(1) ) {
        case 42:
            {
            alt89=1;
            }
            break;
        case 43:
            {
            alt89=2;
            }
            break;
        case 44:
            {
            alt89=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 89, 0, input);

            throw nvae;
        }

        switch (alt89) {
            case 1 :
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1607:4: '.'
                {
                match(input,42,FOLLOW_42_in_synpred14_InternalTortoiseShell3932); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1609:6: ( ( '?.' ) )
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1609:6: ( ( '?.' ) )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1610:1: ( '?.' )
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1610:1: ( '?.' )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1611:2: '?.'
                {
                match(input,43,FOLLOW_43_in_synpred14_InternalTortoiseShell3946); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1616:6: ( ( '*.' ) )
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1616:6: ( ( '*.' ) )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1617:1: ( '*.' )
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1617:1: ( '*.' )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1618:2: '*.'
                {
                match(input,44,FOLLOW_44_in_synpred14_InternalTortoiseShell3966); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalTortoiseShell

    // $ANTLR start synpred15_InternalTortoiseShell
    public final void synpred15_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1727:4: ( ( '(' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1728:1: ( '(' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1728:1: ( '(' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1729:2: '('
        {
        match(input,46,FOLLOW_46_in_synpred15_InternalTortoiseShell4193); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalTortoiseShell

    // $ANTLR start synpred16_InternalTortoiseShell
    public final void synpred16_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1748:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1748:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1748:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1748:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1748:6: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1749:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1749:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt91=2;
        int LA91_0 = input.LA(1);

        if ( (LA91_0==RULE_ID||LA91_0==30||LA91_0==46) ) {
            alt91=1;
        }
        switch (alt91) {
            case 1 :
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1749:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1749:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1750:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1750:1: ( ruleJvmFormalParameter )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1751:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalTortoiseShell4245);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1753:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop90:
                do {
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==45) ) {
                        alt90=1;
                    }


                    switch (alt90) {
                	case 1 :
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1753:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,45,FOLLOW_45_in_synpred16_InternalTortoiseShell4252); if (state.failed) return ;
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1754:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1755:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1755:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1756:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalTortoiseShell4259);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop90;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1758:6: ( ( '|' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1759:1: ( '|' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1759:1: ( '|' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1760:2: '|'
        {
        match(input,49,FOLLOW_49_in_synpred16_InternalTortoiseShell4273); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalTortoiseShell

    // $ANTLR start synpred17_InternalTortoiseShell
    public final void synpred17_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1827:4: ( ( () '[' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1827:5: ( () '[' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1827:5: ( () '[' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1827:6: () '['
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1827:6: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1828:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred17_InternalTortoiseShell4393); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalTortoiseShell

    // $ANTLR start synpred18_InternalTortoiseShell
    public final void synpred18_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2018:3: ( ( () '[' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2018:4: ( () '[' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2018:4: ( () '[' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2018:5: () '['
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2018:5: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2019:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred18_InternalTortoiseShell4917); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalTortoiseShell

    // $ANTLR start synpred20_InternalTortoiseShell
    public final void synpred20_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2112:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2112:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2112:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2112:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2112:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt93=2;
        int LA93_0 = input.LA(1);

        if ( (LA93_0==RULE_ID||LA93_0==30||LA93_0==46) ) {
            alt93=1;
        }
        switch (alt93) {
            case 1 :
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2112:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2112:7: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2113:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2113:1: ( ruleJvmFormalParameter )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2114:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalTortoiseShell5196);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2116:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop92:
                do {
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==45) ) {
                        alt92=1;
                    }


                    switch (alt92) {
                	case 1 :
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2116:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,45,FOLLOW_45_in_synpred20_InternalTortoiseShell5203); if (state.failed) return ;
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2117:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2118:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2118:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2119:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalTortoiseShell5210);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop92;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2121:6: ( ( '|' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2122:1: ( '|' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2122:1: ( '|' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2123:2: '|'
        {
        match(input,49,FOLLOW_49_in_synpred20_InternalTortoiseShell5224); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalTortoiseShell

    // $ANTLR start synpred22_InternalTortoiseShell
    public final void synpred22_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2482:4: ( 'else' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2482:6: 'else'
        {
        match(input,52,FOLLOW_52_in_synpred22_InternalTortoiseShell6007); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalTortoiseShell

    // $ANTLR start synpred23_InternalTortoiseShell
    public final void synpred23_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2536:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2536:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2536:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2536:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2536:6: ( ( ruleValidID ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2537:1: ( ruleValidID )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2537:1: ( ruleValidID )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2538:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalTortoiseShell6149);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,54,FOLLOW_54_in_synpred23_InternalTortoiseShell6155); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalTortoiseShell

    // $ANTLR start synpred24_InternalTortoiseShell
    public final void synpred24_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2582:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2582:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2582:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2582:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,46,FOLLOW_46_in_synpred24_InternalTortoiseShell6231); if (state.failed) return ;
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2583:1: ( ( ruleValidID ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2584:1: ( ruleValidID )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2584:1: ( ruleValidID )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2585:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalTortoiseShell6238);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,54,FOLLOW_54_in_synpred24_InternalTortoiseShell6244); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalTortoiseShell

    // $ANTLR start synpred25_InternalTortoiseShell
    public final void synpred25_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3166:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3166:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3166:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3166:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3166:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3167:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3167:1: ( ruleJvmTypeReference )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3168:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalTortoiseShell7509);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3170:2: ( ( ruleValidID ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3171:1: ( ruleValidID )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3171:1: ( ruleValidID )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3172:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalTortoiseShell7518);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalTortoiseShell

    // $ANTLR start synpred26_InternalTortoiseShell
    public final void synpred26_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3470:4: ( ( '(' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3471:1: ( '(' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3471:1: ( '(' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3472:2: '('
        {
        match(input,46,FOLLOW_46_in_synpred26_InternalTortoiseShell8080); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalTortoiseShell

    // $ANTLR start synpred27_InternalTortoiseShell
    public final void synpred27_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3491:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3491:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3491:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3491:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3491:6: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3492:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3492:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt97=2;
        int LA97_0 = input.LA(1);

        if ( (LA97_0==RULE_ID||LA97_0==30||LA97_0==46) ) {
            alt97=1;
        }
        switch (alt97) {
            case 1 :
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3492:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3492:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3493:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3493:1: ( ruleJvmFormalParameter )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3494:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalTortoiseShell8132);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3496:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop96:
                do {
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==45) ) {
                        alt96=1;
                    }


                    switch (alt96) {
                	case 1 :
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3496:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,45,FOLLOW_45_in_synpred27_InternalTortoiseShell8139); if (state.failed) return ;
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3497:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3498:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3498:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3499:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalTortoiseShell8146);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop96;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3501:6: ( ( '|' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3502:1: ( '|' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3502:1: ( '|' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3503:2: '|'
        {
        match(input,49,FOLLOW_49_in_synpred27_InternalTortoiseShell8160); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalTortoiseShell

    // $ANTLR start synpred28_InternalTortoiseShell
    public final void synpred28_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3570:4: ( ( () '[' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3570:5: ( () '[' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3570:5: ( () '[' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3570:6: () '['
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3570:6: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3571:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred28_InternalTortoiseShell8280); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalTortoiseShell

    // $ANTLR start synpred29_InternalTortoiseShell
    public final void synpred29_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3713:4: ( '<' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3713:6: '<'
        {
        match(input,27,FOLLOW_27_in_synpred29_InternalTortoiseShell8667); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalTortoiseShell

    // $ANTLR start synpred30_InternalTortoiseShell
    public final void synpred30_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3762:5: ( '(' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3762:7: '('
        {
        match(input,46,FOLLOW_46_in_synpred30_InternalTortoiseShell8760); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalTortoiseShell

    // $ANTLR start synpred31_InternalTortoiseShell
    public final void synpred31_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3767:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3767:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3767:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3767:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3767:6: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3768:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3768:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( (LA99_0==RULE_ID||LA99_0==30||LA99_0==46) ) {
            alt99=1;
        }
        switch (alt99) {
            case 1 :
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3768:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3768:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3769:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3769:1: ( ruleJvmFormalParameter )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3770:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalTortoiseShell8790);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3772:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop98:
                do {
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==45) ) {
                        alt98=1;
                    }


                    switch (alt98) {
                	case 1 :
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3772:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,45,FOLLOW_45_in_synpred31_InternalTortoiseShell8797); if (state.failed) return ;
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3773:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3774:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3774:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3775:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalTortoiseShell8804);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop98;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3777:6: ( ( '|' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3778:1: ( '|' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3778:1: ( '|' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3779:2: '|'
        {
        match(input,49,FOLLOW_49_in_synpred31_InternalTortoiseShell8818); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalTortoiseShell

    // $ANTLR start synpred32_InternalTortoiseShell
    public final void synpred32_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3846:4: ( ( () '[' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3846:5: ( () '[' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3846:5: ( () '[' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3846:6: () '['
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3846:6: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3847:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred32_InternalTortoiseShell8938); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalTortoiseShell

    // $ANTLR start synpred33_InternalTortoiseShell
    public final void synpred33_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4168:2: ( ( ruleXExpression ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4169:1: ( ruleXExpression )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4169:1: ( ruleXExpression )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4170:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalTortoiseShell9740);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalTortoiseShell

    // $ANTLR start synpred34_InternalTortoiseShell
    public final void synpred34_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4239:5: ( 'catch' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4239:7: 'catch'
        {
        match(input,75,FOLLOW_75_in_synpred34_InternalTortoiseShell9885); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalTortoiseShell

    // $ANTLR start synpred35_InternalTortoiseShell
    public final void synpred35_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4258:5: ( 'finally' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4258:7: 'finally'
        {
        match(input,74,FOLLOW_74_in_synpred35_InternalTortoiseShell9915); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalTortoiseShell

    // $ANTLR start synpred37_InternalTortoiseShell
    public final void synpred37_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4406:3: ( '.' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4407:2: '.'
        {
        match(input,42,FOLLOW_42_in_synpred37_InternalTortoiseShell10262); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalTortoiseShell

    // $ANTLR start synpred38_InternalTortoiseShell
    public final void synpred38_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4530:2: ( ( () '[' ']' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4530:3: ( () '[' ']' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4530:3: ( () '[' ']' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4530:4: () '[' ']'
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4530:4: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4531:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred38_InternalTortoiseShell10645); if (state.failed) return ;
        match(input,50,FOLLOW_50_in_synpred38_InternalTortoiseShell10649); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalTortoiseShell

    // $ANTLR start synpred39_InternalTortoiseShell
    public final void synpred39_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4684:4: ( '<' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4684:6: '<'
        {
        match(input,27,FOLLOW_27_in_synpred39_InternalTortoiseShell11009); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalTortoiseShell

    // Delegated rules

    public final boolean synpred28_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalTortoiseShell_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalTortoiseShell() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalTortoiseShell_fragment(); // can never throw exception
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
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA86 dfa86 = new DFA86(this);
    static final String DFA13_eotS =
        "\13\uffff";
    static final String DFA13_eofS =
        "\1\1\12\uffff";
    static final String DFA13_minS =
        "\1\4\1\uffff\10\0\1\uffff";
    static final String DFA13_maxS =
        "\1\113\1\uffff\10\0\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA13_specialS =
        "\2\uffff\1\7\1\0\1\2\1\3\1\6\1\1\1\4\1\5\1\uffff}>";
    static final String[] DFA13_transitionS = {
            "\5\1\6\uffff\2\1\1\uffff\10\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1"+
            "\11\17\1\1\uffff\17\1\1\uffff\12\1",
            "",
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
            return "()* loopback of 951:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_3 = input.LA(1);

                         
                        int index13_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalTortoiseShell()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_7 = input.LA(1);

                         
                        int index13_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalTortoiseShell()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_4 = input.LA(1);

                         
                        int index13_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalTortoiseShell()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_5 = input.LA(1);

                         
                        int index13_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalTortoiseShell()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_8 = input.LA(1);

                         
                        int index13_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalTortoiseShell()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_9 = input.LA(1);

                         
                        int index13_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalTortoiseShell()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_6 = input.LA(1);

                         
                        int index13_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalTortoiseShell()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_2 = input.LA(1);

                         
                        int index13_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalTortoiseShell()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_2);
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
    static final String DFA29_eotS =
        "\102\uffff";
    static final String DFA29_eofS =
        "\1\2\101\uffff";
    static final String DFA29_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA29_maxS =
        "\1\113\1\0\100\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA29_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA29_transitionS = {
            "\5\2\6\uffff\2\2\1\uffff\34\2\1\1\2\2\1\uffff\17\2\1\uffff\12"+
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
            return "1727:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
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
                        if ( (synpred15_InternalTortoiseShell()) ) {s = 65;}

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
        "\36\uffff";
    static final String DFA28_eofS =
        "\36\uffff";
    static final String DFA28_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA28_maxS =
        "\1\111\2\0\33\uffff";
    static final String DFA28_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA28_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA28_transitionS = {
            "\4\5\1\1\22\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\35\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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
            return "1748:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA28_0==46) ) {s = 2;}

                        else if ( (LA28_0==30) && (synpred16_InternalTortoiseShell())) {s = 3;}

                        else if ( (LA28_0==49) && (synpred16_InternalTortoiseShell())) {s = 4;}

                        else if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_DECIMAL)||LA28_0==27||(LA28_0>=34 && LA28_0<=35)||LA28_0==40||LA28_0==48||LA28_0==51||LA28_0==53||LA28_0==55||(LA28_0>=59 && LA28_0<=61)||LA28_0==64||(LA28_0>=66 && LA28_0<=73)) ) {s = 5;}

                        else if ( (LA28_0==47) ) {s = 29;}

                         
                        input.seek(index28_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalTortoiseShell()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_2 = input.LA(1);

                         
                        int index28_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalTortoiseShell()) ) {s = 4;}

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
        "\102\uffff";
    static final String DFA30_eofS =
        "\1\2\101\uffff";
    static final String DFA30_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA30_maxS =
        "\1\113\1\0\100\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA30_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA30_transitionS = {
            "\5\2\6\uffff\2\2\1\uffff\36\2\1\1\1\uffff\17\2\1\uffff\12\2",
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
            return "1827:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
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
                        if ( (synpred17_InternalTortoiseShell()) ) {s = 65;}

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
        "\1\111\15\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA32_specialS =
        "\16\uffff}>";
    static final String[] DFA32_transitionS = {
            "\4\5\1\4\22\uffff\1\4\22\uffff\1\15\1\uffff\1\5\2\uffff\1\6"+
            "\1\uffff\1\3\1\uffff\1\2\3\uffff\1\7\1\10\1\11\2\uffff\1\4\1"+
            "\uffff\1\1\4\5\1\12\1\13\1\14",
            "",
            "",
            "",
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
            return "1868:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA36_eotS =
        "\40\uffff";
    static final String DFA36_eofS =
        "\40\uffff";
    static final String DFA36_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA36_maxS =
        "\1\111\2\0\35\uffff";
    static final String DFA36_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA36_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA36_transitionS = {
            "\4\5\1\1\22\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\uffff\1\5\1\4\2\5\1\uffff\1\5\1\uffff\1\5\3\uffff"+
            "\6\5\1\uffff\10\5",
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
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "2112:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_0 = input.LA(1);

                         
                        int index36_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA36_0==RULE_ID) ) {s = 1;}

                        else if ( (LA36_0==46) ) {s = 2;}

                        else if ( (LA36_0==30) && (synpred20_InternalTortoiseShell())) {s = 3;}

                        else if ( (LA36_0==49) && (synpred20_InternalTortoiseShell())) {s = 4;}

                        else if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_DECIMAL)||LA36_0==27||(LA36_0>=34 && LA36_0<=35)||LA36_0==40||LA36_0==48||(LA36_0>=50 && LA36_0<=51)||LA36_0==53||LA36_0==55||(LA36_0>=59 && LA36_0<=64)||(LA36_0>=66 && LA36_0<=73)) ) {s = 5;}

                         
                        input.seek(index36_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_1 = input.LA(1);

                         
                        int index36_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalTortoiseShell()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index36_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_2 = input.LA(1);

                         
                        int index36_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalTortoiseShell()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index36_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA60_eotS =
        "\102\uffff";
    static final String DFA60_eofS =
        "\1\2\101\uffff";
    static final String DFA60_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA60_maxS =
        "\1\113\1\0\100\uffff";
    static final String DFA60_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA60_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA60_transitionS = {
            "\5\2\6\uffff\2\2\1\uffff\34\2\1\1\2\2\1\uffff\17\2\1\uffff\12"+
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
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "3470:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_1 = input.LA(1);

                         
                        int index60_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index60_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA59_eotS =
        "\36\uffff";
    static final String DFA59_eofS =
        "\36\uffff";
    static final String DFA59_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA59_maxS =
        "\1\111\2\0\33\uffff";
    static final String DFA59_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA59_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA59_transitionS = {
            "\4\5\1\1\22\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\35\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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
            ""
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "3491:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_0 = input.LA(1);

                         
                        int index59_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA59_0==RULE_ID) ) {s = 1;}

                        else if ( (LA59_0==46) ) {s = 2;}

                        else if ( (LA59_0==30) && (synpred27_InternalTortoiseShell())) {s = 3;}

                        else if ( (LA59_0==49) && (synpred27_InternalTortoiseShell())) {s = 4;}

                        else if ( ((LA59_0>=RULE_STRING && LA59_0<=RULE_DECIMAL)||LA59_0==27||(LA59_0>=34 && LA59_0<=35)||LA59_0==40||LA59_0==48||LA59_0==51||LA59_0==53||LA59_0==55||(LA59_0>=59 && LA59_0<=61)||LA59_0==64||(LA59_0>=66 && LA59_0<=73)) ) {s = 5;}

                        else if ( (LA59_0==47) ) {s = 29;}

                         
                        input.seek(index59_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalTortoiseShell()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA59_2 = input.LA(1);

                         
                        int index59_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalTortoiseShell()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index59_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA61_eotS =
        "\102\uffff";
    static final String DFA61_eofS =
        "\1\2\101\uffff";
    static final String DFA61_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA61_maxS =
        "\1\113\1\0\100\uffff";
    static final String DFA61_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA61_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA61_transitionS = {
            "\5\2\6\uffff\2\2\1\uffff\36\2\1\1\1\uffff\17\2\1\uffff\12\2",
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
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "3570:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_1 = input.LA(1);

                         
                        int index61_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index61_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\102\uffff";
    static final String DFA65_eofS =
        "\1\2\101\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA65_maxS =
        "\1\113\1\0\100\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA65_transitionS = {
            "\5\2\6\uffff\2\2\1\uffff\11\2\1\1\25\2\1\uffff\17\2\1\uffff"+
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
            return "3713:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
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
                        if ( (synpred29_InternalTortoiseShell()) ) {s = 65;}

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
    static final String DFA68_eotS =
        "\102\uffff";
    static final String DFA68_eofS =
        "\1\2\101\uffff";
    static final String DFA68_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA68_maxS =
        "\1\113\1\0\100\uffff";
    static final String DFA68_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA68_transitionS = {
            "\5\2\6\uffff\2\2\1\uffff\34\2\1\1\2\2\1\uffff\17\2\1\uffff\12"+
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
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "3762:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\36\uffff";
    static final String DFA67_eofS =
        "\36\uffff";
    static final String DFA67_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA67_maxS =
        "\1\111\2\0\33\uffff";
    static final String DFA67_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA67_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA67_transitionS = {
            "\4\5\1\1\22\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
            "\uffff\1\2\1\35\1\5\1\4\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "3767:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_0 = input.LA(1);

                         
                        int index67_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA67_0==RULE_ID) ) {s = 1;}

                        else if ( (LA67_0==46) ) {s = 2;}

                        else if ( (LA67_0==30) && (synpred31_InternalTortoiseShell())) {s = 3;}

                        else if ( (LA67_0==49) && (synpred31_InternalTortoiseShell())) {s = 4;}

                        else if ( ((LA67_0>=RULE_STRING && LA67_0<=RULE_DECIMAL)||LA67_0==27||(LA67_0>=34 && LA67_0<=35)||LA67_0==40||LA67_0==48||LA67_0==51||LA67_0==53||LA67_0==55||(LA67_0>=59 && LA67_0<=61)||LA67_0==64||(LA67_0>=66 && LA67_0<=73)) ) {s = 5;}

                        else if ( (LA67_0==47) ) {s = 29;}

                         
                        input.seek(index67_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalTortoiseShell()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_2 = input.LA(1);

                         
                        int index67_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalTortoiseShell()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index67_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA69_eotS =
        "\102\uffff";
    static final String DFA69_eofS =
        "\1\2\101\uffff";
    static final String DFA69_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA69_maxS =
        "\1\113\1\0\100\uffff";
    static final String DFA69_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA69_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA69_transitionS = {
            "\5\2\6\uffff\2\2\1\uffff\36\2\1\1\1\uffff\17\2\1\uffff\12\2",
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
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "3846:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_1 = input.LA(1);

                         
                        int index69_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA71_eotS =
        "\102\uffff";
    static final String DFA71_eofS =
        "\1\33\101\uffff";
    static final String DFA71_minS =
        "\1\4\32\0\47\uffff";
    static final String DFA71_maxS =
        "\1\113\32\0\47\uffff";
    static final String DFA71_acceptS =
        "\33\uffff\1\2\45\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\47\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\21\1\15\1\16\1\17\1\1\6\uffff\2\33\1\uffff\11\33\1\10\6\33"+
            "\1\4\1\3\4\33\1\2\5\33\1\32\1\33\1\12\1\uffff\1\33\1\23\1\33"+
            "\1\7\1\33\1\6\3\33\1\24\1\25\1\26\2\33\1\11\1\uffff\1\5\1\13"+
            "\1\14\1\20\1\22\1\27\1\30\1\31\2\33",
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
            ""
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "4168:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_1 = input.LA(1);

                         
                        int index71_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA71_2 = input.LA(1);

                         
                        int index71_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA71_3 = input.LA(1);

                         
                        int index71_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA71_4 = input.LA(1);

                         
                        int index71_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA71_5 = input.LA(1);

                         
                        int index71_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA71_6 = input.LA(1);

                         
                        int index71_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA71_7 = input.LA(1);

                         
                        int index71_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA71_8 = input.LA(1);

                         
                        int index71_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA71_9 = input.LA(1);

                         
                        int index71_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA71_10 = input.LA(1);

                         
                        int index71_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA71_11 = input.LA(1);

                         
                        int index71_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA71_12 = input.LA(1);

                         
                        int index71_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA71_13 = input.LA(1);

                         
                        int index71_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA71_14 = input.LA(1);

                         
                        int index71_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA71_15 = input.LA(1);

                         
                        int index71_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA71_16 = input.LA(1);

                         
                        int index71_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA71_17 = input.LA(1);

                         
                        int index71_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA71_18 = input.LA(1);

                         
                        int index71_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA71_19 = input.LA(1);

                         
                        int index71_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA71_20 = input.LA(1);

                         
                        int index71_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA71_21 = input.LA(1);

                         
                        int index71_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA71_22 = input.LA(1);

                         
                        int index71_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA71_23 = input.LA(1);

                         
                        int index71_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA71_24 = input.LA(1);

                         
                        int index71_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA71_25 = input.LA(1);

                         
                        int index71_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA71_26 = input.LA(1);

                         
                        int index71_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index71_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA86_eotS =
        "\102\uffff";
    static final String DFA86_eofS =
        "\1\2\101\uffff";
    static final String DFA86_minS =
        "\1\4\1\0\100\uffff";
    static final String DFA86_maxS =
        "\1\113\1\0\100\uffff";
    static final String DFA86_acceptS =
        "\2\uffff\1\2\76\uffff\1\1";
    static final String DFA86_specialS =
        "\1\uffff\1\0\100\uffff}>";
    static final String[] DFA86_transitionS = {
            "\5\2\6\uffff\2\2\1\uffff\11\2\1\1\25\2\1\uffff\17\2\1\uffff"+
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
            ""
    };

    static final short[] DFA86_eot = DFA.unpackEncodedString(DFA86_eotS);
    static final short[] DFA86_eof = DFA.unpackEncodedString(DFA86_eofS);
    static final char[] DFA86_min = DFA.unpackEncodedStringToUnsignedChars(DFA86_minS);
    static final char[] DFA86_max = DFA.unpackEncodedStringToUnsignedChars(DFA86_maxS);
    static final short[] DFA86_accept = DFA.unpackEncodedString(DFA86_acceptS);
    static final short[] DFA86_special = DFA.unpackEncodedString(DFA86_specialS);
    static final short[][] DFA86_transition;

    static {
        int numStates = DFA86_transitionS.length;
        DFA86_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA86_transition[i] = DFA.unpackEncodedString(DFA86_transitionS[i]);
        }
    }

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = DFA86_eot;
            this.eof = DFA86_eof;
            this.min = DFA86_min;
            this.max = DFA86_max;
            this.accept = DFA86_accept;
            this.special = DFA86_special;
            this.transition = DFA86_transition;
        }
        public String getDescription() {
            return "4684:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA86_1 = input.LA(1);

                         
                        int index86_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalTortoiseShell()) ) {s = 65;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index86_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 86, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_ruleProgram131 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleProgram152 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFunction236 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFunction257 = new BitSet(new long[]{0x0000400040004100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleFunction278 = new BitSet(new long[]{0x0000400040004100L});
    public static final BitSet FOLLOW_ruleBody_in_ruleFunction300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleBody392 = new BitSet(new long[]{0xF8A9410C080101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleBody414 = new BitSet(new long[]{0xF8A9410C080181F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_15_in_ruleBody427 = new BitSet(new long[]{0xF8A9410C080101F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_16_in_ruleBody443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment637 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment653 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment703 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment756 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpSingleAssign867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpMultiAssign955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1051 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1104 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1127 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpOr1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1310 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1363 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1386 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpAnd1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1569 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1622 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1645 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpEquality1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpEquality1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1849 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_23_in_ruleXRelationalExpression1885 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1908 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1969 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1992 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpCompare2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2235 = new BitSet(new long[]{0x00000003FC000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2288 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2311 = new BitSet(new long[]{0x00000003FC000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2457 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2488 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2544 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2575 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2765 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2818 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2841 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpAdd2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpAdd2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3045 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3098 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3121 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpMulti3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpMulti3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3374 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpUnary3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpUnary3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpUnary3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3644 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleXCastedExpression3679 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3702 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3797 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall3846 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3869 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3885 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3907 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall3993 = new BitSet(new long[]{0x0000000008000100L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4017 = new BitSet(new long[]{0x0000000008000100L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4054 = new BitSet(new long[]{0x0000000008000100L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall4083 = new BitSet(new long[]{0x0000400040000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4104 = new BitSet(new long[]{0x0000200004000000L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4117 = new BitSet(new long[]{0x0000400040000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4138 = new BitSet(new long[]{0x0000200004000000L});
    public static final BitSet FOLLOW_26_in_ruleXMemberFeatureCall4152 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4177 = new BitSet(new long[]{0x00015C0000000002L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall4211 = new BitSet(new long[]{0xF8ABC10C480001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4296 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4324 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4337 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4358 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall4375 = new BitSet(new long[]{0x00011C0000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4410 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXClosure5177 = new BitSet(new long[]{0xF8AF410C480001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5250 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXClosure5263 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5284 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_ruleXClosure5306 = new BitSet(new long[]{0xF8AD410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5343 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXClosure5355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5457 = new BitSet(new long[]{0xF8A9410C080081F2L,0x00000000000003FDL});
    public static final BitSet FOLLOW_15_in_ruleXExpressionInClosure5470 = new BitSet(new long[]{0xF8A9410C080001F2L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5628 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXShortClosure5641 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5662 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_ruleXShortClosure5684 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXParenthesizedExpression5803 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5825 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXParenthesizedExpression5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXIfExpression5928 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXIfExpression5940 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5961 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXIfExpression5973 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5994 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXIfExpression6015 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6131 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6174 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6186 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6210 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_46_in_ruleXSwitchExpression6254 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6275 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6287 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6310 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXSwitchExpression6322 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6336 = new BitSet(new long[]{0x0440400040000100L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6357 = new BitSet(new long[]{0x0740400040000100L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6371 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6383 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6404 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6510 = new BitSet(new long[]{0x0440000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXCasePart6524 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6545 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXCasePart6559 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXForLoopExpression6672 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXForLoopExpression6684 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6705 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXForLoopExpression6717 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6738 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXForLoopExpression6750 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXWhileExpression6863 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXWhileExpression6875 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6896 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXWhileExpression6908 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXDoWhileExpression7021 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7042 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXDoWhileExpression7054 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXDoWhileExpression7066 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7087 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXDoWhileExpression7099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXBlockExpression7191 = new BitSet(new long[]{0xFAA9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7213 = new BitSet(new long[]{0xFAA9410C080081F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_15_in_ruleXBlockExpression7226 = new BitSet(new long[]{0xFAA9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_57_in_ruleXBlockExpression7242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXVariableDeclaration7460 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_63_in_ruleXVariableDeclaration7491 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7539 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7560 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7589 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleXVariableDeclaration7603 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7718 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7832 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7956 = new BitSet(new long[]{0x0000000008000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_27_in_ruleXFeatureCall7970 = new BitSet(new long[]{0x0000400040000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7991 = new BitSet(new long[]{0x0000200004000000L});
    public static final BitSet FOLLOW_45_in_ruleXFeatureCall8004 = new BitSet(new long[]{0x0000400040000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8025 = new BitSet(new long[]{0x0000200004000000L});
    public static final BitSet FOLLOW_26_in_ruleXFeatureCall8039 = new BitSet(new long[]{0x0000000008000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8064 = new BitSet(new long[]{0x0001400000000002L});
    public static final BitSet FOLLOW_46_in_ruleXFeatureCall8098 = new BitSet(new long[]{0xF8ABC10C480001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8183 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8211 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFeatureCall8224 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8245 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_47_in_ruleXFeatureCall8262 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleIdOrSuper8417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleStaticQualifier8534 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXConstructorCall8631 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8654 = new BitSet(new long[]{0x0001400008000002L});
    public static final BitSet FOLLOW_27_in_ruleXConstructorCall8675 = new BitSet(new long[]{0x0000400040000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8697 = new BitSet(new long[]{0x0000200004000000L});
    public static final BitSet FOLLOW_45_in_ruleXConstructorCall8710 = new BitSet(new long[]{0x0000400040000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8731 = new BitSet(new long[]{0x0000200004000000L});
    public static final BitSet FOLLOW_26_in_ruleXConstructorCall8745 = new BitSet(new long[]{0x0001400000000002L});
    public static final BitSet FOLLOW_46_in_ruleXConstructorCall8768 = new BitSet(new long[]{0xF8ABC10C480001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8841 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8869 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_45_in_ruleXConstructorCall8882 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8903 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_47_in_ruleXConstructorCall8920 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall8955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXBooleanLiteral9049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXBooleanLiteral9073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXNullLiteral9179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXTypeLiteral9474 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXTypeLiteral9486 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9509 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXTypeLiteral9521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXThrowExpression9613 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXReturnExpression9726 = new BitSet(new long[]{0xF8A9410C080001F2L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXTryCatchFinallyExpression9850 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9901 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_74_in_ruleXTryCatchFinallyExpression9923 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXTryCatchFinallyExpression9967 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXCatchClause10081 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXCatchClause10094 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10115 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXCatchClause10127 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10243 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleQualifiedName10271 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10294 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10431 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10457 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleNumber10477 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10630 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleJvmTypeReference10668 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleJvmTypeReference10680 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXFunctionTypeRef10795 = new BitSet(new long[]{0x0000C00040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10817 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFunctionTypeRef10830 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10851 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_47_in_ruleXFunctionTypeRef10867 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXFunctionTypeRef10881 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10996 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleJvmParameterizedTypeReference11017 = new BitSet(new long[]{0x0000400040000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11039 = new BitSet(new long[]{0x0000200004000000L});
    public static final BitSet FOLLOW_45_in_ruleJvmParameterizedTypeReference11052 = new BitSet(new long[]{0x0000400040000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11073 = new BitSet(new long[]{0x0000200004000000L});
    public static final BitSet FOLLOW_26_in_ruleJvmParameterizedTypeReference11087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmWildcardTypeReference11300 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002001L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJvmUpperBound11434 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleJvmUpperBoundAnded11538 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleJvmLowerBound11642 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalTortoiseShell724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalTortoiseShell1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalTortoiseShell1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalTortoiseShell1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred5_InternalTortoiseShell1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalTortoiseShell1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalTortoiseShell2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred8_InternalTortoiseShell2472 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_synpred8_InternalTortoiseShell2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred9_InternalTortoiseShell2559 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_synpred9_InternalTortoiseShell2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalTortoiseShell2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalTortoiseShell3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred12_InternalTortoiseShell3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred13_InternalTortoiseShell3814 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred13_InternalTortoiseShell3823 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalTortoiseShell3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred14_InternalTortoiseShell3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred14_InternalTortoiseShell3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred14_InternalTortoiseShell3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred15_InternalTortoiseShell4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalTortoiseShell4245 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_synpred16_InternalTortoiseShell4252 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalTortoiseShell4259 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_synpred16_InternalTortoiseShell4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred17_InternalTortoiseShell4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred18_InternalTortoiseShell4917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalTortoiseShell5196 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_synpred20_InternalTortoiseShell5203 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalTortoiseShell5210 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_synpred20_InternalTortoiseShell5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred22_InternalTortoiseShell6007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalTortoiseShell6149 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_synpred23_InternalTortoiseShell6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred24_InternalTortoiseShell6231 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalTortoiseShell6238 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_synpred24_InternalTortoiseShell6244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalTortoiseShell7509 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalTortoiseShell7518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred26_InternalTortoiseShell8080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalTortoiseShell8132 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_synpred27_InternalTortoiseShell8139 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalTortoiseShell8146 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_synpred27_InternalTortoiseShell8160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred28_InternalTortoiseShell8280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred29_InternalTortoiseShell8667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred30_InternalTortoiseShell8760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalTortoiseShell8790 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_synpred31_InternalTortoiseShell8797 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalTortoiseShell8804 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_synpred31_InternalTortoiseShell8818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred32_InternalTortoiseShell8938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalTortoiseShell9740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_synpred34_InternalTortoiseShell9885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_synpred35_InternalTortoiseShell9915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred37_InternalTortoiseShell10262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred38_InternalTortoiseShell10645 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_synpred38_InternalTortoiseShell10649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred39_InternalTortoiseShell11009 = new BitSet(new long[]{0x0000000000000002L});

}