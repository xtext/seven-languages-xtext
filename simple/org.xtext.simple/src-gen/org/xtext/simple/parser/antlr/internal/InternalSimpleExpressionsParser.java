package org.xtext.simple.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.simple.services.SimpleExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSimpleExpressionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application'", "';'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
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

    // delegates
    // delegators


        public InternalSimpleExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimpleExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimpleExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g"; }



     	private SimpleExpressionsGrammarAccess grammarAccess;
     	
        public InternalSimpleExpressionsParser(TokenStream input, SimpleExpressionsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Application";	
       	}
       	
       	@Override
       	protected SimpleExpressionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleApplication"
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:67:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:68:2: (iv_ruleApplication= ruleApplication EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:69:2: iv_ruleApplication= ruleApplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getApplicationRule()); 
            }
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication75);
            iv_ruleApplication=ruleApplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:76:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_main_2_0= ruleMain ) ) ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_main_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:79:28: ( (otherlv_0= 'application' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_main_2_0= ruleMain ) ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:80:1: (otherlv_0= 'application' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_main_2_0= ruleMain ) ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:80:1: (otherlv_0= 'application' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_main_2_0= ruleMain ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:80:3: otherlv_0= 'application' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_main_2_0= ruleMain ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleApplication122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:85:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:85:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:86:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getApplicationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleApplication143);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getApplicationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:102:2: ( (lv_main_2_0= ruleMain ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:103:1: (lv_main_2_0= ruleMain )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:103:1: (lv_main_2_0= ruleMain )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:104:3: lv_main_2_0= ruleMain
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getApplicationAccess().getMainMainParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMain_in_ruleApplication164);
            lv_main_2_0=ruleMain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getApplicationRule());
              	        }
                     		set(
                     			current, 
                     			"main",
                      		lv_main_2_0, 
                      		"Main");
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
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleMain"
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:128:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:129:2: (iv_ruleMain= ruleMain EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:130:2: iv_ruleMain= ruleMain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMainRule()); 
            }
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain200);
            iv_ruleMain=ruleMain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMain; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain210); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:137:1: ruleMain returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:140:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:141:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:141:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:141:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:141:2: ()
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:142:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMainAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:147:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)||LA2_0==25||(LA2_0>=32 && LA2_0<=33)||LA2_0==38||LA2_0==44||LA2_0==46||LA2_0==49||LA2_0==51||LA2_0==53||(LA2_0>=57 && LA2_0<=62)||(LA2_0>=64 && LA2_0<=71)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:147:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:147:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:148:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:148:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:149:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMainAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleMain266);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMainRule());
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

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:165:2: (otherlv_2= ';' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==14) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:165:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleMain279); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getMainAccess().getSemicolonKeyword_1_1());
            	                  
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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleXExpression"
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:177:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:178:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:179:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression319);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression329); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:186:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:189:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:191:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression375);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:207:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:208:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:209:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment409);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment419); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:216:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:219:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:220:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:220:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||(LA4_1>=RULE_STRING && LA4_1<=RULE_ID)||LA4_1==14||(LA4_1>=16 && LA4_1<=46)||(LA4_1>=48 && LA4_1<=73)) ) {
                    alt4=2;
                }
                else if ( (LA4_1==15) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_DECIMAL)||LA4_0==25||(LA4_0>=32 && LA4_0<=33)||LA4_0==38||LA4_0==44||LA4_0==46||LA4_0==49||LA4_0==51||LA4_0==53||(LA4_0>=57 && LA4_0<=59)||LA4_0==62||(LA4_0>=64 && LA4_0<=71)) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:220:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:220:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:220:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:220:3: ()
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:221:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:226:2: ( ( ruleValidID ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:227:1: ( ruleValidID )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:227:1: ( ruleValidID )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:228:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment477);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment493);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:249:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:250:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:250:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:251:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment513);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:268:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:268:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:269:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment543);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:277:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==16) ) {
                        int LA3_1 = input.LA(2);

                        if ( (synpred1_InternalSimpleExpressions()) ) {
                            alt3=1;
                        }
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:277:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:277:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:277:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:282:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:282:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:282:7: ()
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:283:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:288:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:289:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:289:1: ( ruleOpMultiAssign )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:290:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment596);
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

                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:303:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:304:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:304:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:305:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment619);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:329:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:330:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:331:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign659);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign670); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:338:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:341:28: (kw= '=' )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:343:2: kw= '='
            {
            kw=(Token)match(input,15,FOLLOW_15_in_ruleOpSingleAssign707); if (state.failed) return current;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:356:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:357:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:358:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign747);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign758); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:365:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:368:28: (kw= '+=' )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:370:2: kw= '+='
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleOpMultiAssign795); if (state.failed) return current;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:383:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:384:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:385:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression834);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression844); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:392:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:395:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:396:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:396:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:397:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression891);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:405:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    int LA5_2 = input.LA(2);

                    if ( (synpred2_InternalSimpleExpressions()) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:405:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:405:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:405:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:410:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:410:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:410:7: ()
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:411:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:416:2: ( ( ruleOpOr ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:417:1: ( ruleOpOr )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:417:1: ( ruleOpOr )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:418:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression944);
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

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:431:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:432:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:432:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:433:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression967);
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
            	    break loop5;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:457:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:458:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:459:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1006);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1017); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:466:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:469:28: (kw= '||' )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:471:2: kw= '||'
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleOpOr1054); if (state.failed) return current;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:484:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:485:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:486:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1093);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1103); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:493:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:496:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:497:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:497:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:498:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1150);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:506:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    int LA6_2 = input.LA(2);

                    if ( (synpred3_InternalSimpleExpressions()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:506:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:506:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:506:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:511:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:511:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:511:7: ()
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:512:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:517:2: ( ( ruleOpAnd ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:518:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:518:1: ( ruleOpAnd )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:519:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1203);
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

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:532:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:533:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:533:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:534:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1226);
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:558:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:559:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:560:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1265);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1276); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:567:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:570:28: (kw= '&&' )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:572:2: kw= '&&'
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpAnd1313); if (state.failed) return current;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:585:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:586:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:587:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1352);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1362); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:594:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:597:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:598:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:598:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:599:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1409);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:607:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred4_InternalSimpleExpressions()) ) {
                        alt7=1;
                    }


                }
                else if ( (LA7_0==20) ) {
                    int LA7_3 = input.LA(2);

                    if ( (synpred4_InternalSimpleExpressions()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:607:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:607:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:607:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:612:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:612:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:612:7: ()
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:613:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:618:2: ( ( ruleOpEquality ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:619:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:619:1: ( ruleOpEquality )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:620:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1462);
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

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:633:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:634:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:634:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:635:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1485);
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:659:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:660:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:661:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1524);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1535); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:668:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:671:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:672:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:672:1: (kw= '==' | kw= '!=' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:673:2: kw= '=='
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleOpEquality1573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:680:2: kw= '!='
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleOpEquality1592); if (state.failed) return current;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:693:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:694:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:695:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1632);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression1642); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:702:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:705:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:706:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:706:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:707:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1689);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:715:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop9:
            do {
                int alt9=3;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    int LA9_2 = input.LA(2);

                    if ( (synpred6_InternalSimpleExpressions()) ) {
                        alt9=2;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA9_3 = input.LA(2);

                    if ( (synpred6_InternalSimpleExpressions()) ) {
                        alt9=2;
                    }


                    }
                    break;
                case 21:
                    {
                    int LA9_4 = input.LA(2);

                    if ( (synpred5_InternalSimpleExpressions()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA9_5 = input.LA(2);

                    if ( (synpred6_InternalSimpleExpressions()) ) {
                        alt9=2;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA9_6 = input.LA(2);

                    if ( (synpred6_InternalSimpleExpressions()) ) {
                        alt9=2;
                    }


                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:715:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:715:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:715:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:715:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:715:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:717:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:717:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:717:6: ()
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:718:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXRelationalExpression1725); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:727:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:728:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:728:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:729:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1748);
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
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:746:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:746:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:746:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:746:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:746:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:751:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:751:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:751:7: ()
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:752:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:757:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:758:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:758:1: ( ruleOpCompare )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:759:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1809);
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

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:772:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:773:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:773:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:774:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1832);
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:798:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:799:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:800:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare1872);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare1883); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:807:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:810:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:811:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:811:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt10=4;
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
            case 25:
                {
                alt10=4;
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:812:2: kw= '>='
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleOpCompare1921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:819:2: kw= '<='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpCompare1940); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:826:2: kw= '>'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpCompare1959); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:833:2: kw= '<'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare1978); if (state.failed) return current;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:846:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:847:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:848:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2018);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2028); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:855:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:858:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:859:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:859:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:860:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2075);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:868:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:868:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:868:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:868:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:873:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:873:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:873:7: ()
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:874:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:879:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:880:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:880:1: ( ruleOpOther )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:881:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2128);
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

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:894:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:895:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:895:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:896:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2151);
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:920:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:921:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:922:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2190);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2201); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:929:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:932:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:933:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:933:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt14=8;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt14=1;
                }
                break;
            case 27:
                {
                alt14=2;
                }
                break;
            case 28:
                {
                alt14=3;
                }
                break;
            case 24:
                {
                alt14=4;
                }
                break;
            case 25:
                {
                alt14=5;
                }
                break;
            case 29:
                {
                alt14=6;
                }
                break;
            case 30:
                {
                alt14=7;
                }
                break;
            case 31:
                {
                alt14=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:934:2: kw= '->'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther2239); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:941:2: kw= '..'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2258); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:948:2: kw= '=>'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:954:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:954:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:955:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOther2297); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:960:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==24) ) {
                        int LA12_1 = input.LA(2);

                        if ( (LA12_1==24) && (synpred8_InternalSimpleExpressions())) {
                            alt12=1;
                        }
                        else if ( (LA12_1==EOF||(LA12_1>=RULE_STRING && LA12_1<=RULE_ID)||LA12_1==25||(LA12_1>=32 && LA12_1<=33)||LA12_1==38||LA12_1==44||LA12_1==46||LA12_1==49||LA12_1==51||LA12_1==53||(LA12_1>=57 && LA12_1<=59)||LA12_1==62||(LA12_1>=64 && LA12_1<=71)) ) {
                            alt12=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:960:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:960:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:960:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:964:5: (kw= '>' kw= '>' )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:965:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOther2328); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOther2341); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:978:2: kw= '>'
                            {
                            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOther2362); if (state.failed) return current;
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:984:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:984:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:985:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:990:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==25) ) {
                        int LA13_1 = input.LA(2);

                        if ( (synpred9_InternalSimpleExpressions()) ) {
                            alt13=1;
                        }
                        else if ( (true) ) {
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
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:990:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:990:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:990:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:994:5: (kw= '<' kw= '<' )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:995:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2415); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2428); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1008:2: kw= '<'
                            {
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther2449); if (state.failed) return current;
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1015:2: kw= '<>'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2470); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1022:2: kw= '?:'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2489); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1029:2: kw= '<=>'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2508); if (state.failed) return current;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1042:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1043:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1044:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2548);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2558); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1051:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1054:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1055:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1055:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1056:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2605);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1064:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred10_InternalSimpleExpressions()) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==33) ) {
                    int LA15_3 = input.LA(2);

                    if ( (synpred10_InternalSimpleExpressions()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1064:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1064:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1064:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1069:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1069:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1069:7: ()
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1070:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1075:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1076:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1076:1: ( ruleOpAdd )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1077:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2658);
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

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1090:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1091:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1091:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1092:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2681);
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
            	    break loop15;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1116:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1117:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1118:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd2720);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd2731); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1125:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1128:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1129:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1129:1: (kw= '+' | kw= '-' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            else if ( (LA16_0==33) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1130:2: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpAdd2769); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1137:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpAdd2788); if (state.failed) return current;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1150:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1151:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1152:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2828);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2838); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1159:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1162:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1163:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1163:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1164:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2885);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1172:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop17:
            do {
                int alt17=2;
                switch ( input.LA(1) ) {
                case 34:
                    {
                    int LA17_2 = input.LA(2);

                    if ( (synpred11_InternalSimpleExpressions()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (synpred11_InternalSimpleExpressions()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA17_4 = input.LA(2);

                    if ( (synpred11_InternalSimpleExpressions()) ) {
                        alt17=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA17_5 = input.LA(2);

                    if ( (synpred11_InternalSimpleExpressions()) ) {
                        alt17=1;
                    }


                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1172:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1172:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1172:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1177:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1177:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1177:7: ()
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1178:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1183:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1184:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1184:1: ( ruleOpMulti )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1185:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2938);
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

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1198:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1199:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1199:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1200:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2961);
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1224:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1225:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1226:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3000);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3011); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1233:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1236:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1237:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1237:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt18=1;
                }
                break;
            case 35:
                {
                alt18=2;
                }
                break;
            case 36:
                {
                alt18=3;
                }
                break;
            case 37:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1238:2: kw= '*'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpMulti3049); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1245:2: kw= '**'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMulti3068); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1252:2: kw= '/'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpMulti3087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1259:2: kw= '%'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti3106); if (state.failed) return current;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1272:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1273:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1274:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3146);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3156); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1281:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1284:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1285:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1285:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=32 && LA19_0<=33)||LA19_0==38) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)||LA19_0==25||LA19_0==44||LA19_0==46||LA19_0==49||LA19_0==51||LA19_0==53||(LA19_0>=57 && LA19_0<=59)||LA19_0==62||(LA19_0>=64 && LA19_0<=71)) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1285:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1285:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1285:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1285:3: ()
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1286:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1291:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1292:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1292:1: ( ruleOpUnary )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1293:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3214);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1306:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1307:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1307:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1308:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3235);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1326:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3264);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1342:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1343:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1344:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3300);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3311); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1351:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1354:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1355:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1355:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt20=1;
                }
                break;
            case 33:
                {
                alt20=2;
                }
                break;
            case 32:
                {
                alt20=3;
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1356:2: kw= '!'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpUnary3349); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1363:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpUnary3368); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1370:2: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpUnary3387); if (state.failed) return current;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1383:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1384:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1385:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3427);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3437); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1392:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1395:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1396:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1396:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1397:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3484);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1405:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==39) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred12_InternalSimpleExpressions()) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1405:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1405:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1405:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1407:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1407:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1407:6: ()
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1408:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXCastedExpression3519); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1417:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1418:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1418:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1419:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3542);
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
            	    break loop21;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1443:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1444:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1445:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3580);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3590); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1452:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1455:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1456:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1456:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1457:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3637);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1465:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop29:
            do {
                int alt29=3;
                switch ( input.LA(1) ) {
                case 40:
                    {
                    int LA29_2 = input.LA(2);

                    if ( (synpred13_InternalSimpleExpressions()) ) {
                        alt29=1;
                    }
                    else if ( (synpred14_InternalSimpleExpressions()) ) {
                        alt29=2;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA29_3 = input.LA(2);

                    if ( (synpred14_InternalSimpleExpressions()) ) {
                        alt29=2;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA29_4 = input.LA(2);

                    if ( (synpred14_InternalSimpleExpressions()) ) {
                        alt29=2;
                    }


                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1465:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1465:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1465:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1465:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1465:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1471:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1471:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1471:26: ()
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1472:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall3686); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1481:1: ( ( ruleValidID ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1482:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1482:1: ( ruleValidID )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1483:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3709);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3725);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1504:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1505:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1505:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1506:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3747);
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
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1523:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1523:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1523:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1523:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1523:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1539:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1539:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1539:8: ()
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1540:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1545:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt22=3;
            	    switch ( input.LA(1) ) {
            	    case 40:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 42:
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
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1545:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall3833); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1550:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1550:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1551:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1551:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1552:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall3857); if (state.failed) return current;
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
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1566:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1566:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1567:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1567:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1568:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall3894); if (state.failed) return current;
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

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1581:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==25) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1581:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleXMemberFeatureCall3923); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1585:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1586:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1586:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1587:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3944);
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

            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1603:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop23:
            	            do {
            	                int alt23=2;
            	                int LA23_0 = input.LA(1);

            	                if ( (LA23_0==43) ) {
            	                    alt23=1;
            	                }


            	                switch (alt23) {
            	            	case 1 :
            	            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1603:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall3957); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1607:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1608:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1608:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1609:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3978);
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
            	            	    break loop23;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,24,FOLLOW_24_in_ruleXMemberFeatureCall3992); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1629:3: ( ( ruleValidID ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1630:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1630:1: ( ruleValidID )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1631:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4017);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1644:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt27=2;
            	    alt27 = dfa27.predict(input);
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1644:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1644:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1644:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1651:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1652:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4051); if (state.failed) return current;
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

            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1665:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt26=3;
            	            alt26 = dfa26.predict(input);
            	            switch (alt26) {
            	                case 1 :
            	                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1665:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1665:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1665:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1682:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1683:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4136);
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
            	                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1700:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1700:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1700:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1700:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1701:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1701:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1702:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4164);
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

            	                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1718:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop25:
            	                    do {
            	                        int alt25=2;
            	                        int LA25_0 = input.LA(1);

            	                        if ( (LA25_0==43) ) {
            	                            alt25=1;
            	                        }


            	                        switch (alt25) {
            	                    	case 1 :
            	                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1718:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4177); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1722:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1723:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1723:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1724:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4198);
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
            	                    	    break loop25;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4215); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1744:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt28=2;
            	    alt28 = dfa28.predict(input);
            	    switch (alt28) {
            	        case 1 :
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1744:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1747:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1748:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4250);
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
            	    break loop29;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1772:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1773:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1774:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4290);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4300); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1781:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1784:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1785:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1785:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt30=13;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1786:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4347);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1796:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4374);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1806:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4401);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1816:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4428);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1826:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4455);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1836:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4482);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1846:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4509);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1856:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4536);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1866:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4563);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1876:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4590);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1886:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4617);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1896:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4644);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1906:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4671);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1922:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1923:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1924:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral4706);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral4716); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1931:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1934:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1935:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1935:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt31=6;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) && (synpred18_InternalSimpleExpressions())) {
                alt31=1;
            }
            else if ( ((LA31_0>=65 && LA31_0<=66)) ) {
                alt31=2;
            }
            else if ( ((LA31_0>=RULE_HEX && LA31_0<=RULE_DECIMAL)) ) {
                alt31=3;
            }
            else if ( (LA31_0==67) ) {
                alt31=4;
            }
            else if ( (LA31_0==RULE_STRING) ) {
                alt31=5;
            }
            else if ( (LA31_0==68) ) {
                alt31=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1935:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1935:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1935:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral4776);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1948:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4804);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1958:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4831);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1968:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral4858);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1978:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral4885);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1988:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4912);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2004:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2005:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2006:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure4947);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure4957); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2013:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2016:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2017:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2017:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2017:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2017:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2017:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2019:5: ( () otherlv_1= '[' )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2019:6: () otherlv_1= '['
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2019:6: ()
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2020:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleXClosure5017); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2029:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2029:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2044:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2044:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2044:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ID||LA33_0==28||LA33_0==44) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2044:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2044:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2045:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2045:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2046:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5090);
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

                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2062:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==43) ) {
                                    alt32=1;
                                }


                                switch (alt32) {
                            	case 1 :
                            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2062:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleXClosure5103); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2066:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2067:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2067:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2068:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5124);
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
                            	    break loop32;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2084:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2085:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2085:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2086:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,47,FOLLOW_47_in_ruleXClosure5146); if (state.failed) return current;
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

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2099:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2100:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2100:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2101:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5183);
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

            otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleXClosure5195); if (state.failed) return current;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2129:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2130:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2131:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5231);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5241); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2138:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2141:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2142:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2142:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2142:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2142:2: ()
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2143:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2148:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_ID)||LA36_0==25||(LA36_0>=32 && LA36_0<=33)||LA36_0==38||LA36_0==44||LA36_0==46||LA36_0==49||LA36_0==51||LA36_0==53||(LA36_0>=57 && LA36_0<=62)||(LA36_0>=64 && LA36_0<=71)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2148:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2148:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2149:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2149:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2150:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5297);
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

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2166:2: (otherlv_2= ';' )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==14) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2166:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleXExpressionInClosure5310); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2178:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2179:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2180:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5350);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5360); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2187:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2190:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2191:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2191:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2191:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2191:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2191:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2207:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2207:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2207:7: ()
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2208:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2213:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID||LA38_0==28||LA38_0==44) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2213:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2213:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2214:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2214:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2215:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5468);
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

                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2231:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==43) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2231:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXShortClosure5481); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2235:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2236:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2236:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2237:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5502);
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
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2253:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2254:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2254:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2255:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,47,FOLLOW_47_in_ruleXShortClosure5524); if (state.failed) return current;
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

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2268:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2269:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2269:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2270:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5560);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2294:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2295:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2296:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5596);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5606); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2303:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2306:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2307:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2307:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2307:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleXParenthesizedExpression5643); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5665);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXParenthesizedExpression5676); if (state.failed) return current;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2332:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2333:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2334:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5712);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5722); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2341:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2344:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2345:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2345:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2345:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2345:2: ()
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2346:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXIfExpression5768); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXIfExpression5780); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2359:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2360:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2360:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2361:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5801);
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

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXIfExpression5813); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2381:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2382:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2382:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2383:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5834);
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

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2399:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==50) ) {
                int LA39_1 = input.LA(2);

                if ( (synpred22_InternalSimpleExpressions()) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2399:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2399:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2399:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_50_in_ruleXIfExpression5855); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2404:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2405:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2405:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2406:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5877);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2430:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2431:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2432:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5915);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression5925); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2439:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2442:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2443:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2443:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2443:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2443:2: ()
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2444:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression5971); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2453:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_ID)||LA41_0==25||(LA41_0>=32 && LA41_0<=33)||LA41_0==38||LA41_0==46||LA41_0==49||LA41_0==51||LA41_0==53||(LA41_0>=57 && LA41_0<=59)||LA41_0==62||(LA41_0>=64 && LA41_0<=71)) ) {
                alt41=1;
            }
            else if ( (LA41_0==44) ) {
                int LA41_2 = input.LA(2);

                if ( (LA41_2==RULE_ID) ) {
                    int LA41_3 = input.LA(3);

                    if ( (LA41_3==52) && (synpred24_InternalSimpleExpressions())) {
                        alt41=2;
                    }
                    else if ( ((LA41_3>=15 && LA41_3<=37)||(LA41_3>=39 && LA41_3<=42)||(LA41_3>=44 && LA41_3<=46)||LA41_3==63) ) {
                        alt41=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA41_2>=RULE_STRING && LA41_2<=RULE_DECIMAL)||LA41_2==25||(LA41_2>=32 && LA41_2<=33)||LA41_2==38||LA41_2==44||LA41_2==46||LA41_2==49||LA41_2==51||LA41_2==53||(LA41_2>=57 && LA41_2<=59)||LA41_2==62||(LA41_2>=64 && LA41_2<=71)) ) {
                    alt41=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2453:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2453:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2453:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2453:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID) ) {
                        int LA40_1 = input.LA(2);

                        if ( (LA40_1==52) && (synpred23_InternalSimpleExpressions())) {
                            alt40=1;
                        }
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2453:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2458:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2458:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2458:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2459:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2459:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2460:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6014);
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

                            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6026); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2480:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2481:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2481:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2482:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6050);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2499:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2499:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2499:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2499:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2499:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2505:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2505:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleXSwitchExpression6094); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2509:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2510:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2510:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2511:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6115);
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

                    otherlv_7=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6127); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2531:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2532:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2532:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2533:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6150);
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

                    otherlv_9=(Token)match(input,45,FOLLOW_45_in_ruleXSwitchExpression6162); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,53,FOLLOW_53_in_ruleXSwitchExpression6176); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2557:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID||LA42_0==28||LA42_0==44||LA42_0==52||LA42_0==56) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2558:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2558:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2559:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6197);
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
            	    if ( cnt42 >= 1 ) break loop42;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2575:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==54) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2575:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,54,FOLLOW_54_in_ruleXSwitchExpression6211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,52,FOLLOW_52_in_ruleXSwitchExpression6223); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2583:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2584:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2584:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2585:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6244);
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

            otherlv_15=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6258); if (state.failed) return current;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2613:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2614:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2615:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6294);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6304); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2622:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2625:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2626:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2626:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2626:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2626:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID||LA44_0==28||LA44_0==44) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2627:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2627:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2628:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6350);
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

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2644:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==56) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2644:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXCasePart6364); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2648:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2649:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2649:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2650:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6385);
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

            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleXCasePart6399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2670:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2671:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2671:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2672:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6420);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2696:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2697:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2698:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6456);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6466); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2705:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2708:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2709:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2709:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2709:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2709:2: ()
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2710:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXForLoopExpression6512); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXForLoopExpression6524); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2723:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2724:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2724:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2725:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6545);
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

            otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleXForLoopExpression6557); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2745:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2746:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2746:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2747:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6578);
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

            otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleXForLoopExpression6590); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2767:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2768:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2768:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2769:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6611);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2793:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2794:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2795:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6647);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6657); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2802:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2805:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2806:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2806:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2806:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2806:2: ()
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2807:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXWhileExpression6703); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXWhileExpression6715); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2820:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2821:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2821:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2822:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6736);
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

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXWhileExpression6748); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2842:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2843:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2843:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2844:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6769);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2868:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2869:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2870:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6805);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6815); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2877:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2880:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2881:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2881:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2881:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2881:2: ()
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2882:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXDoWhileExpression6861); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2891:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2892:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2892:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2893:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6882);
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

            otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleXDoWhileExpression6894); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleXDoWhileExpression6906); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2917:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2918:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2918:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2919:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6927);
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

            otherlv_6=(Token)match(input,45,FOLLOW_45_in_ruleXDoWhileExpression6939); if (state.failed) return current;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2947:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2948:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2949:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6975);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression6985); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2956:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2959:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2960:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2960:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2960:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2960:2: ()
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2961:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXBlockExpression7031); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2970:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=RULE_STRING && LA47_0<=RULE_ID)||LA47_0==25||(LA47_0>=32 && LA47_0<=33)||LA47_0==38||LA47_0==44||LA47_0==46||LA47_0==49||LA47_0==51||LA47_0==53||(LA47_0>=57 && LA47_0<=62)||(LA47_0>=64 && LA47_0<=71)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2970:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2970:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2971:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2971:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2972:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7053);
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

            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2988:2: (otherlv_3= ';' )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==14) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2988:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleXBlockExpression7066); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_4=(Token)match(input,55,FOLLOW_55_in_ruleXBlockExpression7082); if (state.failed) return current;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3004:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3005:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3006:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7118);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7128); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3013:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3016:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3017:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3017:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=60 && LA48_0<=61)) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=RULE_STRING && LA48_0<=RULE_ID)||LA48_0==25||(LA48_0>=32 && LA48_0<=33)||LA48_0==38||LA48_0==44||LA48_0==46||LA48_0==49||LA48_0==51||LA48_0==53||(LA48_0>=57 && LA48_0<=59)||LA48_0==62||(LA48_0>=64 && LA48_0<=71)) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3018:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7175);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3028:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7202);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3044:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3045:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3046:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7237);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7247); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3053:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3056:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3057:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3057:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3057:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3057:2: ()
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3058:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3063:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==60) ) {
                alt49=1;
            }
            else if ( (LA49_0==61) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3063:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3063:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3064:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3064:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3065:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,60,FOLLOW_60_in_ruleXVariableDeclaration7300); if (state.failed) return current;
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3079:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleXVariableDeclaration7331); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3083:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                int LA50_1 = input.LA(2);

                if ( (synpred25_InternalSimpleExpressions()) ) {
                    alt50=1;
                }
                else if ( (true) ) {
                    alt50=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA50_0==44) && (synpred25_InternalSimpleExpressions())) {
                alt50=1;
            }
            else if ( (LA50_0==28) && (synpred25_InternalSimpleExpressions())) {
                alt50=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3083:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3083:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3083:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3091:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3091:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3091:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3092:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3092:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3093:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7379);
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

                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3109:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3110:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3110:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3111:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7400);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3128:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3128:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3129:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3129:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3130:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7429);
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

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3146:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==15) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3146:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleXVariableDeclaration7443); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3150:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3151:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3151:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3152:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7464);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3176:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3177:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3178:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7502);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7512); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3185:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3188:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3189:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3189:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3189:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3189:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==RULE_ID||LA52_1==25||LA52_1==40||LA52_1==46) ) {
                    alt52=1;
                }
            }
            else if ( (LA52_0==28||LA52_0==44) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3190:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3190:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3191:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7558);
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

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3207:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3208:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3208:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3209:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7580);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3233:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3234:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3235:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7616);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7626); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3242:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3245:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3246:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3246:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3246:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3246:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3247:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3247:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3248:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7672);
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

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3264:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3265:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3265:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3266:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7693);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3290:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3291:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3292:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7729);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7739); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3299:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3302:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3303:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3303:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3303:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3303:2: ()
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3304:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3309:2: ( ( ruleStaticQualifier ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==63) ) {
                    alt53=1;
                }
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3310:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3310:1: ( ruleStaticQualifier )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3311:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7796);
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

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3324:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==25) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3324:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXFeatureCall7810); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3328:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3329:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3329:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3330:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7831);
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

                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3346:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==43) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3346:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall7844); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3350:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3351:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3351:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3352:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7865);
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
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleXFeatureCall7879); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3372:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3373:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3373:1: ( ruleIdOrSuper )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3374:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7904);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3387:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3387:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3387:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3387:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3394:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3395:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,44,FOLLOW_44_in_ruleXFeatureCall7938); if (state.failed) return current;
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

                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3408:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt57=3;
                    alt57 = dfa57.predict(input);
                    switch (alt57) {
                        case 1 :
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3408:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3408:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3408:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3425:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3426:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8023);
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
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3443:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3443:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3443:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3443:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3444:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3444:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3445:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8051);
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

                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3461:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==43) ) {
                                    alt56=1;
                                }


                                switch (alt56) {
                            	case 1 :
                            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3461:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall8064); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3465:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3466:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3466:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3467:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8085);
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
                            	    break loop56;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,45,FOLLOW_45_in_ruleXFeatureCall8102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3487:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3487:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3490:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3491:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8137);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3515:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3516:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3517:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8175);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8186); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3524:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3527:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3528:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3528:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                alt60=1;
            }
            else if ( (LA60_0==62) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3529:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8233);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3541:2: kw= 'super'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleIdOrSuper8257); if (state.failed) return current;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3554:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3555:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3556:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8298);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8309); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3563:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3566:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3567:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3567:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_ID) ) {
                    int LA61_2 = input.LA(2);

                    if ( (LA61_2==63) ) {
                        alt61=1;
                    }


                }


                switch (alt61) {
            	case 1 :
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3568:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8356);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,63,FOLLOW_63_in_ruleStaticQualifier8374); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3592:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3593:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3594:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8415);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8425); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3601:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3604:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3605:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3605:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3605:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3605:2: ()
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3606:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXConstructorCall8471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3615:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3616:1: ( ruleQualifiedName )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3616:1: ( ruleQualifiedName )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3617:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8494);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3630:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt63=2;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3630:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3630:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3630:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleXConstructorCall8515); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3635:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3636:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3636:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3637:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8537);
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

                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3653:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==43) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3653:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall8550); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3657:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3658:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3658:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3659:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8571);
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
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleXConstructorCall8585); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3679:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3679:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3679:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3679:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,44,FOLLOW_44_in_ruleXConstructorCall8608); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3684:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt65=3;
                    alt65 = dfa65.predict(input);
                    switch (alt65) {
                        case 1 :
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3684:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3684:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3684:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3701:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3702:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8681);
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
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3719:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3719:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3719:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3719:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3720:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3720:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3721:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8709);
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

                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3737:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop64:
                            do {
                                int alt64=2;
                                int LA64_0 = input.LA(1);

                                if ( (LA64_0==43) ) {
                                    alt64=1;
                                }


                                switch (alt64) {
                            	case 1 :
                            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3737:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall8722); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3741:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3742:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3742:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3743:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8743);
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
                            	    break loop64;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,45,FOLLOW_45_in_ruleXConstructorCall8760); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3763:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3763:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3766:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3767:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall8795);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3791:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3792:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3793:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8832);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8842); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3800:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3803:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3804:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3804:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3804:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3804:2: ()
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3805:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3810:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==65) ) {
                alt68=1;
            }
            else if ( (LA68_0==66) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3810:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXBooleanLiteral8889); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3815:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3815:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3816:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3816:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3817:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,66,FOLLOW_66_in_ruleXBooleanLiteral8913); if (state.failed) return current;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3838:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3839:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3840:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8963);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral8973); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3847:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3850:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3851:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3851:1: ( () otherlv_1= 'null' )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3851:2: () otherlv_1= 'null'
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3851:2: ()
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3852:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXNullLiteral9019); if (state.failed) return current;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3869:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3870:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3871:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9055);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9065); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3878:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3881:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3882:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3882:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3882:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3882:2: ()
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3883:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3888:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3889:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3889:1: (lv_value_1_0= ruleNumber )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3890:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9120);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3914:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3915:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3916:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9156);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9166); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3923:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3926:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3927:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3927:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3927:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3927:2: ()
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3928:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3933:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3934:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3934:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3935:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9217); if (state.failed) return current;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3959:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3960:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3961:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9258);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9268); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3968:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3971:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3972:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3972:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3972:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3972:2: ()
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3973:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXTypeLiteral9314); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXTypeLiteral9326); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3986:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3987:1: ( ruleQualifiedName )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3987:1: ( ruleQualifiedName )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3988:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9349);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXTypeLiteral9361); if (state.failed) return current;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4013:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4014:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4015:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9397);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9407); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4022:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4025:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4026:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4026:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4026:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4026:2: ()
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4027:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXThrowExpression9453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4036:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4037:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4037:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4038:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9474);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4062:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4063:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4064:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9510);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9520); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4071:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4074:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4075:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4075:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4075:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4075:2: ()
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4076:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXReturnExpression9566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4085:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4085:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4090:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4091:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9597);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4115:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4116:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4117:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9634);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9644); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4124:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4127:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4128:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4128:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4128:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4128:2: ()
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4129:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXTryCatchFinallyExpression9690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4138:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4139:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4139:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4140:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9711);
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

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4156:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==73) ) {
                alt72=1;
            }
            else if ( (LA72_0==72) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4156:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4156:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4156:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4156:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt70=0;
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==73) ) {
                            int LA70_2 = input.LA(2);

                            if ( (synpred34_InternalSimpleExpressions()) ) {
                                alt70=1;
                            }


                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4156:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4158:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4159:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9741);
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
                    	    if ( cnt70 >= 1 ) break loop70;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(70, input);
                                throw eee;
                        }
                        cnt70++;
                    } while (true);

                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4175:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==72) ) {
                        int LA71_1 = input.LA(2);

                        if ( (synpred35_InternalSimpleExpressions()) ) {
                            alt71=1;
                        }
                    }
                    switch (alt71) {
                        case 1 :
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4175:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4175:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4175:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,72,FOLLOW_72_in_ruleXTryCatchFinallyExpression9763); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4180:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4181:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4181:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4182:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9785);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4199:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4199:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4199:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,72,FOLLOW_72_in_ruleXTryCatchFinallyExpression9807); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4203:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4204:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4204:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4205:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9828);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4229:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4230:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4231:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9866);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause9876); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4238:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4241:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4242:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4242:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4242:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4242:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4242:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleXCatchClause9921); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleXCatchClause9934); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4251:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4252:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4252:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4253:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause9955);
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

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleXCatchClause9967); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4273:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4274:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4274:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4275:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause9988);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4299:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4300:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4301:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10025);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10036); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4308:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4311:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4312:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4312:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4313:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10083);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4323:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==40) ) {
                    int LA73_2 = input.LA(2);

                    if ( (LA73_2==RULE_ID) ) {
                        int LA73_3 = input.LA(3);

                        if ( (synpred37_InternalSimpleExpressions()) ) {
                            alt73=1;
                        }


                    }


                }


                switch (alt73) {
            	case 1 :
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4323:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4323:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4323:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,40,FOLLOW_40_in_ruleQualifiedName10111); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10134);
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
            	    break loop73;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4350:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4354:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4355:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10188);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10199); if (state.failed) return current;

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4365:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4369:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4370:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4370:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_HEX) ) {
                alt77=1;
            }
            else if ( ((LA77_0>=RULE_INT && LA77_0<=RULE_DECIMAL)) ) {
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4370:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4378:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4378:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4378:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4378:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==RULE_INT) ) {
                        alt74=1;
                    }
                    else if ( (LA74_0==RULE_DECIMAL) ) {
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
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4378:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10271); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4386:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10297); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4393:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==40) ) {
                        int LA76_1 = input.LA(2);

                        if ( ((LA76_1>=RULE_INT && LA76_1<=RULE_DECIMAL)) ) {
                            alt76=1;
                        }
                    }
                    switch (alt76) {
                        case 1 :
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4394:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,40,FOLLOW_40_in_ruleNumber10317); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4399:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt75=2;
                            int LA75_0 = input.LA(1);

                            if ( (LA75_0==RULE_INT) ) {
                                alt75=1;
                            }
                            else if ( (LA75_0==RULE_DECIMAL) ) {
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
                                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4399:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10333); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4407:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10359); if (state.failed) return current;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4425:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4426:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4427:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10412);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10422); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4434:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4437:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4438:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4438:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_ID) ) {
                alt79=1;
            }
            else if ( (LA79_0==28||LA79_0==44) ) {
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4438:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4438:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4439:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10470);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4447:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==46) ) {
                            int LA78_2 = input.LA(2);

                            if ( (LA78_2==48) ) {
                                int LA78_3 = input.LA(3);

                                if ( (synpred38_InternalSimpleExpressions()) ) {
                                    alt78=1;
                                }


                            }


                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4447:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4450:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4450:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4450:6: ()
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4451:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleJvmTypeReference10508); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleJvmTypeReference10520); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4466:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10552);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4482:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4483:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4484:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10587);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10597); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4491:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4494:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4495:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4495:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4495:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4495:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==44) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4495:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleXFunctionTypeRef10635); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4499:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==RULE_ID||LA81_0==28||LA81_0==44) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4499:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4499:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4500:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4500:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4501:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10657);
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

                            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4517:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop80:
                            do {
                                int alt80=2;
                                int LA80_0 = input.LA(1);

                                if ( (LA80_0==43) ) {
                                    alt80=1;
                                }


                                switch (alt80) {
                            	case 1 :
                            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4517:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXFunctionTypeRef10670); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4521:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4522:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4522:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4523:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10691);
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
                            	    break loop80;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleXFunctionTypeRef10707); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleXFunctionTypeRef10721); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4547:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4548:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4548:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4549:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10742);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4573:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4574:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4575:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10778);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10788); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4582:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4585:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4586:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4586:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4586:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4586:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4587:1: ( ruleQualifiedName )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4587:1: ( ruleQualifiedName )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4588:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10836);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4601:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt84=2;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4601:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4601:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4601:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleJvmParameterizedTypeReference10857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4606:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4607:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4607:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4608:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10879);
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

                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4624:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==43) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4624:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleJvmParameterizedTypeReference10892); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4628:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4629:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4629:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4630:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10913);
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
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleJvmParameterizedTypeReference10927); if (state.failed) return current;
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4658:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4659:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4660:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10965);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10975); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4667:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4670:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4671:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4671:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_ID||LA85_0==28||LA85_0==44) ) {
                alt85=1;
            }
            else if ( (LA85_0==74) ) {
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4672:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11022);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4682:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11049);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4698:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4699:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4700:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11084);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11094); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4707:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4710:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4711:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4711:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4711:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4711:2: ()
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4712:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleJvmWildcardTypeReference11140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4721:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt86=3;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==75) ) {
                alt86=1;
            }
            else if ( (LA86_0==62) ) {
                alt86=2;
            }
            switch (alt86) {
                case 1 :
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4721:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4721:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4722:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4722:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4723:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11162);
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
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4740:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4740:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4741:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4741:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4742:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11189);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4766:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4767:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4768:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11227);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11237); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4775:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4778:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4779:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4779:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4779:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleJvmUpperBound11274); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4783:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4784:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4784:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4785:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11295);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4809:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4810:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4811:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11331);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11341); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4818:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4821:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4822:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4822:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4822:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleJvmUpperBoundAnded11378); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4826:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4827:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4827:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4828:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11399);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4852:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4853:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4854:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11435);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11445); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4861:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4864:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4865:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4865:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4865:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleJvmLowerBound11482); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4869:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4870:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4870:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4871:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11503);
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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4897:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4898:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4899:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11542);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11553); if (state.failed) return current;

            }

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
    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4906:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4909:28: (this_ID_0= RULE_ID )
            // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4910:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11592); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalSimpleExpressions
    public final void synpred1_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:277:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:277:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:277:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:277:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:277:5: ()
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:278:1: 
        {
        }

        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:278:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:279:1: ( ruleOpMultiAssign )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:279:1: ( ruleOpMultiAssign )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:280:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalSimpleExpressions564);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalSimpleExpressions

    // $ANTLR start synpred2_InternalSimpleExpressions
    public final void synpred2_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:405:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:405:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:405:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:405:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:405:5: ()
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:406:1: 
        {
        }

        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:406:2: ( ( ruleOpOr ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:407:1: ( ruleOpOr )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:407:1: ( ruleOpOr )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:408:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalSimpleExpressions912);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalSimpleExpressions

    // $ANTLR start synpred3_InternalSimpleExpressions
    public final void synpred3_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:506:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:506:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:506:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:506:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:506:5: ()
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:507:1: 
        {
        }

        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:507:2: ( ( ruleOpAnd ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:508:1: ( ruleOpAnd )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:508:1: ( ruleOpAnd )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:509:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalSimpleExpressions1171);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalSimpleExpressions

    // $ANTLR start synpred4_InternalSimpleExpressions
    public final void synpred4_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:607:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:607:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:607:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:607:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:607:5: ()
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:608:1: 
        {
        }

        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:608:2: ( ( ruleOpEquality ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:609:1: ( ruleOpEquality )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:609:1: ( ruleOpEquality )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:610:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalSimpleExpressions1430);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalSimpleExpressions

    // $ANTLR start synpred5_InternalSimpleExpressions
    public final void synpred5_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:715:4: ( ( () 'instanceof' ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:715:5: ( () 'instanceof' )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:715:5: ( () 'instanceof' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:715:6: () 'instanceof'
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:715:6: ()
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:716:1: 
        {
        }

        match(input,21,FOLLOW_21_in_synpred5_InternalSimpleExpressions1706); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalSimpleExpressions

    // $ANTLR start synpred6_InternalSimpleExpressions
    public final void synpred6_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:746:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:746:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:746:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:746:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:746:10: ()
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:747:1: 
        {
        }

        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:747:2: ( ( ruleOpCompare ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:748:1: ( ruleOpCompare )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:748:1: ( ruleOpCompare )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:749:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalSimpleExpressions1777);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalSimpleExpressions

    // $ANTLR start synpred7_InternalSimpleExpressions
    public final void synpred7_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:868:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:868:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:868:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:868:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:868:5: ()
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:869:1: 
        {
        }

        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:869:2: ( ( ruleOpOther ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:870:1: ( ruleOpOther )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:870:1: ( ruleOpOther )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:871:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalSimpleExpressions2096);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalSimpleExpressions

    // $ANTLR start synpred8_InternalSimpleExpressions
    public final void synpred8_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:960:3: ( ( '>' '>' ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:960:4: ( '>' '>' )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:960:4: ( '>' '>' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:961:2: '>' '>'
        {
        match(input,24,FOLLOW_24_in_synpred8_InternalSimpleExpressions2312); if (state.failed) return ;
        match(input,24,FOLLOW_24_in_synpred8_InternalSimpleExpressions2317); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalSimpleExpressions

    // $ANTLR start synpred9_InternalSimpleExpressions
    public final void synpred9_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:990:3: ( ( '<' '<' ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:990:4: ( '<' '<' )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:990:4: ( '<' '<' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:991:2: '<' '<'
        {
        match(input,25,FOLLOW_25_in_synpred9_InternalSimpleExpressions2399); if (state.failed) return ;
        match(input,25,FOLLOW_25_in_synpred9_InternalSimpleExpressions2404); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalSimpleExpressions

    // $ANTLR start synpred10_InternalSimpleExpressions
    public final void synpred10_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1064:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1064:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1064:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1064:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1064:5: ()
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1065:1: 
        {
        }

        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1065:2: ( ( ruleOpAdd ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1066:1: ( ruleOpAdd )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1066:1: ( ruleOpAdd )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1067:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalSimpleExpressions2626);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalSimpleExpressions

    // $ANTLR start synpred11_InternalSimpleExpressions
    public final void synpred11_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1172:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1172:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1172:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1172:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1172:5: ()
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1173:1: 
        {
        }

        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1173:2: ( ( ruleOpMulti ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1174:1: ( ruleOpMulti )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1174:1: ( ruleOpMulti )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1175:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalSimpleExpressions2906);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalSimpleExpressions

    // $ANTLR start synpred12_InternalSimpleExpressions
    public final void synpred12_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1405:3: ( ( () 'as' ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1405:4: ( () 'as' )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1405:4: ( () 'as' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1405:5: () 'as'
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1405:5: ()
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1406:1: 
        {
        }

        match(input,39,FOLLOW_39_in_synpred12_InternalSimpleExpressions3500); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalSimpleExpressions

    // $ANTLR start synpred13_InternalSimpleExpressions
    public final void synpred13_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1465:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1465:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1465:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1465:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1465:6: ()
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1466:1: 
        {
        }

        match(input,40,FOLLOW_40_in_synpred13_InternalSimpleExpressions3654); if (state.failed) return ;
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1467:1: ( ( ruleValidID ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1468:1: ( ruleValidID )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1468:1: ( ruleValidID )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1469:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred13_InternalSimpleExpressions3663);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalSimpleExpressions3669);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalSimpleExpressions

    // $ANTLR start synpred14_InternalSimpleExpressions
    public final void synpred14_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1523:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1523:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1523:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1523:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1523:10: ()
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1524:1: 
        {
        }

        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1524:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt87=3;
        switch ( input.LA(1) ) {
        case 40:
            {
            alt87=1;
            }
            break;
        case 41:
            {
            alt87=2;
            }
            break;
        case 42:
            {
            alt87=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 87, 0, input);

            throw nvae;
        }

        switch (alt87) {
            case 1 :
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1524:4: '.'
                {
                match(input,40,FOLLOW_40_in_synpred14_InternalSimpleExpressions3772); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1526:6: ( ( '?.' ) )
                {
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1526:6: ( ( '?.' ) )
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1527:1: ( '?.' )
                {
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1527:1: ( '?.' )
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1528:2: '?.'
                {
                match(input,41,FOLLOW_41_in_synpred14_InternalSimpleExpressions3786); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1533:6: ( ( '*.' ) )
                {
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1533:6: ( ( '*.' ) )
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1534:1: ( '*.' )
                {
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1534:1: ( '*.' )
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1535:2: '*.'
                {
                match(input,42,FOLLOW_42_in_synpred14_InternalSimpleExpressions3806); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalSimpleExpressions

    // $ANTLR start synpred15_InternalSimpleExpressions
    public final void synpred15_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1644:4: ( ( '(' ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1645:1: ( '(' )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1645:1: ( '(' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1646:2: '('
        {
        match(input,44,FOLLOW_44_in_synpred15_InternalSimpleExpressions4033); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalSimpleExpressions

    // $ANTLR start synpred16_InternalSimpleExpressions
    public final void synpred16_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1665:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1665:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1665:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1665:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1665:6: ()
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1666:1: 
        {
        }

        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1666:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt89=2;
        int LA89_0 = input.LA(1);

        if ( (LA89_0==RULE_ID||LA89_0==28||LA89_0==44) ) {
            alt89=1;
        }
        switch (alt89) {
            case 1 :
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1666:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1666:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1667:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1667:1: ( ruleJvmFormalParameter )
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1668:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSimpleExpressions4085);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1670:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop88:
                do {
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==43) ) {
                        alt88=1;
                    }


                    switch (alt88) {
                	case 1 :
                	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1670:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred16_InternalSimpleExpressions4092); if (state.failed) return ;
                	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1671:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1672:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1672:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1673:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSimpleExpressions4099);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

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

        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1675:6: ( ( '|' ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1676:1: ( '|' )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1676:1: ( '|' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1677:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred16_InternalSimpleExpressions4113); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalSimpleExpressions

    // $ANTLR start synpred17_InternalSimpleExpressions
    public final void synpred17_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1744:4: ( ( () '[' ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1744:5: ( () '[' )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1744:5: ( () '[' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1744:6: () '['
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1744:6: ()
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1745:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred17_InternalSimpleExpressions4233); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalSimpleExpressions

    // $ANTLR start synpred18_InternalSimpleExpressions
    public final void synpred18_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1935:3: ( ( () '[' ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1935:4: ( () '[' )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1935:4: ( () '[' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1935:5: () '['
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1935:5: ()
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:1936:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred18_InternalSimpleExpressions4757); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalSimpleExpressions

    // $ANTLR start synpred20_InternalSimpleExpressions
    public final void synpred20_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2029:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2029:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2029:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2029:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2029:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt91=2;
        int LA91_0 = input.LA(1);

        if ( (LA91_0==RULE_ID||LA91_0==28||LA91_0==44) ) {
            alt91=1;
        }
        switch (alt91) {
            case 1 :
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2029:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2029:7: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2030:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2030:1: ( ruleJvmFormalParameter )
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2031:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalSimpleExpressions5036);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2033:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop90:
                do {
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==43) ) {
                        alt90=1;
                    }


                    switch (alt90) {
                	case 1 :
                	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2033:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred20_InternalSimpleExpressions5043); if (state.failed) return ;
                	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2034:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2035:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2035:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2036:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalSimpleExpressions5050);
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

        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2038:6: ( ( '|' ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2039:1: ( '|' )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2039:1: ( '|' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2040:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred20_InternalSimpleExpressions5064); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalSimpleExpressions

    // $ANTLR start synpred22_InternalSimpleExpressions
    public final void synpred22_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2399:4: ( 'else' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2399:6: 'else'
        {
        match(input,50,FOLLOW_50_in_synpred22_InternalSimpleExpressions5847); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalSimpleExpressions

    // $ANTLR start synpred23_InternalSimpleExpressions
    public final void synpred23_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2453:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2453:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2453:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2453:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2453:6: ( ( ruleValidID ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2454:1: ( ruleValidID )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2454:1: ( ruleValidID )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2455:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalSimpleExpressions5989);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,52,FOLLOW_52_in_synpred23_InternalSimpleExpressions5995); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalSimpleExpressions

    // $ANTLR start synpred24_InternalSimpleExpressions
    public final void synpred24_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2499:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2499:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2499:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2499:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,44,FOLLOW_44_in_synpred24_InternalSimpleExpressions6071); if (state.failed) return ;
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2500:1: ( ( ruleValidID ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2501:1: ( ruleValidID )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2501:1: ( ruleValidID )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:2502:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalSimpleExpressions6078);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,52,FOLLOW_52_in_synpred24_InternalSimpleExpressions6084); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalSimpleExpressions

    // $ANTLR start synpred25_InternalSimpleExpressions
    public final void synpred25_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3083:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3083:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3083:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3083:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3083:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3084:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3084:1: ( ruleJvmTypeReference )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3085:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalSimpleExpressions7349);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3087:2: ( ( ruleValidID ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3088:1: ( ruleValidID )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3088:1: ( ruleValidID )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3089:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalSimpleExpressions7358);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalSimpleExpressions

    // $ANTLR start synpred26_InternalSimpleExpressions
    public final void synpred26_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3387:4: ( ( '(' ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3388:1: ( '(' )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3388:1: ( '(' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3389:2: '('
        {
        match(input,44,FOLLOW_44_in_synpred26_InternalSimpleExpressions7920); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalSimpleExpressions

    // $ANTLR start synpred27_InternalSimpleExpressions
    public final void synpred27_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3408:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3408:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3408:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3408:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3408:6: ()
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3409:1: 
        {
        }

        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3409:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==RULE_ID||LA95_0==28||LA95_0==44) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3409:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3409:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3410:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3410:1: ( ruleJvmFormalParameter )
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3411:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalSimpleExpressions7972);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3413:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop94:
                do {
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==43) ) {
                        alt94=1;
                    }


                    switch (alt94) {
                	case 1 :
                	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3413:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred27_InternalSimpleExpressions7979); if (state.failed) return ;
                	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3414:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3415:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3415:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3416:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalSimpleExpressions7986);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop94;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3418:6: ( ( '|' ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3419:1: ( '|' )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3419:1: ( '|' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3420:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred27_InternalSimpleExpressions8000); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalSimpleExpressions

    // $ANTLR start synpred28_InternalSimpleExpressions
    public final void synpred28_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3487:4: ( ( () '[' ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3487:5: ( () '[' )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3487:5: ( () '[' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3487:6: () '['
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3487:6: ()
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3488:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred28_InternalSimpleExpressions8120); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalSimpleExpressions

    // $ANTLR start synpred29_InternalSimpleExpressions
    public final void synpred29_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3630:4: ( '<' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3630:6: '<'
        {
        match(input,25,FOLLOW_25_in_synpred29_InternalSimpleExpressions8507); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalSimpleExpressions

    // $ANTLR start synpred30_InternalSimpleExpressions
    public final void synpred30_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3679:5: ( '(' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3679:7: '('
        {
        match(input,44,FOLLOW_44_in_synpred30_InternalSimpleExpressions8600); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalSimpleExpressions

    // $ANTLR start synpred31_InternalSimpleExpressions
    public final void synpred31_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3684:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3684:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3684:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3684:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3684:6: ()
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3685:1: 
        {
        }

        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3685:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt97=2;
        int LA97_0 = input.LA(1);

        if ( (LA97_0==RULE_ID||LA97_0==28||LA97_0==44) ) {
            alt97=1;
        }
        switch (alt97) {
            case 1 :
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3685:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3685:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3686:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3686:1: ( ruleJvmFormalParameter )
                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3687:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalSimpleExpressions8630);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3689:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop96:
                do {
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==43) ) {
                        alt96=1;
                    }


                    switch (alt96) {
                	case 1 :
                	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3689:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,43,FOLLOW_43_in_synpred31_InternalSimpleExpressions8637); if (state.failed) return ;
                	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3690:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3691:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3691:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3692:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalSimpleExpressions8644);
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

        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3694:6: ( ( '|' ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3695:1: ( '|' )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3695:1: ( '|' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3696:2: '|'
        {
        match(input,47,FOLLOW_47_in_synpred31_InternalSimpleExpressions8658); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalSimpleExpressions

    // $ANTLR start synpred32_InternalSimpleExpressions
    public final void synpred32_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3763:4: ( ( () '[' ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3763:5: ( () '[' )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3763:5: ( () '[' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3763:6: () '['
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3763:6: ()
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:3764:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred32_InternalSimpleExpressions8778); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalSimpleExpressions

    // $ANTLR start synpred33_InternalSimpleExpressions
    public final void synpred33_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4085:2: ( ( ruleXExpression ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4086:1: ( ruleXExpression )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4086:1: ( ruleXExpression )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4087:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalSimpleExpressions9580);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalSimpleExpressions

    // $ANTLR start synpred34_InternalSimpleExpressions
    public final void synpred34_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4156:5: ( 'catch' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4156:7: 'catch'
        {
        match(input,73,FOLLOW_73_in_synpred34_InternalSimpleExpressions9725); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalSimpleExpressions

    // $ANTLR start synpred35_InternalSimpleExpressions
    public final void synpred35_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4175:5: ( 'finally' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4175:7: 'finally'
        {
        match(input,72,FOLLOW_72_in_synpred35_InternalSimpleExpressions9755); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalSimpleExpressions

    // $ANTLR start synpred37_InternalSimpleExpressions
    public final void synpred37_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4323:3: ( '.' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4324:2: '.'
        {
        match(input,40,FOLLOW_40_in_synpred37_InternalSimpleExpressions10102); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalSimpleExpressions

    // $ANTLR start synpred38_InternalSimpleExpressions
    public final void synpred38_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4447:2: ( ( () '[' ']' ) )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4447:3: ( () '[' ']' )
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4447:3: ( () '[' ']' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4447:4: () '[' ']'
        {
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4447:4: ()
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4448:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred38_InternalSimpleExpressions10485); if (state.failed) return ;
        match(input,48,FOLLOW_48_in_synpred38_InternalSimpleExpressions10489); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalSimpleExpressions

    // $ANTLR start synpred39_InternalSimpleExpressions
    public final void synpred39_InternalSimpleExpressions_fragment() throws RecognitionException {   
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4601:4: ( '<' )
        // ../org.xtext.simple/src-gen/org/xtext/simple/parser/antlr/internal/InternalSimpleExpressions.g:4601:6: '<'
        {
        match(input,25,FOLLOW_25_in_synpred39_InternalSimpleExpressions10849); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalSimpleExpressions

    // Delegated rules

    public final boolean synpred28_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalSimpleExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalSimpleExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA84 dfa84 = new DFA84(this);
    static final String DFA11_eotS =
        "\13\uffff";
    static final String DFA11_eofS =
        "\1\1\12\uffff";
    static final String DFA11_minS =
        "\1\4\1\uffff\10\0\1\uffff";
    static final String DFA11_maxS =
        "\1\111\1\uffff\10\0\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA11_specialS =
        "\2\uffff\1\7\1\5\1\4\1\6\1\3\1\1\1\2\1\0\1\uffff}>";
    static final String[] DFA11_transitionS = {
            "\5\1\5\uffff\1\1\1\uffff\10\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1"+
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

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "()* loopback of 868:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSimpleExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSimpleExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSimpleExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSimpleExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSimpleExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSimpleExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSimpleExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalSimpleExpressions()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\101\uffff";
    static final String DFA27_eofS =
        "\1\2\100\uffff";
    static final String DFA27_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA27_maxS =
        "\1\111\1\0\77\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA27_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA27_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\34\2\1\1\2\2\1\uffff\17\2\1\uffff\12"+
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
            return "1644:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index27_1);
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
    static final String DFA26_eotS =
        "\36\uffff";
    static final String DFA26_eofS =
        "\36\uffff";
    static final String DFA26_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA26_maxS =
        "\1\107\2\0\33\uffff";
    static final String DFA26_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA26_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA26_transitionS = {
            "\4\5\1\1\20\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
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

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1665:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                         
                        int index26_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_0==RULE_ID) ) {s = 1;}

                        else if ( (LA26_0==44) ) {s = 2;}

                        else if ( (LA26_0==28) && (synpred16_InternalSimpleExpressions())) {s = 3;}

                        else if ( (LA26_0==47) && (synpred16_InternalSimpleExpressions())) {s = 4;}

                        else if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_DECIMAL)||LA26_0==25||(LA26_0>=32 && LA26_0<=33)||LA26_0==38||LA26_0==46||LA26_0==49||LA26_0==51||LA26_0==53||(LA26_0>=57 && LA26_0<=59)||LA26_0==62||(LA26_0>=64 && LA26_0<=71)) ) {s = 5;}

                        else if ( (LA26_0==45) ) {s = 29;}

                         
                        input.seek(index26_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_1 = input.LA(1);

                         
                        int index26_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSimpleExpressions()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index26_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_2 = input.LA(1);

                         
                        int index26_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalSimpleExpressions()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index26_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\101\uffff";
    static final String DFA28_eofS =
        "\1\2\100\uffff";
    static final String DFA28_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA28_maxS =
        "\1\111\1\0\77\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA28_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA28_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\36\2\1\1\1\uffff\17\2\1\uffff\12\2",
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
            return "1744:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
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
                        if ( (synpred17_InternalSimpleExpressions()) ) {s = 64;}

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
    static final String DFA30_eotS =
        "\16\uffff";
    static final String DFA30_eofS =
        "\16\uffff";
    static final String DFA30_minS =
        "\1\4\15\uffff";
    static final String DFA30_maxS =
        "\1\107\15\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA30_specialS =
        "\16\uffff}>";
    static final String[] DFA30_transitionS = {
            "\4\5\1\4\20\uffff\1\4\22\uffff\1\15\1\uffff\1\5\2\uffff\1\6"+
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
            return "1785:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA34_eotS =
        "\40\uffff";
    static final String DFA34_eofS =
        "\40\uffff";
    static final String DFA34_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA34_maxS =
        "\1\107\2\0\35\uffff";
    static final String DFA34_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA34_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA34_transitionS = {
            "\4\5\1\1\20\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
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

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "2029:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_0 = input.LA(1);

                         
                        int index34_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_0==RULE_ID) ) {s = 1;}

                        else if ( (LA34_0==44) ) {s = 2;}

                        else if ( (LA34_0==28) && (synpred20_InternalSimpleExpressions())) {s = 3;}

                        else if ( (LA34_0==47) && (synpred20_InternalSimpleExpressions())) {s = 4;}

                        else if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_DECIMAL)||LA34_0==25||(LA34_0>=32 && LA34_0<=33)||LA34_0==38||LA34_0==46||(LA34_0>=48 && LA34_0<=49)||LA34_0==51||LA34_0==53||(LA34_0>=57 && LA34_0<=62)||(LA34_0>=64 && LA34_0<=71)) ) {s = 5;}

                         
                        input.seek(index34_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSimpleExpressions()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSimpleExpressions()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA58_eotS =
        "\101\uffff";
    static final String DFA58_eofS =
        "\1\2\100\uffff";
    static final String DFA58_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA58_maxS =
        "\1\111\1\0\77\uffff";
    static final String DFA58_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA58_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA58_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\34\2\1\1\2\2\1\uffff\17\2\1\uffff\12"+
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
            ""
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "3387:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA57_eotS =
        "\36\uffff";
    static final String DFA57_eofS =
        "\36\uffff";
    static final String DFA57_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA57_maxS =
        "\1\107\2\0\33\uffff";
    static final String DFA57_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA57_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA57_transitionS = {
            "\4\5\1\1\20\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
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

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "3408:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_0 = input.LA(1);

                         
                        int index57_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA57_0==RULE_ID) ) {s = 1;}

                        else if ( (LA57_0==44) ) {s = 2;}

                        else if ( (LA57_0==28) && (synpred27_InternalSimpleExpressions())) {s = 3;}

                        else if ( (LA57_0==47) && (synpred27_InternalSimpleExpressions())) {s = 4;}

                        else if ( ((LA57_0>=RULE_STRING && LA57_0<=RULE_DECIMAL)||LA57_0==25||(LA57_0>=32 && LA57_0<=33)||LA57_0==38||LA57_0==46||LA57_0==49||LA57_0==51||LA57_0==53||(LA57_0>=57 && LA57_0<=59)||LA57_0==62||(LA57_0>=64 && LA57_0<=71)) ) {s = 5;}

                        else if ( (LA57_0==45) ) {s = 29;}

                         
                        input.seek(index57_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA57_1 = input.LA(1);

                         
                        int index57_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSimpleExpressions()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index57_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA57_2 = input.LA(1);

                         
                        int index57_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSimpleExpressions()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index57_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA59_eotS =
        "\101\uffff";
    static final String DFA59_eofS =
        "\1\2\100\uffff";
    static final String DFA59_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA59_maxS =
        "\1\111\1\0\77\uffff";
    static final String DFA59_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA59_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA59_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\36\2\1\1\1\uffff\17\2\1\uffff\12\2",
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
            return "3487:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index59_1);
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
    static final String DFA63_eotS =
        "\101\uffff";
    static final String DFA63_eofS =
        "\1\2\100\uffff";
    static final String DFA63_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA63_maxS =
        "\1\111\1\0\77\uffff";
    static final String DFA63_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA63_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA63_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\11\2\1\1\25\2\1\uffff\17\2\1\uffff"+
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
            return "3630:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_1 = input.LA(1);

                         
                        int index63_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index63_1);
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
    static final String DFA66_eotS =
        "\101\uffff";
    static final String DFA66_eofS =
        "\1\2\100\uffff";
    static final String DFA66_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA66_maxS =
        "\1\111\1\0\77\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA66_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\34\2\1\1\2\2\1\uffff\17\2\1\uffff\12"+
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
            return "3679:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred30_InternalSimpleExpressions()) ) {s = 64;}

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
    static final String DFA65_eotS =
        "\36\uffff";
    static final String DFA65_eofS =
        "\36\uffff";
    static final String DFA65_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA65_maxS =
        "\1\107\2\0\33\uffff";
    static final String DFA65_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA65_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA65_transitionS = {
            "\4\5\1\1\20\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\5"+
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
            return "3684:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_0 = input.LA(1);

                         
                        int index65_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA65_0==RULE_ID) ) {s = 1;}

                        else if ( (LA65_0==44) ) {s = 2;}

                        else if ( (LA65_0==28) && (synpred31_InternalSimpleExpressions())) {s = 3;}

                        else if ( (LA65_0==47) && (synpred31_InternalSimpleExpressions())) {s = 4;}

                        else if ( ((LA65_0>=RULE_STRING && LA65_0<=RULE_DECIMAL)||LA65_0==25||(LA65_0>=32 && LA65_0<=33)||LA65_0==38||LA65_0==46||LA65_0==49||LA65_0==51||LA65_0==53||(LA65_0>=57 && LA65_0<=59)||LA65_0==62||(LA65_0>=64 && LA65_0<=71)) ) {s = 5;}

                        else if ( (LA65_0==45) ) {s = 29;}

                         
                        input.seek(index65_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalSimpleExpressions()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA65_2 = input.LA(1);

                         
                        int index65_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalSimpleExpressions()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index65_2);
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
    static final String DFA67_eotS =
        "\101\uffff";
    static final String DFA67_eofS =
        "\1\2\100\uffff";
    static final String DFA67_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA67_maxS =
        "\1\111\1\0\77\uffff";
    static final String DFA67_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA67_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\36\2\1\1\1\uffff\17\2\1\uffff\12\2",
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
            return "3763:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index67_1);
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
        "\101\uffff";
    static final String DFA69_eofS =
        "\1\33\100\uffff";
    static final String DFA69_minS =
        "\1\4\32\0\46\uffff";
    static final String DFA69_maxS =
        "\1\111\32\0\46\uffff";
    static final String DFA69_acceptS =
        "\33\uffff\1\2\44\uffff\1\1";
    static final String DFA69_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\46\uffff}>";
    static final String[] DFA69_transitionS = {
            "\1\21\1\15\1\16\1\17\1\1\5\uffff\1\33\1\uffff\11\33\1\10\6\33"+
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
            return "4085:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA69_2 = input.LA(1);

                         
                        int index69_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA69_3 = input.LA(1);

                         
                        int index69_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA69_4 = input.LA(1);

                         
                        int index69_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA69_5 = input.LA(1);

                         
                        int index69_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA69_6 = input.LA(1);

                         
                        int index69_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA69_7 = input.LA(1);

                         
                        int index69_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA69_8 = input.LA(1);

                         
                        int index69_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA69_9 = input.LA(1);

                         
                        int index69_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA69_10 = input.LA(1);

                         
                        int index69_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA69_11 = input.LA(1);

                         
                        int index69_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA69_12 = input.LA(1);

                         
                        int index69_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA69_13 = input.LA(1);

                         
                        int index69_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA69_14 = input.LA(1);

                         
                        int index69_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA69_15 = input.LA(1);

                         
                        int index69_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA69_16 = input.LA(1);

                         
                        int index69_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA69_17 = input.LA(1);

                         
                        int index69_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA69_18 = input.LA(1);

                         
                        int index69_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA69_19 = input.LA(1);

                         
                        int index69_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA69_20 = input.LA(1);

                         
                        int index69_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA69_21 = input.LA(1);

                         
                        int index69_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA69_22 = input.LA(1);

                         
                        int index69_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA69_23 = input.LA(1);

                         
                        int index69_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA69_24 = input.LA(1);

                         
                        int index69_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA69_25 = input.LA(1);

                         
                        int index69_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA69_26 = input.LA(1);

                         
                        int index69_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index69_26);
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
    static final String DFA84_eotS =
        "\101\uffff";
    static final String DFA84_eofS =
        "\1\2\100\uffff";
    static final String DFA84_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA84_maxS =
        "\1\111\1\0\77\uffff";
    static final String DFA84_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA84_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA84_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\11\2\1\1\25\2\1\uffff\17\2\1\uffff"+
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
            ""
    };

    static final short[] DFA84_eot = DFA.unpackEncodedString(DFA84_eotS);
    static final short[] DFA84_eof = DFA.unpackEncodedString(DFA84_eofS);
    static final char[] DFA84_min = DFA.unpackEncodedStringToUnsignedChars(DFA84_minS);
    static final char[] DFA84_max = DFA.unpackEncodedStringToUnsignedChars(DFA84_maxS);
    static final short[] DFA84_accept = DFA.unpackEncodedString(DFA84_acceptS);
    static final short[] DFA84_special = DFA.unpackEncodedString(DFA84_specialS);
    static final short[][] DFA84_transition;

    static {
        int numStates = DFA84_transitionS.length;
        DFA84_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA84_transition[i] = DFA.unpackEncodedString(DFA84_transitionS[i]);
        }
    }

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = DFA84_eot;
            this.eof = DFA84_eof;
            this.min = DFA84_min;
            this.max = DFA84_max;
            this.accept = DFA84_accept;
            this.special = DFA84_special;
            this.transition = DFA84_transition;
        }
        public String getDescription() {
            return "4601:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA84_1 = input.LA(1);

                         
                        int index84_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalSimpleExpressions()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index84_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 84, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleApplication122 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleApplication143 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleMain_in_ruleApplication164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleMain266 = new BitSet(new long[]{0x7E2A5043020041F2L,0x00000000000000FFL});
    public static final BitSet FOLLOW_14_in_ruleMain279 = new BitSet(new long[]{0x7E2A5043020001F2L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment477 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment493 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment543 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment596 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOpSingleAssign707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpMultiAssign795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression891 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression944 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression967 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpOr1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1150 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1203 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1226 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpAnd1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1409 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1462 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1485 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpEquality1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpEquality1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1689 = new BitSet(new long[]{0x0000000003E00002L});
    public static final BitSet FOLLOW_21_in_ruleXRelationalExpression1725 = new BitSet(new long[]{0x0000100010000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression1748 = new BitSet(new long[]{0x0000000003E00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression1809 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression1832 = new BitSet(new long[]{0x0000000003E00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare1872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpCompare1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpCompare1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpCompare1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2075 = new BitSet(new long[]{0x00000000FF000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2128 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2151 = new BitSet(new long[]{0x00000000FF000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpOther2297 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOpOther2328 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOpOther2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpOther2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2384 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2415 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOther2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2605 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2658 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2681 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd2720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpAdd2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpAdd2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression2828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2885 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression2938 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression2961 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpMulti3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMulti3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpMulti3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3214 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpUnary3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpUnary3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpUnary3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3484 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleXCastedExpression3519 = new BitSet(new long[]{0x0000100010000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3542 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3637 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall3686 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall3709 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall3725 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall3747 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall3833 = new BitSet(new long[]{0x0000000002000100L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall3857 = new BitSet(new long[]{0x0000000002000100L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall3894 = new BitSet(new long[]{0x0000000002000100L});
    public static final BitSet FOLLOW_25_in_ruleXMemberFeatureCall3923 = new BitSet(new long[]{0x0000100010000100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3944 = new BitSet(new long[]{0x0000080001000000L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall3957 = new BitSet(new long[]{0x0000100010000100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall3978 = new BitSet(new long[]{0x0000080001000000L});
    public static final BitSet FOLLOW_24_in_ruleXMemberFeatureCall3992 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4017 = new BitSet(new long[]{0x0000570000000002L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4051 = new BitSet(new long[]{0x7E2AF043120001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4136 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4164 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4177 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4198 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4215 = new BitSet(new long[]{0x0000470000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4250 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral4706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral4804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral4858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure4947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure4957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleXClosure5017 = new BitSet(new long[]{0x7E2BD043120001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5090 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_ruleXClosure5103 = new BitSet(new long[]{0x0000100010000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5124 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_ruleXClosure5146 = new BitSet(new long[]{0x7E2B5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5183 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXClosure5195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5297 = new BitSet(new long[]{0x7E2A5043020041F2L,0x00000000000000FFL});
    public static final BitSet FOLLOW_14_in_ruleXExpressionInClosure5310 = new BitSet(new long[]{0x7E2A5043020001F2L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5468 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_ruleXShortClosure5481 = new BitSet(new long[]{0x0000100010000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5502 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_ruleXShortClosure5524 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXParenthesizedExpression5643 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5665 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXParenthesizedExpression5676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXIfExpression5768 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXIfExpression5780 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5801 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXIfExpression5813 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5834 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXIfExpression5855 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression5925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression5971 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6014 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6026 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6050 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_44_in_ruleXSwitchExpression6094 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6115 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6127 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6150 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXSwitchExpression6162 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXSwitchExpression6176 = new BitSet(new long[]{0x0110100010000100L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6197 = new BitSet(new long[]{0x01D0100010000100L});
    public static final BitSet FOLLOW_54_in_ruleXSwitchExpression6211 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXSwitchExpression6223 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6244 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6350 = new BitSet(new long[]{0x0110000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXCasePart6364 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6385 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXCasePart6399 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXForLoopExpression6512 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXForLoopExpression6524 = new BitSet(new long[]{0x0000100010000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6545 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXForLoopExpression6557 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6578 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXForLoopExpression6590 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXWhileExpression6703 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXWhileExpression6715 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6736 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXWhileExpression6748 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXDoWhileExpression6861 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6882 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXDoWhileExpression6894 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXDoWhileExpression6906 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6927 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXDoWhileExpression6939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression6975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression6985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXBlockExpression7031 = new BitSet(new long[]{0x7EAA5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7053 = new BitSet(new long[]{0x7EAA5043020041F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_14_in_ruleXBlockExpression7066 = new BitSet(new long[]{0x7EAA5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_55_in_ruleXBlockExpression7082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXVariableDeclaration7300 = new BitSet(new long[]{0x0000100010000100L});
    public static final BitSet FOLLOW_61_in_ruleXVariableDeclaration7331 = new BitSet(new long[]{0x0000100010000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7379 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7400 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7429 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleXVariableDeclaration7443 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7558 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7672 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7796 = new BitSet(new long[]{0x4000000002000100L});
    public static final BitSet FOLLOW_25_in_ruleXFeatureCall7810 = new BitSet(new long[]{0x0000100010000100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7831 = new BitSet(new long[]{0x0000080001000000L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall7844 = new BitSet(new long[]{0x0000100010000100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7865 = new BitSet(new long[]{0x0000080001000000L});
    public static final BitSet FOLLOW_24_in_ruleXFeatureCall7879 = new BitSet(new long[]{0x4000000002000100L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7904 = new BitSet(new long[]{0x0000500000000002L});
    public static final BitSet FOLLOW_44_in_ruleXFeatureCall7938 = new BitSet(new long[]{0x7E2AF043120001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8023 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8051 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall8064 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8085 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFeatureCall8102 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleIdOrSuper8257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8356 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleStaticQualifier8374 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXConstructorCall8471 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8494 = new BitSet(new long[]{0x0000500002000002L});
    public static final BitSet FOLLOW_25_in_ruleXConstructorCall8515 = new BitSet(new long[]{0x0000100010000100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8537 = new BitSet(new long[]{0x0000080001000000L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall8550 = new BitSet(new long[]{0x0000100010000100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8571 = new BitSet(new long[]{0x0000080001000000L});
    public static final BitSet FOLLOW_24_in_ruleXConstructorCall8585 = new BitSet(new long[]{0x0000500000000002L});
    public static final BitSet FOLLOW_44_in_ruleXConstructorCall8608 = new BitSet(new long[]{0x7E2AF043120001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8681 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8709 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall8722 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8743 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXConstructorCall8760 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall8795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral8832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXBooleanLiteral8889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXBooleanLiteral8913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral8973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXNullLiteral9019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXTypeLiteral9314 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXTypeLiteral9326 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9349 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXTypeLiteral9361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXThrowExpression9453 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXReturnExpression9566 = new BitSet(new long[]{0x7E2A5043020001F2L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXTryCatchFinallyExpression9690 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression9741 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_72_in_ruleXTryCatchFinallyExpression9763 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXTryCatchFinallyExpression9807 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause9866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause9876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXCatchClause9921 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXCatchClause9934 = new BitSet(new long[]{0x0000100010000100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause9955 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleXCatchClause9967 = new BitSet(new long[]{0x7E2A5043020001F0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause9988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10083 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleQualifiedName10111 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10134 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10271 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10297 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleNumber10317 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10470 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleJvmTypeReference10508 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleJvmTypeReference10520 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXFunctionTypeRef10635 = new BitSet(new long[]{0x0000300010000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10657 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleXFunctionTypeRef10670 = new BitSet(new long[]{0x0000100010000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10691 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_45_in_ruleXFunctionTypeRef10707 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXFunctionTypeRef10721 = new BitSet(new long[]{0x0000100010000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10836 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleJvmParameterizedTypeReference10857 = new BitSet(new long[]{0x0000100010000100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10879 = new BitSet(new long[]{0x0000080001000000L});
    public static final BitSet FOLLOW_43_in_ruleJvmParameterizedTypeReference10892 = new BitSet(new long[]{0x0000100010000100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10913 = new BitSet(new long[]{0x0000080001000000L});
    public static final BitSet FOLLOW_24_in_ruleJvmParameterizedTypeReference10927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference10975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleJvmWildcardTypeReference11140 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleJvmUpperBound11274 = new BitSet(new long[]{0x0000100010000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmUpperBoundAnded11378 = new BitSet(new long[]{0x0000100010000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleJvmLowerBound11482 = new BitSet(new long[]{0x0000100010000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalSimpleExpressions564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalSimpleExpressions912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalSimpleExpressions1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalSimpleExpressions1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred5_InternalSimpleExpressions1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalSimpleExpressions1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalSimpleExpressions2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred8_InternalSimpleExpressions2312 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_synpred8_InternalSimpleExpressions2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred9_InternalSimpleExpressions2399 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_synpred9_InternalSimpleExpressions2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalSimpleExpressions2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalSimpleExpressions2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred12_InternalSimpleExpressions3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred13_InternalSimpleExpressions3654 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred13_InternalSimpleExpressions3663 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalSimpleExpressions3669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred14_InternalSimpleExpressions3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred14_InternalSimpleExpressions3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred14_InternalSimpleExpressions3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred15_InternalSimpleExpressions4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSimpleExpressions4085 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred16_InternalSimpleExpressions4092 = new BitSet(new long[]{0x0000100010000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalSimpleExpressions4099 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred16_InternalSimpleExpressions4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred17_InternalSimpleExpressions4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred18_InternalSimpleExpressions4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalSimpleExpressions5036 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred20_InternalSimpleExpressions5043 = new BitSet(new long[]{0x0000100010000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalSimpleExpressions5050 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred20_InternalSimpleExpressions5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred22_InternalSimpleExpressions5847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalSimpleExpressions5989 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred23_InternalSimpleExpressions5995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred24_InternalSimpleExpressions6071 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalSimpleExpressions6078 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred24_InternalSimpleExpressions6084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalSimpleExpressions7349 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalSimpleExpressions7358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred26_InternalSimpleExpressions7920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalSimpleExpressions7972 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred27_InternalSimpleExpressions7979 = new BitSet(new long[]{0x0000100010000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalSimpleExpressions7986 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred27_InternalSimpleExpressions8000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred28_InternalSimpleExpressions8120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred29_InternalSimpleExpressions8507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred30_InternalSimpleExpressions8600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalSimpleExpressions8630 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_synpred31_InternalSimpleExpressions8637 = new BitSet(new long[]{0x0000100010000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalSimpleExpressions8644 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_47_in_synpred31_InternalSimpleExpressions8658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred32_InternalSimpleExpressions8778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalSimpleExpressions9580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_synpred34_InternalSimpleExpressions9725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_synpred35_InternalSimpleExpressions9755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred37_InternalSimpleExpressions10102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred38_InternalSimpleExpressions10485 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_synpred38_InternalSimpleExpressions10489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred39_InternalSimpleExpressions10849 = new BitSet(new long[]{0x0000000000000002L});

}