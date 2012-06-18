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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:262:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:263:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:264:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression481);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression491); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:271:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:274:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:276:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression537);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:292:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:293:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:294:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment571);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment581); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:301:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:304:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:305:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:305:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:305:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:305:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:305:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:305:3: ()
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:306:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:311:2: ( ( ruleValidID ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:312:1: ( ruleValidID )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:312:1: ( ruleValidID )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:313:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment639);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment655);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:334:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:335:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:335:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:336:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment675);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:353:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:353:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:354:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment705);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:362:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
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
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:362:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:362:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:362:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:367:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:367:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:367:7: ()
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:368:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:373:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:374:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:374:1: ( ruleOpMultiAssign )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:375:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment758);
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

                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:388:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:389:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:389:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:390:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment781);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:414:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:415:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:416:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign821);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign832); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:423:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:426:28: (kw= '=' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:428:2: kw= '='
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleOpSingleAssign869); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:441:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:442:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:443:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign909);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign920); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:450:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:453:28: (kw= '+=' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:455:2: kw= '+='
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpMultiAssign957); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:468:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:469:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:470:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression996);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1006); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:477:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:480:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:481:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:481:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:482:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1053);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:490:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
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
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:490:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:490:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:490:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:495:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:495:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:495:7: ()
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:496:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:501:2: ( ( ruleOpOr ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:502:1: ( ruleOpOr )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:502:1: ( ruleOpOr )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:503:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1106);
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

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:516:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:517:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:517:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:518:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1129);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:542:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:543:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:544:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1168);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1179); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:551:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:554:28: (kw= '||' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:556:2: kw= '||'
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpOr1216); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:569:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:570:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:571:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1255);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1265); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:578:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:581:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:582:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:582:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:583:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1312);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:591:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
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
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:591:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:591:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:591:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:596:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:596:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:596:7: ()
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:597:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:602:2: ( ( ruleOpAnd ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:603:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:603:1: ( ruleOpAnd )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:604:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1365);
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

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:617:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:618:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:618:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:619:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1388);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:643:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:644:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:645:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1427);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1438); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:652:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:655:28: (kw= '&&' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:657:2: kw= '&&'
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpAnd1475); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:670:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:671:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:672:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1514);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1524); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:679:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:682:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:683:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:683:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:684:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1571);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:692:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
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
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:692:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:692:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:692:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:697:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:697:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:697:7: ()
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:698:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:703:2: ( ( ruleOpEquality ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:704:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:704:1: ( ruleOpEquality )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:705:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1624);
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

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:718:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:719:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:719:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:720:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1647);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:744:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:745:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:746:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1686);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1697); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:753:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:756:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:757:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:757:1: (kw= '==' | kw= '!=' )
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:758:2: kw= '=='
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOpEquality1735); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:765:2: kw= '!='
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleOpEquality1754); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:778:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:779:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:780:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1794);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression1804); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:787:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:790:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:791:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:791:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:792:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1851);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:800:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
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
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:800:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:800:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:800:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:800:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:800:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:802:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:802:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:802:6: ()
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:803:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleXRelationalExpression1887); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:812:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:813:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:813:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:814:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1910);
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
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:831:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:831:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:831:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:831:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:831:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:836:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:836:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:836:7: ()
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:837:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:842:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:843:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:843:1: ( ruleOpCompare )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:844:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1971);
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

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:857:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:858:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:858:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:859:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1994);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:883:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:884:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:885:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2034);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2045); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:892:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:895:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:896:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:896:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:897:2: kw= '>='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpCompare2083); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:904:2: kw= '<='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare2102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:911:2: kw= '>'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2121); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:918:2: kw= '<'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2140); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:931:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:932:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:933:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2180);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2190); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:940:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:943:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:944:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:944:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:945:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2237);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:953:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:953:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:953:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:953:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:958:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:958:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:958:7: ()
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:959:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:964:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:965:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:965:1: ( ruleOpOther )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:966:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2290);
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

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:979:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:980:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:980:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:981:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2313);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1005:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1006:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1007:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2352);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2363); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1014:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1017:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1018:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1018:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1019:2: kw= '->'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1026:2: kw= '..'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2420); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1033:2: kw= '=>'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2439); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1039:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1039:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1040:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2459); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1045:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
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
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1045:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1045:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1045:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1049:5: (kw= '>' kw= '>' )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1050:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2490); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2503); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1063:2: kw= '>'
                            {
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2524); if (state.failed) return current;
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1069:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1069:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1070:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2546); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1075:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
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
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1075:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1075:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1075:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1079:5: (kw= '<' kw= '<' )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1080:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2577); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2590); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1093:2: kw= '<'
                            {
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2611); if (state.failed) return current;
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1100:2: kw= '<>'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1107:2: kw= '?:'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2651); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1114:2: kw= '<=>'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2670); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1127:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1128:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1129:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2710);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2720); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1136:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1139:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1140:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1140:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1141:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2767);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1149:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
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
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1149:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1149:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1149:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1154:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1154:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1154:7: ()
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1155:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1160:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1161:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1161:1: ( ruleOpAdd )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1162:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2820);
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

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1175:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1176:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1176:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1177:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2843);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1201:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1202:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1203:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2882);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2893); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1210:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1213:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1214:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1214:1: (kw= '+' | kw= '-' )
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1215:2: kw= '+'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpAdd2931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1222:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpAdd2950); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1235:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1236:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1237:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2990);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3000); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1244:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1247:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1248:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1248:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1249:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3047);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1257:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
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
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1257:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1257:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1257:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1262:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1262:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1262:7: ()
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1263:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1268:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1269:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1269:1: ( ruleOpMulti )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1270:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3100);
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

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1283:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1284:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1284:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1285:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3123);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1309:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1310:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1311:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3162);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3173); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1318:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1321:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1322:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1322:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1323:2: kw= '*'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1330:2: kw= '**'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti3230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1337:2: kw= '/'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpMulti3249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1344:2: kw= '%'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpMulti3268); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1357:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1358:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1359:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3308);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3318); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1366:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1369:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1370:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1370:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1370:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1370:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1370:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1370:3: ()
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1371:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1376:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1377:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1377:1: ( ruleOpUnary )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1378:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3376);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1391:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1392:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1392:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1393:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3397);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1411:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3426);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1427:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1428:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1429:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3462);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3473); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1436:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1439:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1440:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1440:1: (kw= '!' | kw= '-' | kw= '+' )
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1441:2: kw= '!'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpUnary3511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1448:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpUnary3530); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1455:2: kw= '+'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpUnary3549); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1468:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1469:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1470:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3589);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3599); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1477:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1480:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1481:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1481:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1482:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3646);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1490:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
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
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1490:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1490:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1490:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1492:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1492:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1492:6: ()
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1493:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXCastedExpression3681); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1502:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1503:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1503:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1504:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3704);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1528:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1529:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1530:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3742);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3752); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1537:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1540:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1541:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1541:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1542:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3799);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1550:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
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
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1550:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1550:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1550:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1550:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1550:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1556:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1556:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1556:26: ()
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1557:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall3848); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1566:1: ( ( ruleValidID ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1567:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1567:1: ( ruleValidID )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1568:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3871);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3887);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1589:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1590:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1590:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1591:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3909);
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
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1608:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1608:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1608:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1608:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1608:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1624:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1624:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1624:8: ()
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1625:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1630:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
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
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1630:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall3995); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1635:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1635:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1636:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1636:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1637:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4019); if (state.failed) return current;
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
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1651:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1651:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1652:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1652:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1653:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4056); if (state.failed) return current;
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

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1666:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==27) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1666:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall4085); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1670:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1671:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1671:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1672:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4106);
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

            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1688:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop25:
            	            do {
            	                int alt25=2;
            	                int LA25_0 = input.LA(1);

            	                if ( (LA25_0==45) ) {
            	                    alt25=1;
            	                }


            	                switch (alt25) {
            	            	case 1 :
            	            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1688:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4119); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1692:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1693:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1693:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1694:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4140);
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

            	            otherlv_14=(Token)match(input,26,FOLLOW_26_in_ruleXMemberFeatureCall4154); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1714:3: ( ( ruleValidID ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1715:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1715:1: ( ruleValidID )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1716:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4179);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1729:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt29=2;
            	    alt29 = dfa29.predict(input);
            	    switch (alt29) {
            	        case 1 :
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1729:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1729:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1729:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1736:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1737:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall4213); if (state.failed) return current;
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

            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1750:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt28=3;
            	            alt28 = dfa28.predict(input);
            	            switch (alt28) {
            	                case 1 :
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1750:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1750:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1750:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1767:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1768:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4298);
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
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1785:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1785:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1785:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1785:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1786:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1786:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1787:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4326);
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

            	                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1803:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop27:
            	                    do {
            	                        int alt27=2;
            	                        int LA27_0 = input.LA(1);

            	                        if ( (LA27_0==45) ) {
            	                            alt27=1;
            	                        }


            	                        switch (alt27) {
            	                    	case 1 :
            	                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1803:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4339); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1807:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1808:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1808:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1809:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4360);
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

            	            otherlv_21=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall4377); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1829:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt30=2;
            	    alt30 = dfa30.predict(input);
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1829:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1832:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1833:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4412);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1857:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1858:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1859:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4452);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4462); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1866:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1869:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1870:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1870:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt32=13;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1871:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4509);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1881:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4536);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1891:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4563);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1901:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4590);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1911:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4617);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1921:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4644);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1931:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4671);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1941:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4698);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1951:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4725);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1961:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4752);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1971:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4779);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1981:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4806);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1991:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4833);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2007:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2008:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2009:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4868);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4878); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2016:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2019:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2020:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2020:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2020:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2020:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2020:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4938);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2033:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4966);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2043:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4993);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2053:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5020);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2063:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5047);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2073:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5074);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2089:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2090:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2091:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5109);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5119); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2098:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2101:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2102:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2102:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2102:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2102:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2102:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2104:5: ( () otherlv_1= '[' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2104:6: () otherlv_1= '['
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2104:6: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2105:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXClosure5179); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2114:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2114:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2129:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2129:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2129:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_ID||LA35_0==30||LA35_0==46) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2129:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2129:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2130:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2130:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2131:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5252);
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

                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2147:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==45) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2147:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleXClosure5265); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2151:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2152:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2152:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2153:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5286);
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

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2169:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2170:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2170:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2171:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,49,FOLLOW_49_in_ruleXClosure5308); if (state.failed) return current;
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

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2184:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2185:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2185:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2186:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5345);
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

            otherlv_7=(Token)match(input,50,FOLLOW_50_in_ruleXClosure5357); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2214:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2215:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2216:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5393);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5403); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2223:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2226:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2227:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2227:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2227:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2227:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2228:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2233:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_ID)||LA38_0==27||(LA38_0>=34 && LA38_0<=35)||LA38_0==40||LA38_0==46||LA38_0==48||LA38_0==51||LA38_0==53||LA38_0==55||(LA38_0>=59 && LA38_0<=64)||(LA38_0>=66 && LA38_0<=73)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2233:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2233:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2234:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2234:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2235:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5459);
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

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2251:2: (otherlv_2= ';' )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==15) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2251:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleXExpressionInClosure5472); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2263:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2264:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2265:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5512);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5522); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2272:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2275:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2276:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2276:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2276:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2276:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2276:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2292:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2292:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2292:7: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2293:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2298:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID||LA40_0==30||LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2298:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2298:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2299:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2299:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2300:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5630);
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

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2316:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==45) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2316:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXShortClosure5643); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2320:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2321:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2321:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2322:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5664);
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

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2338:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2339:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2339:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2340:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,49,FOLLOW_49_in_ruleXShortClosure5686); if (state.failed) return current;
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

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2353:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2354:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2354:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2355:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5722);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2379:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2380:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2381:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5758);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5768); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2388:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2391:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2392:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2392:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2392:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleXParenthesizedExpression5805); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5827);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXParenthesizedExpression5838); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2417:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2418:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2419:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5874);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5884); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2426:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2429:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2430:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2430:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2430:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2430:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2431:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXIfExpression5930); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXIfExpression5942); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2444:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2445:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2445:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2446:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5963);
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

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXIfExpression5975); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2466:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2467:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2467:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2468:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5996);
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

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2484:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2484:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2484:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2484:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,52,FOLLOW_52_in_ruleXIfExpression6017); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2489:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2490:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2490:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2491:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6039);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2515:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2516:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2517:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6077);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6087); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2524:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2527:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2528:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2528:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2528:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2528:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2529:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6133); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2538:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2538:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2538:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2538:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2538:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
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
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2538:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2543:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2543:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2543:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2544:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2544:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2545:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6176);
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

                            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6188); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2565:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2566:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2566:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2567:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6212);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2584:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2584:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2584:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2584:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2584:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2590:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2590:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleXSwitchExpression6256); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2594:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2595:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2595:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2596:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6277);
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

                    otherlv_7=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6289); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2616:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2617:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2617:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2618:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6312);
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

                    otherlv_9=(Token)match(input,47,FOLLOW_47_in_ruleXSwitchExpression6324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6338); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2642:1: ( (lv_cases_11_0= ruleXCasePart ) )+
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
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2643:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2643:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2644:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6359);
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

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2660:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==56) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2660:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2668:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2669:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2669:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2670:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6406);
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

            otherlv_15=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6420); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2698:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2699:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2700:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6456);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6466); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2707:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2710:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2711:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2711:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2711:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2711:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==30||LA46_0==46) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2712:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2712:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2713:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6512);
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

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2729:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==58) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2729:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXCasePart6526); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2733:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2734:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2734:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2735:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6547);
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

            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXCasePart6561); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2755:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2756:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2756:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2757:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6582);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2781:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2782:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2783:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6618);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6628); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2790:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2793:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2794:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2794:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2794:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2794:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2795:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXForLoopExpression6674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXForLoopExpression6686); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2808:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2809:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2809:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2810:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6707);
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

            otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleXForLoopExpression6719); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2830:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2831:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2831:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2832:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6740);
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

            otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleXForLoopExpression6752); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2852:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2853:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2853:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2854:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6773);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2878:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2879:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2880:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6809);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6819); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2887:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2890:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2891:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2891:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2891:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2891:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2892:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXWhileExpression6865); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXWhileExpression6877); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2905:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2906:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2906:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2907:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6898);
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

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXWhileExpression6910); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2927:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2928:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2928:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2929:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6931);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2953:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2954:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2955:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6967);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6977); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2962:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2965:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2966:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2966:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2966:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2966:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2967:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXDoWhileExpression7023); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2976:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2977:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2977:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2978:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7044);
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

            otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleXDoWhileExpression7056); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleXDoWhileExpression7068); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3002:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3003:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3003:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3004:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7089);
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

            otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleXDoWhileExpression7101); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3032:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3033:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3034:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7137);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7147); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3041:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3044:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3045:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3045:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3045:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3045:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3046:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXBlockExpression7193); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3055:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_ID)||LA49_0==27||(LA49_0>=34 && LA49_0<=35)||LA49_0==40||LA49_0==46||LA49_0==48||LA49_0==51||LA49_0==53||LA49_0==55||(LA49_0>=59 && LA49_0<=64)||(LA49_0>=66 && LA49_0<=73)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3055:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3055:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3056:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3056:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3057:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7215);
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

            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3073:2: (otherlv_3= ';' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==15) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3073:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleXBlockExpression7228); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,57,FOLLOW_57_in_ruleXBlockExpression7244); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3089:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3090:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3091:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7280);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7290); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3098:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3101:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3102:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3102:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3103:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7337);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3113:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7364);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3129:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3130:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3131:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7399);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7409); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3138:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3141:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3142:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3142:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3142:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3142:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3143:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3148:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3148:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3148:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3149:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3149:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3150:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,62,FOLLOW_62_in_ruleXVariableDeclaration7462); if (state.failed) return current;
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3164:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleXVariableDeclaration7493); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3168:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3168:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3168:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3168:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3176:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3176:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3176:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3177:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3177:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3178:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7541);
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

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3194:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3195:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3195:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3196:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7562);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3213:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3213:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3214:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3214:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3215:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7591);
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

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3231:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==17) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3231:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleXVariableDeclaration7605); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3235:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3236:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3236:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3237:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7626);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3261:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3262:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3263:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7664);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7674); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3270:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3273:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3274:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3274:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3274:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3274:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3275:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3275:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3276:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7720);
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

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3292:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3293:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3293:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3294:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7742);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3318:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3319:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3320:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7778);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7788); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3327:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3330:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3331:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3331:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3331:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3331:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3332:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3332:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3333:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7834);
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

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3349:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3350:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3350:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3351:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7855);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3375:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3376:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3377:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7891);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7901); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3384:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3387:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3388:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3388:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3388:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3388:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3389:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3394:2: ( ( ruleStaticQualifier ) )?
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3395:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3395:1: ( ruleStaticQualifier )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3396:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7958);
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

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3409:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==27) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3409:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXFeatureCall7972); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3413:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3414:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3414:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3415:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7993);
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

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3431:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==45) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3431:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXFeatureCall8006); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3435:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3436:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3436:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3437:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8027);
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

                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleXFeatureCall8041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3457:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3458:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3458:1: ( ruleIdOrSuper )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3459:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8066);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3472:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3472:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3472:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3472:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3479:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3480:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,46,FOLLOW_46_in_ruleXFeatureCall8100); if (state.failed) return current;
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

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3493:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt59=3;
                    alt59 = dfa59.predict(input);
                    switch (alt59) {
                        case 1 :
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3493:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3493:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3493:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3510:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3511:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8185);
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
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3528:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3528:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3528:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3528:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3529:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3529:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3530:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8213);
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

                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3546:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==45) ) {
                                    alt58=1;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3546:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,45,FOLLOW_45_in_ruleXFeatureCall8226); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3550:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3551:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3551:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3552:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8247);
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

                    otherlv_13=(Token)match(input,47,FOLLOW_47_in_ruleXFeatureCall8264); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3572:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3572:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3575:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3576:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8299);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3600:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3601:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3602:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8337);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8348); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3609:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3612:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3613:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3613:1: (this_ValidID_0= ruleValidID | kw= 'super' )
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3614:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8395);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3626:2: kw= 'super'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleIdOrSuper8419); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3639:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3640:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3641:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8460);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8471); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3648:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3651:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3652:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3652:1: (this_ValidID_0= ruleValidID kw= '::' )+
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
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3653:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8518);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,65,FOLLOW_65_in_ruleStaticQualifier8536); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3677:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3678:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3679:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8577);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8587); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3686:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3689:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3690:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3690:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3690:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3690:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3691:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXConstructorCall8633); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3700:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3701:1: ( ruleQualifiedName )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3701:1: ( ruleQualifiedName )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3702:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8656);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3715:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3715:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3715:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3715:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleXConstructorCall8677); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3720:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3721:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3721:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3722:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8699);
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

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3738:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==45) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3738:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleXConstructorCall8712); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3742:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3743:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3743:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3744:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8733);
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

                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleXConstructorCall8747); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3764:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3764:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3764:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3764:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleXConstructorCall8770); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3769:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt67=3;
                    alt67 = dfa67.predict(input);
                    switch (alt67) {
                        case 1 :
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3769:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3769:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3769:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3786:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3787:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8843);
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
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3804:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3804:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3804:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3804:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3805:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3805:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3806:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8871);
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

                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3822:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop66:
                            do {
                                int alt66=2;
                                int LA66_0 = input.LA(1);

                                if ( (LA66_0==45) ) {
                                    alt66=1;
                                }


                                switch (alt66) {
                            	case 1 :
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3822:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,45,FOLLOW_45_in_ruleXConstructorCall8884); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3826:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3827:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3827:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3828:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8905);
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

                    otherlv_13=(Token)match(input,47,FOLLOW_47_in_ruleXConstructorCall8922); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3848:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3848:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3851:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3852:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall8957);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3876:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3877:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3878:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8994);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9004); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3885:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3888:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3889:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3889:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3889:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3889:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3890:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3895:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3895:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXBooleanLiteral9051); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3900:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3900:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3901:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3901:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3902:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,68,FOLLOW_68_in_ruleXBooleanLiteral9075); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3923:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3924:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3925:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9125);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9135); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3932:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3935:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3936:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3936:1: ( () otherlv_1= 'null' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3936:2: () otherlv_1= 'null'
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3936:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3937:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXNullLiteral9181); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3954:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3955:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3956:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9217);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9227); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3963:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3966:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3967:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3967:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3967:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3967:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3968:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3973:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3974:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3974:1: (lv_value_1_0= ruleNumber )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3975:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9282);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3999:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4000:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4001:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9318);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9328); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4008:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4011:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4012:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4012:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4012:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4012:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4013:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4018:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4019:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4019:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4020:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9379); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4044:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4045:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4046:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9420);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9430); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4053:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4056:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4057:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4057:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4057:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4057:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4058:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXTypeLiteral9476); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXTypeLiteral9488); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4071:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4072:1: ( ruleQualifiedName )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4072:1: ( ruleQualifiedName )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4073:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9511);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXTypeLiteral9523); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4098:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4099:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4100:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9559);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9569); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4107:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4110:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4111:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4111:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4111:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4111:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4112:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXThrowExpression9615); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4121:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4122:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4122:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4123:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9636);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4147:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4148:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4149:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9672);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9682); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4156:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4159:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4160:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4160:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4160:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4160:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4161:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXReturnExpression9728); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4170:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4170:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4175:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4176:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9759);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4200:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4201:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4202:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9796);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9806); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4209:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4212:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4213:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4213:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4213:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4213:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4214:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXTryCatchFinallyExpression9852); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4223:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4224:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4224:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4225:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9873);
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

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4241:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4241:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4241:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4241:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4241:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
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
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4241:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4243:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4244:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9903);
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

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4260:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
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
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4260:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4260:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4260:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleXTryCatchFinallyExpression9925); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4265:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4266:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4266:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4267:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9947);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4284:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4284:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4284:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,74,FOLLOW_74_in_ruleXTryCatchFinallyExpression9969); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4288:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4289:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4289:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4290:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9990);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4314:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4315:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4316:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10028);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10038); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4323:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4326:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4327:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4327:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4327:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4327:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4327:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleXCatchClause10083); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleXCatchClause10096); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4336:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4337:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4337:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4338:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10117);
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

            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleXCatchClause10129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4358:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4359:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4359:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4360:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10150);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4384:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4385:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4386:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10187);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10198); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4393:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4396:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4397:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4397:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4398:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10245);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4408:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
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
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4408:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4408:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4408:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,42,FOLLOW_42_in_ruleQualifiedName10273); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10296);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4435:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4439:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4440:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10350);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10361); if (state.failed) return current;

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4450:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4454:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4455:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4455:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4455:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10405); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4463:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4463:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4463:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4463:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
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
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4463:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10433); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4471:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10459); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4478:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
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
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4479:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,42,FOLLOW_42_in_ruleNumber10479); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4484:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
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
                                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4484:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10495); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4492:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10521); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4510:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4511:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4512:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10574);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10584); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4519:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4522:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4523:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4523:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4523:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4523:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4524:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10632);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4532:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
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
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4532:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4535:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4535:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4535:6: ()
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4536:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleJvmTypeReference10670); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleJvmTypeReference10682); if (state.failed) return current;
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4551:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10714);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4567:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4568:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4569:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10749);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10759); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4576:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4579:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4580:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4580:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4580:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4580:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==46) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4580:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleXFunctionTypeRef10797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4584:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==RULE_ID||LA83_0==30||LA83_0==46) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4584:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4584:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4585:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4585:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4586:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10819);
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

                            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4602:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop82:
                            do {
                                int alt82=2;
                                int LA82_0 = input.LA(1);

                                if ( (LA82_0==45) ) {
                                    alt82=1;
                                }


                                switch (alt82) {
                            	case 1 :
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4602:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXFunctionTypeRef10832); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4606:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4607:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4607:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4608:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10853);
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

                    otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXFunctionTypeRef10869); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleXFunctionTypeRef10883); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4632:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4633:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4633:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4634:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10904);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4658:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4659:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4660:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10940);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10950); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4667:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4670:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4671:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4671:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4671:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4671:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4672:1: ( ruleQualifiedName )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4672:1: ( ruleQualifiedName )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4673:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10998);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4686:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt86=2;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4686:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4686:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4686:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleJvmParameterizedTypeReference11019); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4691:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4692:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4692:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4693:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11041);
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

                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4709:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==45) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4709:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleJvmParameterizedTypeReference11054); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4713:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4714:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4714:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4715:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11075);
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

                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleJvmParameterizedTypeReference11089); if (state.failed) return current;
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4743:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4744:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4745:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11127);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11137); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4752:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4755:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4756:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4756:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4757:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11184);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4767:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11211);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4783:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4784:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4785:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11246);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11256); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4792:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4795:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4796:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4796:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4796:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4796:2: ()
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4797:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleJvmWildcardTypeReference11302); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4806:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4806:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4806:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4807:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4807:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4808:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11324);
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
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4825:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4825:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4826:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4826:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4827:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11351);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4851:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4852:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4853:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11389);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11399); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4860:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4863:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4864:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4864:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4864:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleJvmUpperBound11436); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4868:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4869:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4869:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4870:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11457);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4894:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4895:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4896:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11493);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11503); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4903:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4906:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4907:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4907:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4907:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleJvmUpperBoundAnded11540); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4911:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4912:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4912:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4913:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11561);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4937:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4938:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4939:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11597);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11607); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4946:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4949:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4950:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4950:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4950:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleJvmLowerBound11644); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4954:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4955:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4955:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4956:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11665);
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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4982:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4983:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4984:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11704);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11715); if (state.failed) return current;

            }

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
    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4991:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4994:28: (this_ID_0= RULE_ID )
            // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4995:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11754); if (state.failed) return current;
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
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:362:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:362:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:362:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:362:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:362:5: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:363:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:363:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:364:1: ( ruleOpMultiAssign )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:364:1: ( ruleOpMultiAssign )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:365:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalTortoiseShell726);
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
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:490:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:490:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:490:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:490:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:490:5: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:491:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:491:2: ( ( ruleOpOr ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:492:1: ( ruleOpOr )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:492:1: ( ruleOpOr )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:493:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalTortoiseShell1074);
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
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:591:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:591:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:591:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:591:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:591:5: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:592:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:592:2: ( ( ruleOpAnd ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:593:1: ( ruleOpAnd )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:593:1: ( ruleOpAnd )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:594:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalTortoiseShell1333);
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
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:692:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:692:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:692:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:692:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:692:5: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:693:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:693:2: ( ( ruleOpEquality ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:694:1: ( ruleOpEquality )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:694:1: ( ruleOpEquality )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:695:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalTortoiseShell1592);
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
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:800:4: ( ( () 'instanceof' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:800:5: ( () 'instanceof' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:800:5: ( () 'instanceof' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:800:6: () 'instanceof'
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:800:6: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:801:1: 
        {
        }

        match(input,23,FOLLOW_23_in_synpred5_InternalTortoiseShell1868); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalTortoiseShell

    // $ANTLR start synpred6_InternalTortoiseShell
    public final void synpred6_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:831:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:831:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:831:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:831:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:831:10: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:832:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:832:2: ( ( ruleOpCompare ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:833:1: ( ruleOpCompare )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:833:1: ( ruleOpCompare )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:834:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalTortoiseShell1939);
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
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:953:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:953:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:953:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:953:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:953:5: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:954:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:954:2: ( ( ruleOpOther ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:955:1: ( ruleOpOther )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:955:1: ( ruleOpOther )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:956:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalTortoiseShell2258);
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
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1045:3: ( ( '>' '>' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1045:4: ( '>' '>' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1045:4: ( '>' '>' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1046:2: '>' '>'
        {
        match(input,26,FOLLOW_26_in_synpred8_InternalTortoiseShell2474); if (state.failed) return ;
        match(input,26,FOLLOW_26_in_synpred8_InternalTortoiseShell2479); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalTortoiseShell

    // $ANTLR start synpred9_InternalTortoiseShell
    public final void synpred9_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1075:3: ( ( '<' '<' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1075:4: ( '<' '<' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1075:4: ( '<' '<' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1076:2: '<' '<'
        {
        match(input,27,FOLLOW_27_in_synpred9_InternalTortoiseShell2561); if (state.failed) return ;
        match(input,27,FOLLOW_27_in_synpred9_InternalTortoiseShell2566); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalTortoiseShell

    // $ANTLR start synpred10_InternalTortoiseShell
    public final void synpred10_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1149:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1149:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1149:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1149:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1149:5: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1150:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1150:2: ( ( ruleOpAdd ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1151:1: ( ruleOpAdd )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1151:1: ( ruleOpAdd )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1152:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalTortoiseShell2788);
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
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1257:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1257:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1257:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1257:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1257:5: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1258:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1258:2: ( ( ruleOpMulti ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1259:1: ( ruleOpMulti )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1259:1: ( ruleOpMulti )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1260:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalTortoiseShell3068);
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
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1490:3: ( ( () 'as' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1490:4: ( () 'as' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1490:4: ( () 'as' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1490:5: () 'as'
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1490:5: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1491:1: 
        {
        }

        match(input,41,FOLLOW_41_in_synpred12_InternalTortoiseShell3662); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalTortoiseShell

    // $ANTLR start synpred13_InternalTortoiseShell
    public final void synpred13_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1550:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1550:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1550:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1550:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1550:6: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1551:1: 
        {
        }

        match(input,42,FOLLOW_42_in_synpred13_InternalTortoiseShell3816); if (state.failed) return ;
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1552:1: ( ( ruleValidID ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1553:1: ( ruleValidID )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1553:1: ( ruleValidID )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1554:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred13_InternalTortoiseShell3825);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalTortoiseShell3831);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalTortoiseShell

    // $ANTLR start synpred14_InternalTortoiseShell
    public final void synpred14_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1608:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1608:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1608:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1608:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1608:10: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1609:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1609:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
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
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1609:4: '.'
                {
                match(input,42,FOLLOW_42_in_synpred14_InternalTortoiseShell3934); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1611:6: ( ( '?.' ) )
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1611:6: ( ( '?.' ) )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1612:1: ( '?.' )
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1612:1: ( '?.' )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1613:2: '?.'
                {
                match(input,43,FOLLOW_43_in_synpred14_InternalTortoiseShell3948); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1618:6: ( ( '*.' ) )
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1618:6: ( ( '*.' ) )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1619:1: ( '*.' )
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1619:1: ( '*.' )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1620:2: '*.'
                {
                match(input,44,FOLLOW_44_in_synpred14_InternalTortoiseShell3968); if (state.failed) return ;

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
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1729:4: ( ( '(' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1730:1: ( '(' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1730:1: ( '(' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1731:2: '('
        {
        match(input,46,FOLLOW_46_in_synpred15_InternalTortoiseShell4195); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalTortoiseShell

    // $ANTLR start synpred16_InternalTortoiseShell
    public final void synpred16_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1750:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1750:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1750:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1750:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1750:6: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1751:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1751:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt91=2;
        int LA91_0 = input.LA(1);

        if ( (LA91_0==RULE_ID||LA91_0==30||LA91_0==46) ) {
            alt91=1;
        }
        switch (alt91) {
            case 1 :
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1751:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1751:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1752:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1752:1: ( ruleJvmFormalParameter )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1753:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalTortoiseShell4247);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1755:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop90:
                do {
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==45) ) {
                        alt90=1;
                    }


                    switch (alt90) {
                	case 1 :
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1755:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,45,FOLLOW_45_in_synpred16_InternalTortoiseShell4254); if (state.failed) return ;
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1756:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1757:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1757:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1758:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalTortoiseShell4261);
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

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1760:6: ( ( '|' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1761:1: ( '|' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1761:1: ( '|' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1762:2: '|'
        {
        match(input,49,FOLLOW_49_in_synpred16_InternalTortoiseShell4275); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalTortoiseShell

    // $ANTLR start synpred17_InternalTortoiseShell
    public final void synpred17_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1829:4: ( ( () '[' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1829:5: ( () '[' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1829:5: ( () '[' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1829:6: () '['
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1829:6: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:1830:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred17_InternalTortoiseShell4395); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalTortoiseShell

    // $ANTLR start synpred18_InternalTortoiseShell
    public final void synpred18_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2020:3: ( ( () '[' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2020:4: ( () '[' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2020:4: ( () '[' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2020:5: () '['
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2020:5: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2021:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred18_InternalTortoiseShell4919); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalTortoiseShell

    // $ANTLR start synpred20_InternalTortoiseShell
    public final void synpred20_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2114:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2114:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2114:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2114:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2114:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt93=2;
        int LA93_0 = input.LA(1);

        if ( (LA93_0==RULE_ID||LA93_0==30||LA93_0==46) ) {
            alt93=1;
        }
        switch (alt93) {
            case 1 :
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2114:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2114:7: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2115:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2115:1: ( ruleJvmFormalParameter )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2116:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalTortoiseShell5198);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2118:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop92:
                do {
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==45) ) {
                        alt92=1;
                    }


                    switch (alt92) {
                	case 1 :
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2118:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,45,FOLLOW_45_in_synpred20_InternalTortoiseShell5205); if (state.failed) return ;
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2119:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2120:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2120:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2121:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalTortoiseShell5212);
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

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2123:6: ( ( '|' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2124:1: ( '|' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2124:1: ( '|' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2125:2: '|'
        {
        match(input,49,FOLLOW_49_in_synpred20_InternalTortoiseShell5226); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalTortoiseShell

    // $ANTLR start synpred22_InternalTortoiseShell
    public final void synpred22_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2484:4: ( 'else' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2484:6: 'else'
        {
        match(input,52,FOLLOW_52_in_synpred22_InternalTortoiseShell6009); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalTortoiseShell

    // $ANTLR start synpred23_InternalTortoiseShell
    public final void synpred23_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2538:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2538:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2538:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2538:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2538:6: ( ( ruleValidID ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2539:1: ( ruleValidID )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2539:1: ( ruleValidID )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2540:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalTortoiseShell6151);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,54,FOLLOW_54_in_synpred23_InternalTortoiseShell6157); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalTortoiseShell

    // $ANTLR start synpred24_InternalTortoiseShell
    public final void synpred24_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2584:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2584:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2584:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2584:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,46,FOLLOW_46_in_synpred24_InternalTortoiseShell6233); if (state.failed) return ;
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2585:1: ( ( ruleValidID ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2586:1: ( ruleValidID )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2586:1: ( ruleValidID )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:2587:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalTortoiseShell6240);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,54,FOLLOW_54_in_synpred24_InternalTortoiseShell6246); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalTortoiseShell

    // $ANTLR start synpred25_InternalTortoiseShell
    public final void synpred25_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3168:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3168:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3168:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3168:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3168:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3169:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3169:1: ( ruleJvmTypeReference )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3170:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalTortoiseShell7511);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3172:2: ( ( ruleValidID ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3173:1: ( ruleValidID )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3173:1: ( ruleValidID )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3174:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalTortoiseShell7520);
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
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3472:4: ( ( '(' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3473:1: ( '(' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3473:1: ( '(' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3474:2: '('
        {
        match(input,46,FOLLOW_46_in_synpred26_InternalTortoiseShell8082); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalTortoiseShell

    // $ANTLR start synpred27_InternalTortoiseShell
    public final void synpred27_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3493:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3493:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3493:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3493:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3493:6: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3494:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3494:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt97=2;
        int LA97_0 = input.LA(1);

        if ( (LA97_0==RULE_ID||LA97_0==30||LA97_0==46) ) {
            alt97=1;
        }
        switch (alt97) {
            case 1 :
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3494:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3494:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3495:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3495:1: ( ruleJvmFormalParameter )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3496:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalTortoiseShell8134);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3498:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop96:
                do {
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==45) ) {
                        alt96=1;
                    }


                    switch (alt96) {
                	case 1 :
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3498:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,45,FOLLOW_45_in_synpred27_InternalTortoiseShell8141); if (state.failed) return ;
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3499:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3500:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3500:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3501:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalTortoiseShell8148);
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

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3503:6: ( ( '|' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3504:1: ( '|' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3504:1: ( '|' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3505:2: '|'
        {
        match(input,49,FOLLOW_49_in_synpred27_InternalTortoiseShell8162); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalTortoiseShell

    // $ANTLR start synpred28_InternalTortoiseShell
    public final void synpred28_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3572:4: ( ( () '[' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3572:5: ( () '[' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3572:5: ( () '[' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3572:6: () '['
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3572:6: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3573:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred28_InternalTortoiseShell8282); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalTortoiseShell

    // $ANTLR start synpred29_InternalTortoiseShell
    public final void synpred29_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3715:4: ( '<' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3715:6: '<'
        {
        match(input,27,FOLLOW_27_in_synpred29_InternalTortoiseShell8669); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalTortoiseShell

    // $ANTLR start synpred30_InternalTortoiseShell
    public final void synpred30_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3764:5: ( '(' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3764:7: '('
        {
        match(input,46,FOLLOW_46_in_synpred30_InternalTortoiseShell8762); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalTortoiseShell

    // $ANTLR start synpred31_InternalTortoiseShell
    public final void synpred31_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3769:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3769:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3769:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3769:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3769:6: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3770:1: 
        {
        }

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3770:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( (LA99_0==RULE_ID||LA99_0==30||LA99_0==46) ) {
            alt99=1;
        }
        switch (alt99) {
            case 1 :
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3770:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3770:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3771:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3771:1: ( ruleJvmFormalParameter )
                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3772:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalTortoiseShell8792);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3774:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop98:
                do {
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==45) ) {
                        alt98=1;
                    }


                    switch (alt98) {
                	case 1 :
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3774:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,45,FOLLOW_45_in_synpred31_InternalTortoiseShell8799); if (state.failed) return ;
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3775:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3776:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3776:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3777:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalTortoiseShell8806);
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

        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3779:6: ( ( '|' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3780:1: ( '|' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3780:1: ( '|' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3781:2: '|'
        {
        match(input,49,FOLLOW_49_in_synpred31_InternalTortoiseShell8820); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalTortoiseShell

    // $ANTLR start synpred32_InternalTortoiseShell
    public final void synpred32_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3848:4: ( ( () '[' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3848:5: ( () '[' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3848:5: ( () '[' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3848:6: () '['
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3848:6: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:3849:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred32_InternalTortoiseShell8940); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalTortoiseShell

    // $ANTLR start synpred33_InternalTortoiseShell
    public final void synpred33_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4170:2: ( ( ruleXExpression ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4171:1: ( ruleXExpression )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4171:1: ( ruleXExpression )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4172:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalTortoiseShell9742);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalTortoiseShell

    // $ANTLR start synpred34_InternalTortoiseShell
    public final void synpred34_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4241:5: ( 'catch' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4241:7: 'catch'
        {
        match(input,75,FOLLOW_75_in_synpred34_InternalTortoiseShell9887); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalTortoiseShell

    // $ANTLR start synpred35_InternalTortoiseShell
    public final void synpred35_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4260:5: ( 'finally' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4260:7: 'finally'
        {
        match(input,74,FOLLOW_74_in_synpred35_InternalTortoiseShell9917); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalTortoiseShell

    // $ANTLR start synpred37_InternalTortoiseShell
    public final void synpred37_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4408:3: ( '.' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4409:2: '.'
        {
        match(input,42,FOLLOW_42_in_synpred37_InternalTortoiseShell10264); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalTortoiseShell

    // $ANTLR start synpred38_InternalTortoiseShell
    public final void synpred38_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4532:2: ( ( () '[' ']' ) )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4532:3: ( () '[' ']' )
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4532:3: ( () '[' ']' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4532:4: () '[' ']'
        {
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4532:4: ()
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4533:1: 
        {
        }

        match(input,48,FOLLOW_48_in_synpred38_InternalTortoiseShell10647); if (state.failed) return ;
        match(input,50,FOLLOW_50_in_synpred38_InternalTortoiseShell10651); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalTortoiseShell

    // $ANTLR start synpred39_InternalTortoiseShell
    public final void synpred39_InternalTortoiseShell_fragment() throws RecognitionException {   
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4686:4: ( '<' )
        // ../org.xtext.tortoiseshell/src-gen/org/xtext/tortoiseshell/parser/antlr/internal/InternalTortoiseShell.g:4686:6: '<'
        {
        match(input,27,FOLLOW_27_in_synpred39_InternalTortoiseShell11011); if (state.failed) return ;

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
            return "()* loopback of 953:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
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
            return "1729:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
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
            return "1750:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
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
            return "1829:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
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
            return "1870:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
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
            return "2114:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
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
            return "3472:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
            return "3493:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
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
            return "3572:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
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
            return "3715:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
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
            return "3764:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
            return "3769:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
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
            return "3848:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
            return "4170:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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
            return "4686:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
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
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment639 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment655 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment705 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment758 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpSingleAssign869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpMultiAssign957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1053 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1106 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1129 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpOr1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1312 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1365 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1388 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpAnd1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1571 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1624 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1647 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpEquality1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpEquality1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1851 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_23_in_ruleXRelationalExpression1887 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1910 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1971 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1994 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpCompare2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2237 = new BitSet(new long[]{0x00000003FC000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2290 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2313 = new BitSet(new long[]{0x00000003FC000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2459 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2490 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2546 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2577 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2767 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2820 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2843 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpAdd2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpAdd2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3047 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3100 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3123 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpMulti3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpMulti3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3376 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpUnary3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpUnary3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpUnary3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3646 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleXCastedExpression3681 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3704 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3799 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall3848 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3871 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3887 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3909 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall3995 = new BitSet(new long[]{0x0000000008000100L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4019 = new BitSet(new long[]{0x0000000008000100L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4056 = new BitSet(new long[]{0x0000000008000100L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall4085 = new BitSet(new long[]{0x0000400040000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4106 = new BitSet(new long[]{0x0000200004000000L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4119 = new BitSet(new long[]{0x0000400040000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4140 = new BitSet(new long[]{0x0000200004000000L});
    public static final BitSet FOLLOW_26_in_ruleXMemberFeatureCall4154 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4179 = new BitSet(new long[]{0x00015C0000000002L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall4213 = new BitSet(new long[]{0xF8ABC10C480001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4298 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4326 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4339 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4360 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall4377 = new BitSet(new long[]{0x00011C0000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4412 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXClosure5179 = new BitSet(new long[]{0xF8AF410C480001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5252 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXClosure5265 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5286 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_ruleXClosure5308 = new BitSet(new long[]{0xF8AD410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5345 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXClosure5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5459 = new BitSet(new long[]{0xF8A9410C080081F2L,0x00000000000003FDL});
    public static final BitSet FOLLOW_15_in_ruleXExpressionInClosure5472 = new BitSet(new long[]{0xF8A9410C080001F2L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5630 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXShortClosure5643 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5664 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_ruleXShortClosure5686 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXParenthesizedExpression5805 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5827 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXParenthesizedExpression5838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXIfExpression5930 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXIfExpression5942 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5963 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXIfExpression5975 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5996 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXIfExpression6017 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6133 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6176 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6188 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6212 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_46_in_ruleXSwitchExpression6256 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6277 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6289 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6312 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXSwitchExpression6324 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6338 = new BitSet(new long[]{0x0440400040000100L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6359 = new BitSet(new long[]{0x0740400040000100L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6373 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6385 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6406 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6512 = new BitSet(new long[]{0x0440000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXCasePart6526 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6547 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXCasePart6561 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXForLoopExpression6674 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXForLoopExpression6686 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6707 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXForLoopExpression6719 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6740 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXForLoopExpression6752 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXWhileExpression6865 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXWhileExpression6877 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6898 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXWhileExpression6910 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXDoWhileExpression7023 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7044 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXDoWhileExpression7056 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXDoWhileExpression7068 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7089 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXDoWhileExpression7101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXBlockExpression7193 = new BitSet(new long[]{0xFAA9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7215 = new BitSet(new long[]{0xFAA9410C080081F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_15_in_ruleXBlockExpression7228 = new BitSet(new long[]{0xFAA9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_57_in_ruleXBlockExpression7244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXVariableDeclaration7462 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_63_in_ruleXVariableDeclaration7493 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7541 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7562 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7591 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleXVariableDeclaration7605 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7720 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7834 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7958 = new BitSet(new long[]{0x0000000008000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_27_in_ruleXFeatureCall7972 = new BitSet(new long[]{0x0000400040000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7993 = new BitSet(new long[]{0x0000200004000000L});
    public static final BitSet FOLLOW_45_in_ruleXFeatureCall8006 = new BitSet(new long[]{0x0000400040000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8027 = new BitSet(new long[]{0x0000200004000000L});
    public static final BitSet FOLLOW_26_in_ruleXFeatureCall8041 = new BitSet(new long[]{0x0000000008000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8066 = new BitSet(new long[]{0x0001400000000002L});
    public static final BitSet FOLLOW_46_in_ruleXFeatureCall8100 = new BitSet(new long[]{0xF8ABC10C480001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8185 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8213 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFeatureCall8226 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8247 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_47_in_ruleXFeatureCall8264 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleIdOrSuper8419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleStaticQualifier8536 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXConstructorCall8633 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8656 = new BitSet(new long[]{0x0001400008000002L});
    public static final BitSet FOLLOW_27_in_ruleXConstructorCall8677 = new BitSet(new long[]{0x0000400040000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8699 = new BitSet(new long[]{0x0000200004000000L});
    public static final BitSet FOLLOW_45_in_ruleXConstructorCall8712 = new BitSet(new long[]{0x0000400040000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8733 = new BitSet(new long[]{0x0000200004000000L});
    public static final BitSet FOLLOW_26_in_ruleXConstructorCall8747 = new BitSet(new long[]{0x0001400000000002L});
    public static final BitSet FOLLOW_46_in_ruleXConstructorCall8770 = new BitSet(new long[]{0xF8ABC10C480001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8843 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8871 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_45_in_ruleXConstructorCall8884 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8905 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_47_in_ruleXConstructorCall8922 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall8957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXBooleanLiteral9051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXBooleanLiteral9075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXNullLiteral9181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXTypeLiteral9476 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXTypeLiteral9488 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9511 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXTypeLiteral9523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXThrowExpression9615 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXReturnExpression9728 = new BitSet(new long[]{0xF8A9410C080001F2L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXTryCatchFinallyExpression9852 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9903 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_74_in_ruleXTryCatchFinallyExpression9925 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXTryCatchFinallyExpression9969 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXCatchClause10083 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXCatchClause10096 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10117 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXCatchClause10129 = new BitSet(new long[]{0xF8A9410C080001F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10245 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleQualifiedName10273 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10296 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10433 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10459 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleNumber10479 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10632 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleJvmTypeReference10670 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleJvmTypeReference10682 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXFunctionTypeRef10797 = new BitSet(new long[]{0x0000C00040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10819 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFunctionTypeRef10832 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10853 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_47_in_ruleXFunctionTypeRef10869 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXFunctionTypeRef10883 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10998 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleJvmParameterizedTypeReference11019 = new BitSet(new long[]{0x0000400040000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11041 = new BitSet(new long[]{0x0000200004000000L});
    public static final BitSet FOLLOW_45_in_ruleJvmParameterizedTypeReference11054 = new BitSet(new long[]{0x0000400040000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11075 = new BitSet(new long[]{0x0000200004000000L});
    public static final BitSet FOLLOW_26_in_ruleJvmParameterizedTypeReference11089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmWildcardTypeReference11302 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002001L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJvmUpperBound11436 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleJvmUpperBoundAnded11540 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleJvmLowerBound11644 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalTortoiseShell726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalTortoiseShell1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalTortoiseShell1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalTortoiseShell1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred5_InternalTortoiseShell1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalTortoiseShell1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalTortoiseShell2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred8_InternalTortoiseShell2474 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_synpred8_InternalTortoiseShell2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred9_InternalTortoiseShell2561 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_synpred9_InternalTortoiseShell2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalTortoiseShell2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalTortoiseShell3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred12_InternalTortoiseShell3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred13_InternalTortoiseShell3816 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred13_InternalTortoiseShell3825 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalTortoiseShell3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred14_InternalTortoiseShell3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred14_InternalTortoiseShell3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred14_InternalTortoiseShell3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred15_InternalTortoiseShell4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalTortoiseShell4247 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_synpred16_InternalTortoiseShell4254 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalTortoiseShell4261 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_synpred16_InternalTortoiseShell4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred17_InternalTortoiseShell4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred18_InternalTortoiseShell4919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalTortoiseShell5198 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_synpred20_InternalTortoiseShell5205 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalTortoiseShell5212 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_synpred20_InternalTortoiseShell5226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred22_InternalTortoiseShell6009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalTortoiseShell6151 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_synpred23_InternalTortoiseShell6157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred24_InternalTortoiseShell6233 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalTortoiseShell6240 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_synpred24_InternalTortoiseShell6246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalTortoiseShell7511 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalTortoiseShell7520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred26_InternalTortoiseShell8082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalTortoiseShell8134 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_synpred27_InternalTortoiseShell8141 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalTortoiseShell8148 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_synpred27_InternalTortoiseShell8162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred28_InternalTortoiseShell8282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred29_InternalTortoiseShell8669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred30_InternalTortoiseShell8762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalTortoiseShell8792 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_45_in_synpred31_InternalTortoiseShell8799 = new BitSet(new long[]{0x0000400040000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalTortoiseShell8806 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_49_in_synpred31_InternalTortoiseShell8820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred32_InternalTortoiseShell8940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalTortoiseShell9742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_synpred34_InternalTortoiseShell9887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_synpred35_InternalTortoiseShell9917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred37_InternalTortoiseShell10264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred38_InternalTortoiseShell10647 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_synpred38_InternalTortoiseShell10651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred39_InternalTortoiseShell11011 = new BitSet(new long[]{0x0000000000000002L});

}