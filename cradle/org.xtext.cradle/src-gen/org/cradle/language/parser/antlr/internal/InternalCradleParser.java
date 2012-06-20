package org.cradle.language.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.cradle.language.services.CradleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCradleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.'", "'.*'", "'param'", "'='", "'task'", "'depends'", "'on'", "':'", "','", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
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
    public static final int RULE_HEX=6;
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
    public static final int RULE_INT=7;
    public static final int RULE_DECIMAL=8;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
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


        public InternalCradleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCradleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCradleParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g"; }



     	private CradleGrammarAccess grammarAccess;
     	
        public InternalCradleParser(TokenStream input, CradleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CradleFile";	
       	}
       	
       	@Override
       	protected CradleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCradleFile"
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:67:1: entryRuleCradleFile returns [EObject current=null] : iv_ruleCradleFile= ruleCradleFile EOF ;
    public final EObject entryRuleCradleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCradleFile = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:68:2: (iv_ruleCradleFile= ruleCradleFile EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:69:2: iv_ruleCradleFile= ruleCradleFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCradleFileRule()); 
            }
            pushFollow(FOLLOW_ruleCradleFile_in_entryRuleCradleFile75);
            iv_ruleCradleFile=ruleCradleFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCradleFile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCradleFile85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCradleFile"


    // $ANTLR start "ruleCradleFile"
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:76:1: ruleCradleFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImportDeclaration ) )* ( (lv_declarations_1_0= ruleDeclaration ) )* ) ;
    public final EObject ruleCradleFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_declarations_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:79:28: ( ( ( (lv_imports_0_0= ruleImportDeclaration ) )* ( (lv_declarations_1_0= ruleDeclaration ) )* ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:80:1: ( ( (lv_imports_0_0= ruleImportDeclaration ) )* ( (lv_declarations_1_0= ruleDeclaration ) )* )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:80:1: ( ( (lv_imports_0_0= ruleImportDeclaration ) )* ( (lv_declarations_1_0= ruleDeclaration ) )* )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:80:2: ( (lv_imports_0_0= ruleImportDeclaration ) )* ( (lv_declarations_1_0= ruleDeclaration ) )*
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:80:2: ( (lv_imports_0_0= ruleImportDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:81:1: (lv_imports_0_0= ruleImportDeclaration )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:81:1: (lv_imports_0_0= ruleImportDeclaration )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:82:3: lv_imports_0_0= ruleImportDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCradleFileAccess().getImportsImportDeclarationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportDeclaration_in_ruleCradleFile131);
            	    lv_imports_0_0=ruleImportDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCradleFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"ImportDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:98:3: ( (lv_declarations_1_0= ruleDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:99:1: (lv_declarations_1_0= ruleDeclaration )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:99:1: (lv_declarations_1_0= ruleDeclaration )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:100:3: lv_declarations_1_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCradleFileAccess().getDeclarationsDeclarationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleCradleFile153);
            	    lv_declarations_1_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCradleFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_1_0, 
            	              		"Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
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
    // $ANTLR end "ruleCradleFile"


    // $ANTLR start "entryRuleImportDeclaration"
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:124:1: entryRuleImportDeclaration returns [EObject current=null] : iv_ruleImportDeclaration= ruleImportDeclaration EOF ;
    public final EObject entryRuleImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDeclaration = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:125:2: (iv_ruleImportDeclaration= ruleImportDeclaration EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:126:2: iv_ruleImportDeclaration= ruleImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration190);
            iv_ruleImportDeclaration=ruleImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDeclaration200); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportDeclaration"


    // $ANTLR start "ruleImportDeclaration"
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:133:1: ruleImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:136:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:137:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImportDeclaration237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportDeclarationAccess().getImportKeyword_0());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:141:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:143:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImportDeclaration258);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildCard");
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
    // $ANTLR end "ruleImportDeclaration"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:167:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:168:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:169:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard295);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard306); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:176:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:179:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.*' )? ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:180:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.*' )? )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:180:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.*' )? )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:180:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.*' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedNameWithWildCard346); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameWithWildCardAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:187:1: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:188:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildCard365); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedNameWithWildCard380); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameWithWildCardAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:200:3: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:201:2: kw= '.*'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNameWithWildCard401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_2()); 
                          
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
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleDeclaration"
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:214:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:215:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:216:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration443);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration453); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:223:1: ruleDeclaration returns [EObject current=null] : (this_Task_0= ruleTask | this_Parameter_1= ruleParameter ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Task_0 = null;

        EObject this_Parameter_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:226:28: ( (this_Task_0= ruleTask | this_Parameter_1= ruleParameter ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:227:1: (this_Task_0= ruleTask | this_Parameter_1= ruleParameter )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:227:1: (this_Task_0= ruleTask | this_Parameter_1= ruleParameter )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:228:5: this_Task_0= ruleTask
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getTaskParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTask_in_ruleDeclaration500);
                    this_Task_0=ruleTask();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Task_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:238:5: this_Parameter_1= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getParameterParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleDeclaration527);
                    this_Parameter_1=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Parameter_1; 
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleParameter"
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:254:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:255:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:256:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter562);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter572); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:263:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'param' ( (lv_type_1_0= ruleJvmTypeReference ) )? ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_init_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:266:28: ( (otherlv_0= 'param' ( (lv_type_1_0= ruleJvmTypeReference ) )? ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:267:1: (otherlv_0= 'param' ( (lv_type_1_0= ruleJvmTypeReference ) )? ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:267:1: (otherlv_0= 'param' ( (lv_type_1_0= ruleJvmTypeReference ) )? ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )? )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:267:3: otherlv_0= 'param' ( (lv_type_1_0= ruleJvmTypeReference ) )? ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleParameter609); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParamKeyword_0());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:271:1: ( (lv_type_1_0= ruleJvmTypeReference ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID||LA6_1==14||LA6_1==32||LA6_1==51) ) {
                    alt6=1;
                }
            }
            else if ( (LA6_0==35||LA6_0==49) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:272:1: (lv_type_1_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:272:1: (lv_type_1_0= ruleJvmTypeReference )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:273:3: lv_type_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getTypeJvmTypeReferenceParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleParameter630);
                    lv_type_1_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_1_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:289:3: ( (lv_name_2_0= ruleValidID ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:290:1: (lv_name_2_0= ruleValidID )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:290:1: (lv_name_2_0= ruleValidID )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:291:3: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getNameValidIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleParameter652);
            lv_name_2_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:307:2: (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:307:4: otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleParameter665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:311:1: ( (lv_init_4_0= ruleXExpression ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:312:1: (lv_init_4_0= ruleXExpression )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:312:1: (lv_init_4_0= ruleXExpression )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:313:3: lv_init_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getInitXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleParameter686);
                    lv_init_4_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"init",
                              		lv_init_4_0, 
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTask"
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:337:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:338:2: (iv_ruleTask= ruleTask EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:339:2: iv_ruleTask= ruleTask EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTaskRule()); 
            }
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask724);
            iv_ruleTask=ruleTask();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTask; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask734); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:346:1: ruleTask returns [EObject current=null] : (otherlv_0= 'task' ( (lv_name_1_0= ruleValidID ) ) ( ( (otherlv_2= 'depends' otherlv_3= 'on' ) | otherlv_4= ':' ) ( (lv_dependsOn_5_0= ruleTaskReference ) ) (otherlv_6= ',' ( (lv_dependsOn_7_0= ruleTaskReference ) ) )* )? ( (lv_action_8_0= ruleXBlockExpression ) ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_dependsOn_5_0 = null;

        EObject lv_dependsOn_7_0 = null;

        EObject lv_action_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:349:28: ( (otherlv_0= 'task' ( (lv_name_1_0= ruleValidID ) ) ( ( (otherlv_2= 'depends' otherlv_3= 'on' ) | otherlv_4= ':' ) ( (lv_dependsOn_5_0= ruleTaskReference ) ) (otherlv_6= ',' ( (lv_dependsOn_7_0= ruleTaskReference ) ) )* )? ( (lv_action_8_0= ruleXBlockExpression ) ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:350:1: (otherlv_0= 'task' ( (lv_name_1_0= ruleValidID ) ) ( ( (otherlv_2= 'depends' otherlv_3= 'on' ) | otherlv_4= ':' ) ( (lv_dependsOn_5_0= ruleTaskReference ) ) (otherlv_6= ',' ( (lv_dependsOn_7_0= ruleTaskReference ) ) )* )? ( (lv_action_8_0= ruleXBlockExpression ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:350:1: (otherlv_0= 'task' ( (lv_name_1_0= ruleValidID ) ) ( ( (otherlv_2= 'depends' otherlv_3= 'on' ) | otherlv_4= ':' ) ( (lv_dependsOn_5_0= ruleTaskReference ) ) (otherlv_6= ',' ( (lv_dependsOn_7_0= ruleTaskReference ) ) )* )? ( (lv_action_8_0= ruleXBlockExpression ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:350:3: otherlv_0= 'task' ( (lv_name_1_0= ruleValidID ) ) ( ( (otherlv_2= 'depends' otherlv_3= 'on' ) | otherlv_4= ':' ) ( (lv_dependsOn_5_0= ruleTaskReference ) ) (otherlv_6= ',' ( (lv_dependsOn_7_0= ruleTaskReference ) ) )* )? ( (lv_action_8_0= ruleXBlockExpression ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleTask771); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:354:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:355:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:355:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:356:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTaskAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleTask792);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTaskRule());
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

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:372:2: ( ( (otherlv_2= 'depends' otherlv_3= 'on' ) | otherlv_4= ':' ) ( (lv_dependsOn_5_0= ruleTaskReference ) ) (otherlv_6= ',' ( (lv_dependsOn_7_0= ruleTaskReference ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19||LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:372:3: ( (otherlv_2= 'depends' otherlv_3= 'on' ) | otherlv_4= ':' ) ( (lv_dependsOn_5_0= ruleTaskReference ) ) (otherlv_6= ',' ( (lv_dependsOn_7_0= ruleTaskReference ) ) )*
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:372:3: ( (otherlv_2= 'depends' otherlv_3= 'on' ) | otherlv_4= ':' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==19) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==21) ) {
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
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:372:4: (otherlv_2= 'depends' otherlv_3= 'on' )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:372:4: (otherlv_2= 'depends' otherlv_3= 'on' )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:372:6: otherlv_2= 'depends' otherlv_3= 'on'
                            {
                            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleTask807); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getDependsKeyword_2_0_0_0());
                                  
                            }
                            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleTask819); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getOnKeyword_2_0_0_1());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:381:7: otherlv_4= ':'
                            {
                            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleTask838); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getColonKeyword_2_0_1());
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:385:2: ( (lv_dependsOn_5_0= ruleTaskReference ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:386:1: (lv_dependsOn_5_0= ruleTaskReference )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:386:1: (lv_dependsOn_5_0= ruleTaskReference )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:387:3: lv_dependsOn_5_0= ruleTaskReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTaskAccess().getDependsOnTaskReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTaskReference_in_ruleTask860);
                    lv_dependsOn_5_0=ruleTaskReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTaskRule());
                      	        }
                             		add(
                             			current, 
                             			"dependsOn",
                              		lv_dependsOn_5_0, 
                              		"TaskReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:403:2: (otherlv_6= ',' ( (lv_dependsOn_7_0= ruleTaskReference ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==22) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:403:4: otherlv_6= ',' ( (lv_dependsOn_7_0= ruleTaskReference ) )
                    	    {
                    	    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleTask873); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:407:1: ( (lv_dependsOn_7_0= ruleTaskReference ) )
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:408:1: (lv_dependsOn_7_0= ruleTaskReference )
                    	    {
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:408:1: (lv_dependsOn_7_0= ruleTaskReference )
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:409:3: lv_dependsOn_7_0= ruleTaskReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTaskAccess().getDependsOnTaskReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTaskReference_in_ruleTask894);
                    	    lv_dependsOn_7_0=ruleTaskReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTaskRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"dependsOn",
                    	              		lv_dependsOn_7_0, 
                    	              		"TaskReference");
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
                    break;

            }

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:425:6: ( (lv_action_8_0= ruleXBlockExpression ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:426:1: (lv_action_8_0= ruleXBlockExpression )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:426:1: (lv_action_8_0= ruleXBlockExpression )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:427:3: lv_action_8_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTaskAccess().getActionXBlockExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleTask919);
            lv_action_8_0=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTaskRule());
              	        }
                     		set(
                     			current, 
                     			"action",
                      		lv_action_8_0, 
                      		"XBlockExpression");
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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleTaskReference"
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:451:1: entryRuleTaskReference returns [EObject current=null] : iv_ruleTaskReference= ruleTaskReference EOF ;
    public final EObject entryRuleTaskReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskReference = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:452:2: (iv_ruleTaskReference= ruleTaskReference EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:453:2: iv_ruleTaskReference= ruleTaskReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTaskReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleTaskReference_in_entryRuleTaskReference955);
            iv_ruleTaskReference=ruleTaskReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTaskReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskReference965); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskReference"


    // $ANTLR start "ruleTaskReference"
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:460:1: ruleTaskReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_softReference_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTaskReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_softReference_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:463:28: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_softReference_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:464:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_softReference_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:464:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_softReference_1_0= RULE_STRING ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_STRING) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:464:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:464:2: ( (otherlv_0= RULE_ID ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:465:1: (otherlv_0= RULE_ID )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:465:1: (otherlv_0= RULE_ID )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:466:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTaskReferenceRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTaskReference1010); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getTaskReferenceAccess().getReferenceTaskCrossReference_0_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:478:6: ( (lv_softReference_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:478:6: ( (lv_softReference_1_0= RULE_STRING ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:479:1: (lv_softReference_1_0= RULE_STRING )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:479:1: (lv_softReference_1_0= RULE_STRING )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:480:3: lv_softReference_1_0= RULE_STRING
                    {
                    lv_softReference_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTaskReference1033); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_softReference_1_0, grammarAccess.getTaskReferenceAccess().getSoftReferenceSTRINGTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTaskReferenceRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"softReference",
                              		lv_softReference_1_0, 
                              		"STRING");
                      	    
                    }

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
    // $ANTLR end "ruleTaskReference"


    // $ANTLR start "entryRuleXExpression"
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:504:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:505:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:506:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1074);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1084); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:513:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:516:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:518:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1130);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:534:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:535:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:536:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1164);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1174); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:543:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:546:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:547:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:547:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF||(LA13_1>=RULE_ID && LA13_1<=RULE_DECIMAL)||LA13_1==14||LA13_1==16||LA13_1==18||(LA13_1>=21 && LA13_1<=51)||(LA13_1>=53 && LA13_1<=78)) ) {
                    alt13=2;
                }
                else if ( (LA13_1==17) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_DECIMAL)||LA13_0==32||(LA13_0>=39 && LA13_0<=40)||LA13_0==45||LA13_0==49||LA13_0==51||LA13_0==55||(LA13_0>=57 && LA13_0<=58)||(LA13_0>=62 && LA13_0<=64)||LA13_0==67||(LA13_0>=69 && LA13_0<=76)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:547:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:547:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:547:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:547:3: ()
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:548:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:553:2: ( ( ruleValidID ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:554:1: ( ruleValidID )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:554:1: ( ruleValidID )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:555:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1232);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1248);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:576:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:577:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:577:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:578:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1268);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:595:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:595:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:596:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1298);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:604:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==23) ) {
                        int LA12_1 = input.LA(2);

                        if ( (synpred1_InternalCradle()) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:604:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:604:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:604:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:609:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:609:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:609:7: ()
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:610:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:615:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:616:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:616:1: ( ruleOpMultiAssign )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:617:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1351);
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

                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:630:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:631:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:631:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:632:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1374);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:656:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:657:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:658:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1414);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1425); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:665:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:668:28: (kw= '=' )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:670:2: kw= '='
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleOpSingleAssign1462); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:683:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:684:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:685:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1502);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1513); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:692:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:695:28: (kw= '+=' )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:697:2: kw= '+='
            {
            kw=(Token)match(input,23,FOLLOW_23_in_ruleOpMultiAssign1550); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:710:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:711:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:712:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1589);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1599); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:719:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:722:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:723:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:723:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:724:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1646);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:732:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred2_InternalCradle()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:732:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:732:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:732:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:737:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:737:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:737:7: ()
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:738:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:743:2: ( ( ruleOpOr ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:744:1: ( ruleOpOr )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:744:1: ( ruleOpOr )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:745:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1699);
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

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:758:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:759:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:759:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:760:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1722);
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
            	    break loop14;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:784:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:785:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:786:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1761);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1772); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:793:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:796:28: (kw= '||' )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:798:2: kw= '||'
            {
            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOr1809); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:811:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:812:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:813:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1848);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1858); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:820:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:823:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:824:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:824:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:825:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1905);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:833:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred3_InternalCradle()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:833:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:833:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:833:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:838:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:838:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:838:7: ()
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:839:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:844:2: ( ( ruleOpAnd ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:845:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:845:1: ( ruleOpAnd )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:846:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1958);
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

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:859:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:860:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:860:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:861:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1981);
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:885:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:886:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:887:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2020);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2031); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:894:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:897:28: (kw= '&&' )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:899:2: kw= '&&'
            {
            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpAnd2068); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:912:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:913:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:914:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2107);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2117); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:921:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:924:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:925:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:925:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:926:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2164);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:934:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred4_InternalCradle()) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==27) ) {
                    int LA16_3 = input.LA(2);

                    if ( (synpred4_InternalCradle()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:934:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:934:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:934:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:939:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:939:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:939:7: ()
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:940:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:945:2: ( ( ruleOpEquality ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:946:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:946:1: ( ruleOpEquality )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:947:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2217);
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

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:960:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:961:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:961:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:962:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2240);
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:986:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:987:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:988:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2279);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2290); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:995:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:998:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:999:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:999:1: (kw= '==' | kw= '!=' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            else if ( (LA17_0==27) ) {
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1000:2: kw= '=='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpEquality2328); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1007:2: kw= '!='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpEquality2347); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1020:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1021:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1022:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2387);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2397); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1029:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1032:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1033:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1033:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1034:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2444);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1042:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop18:
            do {
                int alt18=3;
                switch ( input.LA(1) ) {
                case 31:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (synpred6_InternalCradle()) ) {
                        alt18=2;
                    }


                    }
                    break;
                case 32:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (synpred6_InternalCradle()) ) {
                        alt18=2;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (synpred5_InternalCradle()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA18_5 = input.LA(2);

                    if ( (synpred6_InternalCradle()) ) {
                        alt18=2;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA18_6 = input.LA(2);

                    if ( (synpred6_InternalCradle()) ) {
                        alt18=2;
                    }


                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1042:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1042:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1042:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1042:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1042:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1044:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1044:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1044:6: ()
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1045:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleXRelationalExpression2480); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1054:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1055:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1055:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1056:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2503);
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
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1073:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1073:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1073:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1073:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1073:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1078:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1078:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1078:7: ()
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1079:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1084:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1085:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1085:1: ( ruleOpCompare )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1086:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2564);
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

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1099:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1100:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1100:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1101:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2587);
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1125:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1126:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1127:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2627);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2638); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1134:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1137:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1138:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1138:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt19=1;
                }
                break;
            case 30:
                {
                alt19=2;
                }
                break;
            case 31:
                {
                alt19=3;
                }
                break;
            case 32:
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1139:2: kw= '>='
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpCompare2676); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1146:2: kw= '<='
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpCompare2695); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1153:2: kw= '>'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpCompare2714); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1160:2: kw= '<'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpCompare2733); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1173:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1174:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1175:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2773);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2783); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1182:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1185:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1186:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1186:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1187:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2830);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1195:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1195:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1195:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1195:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1200:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1200:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1200:7: ()
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1201:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1206:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1207:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1207:1: ( ruleOpOther )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1208:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2883);
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

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1221:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1222:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1222:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1223:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2906);
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
            	    break loop20;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1247:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1248:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1249:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2945);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2956); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1256:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1259:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1260:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1260:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt23=8;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt23=1;
                }
                break;
            case 34:
                {
                alt23=2;
                }
                break;
            case 35:
                {
                alt23=3;
                }
                break;
            case 31:
                {
                alt23=4;
                }
                break;
            case 32:
                {
                alt23=5;
                }
                break;
            case 36:
                {
                alt23=6;
                }
                break;
            case 37:
                {
                alt23=7;
                }
                break;
            case 38:
                {
                alt23=8;
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1261:2: kw= '->'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2994); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1268:2: kw= '..'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpOther3013); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1275:2: kw= '=>'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther3032); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1281:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1281:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1282:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther3052); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1287:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==31) ) {
                        int LA21_1 = input.LA(2);

                        if ( (LA21_1==EOF||(LA21_1>=RULE_ID && LA21_1<=RULE_DECIMAL)||LA21_1==32||(LA21_1>=39 && LA21_1<=40)||LA21_1==45||LA21_1==49||LA21_1==51||LA21_1==55||(LA21_1>=57 && LA21_1<=58)||(LA21_1>=62 && LA21_1<=64)||LA21_1==67||(LA21_1>=69 && LA21_1<=76)) ) {
                            alt21=2;
                        }
                        else if ( (LA21_1==31) && (synpred8_InternalCradle())) {
                            alt21=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1287:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1287:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1287:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1291:5: (kw= '>' kw= '>' )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1292:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther3083); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther3096); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1305:2: kw= '>'
                            {
                            kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther3117); if (state.failed) return current;
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1311:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1311:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1312:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther3139); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1317:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==32) ) {
                        int LA22_1 = input.LA(2);

                        if ( (synpred9_InternalCradle()) ) {
                            alt22=1;
                        }
                        else if ( (true) ) {
                            alt22=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1317:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1317:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1317:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1321:5: (kw= '<' kw= '<' )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1322:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther3170); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther3183); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1335:2: kw= '<'
                            {
                            kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther3204); if (state.failed) return current;
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1342:2: kw= '<>'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther3225); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1349:2: kw= '?:'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpOther3244); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1356:2: kw= '<=>'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpOther3263); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1369:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1370:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1371:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3303);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3313); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1378:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1381:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1382:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1382:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1383:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3360);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1391:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    int LA24_2 = input.LA(2);

                    if ( (synpred10_InternalCradle()) ) {
                        alt24=1;
                    }


                }
                else if ( (LA24_0==40) ) {
                    int LA24_3 = input.LA(2);

                    if ( (synpred10_InternalCradle()) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1391:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1391:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1391:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1396:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1396:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1396:7: ()
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1397:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1402:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1403:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1403:1: ( ruleOpAdd )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1404:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3413);
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

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1417:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1418:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1418:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1419:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3436);
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
            	    break loop24;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1443:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1444:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1445:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3475);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3486); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1452:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1455:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1456:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1456:1: (kw= '+' | kw= '-' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            else if ( (LA25_0==40) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1457:2: kw= '+'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpAdd3524); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1464:2: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpAdd3543); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1477:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1478:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1479:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3583);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3593); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1486:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1489:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1490:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1490:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1491:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3640);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1499:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop26:
            do {
                int alt26=2;
                switch ( input.LA(1) ) {
                case 41:
                    {
                    int LA26_2 = input.LA(2);

                    if ( (synpred11_InternalCradle()) ) {
                        alt26=1;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA26_3 = input.LA(2);

                    if ( (synpred11_InternalCradle()) ) {
                        alt26=1;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA26_4 = input.LA(2);

                    if ( (synpred11_InternalCradle()) ) {
                        alt26=1;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA26_5 = input.LA(2);

                    if ( (synpred11_InternalCradle()) ) {
                        alt26=1;
                    }


                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1499:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1499:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1499:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1504:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1504:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1504:7: ()
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1505:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1510:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1511:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1511:1: ( ruleOpMulti )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1512:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3693);
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

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1525:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1526:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1526:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1527:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3716);
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
            	    break loop26;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1551:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1552:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1553:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3755);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3766); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1560:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1563:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1564:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1564:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt27=1;
                }
                break;
            case 42:
                {
                alt27=2;
                }
                break;
            case 43:
                {
                alt27=3;
                }
                break;
            case 44:
                {
                alt27=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1565:2: kw= '*'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpMulti3804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1572:2: kw= '**'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpMulti3823); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1579:2: kw= '/'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpMulti3842); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1586:2: kw= '%'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpMulti3861); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1599:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1600:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1601:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3901);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3911); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1608:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1611:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1612:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1612:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=39 && LA28_0<=40)||LA28_0==45) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_DECIMAL)||LA28_0==32||LA28_0==49||LA28_0==51||LA28_0==55||(LA28_0>=57 && LA28_0<=58)||(LA28_0>=62 && LA28_0<=64)||LA28_0==67||(LA28_0>=69 && LA28_0<=76)) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1612:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1612:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1612:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1612:3: ()
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1613:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1618:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1619:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1619:1: ( ruleOpUnary )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1620:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3969);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1633:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1634:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1634:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1635:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3990);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1653:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4019);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1669:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1670:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1671:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4055);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4066); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1678:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1681:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1682:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1682:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt29=1;
                }
                break;
            case 40:
                {
                alt29=2;
                }
                break;
            case 39:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1683:2: kw= '!'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpUnary4104); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1690:2: kw= '-'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpUnary4123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1697:2: kw= '+'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpUnary4142); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1710:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1711:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1712:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4182);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4192); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1719:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1722:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1723:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1723:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1724:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4239);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1732:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==46) ) {
                    int LA30_2 = input.LA(2);

                    if ( (synpred12_InternalCradle()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1732:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1732:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1732:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1734:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1734:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1734:6: ()
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1735:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXCastedExpression4274); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1744:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1745:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1745:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1746:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4297);
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1770:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1771:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1772:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4335);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4345); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1779:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1782:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1783:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1783:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1784:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4392);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1792:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop38:
            do {
                int alt38=3;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    int LA38_2 = input.LA(2);

                    if ( (synpred13_InternalCradle()) ) {
                        alt38=1;
                    }
                    else if ( (synpred14_InternalCradle()) ) {
                        alt38=2;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA38_3 = input.LA(2);

                    if ( (synpred14_InternalCradle()) ) {
                        alt38=2;
                    }


                    }
                    break;
                case 48:
                    {
                    int LA38_4 = input.LA(2);

                    if ( (synpred14_InternalCradle()) ) {
                        alt38=2;
                    }


                    }
                    break;

                }

                switch (alt38) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1792:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1792:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1792:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1792:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1792:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1798:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1798:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1798:26: ()
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1799:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleXMemberFeatureCall4441); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1808:1: ( ( ruleValidID ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1809:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1809:1: ( ruleValidID )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1810:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4464);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4480);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1831:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1832:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1832:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1833:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4502);
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
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1850:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1850:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1850:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1850:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1850:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1866:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1866:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1866:8: ()
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1867:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1872:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt31=3;
            	    switch ( input.LA(1) ) {
            	    case 14:
            	        {
            	        alt31=1;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt31=2;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt31=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt31) {
            	        case 1 :
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1872:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleXMemberFeatureCall4588); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1877:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1877:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1878:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1878:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1879:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall4612); if (state.failed) return current;
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
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1893:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1893:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1894:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1894:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1895:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall4649); if (state.failed) return current;
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

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1908:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==32) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1908:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleXMemberFeatureCall4678); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1912:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1913:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1913:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1914:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4699);
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

            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1930:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop32:
            	            do {
            	                int alt32=2;
            	                int LA32_0 = input.LA(1);

            	                if ( (LA32_0==22) ) {
            	                    alt32=1;
            	                }


            	                switch (alt32) {
            	            	case 1 :
            	            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1930:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,22,FOLLOW_22_in_ruleXMemberFeatureCall4712); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1934:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1935:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1935:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1936:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4733);
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
            	            	    break loop32;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,31,FOLLOW_31_in_ruleXMemberFeatureCall4747); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1956:3: ( ( ruleValidID ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1957:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1957:1: ( ruleValidID )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1958:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4772);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1971:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt36=2;
            	    alt36 = dfa36.predict(input);
            	    switch (alt36) {
            	        case 1 :
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1971:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1971:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1971:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1978:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1979:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,49,FOLLOW_49_in_ruleXMemberFeatureCall4806); if (state.failed) return current;
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

            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1992:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt35=3;
            	            alt35 = dfa35.predict(input);
            	            switch (alt35) {
            	                case 1 :
            	                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1992:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1992:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1992:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2009:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2010:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4891);
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
            	                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2027:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2027:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2027:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2027:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2028:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2028:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2029:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4919);
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

            	                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2045:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop34:
            	                    do {
            	                        int alt34=2;
            	                        int LA34_0 = input.LA(1);

            	                        if ( (LA34_0==22) ) {
            	                            alt34=1;
            	                        }


            	                        switch (alt34) {
            	                    	case 1 :
            	                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2045:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,22,FOLLOW_22_in_ruleXMemberFeatureCall4932); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2049:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2050:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2050:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2051:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4953);
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
            	                    	    break loop34;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,50,FOLLOW_50_in_ruleXMemberFeatureCall4970); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2071:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt37=2;
            	    alt37 = dfa37.predict(input);
            	    switch (alt37) {
            	        case 1 :
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2071:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2074:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2075:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5005);
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2099:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2100:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2101:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5045);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression5055); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2108:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2111:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2112:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2112:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt39=13;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2113:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5102);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2123:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5129);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2133:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5156);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2143:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5183);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2153:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5210);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2163:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5237);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2173:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5264);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2183:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5291);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2193:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5318);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2203:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5345);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2213:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5372);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2223:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5399);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2233:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5426);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2249:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2250:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2251:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5461);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5471); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2258:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2261:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2262:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2262:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt40=6;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==51) && (synpred18_InternalCradle())) {
                alt40=1;
            }
            else if ( ((LA40_0>=70 && LA40_0<=71)) ) {
                alt40=2;
            }
            else if ( ((LA40_0>=RULE_HEX && LA40_0<=RULE_DECIMAL)) ) {
                alt40=3;
            }
            else if ( (LA40_0==72) ) {
                alt40=4;
            }
            else if ( (LA40_0==RULE_STRING) ) {
                alt40=5;
            }
            else if ( (LA40_0==73) ) {
                alt40=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2262:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2262:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2262:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5531);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2275:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5559);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2285:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5586);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2295:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5613);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2305:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5640);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2315:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5667);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2331:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2332:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2333:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5702);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5712); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2340:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2343:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2344:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2344:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2344:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2344:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2344:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2346:5: ( () otherlv_1= '[' )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2346:6: () otherlv_1= '['
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2346:6: ()
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2347:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXClosure5772); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2356:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2356:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2371:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2371:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2371:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_ID||LA42_0==35||LA42_0==49) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2371:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2371:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2372:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2372:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2373:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5845);
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

                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2389:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==22) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2389:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleXClosure5858); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2393:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2394:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2394:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2395:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5879);
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
                            	    break loop41;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2411:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2412:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2412:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2413:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,52,FOLLOW_52_in_ruleXClosure5901); if (state.failed) return current;
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

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2426:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2427:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2427:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2428:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5938);
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

            otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleXClosure5950); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2456:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2457:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2458:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5986);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5996); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2465:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2468:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2469:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2469:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2469:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2469:2: ()
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2470:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2475:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_DECIMAL)||LA45_0==32||(LA45_0>=39 && LA45_0<=40)||LA45_0==45||LA45_0==49||LA45_0==51||LA45_0==55||(LA45_0>=57 && LA45_0<=58)||(LA45_0>=62 && LA45_0<=67)||(LA45_0>=69 && LA45_0<=76)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2475:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2475:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2476:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2476:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2477:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6052);
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

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2493:2: (otherlv_2= ';' )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==54) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2493:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleXExpressionInClosure6065); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2505:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2506:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2507:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6105);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6115); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2514:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2517:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2518:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2518:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2518:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2518:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2518:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2534:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2534:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2534:7: ()
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2535:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2540:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID||LA47_0==35||LA47_0==49) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2540:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2540:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2541:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2541:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2542:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6223);
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

                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2558:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==22) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2558:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXShortClosure6236); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2562:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2563:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2563:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2564:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6257);
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
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2580:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2581:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2581:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2582:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,52,FOLLOW_52_in_ruleXShortClosure6279); if (state.failed) return current;
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

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2595:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2596:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2596:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2597:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6315);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2621:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2622:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2623:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6351);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6361); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2630:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2633:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2634:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2634:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2634:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleXParenthesizedExpression6398); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6420);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleXParenthesizedExpression6431); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2659:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2660:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2661:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6467);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6477); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2668:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2671:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2672:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2672:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2672:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2672:2: ()
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2673:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXIfExpression6523); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXIfExpression6535); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2686:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2687:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2687:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2688:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6556);
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

            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleXIfExpression6568); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2708:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2709:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2709:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2710:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6589);
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

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2726:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==56) ) {
                int LA48_1 = input.LA(2);

                if ( (synpred22_InternalCradle()) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2726:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2726:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2726:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,56,FOLLOW_56_in_ruleXIfExpression6610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2731:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2732:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2732:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2733:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6632);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2757:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2758:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2759:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6670);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6680); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2766:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2769:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2770:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2770:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2770:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2770:2: ()
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2771:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6726); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2780:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_DECIMAL)||LA50_0==32||(LA50_0>=39 && LA50_0<=40)||LA50_0==45||LA50_0==51||LA50_0==55||(LA50_0>=57 && LA50_0<=58)||(LA50_0>=62 && LA50_0<=64)||LA50_0==67||(LA50_0>=69 && LA50_0<=76)) ) {
                alt50=1;
            }
            else if ( (LA50_0==49) ) {
                int LA50_2 = input.LA(2);

                if ( (LA50_2==RULE_ID) ) {
                    int LA50_3 = input.LA(3);

                    if ( (LA50_3==14||LA50_3==17||(LA50_3>=23 && LA50_3<=44)||(LA50_3>=46 && LA50_3<=51)||LA50_3==68) ) {
                        alt50=1;
                    }
                    else if ( (LA50_3==21) && (synpred24_InternalCradle())) {
                        alt50=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA50_2>=RULE_STRING && LA50_2<=RULE_DECIMAL)||LA50_2==32||(LA50_2>=39 && LA50_2<=40)||LA50_2==45||LA50_2==49||LA50_2==51||LA50_2==55||(LA50_2>=57 && LA50_2<=58)||(LA50_2>=62 && LA50_2<=64)||LA50_2==67||(LA50_2>=69 && LA50_2<=76)) ) {
                    alt50=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2780:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2780:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2780:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2780:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_ID) ) {
                        int LA49_1 = input.LA(2);

                        if ( (LA49_1==21) && (synpred23_InternalCradle())) {
                            alt49=1;
                        }
                    }
                    switch (alt49) {
                        case 1 :
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2780:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2785:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2785:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2785:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2786:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2786:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2787:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6769);
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

                            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleXSwitchExpression6781); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2807:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2808:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2808:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2809:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6805);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2826:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2826:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2826:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2826:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2826:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2832:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2832:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression6849); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2836:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2837:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2837:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2838:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6870);
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

                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleXSwitchExpression6882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2858:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2859:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2859:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2860:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6905);
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

                    otherlv_9=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression6917); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,58,FOLLOW_58_in_ruleXSwitchExpression6931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2884:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID||LA51_0==21||LA51_0==35||LA51_0==49||LA51_0==61) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2885:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2885:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2886:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6952);
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
            	    if ( cnt51 >= 1 ) break loop51;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2902:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==59) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2902:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,59,FOLLOW_59_in_ruleXSwitchExpression6966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleXSwitchExpression6978); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2910:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2911:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2911:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2912:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6999);
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

            otherlv_15=(Token)match(input,60,FOLLOW_60_in_ruleXSwitchExpression7013); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2940:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2941:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2942:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7049);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7059); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2949:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2952:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2953:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2953:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2953:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2953:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID||LA53_0==35||LA53_0==49) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2954:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2954:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2955:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7105);
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

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2971:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==61) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2971:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXCasePart7119); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2975:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2976:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2976:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2977:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7140);
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

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleXCasePart7154); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2997:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2998:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2998:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2999:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7175);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3023:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3024:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3025:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7211);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7221); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3032:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3035:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3036:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3036:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3036:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3036:2: ()
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3037:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXForLoopExpression7267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXForLoopExpression7279); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3050:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3051:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3051:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3052:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7300);
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

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXForLoopExpression7312); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3072:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3073:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3073:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3074:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7333);
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

            otherlv_6=(Token)match(input,50,FOLLOW_50_in_ruleXForLoopExpression7345); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3094:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3095:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3095:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3096:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7366);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3120:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3121:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3122:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7402);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7412); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3129:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3132:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3133:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3133:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3133:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3133:2: ()
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3134:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXWhileExpression7458); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXWhileExpression7470); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3147:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3148:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3148:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3149:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7491);
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

            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleXWhileExpression7503); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3169:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3170:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3170:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3171:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7524);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3195:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3196:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3197:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7560);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7570); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3204:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3207:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3208:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3208:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3208:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3208:2: ()
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3209:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXDoWhileExpression7616); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3218:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3219:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3219:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3220:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7637);
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

            otherlv_3=(Token)match(input,63,FOLLOW_63_in_ruleXDoWhileExpression7649); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXDoWhileExpression7661); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3244:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3245:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3245:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3246:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7682);
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

            otherlv_6=(Token)match(input,50,FOLLOW_50_in_ruleXDoWhileExpression7694); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3274:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3275:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3276:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7730);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7740); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3283:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3286:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3287:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3287:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3287:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3287:2: ()
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3288:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXBlockExpression7786); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3297:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=RULE_ID && LA56_0<=RULE_DECIMAL)||LA56_0==32||(LA56_0>=39 && LA56_0<=40)||LA56_0==45||LA56_0==49||LA56_0==51||LA56_0==55||(LA56_0>=57 && LA56_0<=58)||(LA56_0>=62 && LA56_0<=67)||(LA56_0>=69 && LA56_0<=76)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3297:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3297:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3298:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3298:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3299:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7808);
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

            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3315:2: (otherlv_3= ';' )?
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==54) ) {
            	        alt55=1;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3315:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXBlockExpression7821); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_4=(Token)match(input,60,FOLLOW_60_in_ruleXBlockExpression7837); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3331:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3332:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3333:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7873);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7883); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3340:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3343:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3344:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3344:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=65 && LA57_0<=66)) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_DECIMAL)||LA57_0==32||(LA57_0>=39 && LA57_0<=40)||LA57_0==45||LA57_0==49||LA57_0==51||LA57_0==55||(LA57_0>=57 && LA57_0<=58)||(LA57_0>=62 && LA57_0<=64)||LA57_0==67||(LA57_0>=69 && LA57_0<=76)) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3345:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7930);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3355:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7957);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3371:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3372:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3373:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7992);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8002); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3380:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3383:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3384:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3384:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3384:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3384:2: ()
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3385:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3390:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==65) ) {
                alt58=1;
            }
            else if ( (LA58_0==66) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3390:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3390:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3391:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3391:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3392:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,65,FOLLOW_65_in_ruleXVariableDeclaration8055); if (state.failed) return current;
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3406:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,66,FOLLOW_66_in_ruleXVariableDeclaration8086); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3410:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (synpred25_InternalCradle()) ) {
                    alt59=1;
                }
                else if ( (true) ) {
                    alt59=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA59_0==49) && (synpred25_InternalCradle())) {
                alt59=1;
            }
            else if ( (LA59_0==35) && (synpred25_InternalCradle())) {
                alt59=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3410:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3410:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3410:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3418:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3418:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3418:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3419:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3419:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3420:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8134);
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

                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3436:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3437:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3437:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3438:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8155);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3455:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3455:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3456:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3456:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3457:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8184);
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

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3473:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==17) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3473:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleXVariableDeclaration8198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3477:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3478:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3478:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3479:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8219);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3503:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3504:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3505:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8257);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8267); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3512:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3515:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3516:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3516:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3516:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3516:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==RULE_ID||LA61_1==14||LA61_1==32||LA61_1==51) ) {
                    alt61=1;
                }
            }
            else if ( (LA61_0==35||LA61_0==49) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3517:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3517:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3518:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8313);
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

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3534:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3535:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3535:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3536:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8335);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3560:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3561:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3562:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8371);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8381); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3569:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3572:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3573:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3573:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3573:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3573:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3574:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3574:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3575:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8427);
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

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3591:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3592:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3592:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3593:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8448);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3617:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3618:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3619:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8484);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8494); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3626:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3629:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3630:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3630:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3630:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3630:2: ()
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3631:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3636:2: ( ( ruleStaticQualifier ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                int LA62_1 = input.LA(2);

                if ( (LA62_1==68) ) {
                    alt62=1;
                }
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3637:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3637:1: ( ruleStaticQualifier )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3638:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8551);
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

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3651:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==32) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3651:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleXFeatureCall8565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3655:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3656:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3656:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3657:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8586);
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

                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3673:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==22) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3673:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleXFeatureCall8599); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3677:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3678:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3678:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3679:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8620);
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
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleXFeatureCall8634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3699:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3700:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3700:1: ( ruleIdOrSuper )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3701:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8659);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3714:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3714:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3714:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3714:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3721:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3722:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,49,FOLLOW_49_in_ruleXFeatureCall8693); if (state.failed) return current;
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

                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3735:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt66=3;
                    alt66 = dfa66.predict(input);
                    switch (alt66) {
                        case 1 :
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3735:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3735:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3735:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3752:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3753:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8778);
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
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3770:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3770:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3770:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3770:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3771:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3771:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3772:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8806);
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

                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3788:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop65:
                            do {
                                int alt65=2;
                                int LA65_0 = input.LA(1);

                                if ( (LA65_0==22) ) {
                                    alt65=1;
                                }


                                switch (alt65) {
                            	case 1 :
                            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3788:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleXFeatureCall8819); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3792:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3793:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3793:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3794:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8840);
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
                            	    break loop65;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,50,FOLLOW_50_in_ruleXFeatureCall8857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3814:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3814:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3817:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3818:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8892);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3842:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3843:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3844:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8930);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8941); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3851:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3854:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3855:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3855:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID) ) {
                alt69=1;
            }
            else if ( (LA69_0==67) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3856:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8988);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3868:2: kw= 'super'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleIdOrSuper9012); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3881:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3882:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3883:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9053);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier9064); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3890:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3893:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3894:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3894:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt70=0;
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==RULE_ID) ) {
                    int LA70_2 = input.LA(2);

                    if ( (LA70_2==68) ) {
                        alt70=1;
                    }


                }


                switch (alt70) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3895:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier9111);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,68,FOLLOW_68_in_ruleStaticQualifier9129); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3919:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3920:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3921:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9170);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9180); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3928:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3931:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3932:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3932:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3932:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3932:2: ()
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3933:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXConstructorCall9226); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3942:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3943:1: ( ruleQualifiedName )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3943:1: ( ruleQualifiedName )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3944:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9249);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3957:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3957:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3957:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3957:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleXConstructorCall9270); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3962:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3963:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3963:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3964:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9292);
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

                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3980:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==22) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3980:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleXConstructorCall9305); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3984:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3985:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3985:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3986:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9326);
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
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleXConstructorCall9340); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4006:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt75=2;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4006:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4006:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4006:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,49,FOLLOW_49_in_ruleXConstructorCall9363); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4011:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt74=3;
                    alt74 = dfa74.predict(input);
                    switch (alt74) {
                        case 1 :
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4011:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4011:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4011:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4028:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4029:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9436);
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
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4046:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4046:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4046:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4046:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4047:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4047:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4048:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9464);
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

                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4064:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop73:
                            do {
                                int alt73=2;
                                int LA73_0 = input.LA(1);

                                if ( (LA73_0==22) ) {
                                    alt73=1;
                                }


                                switch (alt73) {
                            	case 1 :
                            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4064:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleXConstructorCall9477); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4068:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4069:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4069:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4070:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9498);
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
                            	    break loop73;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,50,FOLLOW_50_in_ruleXConstructorCall9515); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4090:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4090:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4093:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4094:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9550);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4118:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4119:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4120:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9587);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9597); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4127:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4130:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4131:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4131:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4131:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4131:2: ()
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4132:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4137:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==70) ) {
                alt77=1;
            }
            else if ( (LA77_0==71) ) {
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4137:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXBooleanLiteral9644); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4142:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4142:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4143:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4143:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4144:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,71,FOLLOW_71_in_ruleXBooleanLiteral9668); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4165:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4166:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4167:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9718);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9728); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4174:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4177:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4178:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4178:1: ( () otherlv_1= 'null' )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4178:2: () otherlv_1= 'null'
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4178:2: ()
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4179:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXNullLiteral9774); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4196:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4197:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4198:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9810);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9820); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4205:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4208:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4209:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4209:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4209:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4209:2: ()
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4210:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4215:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4216:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4216:1: (lv_value_1_0= ruleNumber )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4217:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9875);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4241:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4242:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4243:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9911);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9921); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4250:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4253:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4254:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4254:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4254:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4254:2: ()
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4255:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4260:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4261:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4261:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4262:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9972); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4286:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4287:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4288:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10013);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral10023); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4295:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4298:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4299:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4299:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4299:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4299:2: ()
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4300:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXTypeLiteral10069); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXTypeLiteral10081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4313:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4314:1: ( ruleQualifiedName )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4314:1: ( ruleQualifiedName )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4315:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10104);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleXTypeLiteral10116); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4340:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4341:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4342:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10152);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10162); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4349:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4352:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4353:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4353:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4353:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4353:2: ()
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4354:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXThrowExpression10208); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4363:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4364:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4364:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4365:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10229);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4389:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4390:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4391:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10265);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10275); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4398:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4401:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4402:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4402:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4402:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4402:2: ()
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4403:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXReturnExpression10321); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4412:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt78=2;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4412:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4417:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4418:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10352);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4442:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4443:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4444:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10389);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10399); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4451:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4454:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4455:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4455:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4455:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4455:2: ()
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4456:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleXTryCatchFinallyExpression10445); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4465:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4466:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4466:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4467:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10466);
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

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4483:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==78) ) {
                alt81=1;
            }
            else if ( (LA81_0==77) ) {
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4483:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4483:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4483:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4483:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt79=0;
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==78) ) {
                            int LA79_2 = input.LA(2);

                            if ( (synpred34_InternalCradle()) ) {
                                alt79=1;
                            }


                        }


                        switch (alt79) {
                    	case 1 :
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4483:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4485:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4486:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10496);
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
                    	    if ( cnt79 >= 1 ) break loop79;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(79, input);
                                throw eee;
                        }
                        cnt79++;
                    } while (true);

                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4502:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==77) ) {
                        int LA80_1 = input.LA(2);

                        if ( (synpred35_InternalCradle()) ) {
                            alt80=1;
                        }
                    }
                    switch (alt80) {
                        case 1 :
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4502:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4502:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4502:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,77,FOLLOW_77_in_ruleXTryCatchFinallyExpression10518); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4507:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4508:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4508:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4509:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10540);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4526:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4526:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4526:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,77,FOLLOW_77_in_ruleXTryCatchFinallyExpression10562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4530:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4531:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4531:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4532:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10583);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4556:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4557:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4558:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10621);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10631); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4565:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4568:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4569:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4569:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4569:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4569:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4569:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleXCatchClause10676); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXCatchClause10689); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4578:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4579:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4579:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4580:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10710);
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

            otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleXCatchClause10722); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4600:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4601:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4601:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4602:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10743);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4626:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4627:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4628:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10780);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10791); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4635:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4638:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4639:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4639:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4640:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10838);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4650:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==14) ) {
                    int LA82_2 = input.LA(2);

                    if ( (LA82_2==RULE_ID) ) {
                        int LA82_3 = input.LA(3);

                        if ( (synpred37_InternalCradle()) ) {
                            alt82=1;
                        }


                    }


                }


                switch (alt82) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4650:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4650:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4650:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName10866); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10889);
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
            	    break loop82;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4677:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4681:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4682:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10943);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10954); if (state.failed) return current;

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4692:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4696:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4697:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4697:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_HEX) ) {
                alt86=1;
            }
            else if ( ((LA86_0>=RULE_INT && LA86_0<=RULE_DECIMAL)) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4697:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10998); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4705:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4705:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4705:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4705:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
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
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4705:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11026); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4713:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11052); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4720:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==14) ) {
                        int LA85_1 = input.LA(2);

                        if ( ((LA85_1>=RULE_INT && LA85_1<=RULE_DECIMAL)) ) {
                            alt85=1;
                        }
                    }
                    switch (alt85) {
                        case 1 :
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4721:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,14,FOLLOW_14_in_ruleNumber11072); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4726:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt84=2;
                            int LA84_0 = input.LA(1);

                            if ( (LA84_0==RULE_INT) ) {
                                alt84=1;
                            }
                            else if ( (LA84_0==RULE_DECIMAL) ) {
                                alt84=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 84, 0, input);

                                throw nvae;
                            }
                            switch (alt84) {
                                case 1 :
                                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4726:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11088); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4734:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11114); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4752:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4753:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4754:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11167);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference11177); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4761:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4764:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4765:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4765:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_ID) ) {
                alt88=1;
            }
            else if ( (LA88_0==35||LA88_0==49) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4765:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4765:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4766:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11225);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4774:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==51) ) {
                            int LA87_2 = input.LA(2);

                            if ( (LA87_2==53) ) {
                                int LA87_3 = input.LA(3);

                                if ( (synpred38_InternalCradle()) ) {
                                    alt87=1;
                                }


                            }


                        }


                        switch (alt87) {
                    	case 1 :
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4774:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4777:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4777:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4777:6: ()
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4778:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleJvmTypeReference11263); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleJvmTypeReference11275); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4793:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11307);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4809:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4810:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4811:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11342);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11352); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4818:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4821:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4822:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4822:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4822:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4822:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==49) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4822:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleXFunctionTypeRef11390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4826:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==RULE_ID||LA90_0==35||LA90_0==49) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4826:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4826:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4827:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4827:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4828:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11412);
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

                            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4844:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop89:
                            do {
                                int alt89=2;
                                int LA89_0 = input.LA(1);

                                if ( (LA89_0==22) ) {
                                    alt89=1;
                                }


                                switch (alt89) {
                            	case 1 :
                            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4844:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXFunctionTypeRef11425); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4848:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4849:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4849:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4850:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11446);
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
                            	    break loop89;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleXFunctionTypeRef11462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleXFunctionTypeRef11476); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4874:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4875:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4875:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4876:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11497);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4900:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4901:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4902:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11533);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11543); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4909:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4912:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4913:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4913:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4913:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4913:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4914:1: ( ruleQualifiedName )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4914:1: ( ruleQualifiedName )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4915:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11591);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4928:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt93=2;
            alt93 = dfa93.predict(input);
            switch (alt93) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4928:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4928:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4928:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleJvmParameterizedTypeReference11612); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4933:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4934:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4934:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4935:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11634);
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

                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4951:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==22) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4951:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleJvmParameterizedTypeReference11647); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4955:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4956:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4956:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4957:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11668);
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
                    	    break loop92;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleJvmParameterizedTypeReference11682); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4985:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4986:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4987:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11720);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11730); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4994:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4997:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4998:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4998:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_ID||LA94_0==35||LA94_0==49) ) {
                alt94=1;
            }
            else if ( (LA94_0==79) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4999:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11777);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5009:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11804);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5025:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5026:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5027:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11839);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11849); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5034:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5037:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5038:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5038:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5038:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5038:2: ()
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5039:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleJvmWildcardTypeReference11895); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5048:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt95=3;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==80) ) {
                alt95=1;
            }
            else if ( (LA95_0==67) ) {
                alt95=2;
            }
            switch (alt95) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5048:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5048:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5049:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5049:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5050:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11917);
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
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5067:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5067:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5068:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5068:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5069:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11944);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5093:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5094:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5095:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11982);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11992); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5102:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5105:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5106:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5106:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5106:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleJvmUpperBound12029); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5110:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5111:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5111:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5112:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12050);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5136:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5137:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5138:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12086);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12096); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5145:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5148:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5149:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5149:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5149:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleJvmUpperBoundAnded12133); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5153:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5154:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5154:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5155:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12154);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5179:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5180:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5181:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12190);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12200); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5188:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5191:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5192:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5192:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5192:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleJvmLowerBound12237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5196:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5197:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5197:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5198:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12258);
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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5224:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5225:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5226:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12297);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12308); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5233:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5236:28: (this_ID_0= RULE_ID )
            // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:5237:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12347); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalCradle
    public final void synpred1_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:604:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:604:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:604:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:604:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:604:5: ()
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:605:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:605:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:606:1: ( ruleOpMultiAssign )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:606:1: ( ruleOpMultiAssign )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:607:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalCradle1319);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalCradle

    // $ANTLR start synpred2_InternalCradle
    public final void synpred2_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:732:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:732:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:732:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:732:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:732:5: ()
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:733:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:733:2: ( ( ruleOpOr ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:734:1: ( ruleOpOr )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:734:1: ( ruleOpOr )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:735:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalCradle1667);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalCradle

    // $ANTLR start synpred3_InternalCradle
    public final void synpred3_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:833:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:833:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:833:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:833:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:833:5: ()
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:834:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:834:2: ( ( ruleOpAnd ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:835:1: ( ruleOpAnd )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:835:1: ( ruleOpAnd )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:836:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalCradle1926);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalCradle

    // $ANTLR start synpred4_InternalCradle
    public final void synpred4_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:934:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:934:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:934:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:934:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:934:5: ()
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:935:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:935:2: ( ( ruleOpEquality ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:936:1: ( ruleOpEquality )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:936:1: ( ruleOpEquality )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:937:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalCradle2185);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalCradle

    // $ANTLR start synpred5_InternalCradle
    public final void synpred5_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1042:4: ( ( () 'instanceof' ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1042:5: ( () 'instanceof' )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1042:5: ( () 'instanceof' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1042:6: () 'instanceof'
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1042:6: ()
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1043:1: 
        {
        }

        match(input,28,FOLLOW_28_in_synpred5_InternalCradle2461); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalCradle

    // $ANTLR start synpred6_InternalCradle
    public final void synpred6_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1073:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1073:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1073:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1073:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1073:10: ()
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1074:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1074:2: ( ( ruleOpCompare ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1075:1: ( ruleOpCompare )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1075:1: ( ruleOpCompare )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1076:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalCradle2532);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalCradle

    // $ANTLR start synpred7_InternalCradle
    public final void synpred7_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1195:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1195:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1195:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1195:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1195:5: ()
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1196:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1196:2: ( ( ruleOpOther ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1197:1: ( ruleOpOther )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1197:1: ( ruleOpOther )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1198:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalCradle2851);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalCradle

    // $ANTLR start synpred8_InternalCradle
    public final void synpred8_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1287:3: ( ( '>' '>' ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1287:4: ( '>' '>' )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1287:4: ( '>' '>' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1288:2: '>' '>'
        {
        match(input,31,FOLLOW_31_in_synpred8_InternalCradle3067); if (state.failed) return ;
        match(input,31,FOLLOW_31_in_synpred8_InternalCradle3072); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalCradle

    // $ANTLR start synpred9_InternalCradle
    public final void synpred9_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1317:3: ( ( '<' '<' ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1317:4: ( '<' '<' )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1317:4: ( '<' '<' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1318:2: '<' '<'
        {
        match(input,32,FOLLOW_32_in_synpred9_InternalCradle3154); if (state.failed) return ;
        match(input,32,FOLLOW_32_in_synpred9_InternalCradle3159); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalCradle

    // $ANTLR start synpred10_InternalCradle
    public final void synpred10_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1391:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1391:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1391:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1391:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1391:5: ()
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1392:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1392:2: ( ( ruleOpAdd ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1393:1: ( ruleOpAdd )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1393:1: ( ruleOpAdd )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1394:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalCradle3381);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalCradle

    // $ANTLR start synpred11_InternalCradle
    public final void synpred11_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1499:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1499:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1499:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1499:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1499:5: ()
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1500:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1500:2: ( ( ruleOpMulti ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1501:1: ( ruleOpMulti )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1501:1: ( ruleOpMulti )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1502:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalCradle3661);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalCradle

    // $ANTLR start synpred12_InternalCradle
    public final void synpred12_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1732:3: ( ( () 'as' ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1732:4: ( () 'as' )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1732:4: ( () 'as' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1732:5: () 'as'
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1732:5: ()
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1733:1: 
        {
        }

        match(input,46,FOLLOW_46_in_synpred12_InternalCradle4255); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalCradle

    // $ANTLR start synpred13_InternalCradle
    public final void synpred13_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1792:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1792:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1792:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1792:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1792:6: ()
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1793:1: 
        {
        }

        match(input,14,FOLLOW_14_in_synpred13_InternalCradle4409); if (state.failed) return ;
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1794:1: ( ( ruleValidID ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1795:1: ( ruleValidID )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1795:1: ( ruleValidID )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1796:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred13_InternalCradle4418);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalCradle4424);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalCradle

    // $ANTLR start synpred14_InternalCradle
    public final void synpred14_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1850:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1850:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1850:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1850:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1850:10: ()
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1851:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1851:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt96=3;
        switch ( input.LA(1) ) {
        case 14:
            {
            alt96=1;
            }
            break;
        case 47:
            {
            alt96=2;
            }
            break;
        case 48:
            {
            alt96=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 96, 0, input);

            throw nvae;
        }

        switch (alt96) {
            case 1 :
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1851:4: '.'
                {
                match(input,14,FOLLOW_14_in_synpred14_InternalCradle4527); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1853:6: ( ( '?.' ) )
                {
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1853:6: ( ( '?.' ) )
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1854:1: ( '?.' )
                {
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1854:1: ( '?.' )
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1855:2: '?.'
                {
                match(input,47,FOLLOW_47_in_synpred14_InternalCradle4541); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1860:6: ( ( '*.' ) )
                {
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1860:6: ( ( '*.' ) )
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1861:1: ( '*.' )
                {
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1861:1: ( '*.' )
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1862:2: '*.'
                {
                match(input,48,FOLLOW_48_in_synpred14_InternalCradle4561); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalCradle

    // $ANTLR start synpred15_InternalCradle
    public final void synpred15_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1971:4: ( ( '(' ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1972:1: ( '(' )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1972:1: ( '(' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1973:2: '('
        {
        match(input,49,FOLLOW_49_in_synpred15_InternalCradle4788); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalCradle

    // $ANTLR start synpred16_InternalCradle
    public final void synpred16_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1992:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1992:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1992:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1992:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1992:6: ()
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1993:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1993:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt98=2;
        int LA98_0 = input.LA(1);

        if ( (LA98_0==RULE_ID||LA98_0==35||LA98_0==49) ) {
            alt98=1;
        }
        switch (alt98) {
            case 1 :
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1993:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1993:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1994:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1994:1: ( ruleJvmFormalParameter )
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1995:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalCradle4840);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1997:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop97:
                do {
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==22) ) {
                        alt97=1;
                    }


                    switch (alt97) {
                	case 1 :
                	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1997:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred16_InternalCradle4847); if (state.failed) return ;
                	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1998:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1999:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:1999:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2000:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalCradle4854);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop97;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2002:6: ( ( '|' ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2003:1: ( '|' )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2003:1: ( '|' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2004:2: '|'
        {
        match(input,52,FOLLOW_52_in_synpred16_InternalCradle4868); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalCradle

    // $ANTLR start synpred17_InternalCradle
    public final void synpred17_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2071:4: ( ( () '[' ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2071:5: ( () '[' )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2071:5: ( () '[' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2071:6: () '['
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2071:6: ()
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2072:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred17_InternalCradle4988); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalCradle

    // $ANTLR start synpred18_InternalCradle
    public final void synpred18_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2262:3: ( ( () '[' ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2262:4: ( () '[' )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2262:4: ( () '[' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2262:5: () '['
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2262:5: ()
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2263:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred18_InternalCradle5512); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalCradle

    // $ANTLR start synpred20_InternalCradle
    public final void synpred20_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2356:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2356:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2356:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2356:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2356:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt100=2;
        int LA100_0 = input.LA(1);

        if ( (LA100_0==RULE_ID||LA100_0==35||LA100_0==49) ) {
            alt100=1;
        }
        switch (alt100) {
            case 1 :
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2356:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2356:7: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2357:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2357:1: ( ruleJvmFormalParameter )
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2358:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalCradle5791);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2360:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop99:
                do {
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==22) ) {
                        alt99=1;
                    }


                    switch (alt99) {
                	case 1 :
                	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2360:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred20_InternalCradle5798); if (state.failed) return ;
                	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2361:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2362:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2362:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2363:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalCradle5805);
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

        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2365:6: ( ( '|' ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2366:1: ( '|' )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2366:1: ( '|' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2367:2: '|'
        {
        match(input,52,FOLLOW_52_in_synpred20_InternalCradle5819); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalCradle

    // $ANTLR start synpred22_InternalCradle
    public final void synpred22_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2726:4: ( 'else' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2726:6: 'else'
        {
        match(input,56,FOLLOW_56_in_synpred22_InternalCradle6602); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalCradle

    // $ANTLR start synpred23_InternalCradle
    public final void synpred23_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2780:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2780:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2780:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2780:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2780:6: ( ( ruleValidID ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2781:1: ( ruleValidID )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2781:1: ( ruleValidID )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2782:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalCradle6744);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,21,FOLLOW_21_in_synpred23_InternalCradle6750); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalCradle

    // $ANTLR start synpred24_InternalCradle
    public final void synpred24_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2826:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2826:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2826:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2826:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,49,FOLLOW_49_in_synpred24_InternalCradle6826); if (state.failed) return ;
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2827:1: ( ( ruleValidID ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2828:1: ( ruleValidID )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2828:1: ( ruleValidID )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:2829:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalCradle6833);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,21,FOLLOW_21_in_synpred24_InternalCradle6839); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalCradle

    // $ANTLR start synpred25_InternalCradle
    public final void synpred25_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3410:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3410:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3410:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3410:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3410:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3411:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3411:1: ( ruleJvmTypeReference )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3412:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalCradle8104);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3414:2: ( ( ruleValidID ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3415:1: ( ruleValidID )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3415:1: ( ruleValidID )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3416:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalCradle8113);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalCradle

    // $ANTLR start synpred26_InternalCradle
    public final void synpred26_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3714:4: ( ( '(' ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3715:1: ( '(' )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3715:1: ( '(' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3716:2: '('
        {
        match(input,49,FOLLOW_49_in_synpred26_InternalCradle8675); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalCradle

    // $ANTLR start synpred27_InternalCradle
    public final void synpred27_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3735:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3735:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3735:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3735:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3735:6: ()
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3736:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3736:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt104=2;
        int LA104_0 = input.LA(1);

        if ( (LA104_0==RULE_ID||LA104_0==35||LA104_0==49) ) {
            alt104=1;
        }
        switch (alt104) {
            case 1 :
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3736:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3736:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3737:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3737:1: ( ruleJvmFormalParameter )
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3738:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalCradle8727);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3740:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop103:
                do {
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==22) ) {
                        alt103=1;
                    }


                    switch (alt103) {
                	case 1 :
                	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3740:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred27_InternalCradle8734); if (state.failed) return ;
                	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3741:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3742:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3742:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3743:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalCradle8741);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop103;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3745:6: ( ( '|' ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3746:1: ( '|' )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3746:1: ( '|' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3747:2: '|'
        {
        match(input,52,FOLLOW_52_in_synpred27_InternalCradle8755); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalCradle

    // $ANTLR start synpred28_InternalCradle
    public final void synpred28_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3814:4: ( ( () '[' ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3814:5: ( () '[' )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3814:5: ( () '[' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3814:6: () '['
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3814:6: ()
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3815:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred28_InternalCradle8875); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalCradle

    // $ANTLR start synpred29_InternalCradle
    public final void synpred29_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3957:4: ( '<' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:3957:6: '<'
        {
        match(input,32,FOLLOW_32_in_synpred29_InternalCradle9262); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalCradle

    // $ANTLR start synpred30_InternalCradle
    public final void synpred30_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4006:5: ( '(' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4006:7: '('
        {
        match(input,49,FOLLOW_49_in_synpred30_InternalCradle9355); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalCradle

    // $ANTLR start synpred31_InternalCradle
    public final void synpred31_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4011:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4011:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4011:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4011:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4011:6: ()
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4012:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4012:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt106=2;
        int LA106_0 = input.LA(1);

        if ( (LA106_0==RULE_ID||LA106_0==35||LA106_0==49) ) {
            alt106=1;
        }
        switch (alt106) {
            case 1 :
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4012:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4012:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4013:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4013:1: ( ruleJvmFormalParameter )
                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4014:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalCradle9385);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4016:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop105:
                do {
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==22) ) {
                        alt105=1;
                    }


                    switch (alt105) {
                	case 1 :
                	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4016:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred31_InternalCradle9392); if (state.failed) return ;
                	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4017:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4018:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4018:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4019:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalCradle9399);
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

        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4021:6: ( ( '|' ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4022:1: ( '|' )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4022:1: ( '|' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4023:2: '|'
        {
        match(input,52,FOLLOW_52_in_synpred31_InternalCradle9413); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalCradle

    // $ANTLR start synpred32_InternalCradle
    public final void synpred32_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4090:4: ( ( () '[' ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4090:5: ( () '[' )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4090:5: ( () '[' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4090:6: () '['
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4090:6: ()
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4091:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred32_InternalCradle9533); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalCradle

    // $ANTLR start synpred33_InternalCradle
    public final void synpred33_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4412:2: ( ( ruleXExpression ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4413:1: ( ruleXExpression )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4413:1: ( ruleXExpression )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4414:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalCradle10335);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalCradle

    // $ANTLR start synpred34_InternalCradle
    public final void synpred34_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4483:5: ( 'catch' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4483:7: 'catch'
        {
        match(input,78,FOLLOW_78_in_synpred34_InternalCradle10480); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalCradle

    // $ANTLR start synpred35_InternalCradle
    public final void synpred35_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4502:5: ( 'finally' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4502:7: 'finally'
        {
        match(input,77,FOLLOW_77_in_synpred35_InternalCradle10510); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalCradle

    // $ANTLR start synpred37_InternalCradle
    public final void synpred37_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4650:3: ( '.' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4651:2: '.'
        {
        match(input,14,FOLLOW_14_in_synpred37_InternalCradle10857); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalCradle

    // $ANTLR start synpred38_InternalCradle
    public final void synpred38_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4774:2: ( ( () '[' ']' ) )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4774:3: ( () '[' ']' )
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4774:3: ( () '[' ']' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4774:4: () '[' ']'
        {
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4774:4: ()
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4775:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred38_InternalCradle11240); if (state.failed) return ;
        match(input,53,FOLLOW_53_in_synpred38_InternalCradle11244); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalCradle

    // $ANTLR start synpred39_InternalCradle
    public final void synpred39_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4928:4: ( '<' )
        // ../org.xtext.cradle/src-gen/org/cradle/language/parser/antlr/internal/InternalCradle.g:4928:6: '<'
        {
        match(input,32,FOLLOW_32_in_synpred39_InternalCradle11604); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalCradle

    // Delegated rules

    public final boolean synpred1_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA20 dfa20 = new DFA20(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA93 dfa93 = new DFA93(this);
    static final String DFA20_eotS =
        "\13\uffff";
    static final String DFA20_eofS =
        "\1\1\12\uffff";
    static final String DFA20_minS =
        "\1\4\1\uffff\10\0\1\uffff";
    static final String DFA20_maxS =
        "\1\116\1\uffff\10\0\1\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA20_specialS =
        "\2\uffff\1\6\1\7\1\4\1\5\1\3\1\2\1\0\1\1\1\uffff}>";
    static final String[] DFA20_transitionS = {
            "\5\1\5\uffff\1\1\1\uffff\1\1\1\uffff\1\1\2\uffff\12\1\1\2\1"+
            "\3\1\4\1\5\1\6\1\7\1\10\1\11\15\1\1\uffff\17\1\1\uffff\12\1",
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

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "()* loopback of 1195:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_8 = input.LA(1);

                         
                        int index20_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalCradle()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index20_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_9 = input.LA(1);

                         
                        int index20_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalCradle()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index20_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_7 = input.LA(1);

                         
                        int index20_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalCradle()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index20_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_6 = input.LA(1);

                         
                        int index20_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalCradle()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index20_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA20_4 = input.LA(1);

                         
                        int index20_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalCradle()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index20_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA20_5 = input.LA(1);

                         
                        int index20_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalCradle()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index20_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA20_2 = input.LA(1);

                         
                        int index20_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalCradle()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index20_2);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA20_3 = input.LA(1);

                         
                        int index20_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalCradle()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index20_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA36_eotS =
        "\103\uffff";
    static final String DFA36_eofS =
        "\1\2\102\uffff";
    static final String DFA36_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA36_maxS =
        "\1\116\1\0\101\uffff";
    static final String DFA36_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA36_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA36_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\34\2\1\1\2"+
            "\2\1\uffff\17\2\1\uffff\12\2",
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
            return "1971:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_1 = input.LA(1);

                         
                        int index36_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index36_1);
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
    static final String DFA35_eotS =
        "\36\uffff";
    static final String DFA35_eofS =
        "\36\uffff";
    static final String DFA35_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA35_maxS =
        "\1\114\2\0\33\uffff";
    static final String DFA35_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA35_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\1\4\5\27\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\3"+
            "\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\2\5\3\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5",
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

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "1992:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_0 = input.LA(1);

                         
                        int index35_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA35_0==RULE_ID) ) {s = 1;}

                        else if ( (LA35_0==49) ) {s = 2;}

                        else if ( (LA35_0==35) && (synpred16_InternalCradle())) {s = 3;}

                        else if ( (LA35_0==52) && (synpred16_InternalCradle())) {s = 4;}

                        else if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_DECIMAL)||LA35_0==32||(LA35_0>=39 && LA35_0<=40)||LA35_0==45||LA35_0==51||LA35_0==55||(LA35_0>=57 && LA35_0<=58)||(LA35_0>=62 && LA35_0<=64)||LA35_0==67||(LA35_0>=69 && LA35_0<=76)) ) {s = 5;}

                        else if ( (LA35_0==50) ) {s = 29;}

                         
                        input.seek(index35_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalCradle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA35_2 = input.LA(1);

                         
                        int index35_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalCradle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index35_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA37_eotS =
        "\103\uffff";
    static final String DFA37_eofS =
        "\1\2\102\uffff";
    static final String DFA37_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA37_maxS =
        "\1\116\1\0\101\uffff";
    static final String DFA37_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA37_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA37_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\36\2\1\1\1"+
            "\uffff\17\2\1\uffff\12\2",
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
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "2071:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_1 = input.LA(1);

                         
                        int index37_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index37_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA39_eotS =
        "\16\uffff";
    static final String DFA39_eofS =
        "\16\uffff";
    static final String DFA39_minS =
        "\1\4\15\uffff";
    static final String DFA39_maxS =
        "\1\114\15\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA39_specialS =
        "\16\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\4\4\5\27\uffff\1\4\20\uffff\1\15\1\uffff\1\5\3\uffff\1\6"+
            "\1\uffff\1\3\1\2\3\uffff\1\7\1\10\1\11\2\uffff\1\4\1\uffff\1"+
            "\1\4\5\1\12\1\13\1\14",
            "",
            "",
            "",
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

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "2112:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA43_eotS =
        "\40\uffff";
    static final String DFA43_eofS =
        "\40\uffff";
    static final String DFA43_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA43_maxS =
        "\1\114\2\0\35\uffff";
    static final String DFA43_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA43_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\1\4\5\27\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\3"+
            "\uffff\1\2\1\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff\2\5\3\uffff"+
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

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "2356:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_0 = input.LA(1);

                         
                        int index43_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA43_0==RULE_ID) ) {s = 1;}

                        else if ( (LA43_0==49) ) {s = 2;}

                        else if ( (LA43_0==35) && (synpred20_InternalCradle())) {s = 3;}

                        else if ( (LA43_0==52) && (synpred20_InternalCradle())) {s = 4;}

                        else if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_DECIMAL)||LA43_0==32||(LA43_0>=39 && LA43_0<=40)||LA43_0==45||LA43_0==51||LA43_0==53||LA43_0==55||(LA43_0>=57 && LA43_0<=58)||(LA43_0>=62 && LA43_0<=67)||(LA43_0>=69 && LA43_0<=76)) ) {s = 5;}

                         
                        input.seek(index43_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_1 = input.LA(1);

                         
                        int index43_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalCradle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index43_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA43_2 = input.LA(1);

                         
                        int index43_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalCradle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index43_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\103\uffff";
    static final String DFA67_eofS =
        "\1\2\102\uffff";
    static final String DFA67_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA67_maxS =
        "\1\116\1\0\101\uffff";
    static final String DFA67_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA67_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\34\2\1\1\2"+
            "\2\1\uffff\17\2\1\uffff\12\2",
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
            return "3714:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred26_InternalCradle()) ) {s = 66;}

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
    static final String DFA66_eotS =
        "\36\uffff";
    static final String DFA66_eofS =
        "\36\uffff";
    static final String DFA66_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA66_maxS =
        "\1\114\2\0\33\uffff";
    static final String DFA66_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA66_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\1\4\5\27\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\3"+
            "\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\2\5\3\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5",
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
            return "3735:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_0 = input.LA(1);

                         
                        int index66_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA66_0==RULE_ID) ) {s = 1;}

                        else if ( (LA66_0==49) ) {s = 2;}

                        else if ( (LA66_0==35) && (synpred27_InternalCradle())) {s = 3;}

                        else if ( (LA66_0==52) && (synpred27_InternalCradle())) {s = 4;}

                        else if ( ((LA66_0>=RULE_STRING && LA66_0<=RULE_DECIMAL)||LA66_0==32||(LA66_0>=39 && LA66_0<=40)||LA66_0==45||LA66_0==51||LA66_0==55||(LA66_0>=57 && LA66_0<=58)||(LA66_0>=62 && LA66_0<=64)||LA66_0==67||(LA66_0>=69 && LA66_0<=76)) ) {s = 5;}

                        else if ( (LA66_0==50) ) {s = 29;}

                         
                        input.seek(index66_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalCradle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA66_2 = input.LA(1);

                         
                        int index66_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalCradle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index66_2);
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
    static final String DFA68_eotS =
        "\103\uffff";
    static final String DFA68_eofS =
        "\1\2\102\uffff";
    static final String DFA68_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA68_maxS =
        "\1\116\1\0\101\uffff";
    static final String DFA68_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA68_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\36\2\1\1\1"+
            "\uffff\17\2\1\uffff\12\2",
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
            return "3814:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred28_InternalCradle()) ) {s = 66;}

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
    static final String DFA72_eotS =
        "\103\uffff";
    static final String DFA72_eofS =
        "\1\2\102\uffff";
    static final String DFA72_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA72_maxS =
        "\1\116\1\0\101\uffff";
    static final String DFA72_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA72_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA72_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\13\2\1\1\23"+
            "\2\1\uffff\17\2\1\uffff\12\2",
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
            return "3957:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index72_1);
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
    static final String DFA75_eotS =
        "\103\uffff";
    static final String DFA75_eofS =
        "\1\2\102\uffff";
    static final String DFA75_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA75_maxS =
        "\1\116\1\0\101\uffff";
    static final String DFA75_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA75_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA75_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\34\2\1\1\2"+
            "\2\1\uffff\17\2\1\uffff\12\2",
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
            ""
    };

    static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
    static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
    static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
    static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
    static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
    static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
    static final short[][] DFA75_transition;

    static {
        int numStates = DFA75_transitionS.length;
        DFA75_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = DFA75_eot;
            this.eof = DFA75_eof;
            this.min = DFA75_min;
            this.max = DFA75_max;
            this.accept = DFA75_accept;
            this.special = DFA75_special;
            this.transition = DFA75_transition;
        }
        public String getDescription() {
            return "4006:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA75_1 = input.LA(1);

                         
                        int index75_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index75_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 75, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA74_eotS =
        "\36\uffff";
    static final String DFA74_eofS =
        "\36\uffff";
    static final String DFA74_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA74_maxS =
        "\1\114\2\0\33\uffff";
    static final String DFA74_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA74_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\1\4\5\27\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\3"+
            "\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\2\5\3\uffff\3\5"+
            "\2\uffff\1\5\1\uffff\10\5",
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
            return "4011:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_0 = input.LA(1);

                         
                        int index74_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA74_0==RULE_ID) ) {s = 1;}

                        else if ( (LA74_0==49) ) {s = 2;}

                        else if ( (LA74_0==35) && (synpred31_InternalCradle())) {s = 3;}

                        else if ( (LA74_0==52) && (synpred31_InternalCradle())) {s = 4;}

                        else if ( ((LA74_0>=RULE_STRING && LA74_0<=RULE_DECIMAL)||LA74_0==32||(LA74_0>=39 && LA74_0<=40)||LA74_0==45||LA74_0==51||LA74_0==55||(LA74_0>=57 && LA74_0<=58)||(LA74_0>=62 && LA74_0<=64)||LA74_0==67||(LA74_0>=69 && LA74_0<=76)) ) {s = 5;}

                        else if ( (LA74_0==50) ) {s = 29;}

                         
                        input.seek(index74_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA74_1 = input.LA(1);

                         
                        int index74_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalCradle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA74_2 = input.LA(1);

                         
                        int index74_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalCradle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index74_2);
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
    static final String DFA76_eotS =
        "\103\uffff";
    static final String DFA76_eofS =
        "\1\2\102\uffff";
    static final String DFA76_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA76_maxS =
        "\1\116\1\0\101\uffff";
    static final String DFA76_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA76_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA76_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\36\2\1\1\1"+
            "\uffff\17\2\1\uffff\12\2",
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
            ""
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "4090:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_1 = input.LA(1);

                         
                        int index76_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index76_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA78_eotS =
        "\103\uffff";
    static final String DFA78_eofS =
        "\1\33\102\uffff";
    static final String DFA78_minS =
        "\1\4\32\0\50\uffff";
    static final String DFA78_maxS =
        "\1\116\32\0\50\uffff";
    static final String DFA78_acceptS =
        "\33\uffff\1\2\46\uffff\1\1";
    static final String DFA78_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\50\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\1\1\21\1\15\1\16\1\17\5\uffff\1\33\1\uffff\1\33\1\uffff\1"+
            "\33\2\uffff\13\33\1\10\6\33\1\4\1\3\4\33\1\2\3\33\1\32\1\33"+
            "\1\12\1\uffff\2\33\1\23\1\33\1\7\1\6\3\33\1\24\1\25\1\26\2\33"+
            "\1\11\1\uffff\1\5\1\13\1\14\1\20\1\22\1\27\1\30\1\31\2\33",
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
            ""
    };

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "4412:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_1 = input.LA(1);

                         
                        int index78_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA78_2 = input.LA(1);

                         
                        int index78_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA78_3 = input.LA(1);

                         
                        int index78_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA78_4 = input.LA(1);

                         
                        int index78_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA78_5 = input.LA(1);

                         
                        int index78_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA78_6 = input.LA(1);

                         
                        int index78_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA78_7 = input.LA(1);

                         
                        int index78_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA78_8 = input.LA(1);

                         
                        int index78_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA78_9 = input.LA(1);

                         
                        int index78_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA78_10 = input.LA(1);

                         
                        int index78_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA78_11 = input.LA(1);

                         
                        int index78_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA78_12 = input.LA(1);

                         
                        int index78_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA78_13 = input.LA(1);

                         
                        int index78_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA78_14 = input.LA(1);

                         
                        int index78_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA78_15 = input.LA(1);

                         
                        int index78_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA78_16 = input.LA(1);

                         
                        int index78_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA78_17 = input.LA(1);

                         
                        int index78_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA78_18 = input.LA(1);

                         
                        int index78_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA78_19 = input.LA(1);

                         
                        int index78_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA78_20 = input.LA(1);

                         
                        int index78_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA78_21 = input.LA(1);

                         
                        int index78_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA78_22 = input.LA(1);

                         
                        int index78_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA78_23 = input.LA(1);

                         
                        int index78_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA78_24 = input.LA(1);

                         
                        int index78_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA78_25 = input.LA(1);

                         
                        int index78_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA78_26 = input.LA(1);

                         
                        int index78_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index78_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 78, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA93_eotS =
        "\103\uffff";
    static final String DFA93_eofS =
        "\1\2\102\uffff";
    static final String DFA93_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA93_maxS =
        "\1\116\1\0\101\uffff";
    static final String DFA93_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA93_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA93_transitionS = {
            "\5\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\13\2\1\1\23"+
            "\2\1\uffff\17\2\1\uffff\12\2",
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
            ""
    };

    static final short[] DFA93_eot = DFA.unpackEncodedString(DFA93_eotS);
    static final short[] DFA93_eof = DFA.unpackEncodedString(DFA93_eofS);
    static final char[] DFA93_min = DFA.unpackEncodedStringToUnsignedChars(DFA93_minS);
    static final char[] DFA93_max = DFA.unpackEncodedStringToUnsignedChars(DFA93_maxS);
    static final short[] DFA93_accept = DFA.unpackEncodedString(DFA93_acceptS);
    static final short[] DFA93_special = DFA.unpackEncodedString(DFA93_specialS);
    static final short[][] DFA93_transition;

    static {
        int numStates = DFA93_transitionS.length;
        DFA93_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA93_transition[i] = DFA.unpackEncodedString(DFA93_transitionS[i]);
        }
    }

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = DFA93_eot;
            this.eof = DFA93_eof;
            this.min = DFA93_min;
            this.max = DFA93_max;
            this.accept = DFA93_accept;
            this.special = DFA93_special;
            this.transition = DFA93_transition;
        }
        public String getDescription() {
            return "4928:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA93_1 = input.LA(1);

                         
                        int index93_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalCradle()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index93_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 93, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleCradleFile_in_entryRuleCradleFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCradleFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_ruleCradleFile131 = new BitSet(new long[]{0x0000000000052002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleCradleFile153 = new BitSet(new long[]{0x0000000000050002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDeclaration200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImportDeclaration237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImportDeclaration258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedNameWithWildCard346 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildCard365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedNameWithWildCard380 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNameWithWildCard401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_ruleDeclaration500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDeclaration527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleParameter609 = new BitSet(new long[]{0x0002000800000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleParameter630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleParameter652 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleParameter665 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleParameter686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTask771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleTask792 = new BitSet(new long[]{0x0400000000280000L});
    public static final BitSet FOLLOW_19_in_ruleTask807 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTask819 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_21_in_ruleTask838 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleTaskReference_in_ruleTask860 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTask873 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleTaskReference_in_ruleTask894 = new BitSet(new long[]{0x0400000000400000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleTask919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskReference_in_entryRuleTaskReference955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskReference965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTaskReference1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTaskReference1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1232 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1248 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1298 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1351 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpSingleAssign1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpMultiAssign1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1646 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1699 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1722 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpOr1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1905 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1958 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1981 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpAnd2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2164 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2217 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2240 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpEquality2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpEquality2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2444 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_28_in_ruleXRelationalExpression2480 = new BitSet(new long[]{0x0002000800000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2503 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2564 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2587 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpCompare2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpCompare2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpCompare2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpCompare2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2830 = new BitSet(new long[]{0x0000007F80000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2883 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2906 = new BitSet(new long[]{0x0000007F80000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpOther3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOther3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther3052 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleOpOther3083 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleOpOther3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther3139 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleOpOther3170 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleOpOther3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpOther3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpOther3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpOther3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3360 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3413 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3436 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpAdd3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpAdd3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3640 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3693 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3716 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpMulti3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpMulti3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpMulti3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpMulti3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3969 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpUnary4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpUnary4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpUnary4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4239 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleXCastedExpression4274 = new BitSet(new long[]{0x0002000800000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4297 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4392 = new BitSet(new long[]{0x0001800000004002L});
    public static final BitSet FOLLOW_14_in_ruleXMemberFeatureCall4441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4464 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4480 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4502 = new BitSet(new long[]{0x0001800000004002L});
    public static final BitSet FOLLOW_14_in_ruleXMemberFeatureCall4588 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall4612 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall4649 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_32_in_ruleXMemberFeatureCall4678 = new BitSet(new long[]{0x0002000800000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4699 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_22_in_ruleXMemberFeatureCall4712 = new BitSet(new long[]{0x0002000800000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4733 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_31_in_ruleXMemberFeatureCall4747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4772 = new BitSet(new long[]{0x000B800000004002L});
    public static final BitSet FOLLOW_49_in_ruleXMemberFeatureCall4806 = new BitSet(new long[]{0xC69E2189000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4891 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4919 = new BitSet(new long[]{0x0004000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXMemberFeatureCall4932 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4953 = new BitSet(new long[]{0x0004000000400000L});
    public static final BitSet FOLLOW_50_in_ruleXMemberFeatureCall4970 = new BitSet(new long[]{0x0009800000004002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall5005 = new BitSet(new long[]{0x0001800000004002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression5055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXClosure5772 = new BitSet(new long[]{0xC6BA2189000001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5845 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXClosure5858 = new BitSet(new long[]{0x0002000800000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5879 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_52_in_ruleXClosure5901 = new BitSet(new long[]{0xC6AA2181000001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5938 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXClosure5950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6052 = new BitSet(new long[]{0xC6CA2181000001F2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_54_in_ruleXExpressionInClosure6065 = new BitSet(new long[]{0xC68A2181000001F2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6223 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXShortClosure6236 = new BitSet(new long[]{0x0002000800000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6257 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_52_in_ruleXShortClosure6279 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXParenthesizedExpression6398 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6420 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXParenthesizedExpression6431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXIfExpression6523 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXIfExpression6535 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6556 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXIfExpression6568 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6589 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXIfExpression6610 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6726 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6769 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXSwitchExpression6781 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6805 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression6849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6870 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXSwitchExpression6882 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6905 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression6917 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXSwitchExpression6931 = new BitSet(new long[]{0x2002000800200010L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6952 = new BitSet(new long[]{0x3802000800200010L});
    public static final BitSet FOLLOW_59_in_ruleXSwitchExpression6966 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXSwitchExpression6978 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6999 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXSwitchExpression7013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7105 = new BitSet(new long[]{0x2000000000200000L});
    public static final BitSet FOLLOW_61_in_ruleXCasePart7119 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7140 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXCasePart7154 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXForLoopExpression7267 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXForLoopExpression7279 = new BitSet(new long[]{0x0002000800000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7300 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXForLoopExpression7312 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7333 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXForLoopExpression7345 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXWhileExpression7458 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXWhileExpression7470 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7491 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXWhileExpression7503 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXDoWhileExpression7616 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7637 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleXDoWhileExpression7649 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXDoWhileExpression7661 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7682 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXDoWhileExpression7694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXBlockExpression7786 = new BitSet(new long[]{0xD68A2181000001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7808 = new BitSet(new long[]{0xD6CA2181000001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_54_in_ruleXBlockExpression7821 = new BitSet(new long[]{0xD68A2181000001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_60_in_ruleXBlockExpression7837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXVariableDeclaration8055 = new BitSet(new long[]{0x0002000800000010L});
    public static final BitSet FOLLOW_66_in_ruleXVariableDeclaration8086 = new BitSet(new long[]{0x0002000800000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8155 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8184 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleXVariableDeclaration8198 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8313 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8551 = new BitSet(new long[]{0x0000000100000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_32_in_ruleXFeatureCall8565 = new BitSet(new long[]{0x0002000800000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8586 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_22_in_ruleXFeatureCall8599 = new BitSet(new long[]{0x0002000800000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8620 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_31_in_ruleXFeatureCall8634 = new BitSet(new long[]{0x0000000100000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8659 = new BitSet(new long[]{0x000A000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXFeatureCall8693 = new BitSet(new long[]{0xC69E2189000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8778 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8806 = new BitSet(new long[]{0x0004000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXFeatureCall8819 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8840 = new BitSet(new long[]{0x0004000000400000L});
    public static final BitSet FOLLOW_50_in_ruleXFeatureCall8857 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleIdOrSuper9012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier9064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier9111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleStaticQualifier9129 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXConstructorCall9226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9249 = new BitSet(new long[]{0x000A000100000002L});
    public static final BitSet FOLLOW_32_in_ruleXConstructorCall9270 = new BitSet(new long[]{0x0002000800000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9292 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_22_in_ruleXConstructorCall9305 = new BitSet(new long[]{0x0002000800000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9326 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_31_in_ruleXConstructorCall9340 = new BitSet(new long[]{0x000A000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXConstructorCall9363 = new BitSet(new long[]{0xC69E2189000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9436 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9464 = new BitSet(new long[]{0x0004000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXConstructorCall9477 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9498 = new BitSet(new long[]{0x0004000000400000L});
    public static final BitSet FOLLOW_50_in_ruleXConstructorCall9515 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXBooleanLiteral9644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXBooleanLiteral9668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXNullLiteral9774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral10023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXTypeLiteral10069 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXTypeLiteral10081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10104 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXTypeLiteral10116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXThrowExpression10208 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXReturnExpression10321 = new BitSet(new long[]{0xC68A2181000001F2L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXTryCatchFinallyExpression10445 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10496 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_77_in_ruleXTryCatchFinallyExpression10518 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXTryCatchFinallyExpression10562 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleXCatchClause10676 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXCatchClause10689 = new BitSet(new long[]{0x0002000800000010L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10710 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXCatchClause10722 = new BitSet(new long[]{0xC68A2181000001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10838 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName10866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10889 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11026 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11052 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleNumber11072 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference11177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11225 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleJvmTypeReference11263 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleJvmTypeReference11275 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXFunctionTypeRef11390 = new BitSet(new long[]{0x0006000800000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11412 = new BitSet(new long[]{0x0004000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXFunctionTypeRef11425 = new BitSet(new long[]{0x0002000800000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11446 = new BitSet(new long[]{0x0004000000400000L});
    public static final BitSet FOLLOW_50_in_ruleXFunctionTypeRef11462 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleXFunctionTypeRef11476 = new BitSet(new long[]{0x0002000800000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11591 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleJvmParameterizedTypeReference11612 = new BitSet(new long[]{0x0002000800000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11634 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_22_in_ruleJvmParameterizedTypeReference11647 = new BitSet(new long[]{0x0002000800000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11668 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_31_in_ruleJvmParameterizedTypeReference11682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleJvmWildcardTypeReference11895 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010008L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleJvmUpperBound12029 = new BitSet(new long[]{0x0002000800000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleJvmUpperBoundAnded12133 = new BitSet(new long[]{0x0002000800000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleJvmLowerBound12237 = new BitSet(new long[]{0x0002000800000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalCradle1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalCradle1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalCradle1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalCradle2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred5_InternalCradle2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalCradle2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalCradle2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred8_InternalCradle3067 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_synpred8_InternalCradle3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred9_InternalCradle3154 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_synpred9_InternalCradle3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalCradle3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalCradle3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred12_InternalCradle4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred13_InternalCradle4409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred13_InternalCradle4418 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalCradle4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred14_InternalCradle4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred14_InternalCradle4541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred14_InternalCradle4561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred15_InternalCradle4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalCradle4840 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_22_in_synpred16_InternalCradle4847 = new BitSet(new long[]{0x0002000800000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalCradle4854 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_52_in_synpred16_InternalCradle4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred17_InternalCradle4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred18_InternalCradle5512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalCradle5791 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_22_in_synpred20_InternalCradle5798 = new BitSet(new long[]{0x0002000800000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalCradle5805 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_52_in_synpred20_InternalCradle5819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred22_InternalCradle6602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalCradle6744 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_synpred23_InternalCradle6750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred24_InternalCradle6826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalCradle6833 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_synpred24_InternalCradle6839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalCradle8104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalCradle8113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred26_InternalCradle8675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalCradle8727 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_22_in_synpred27_InternalCradle8734 = new BitSet(new long[]{0x0002000800000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalCradle8741 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_52_in_synpred27_InternalCradle8755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred28_InternalCradle8875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred29_InternalCradle9262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred30_InternalCradle9355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalCradle9385 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_22_in_synpred31_InternalCradle9392 = new BitSet(new long[]{0x0002000800000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalCradle9399 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_52_in_synpred31_InternalCradle9413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred32_InternalCradle9533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalCradle10335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_synpred34_InternalCradle10480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred35_InternalCradle10510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred37_InternalCradle10857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred38_InternalCradle11240 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_synpred38_InternalCradle11244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred39_InternalCradle11604 = new BitSet(new long[]{0x0000000000000002L});

}