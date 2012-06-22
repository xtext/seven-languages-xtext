package org.xtext.cradle.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.cradle.services.CradleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCradleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FILE", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.'", "'.*'", "'param'", "'='", "'task'", "'dependsOn'", "','", "'?.'", "'*.'", "'<'", "'>'", "'('", "')'", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
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
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=7;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__59=59;
    public static final int RULE_INT=8;
    public static final int RULE_DECIMAL=9;
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
    public static final int RULE_FILE=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
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
    public static final int RULE_WS=12;
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
    public String getGrammarFileName() { return "../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g"; }



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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:67:1: entryRuleCradleFile returns [EObject current=null] : iv_ruleCradleFile= ruleCradleFile EOF ;
    public final EObject entryRuleCradleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCradleFile = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:68:2: (iv_ruleCradleFile= ruleCradleFile EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:69:2: iv_ruleCradleFile= ruleCradleFile EOF
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:76:1: ruleCradleFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImportDeclaration ) )* ( (lv_declarations_1_0= ruleDeclaration ) )* ) ;
    public final EObject ruleCradleFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_declarations_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:79:28: ( ( ( (lv_imports_0_0= ruleImportDeclaration ) )* ( (lv_declarations_1_0= ruleDeclaration ) )* ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:80:1: ( ( (lv_imports_0_0= ruleImportDeclaration ) )* ( (lv_declarations_1_0= ruleDeclaration ) )* )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:80:1: ( ( (lv_imports_0_0= ruleImportDeclaration ) )* ( (lv_declarations_1_0= ruleDeclaration ) )* )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:80:2: ( (lv_imports_0_0= ruleImportDeclaration ) )* ( (lv_declarations_1_0= ruleDeclaration ) )*
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:80:2: ( (lv_imports_0_0= ruleImportDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:81:1: (lv_imports_0_0= ruleImportDeclaration )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:81:1: (lv_imports_0_0= ruleImportDeclaration )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:82:3: lv_imports_0_0= ruleImportDeclaration
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

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:98:3: ( (lv_declarations_1_0= ruleDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17||LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:99:1: (lv_declarations_1_0= ruleDeclaration )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:99:1: (lv_declarations_1_0= ruleDeclaration )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:100:3: lv_declarations_1_0= ruleDeclaration
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:124:1: entryRuleImportDeclaration returns [EObject current=null] : iv_ruleImportDeclaration= ruleImportDeclaration EOF ;
    public final EObject entryRuleImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDeclaration = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:125:2: (iv_ruleImportDeclaration= ruleImportDeclaration EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:126:2: iv_ruleImportDeclaration= ruleImportDeclaration EOF
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:133:1: ruleImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:136:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:137:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImportDeclaration237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportDeclarationAccess().getImportKeyword_0());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:141:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:143:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:167:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:168:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:169:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:176:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:179:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.*' )? ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:180:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.*' )? )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:180:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.*' )? )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:180:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.*' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedNameWithWildCard346); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameWithWildCardAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:187:1: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:188:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNameWithWildCard365); if (state.failed) return current;
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

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:200:3: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:201:2: kw= '.*'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedNameWithWildCard401); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:214:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:215:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:216:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:223:1: ruleDeclaration returns [EObject current=null] : (this_Task_0= ruleTask | this_Parameter_1= ruleParameter ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Task_0 = null;

        EObject this_Parameter_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:226:28: ( (this_Task_0= ruleTask | this_Parameter_1= ruleParameter ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:227:1: (this_Task_0= ruleTask | this_Parameter_1= ruleParameter )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:227:1: (this_Task_0= ruleTask | this_Parameter_1= ruleParameter )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:228:5: this_Task_0= ruleTask
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:238:5: this_Parameter_1= ruleParameter
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:254:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:255:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:256:2: iv_ruleParameter= ruleParameter EOF
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:263:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'param' ( (lv_type_1_0= ruleJvmTypeReference ) )? ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_init_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:266:28: ( (otherlv_0= 'param' ( (lv_type_1_0= ruleJvmTypeReference ) )? ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:267:1: (otherlv_0= 'param' ( (lv_type_1_0= ruleJvmTypeReference ) )? ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:267:1: (otherlv_0= 'param' ( (lv_type_1_0= ruleJvmTypeReference ) )? ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )? )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:267:3: otherlv_0= 'param' ( (lv_type_1_0= ruleJvmTypeReference ) )? ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleParameter609); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParamKeyword_0());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:271:1: ( (lv_type_1_0= ruleJvmTypeReference ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID||LA6_1==15||LA6_1==24||LA6_1==50) ) {
                    alt6=1;
                }
            }
            else if ( (LA6_0==26||LA6_0==38) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:272:1: (lv_type_1_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:272:1: (lv_type_1_0= ruleJvmTypeReference )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:273:3: lv_type_1_0= ruleJvmTypeReference
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

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:289:3: ( (lv_name_2_0= ruleValidID ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:290:1: (lv_name_2_0= ruleValidID )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:290:1: (lv_name_2_0= ruleValidID )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:291:3: lv_name_2_0= ruleValidID
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

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:307:2: (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:307:4: otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleParameter665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:311:1: ( (lv_init_4_0= ruleXExpression ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:312:1: (lv_init_4_0= ruleXExpression )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:312:1: (lv_init_4_0= ruleXExpression )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:313:3: lv_init_4_0= ruleXExpression
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:337:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:338:2: (iv_ruleTask= ruleTask EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:339:2: iv_ruleTask= ruleTask EOF
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:346:1: ruleTask returns [EObject current=null] : (otherlv_0= 'task' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'dependsOn' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ( (lv_action_6_0= ruleXBlockExpression ) ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_action_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:349:28: ( (otherlv_0= 'task' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'dependsOn' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ( (lv_action_6_0= ruleXBlockExpression ) ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:350:1: (otherlv_0= 'task' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'dependsOn' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ( (lv_action_6_0= ruleXBlockExpression ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:350:1: (otherlv_0= 'task' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'dependsOn' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ( (lv_action_6_0= ruleXBlockExpression ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:350:3: otherlv_0= 'task' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'dependsOn' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ( (lv_action_6_0= ruleXBlockExpression ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleTask771); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:354:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:355:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:355:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:356:3: lv_name_1_0= ruleValidID
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

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:372:2: (otherlv_2= 'dependsOn' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:372:4: otherlv_2= 'dependsOn' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleTask805); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getDependsOnKeyword_2_0());
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:376:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:377:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:377:1: (otherlv_3= RULE_ID )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:378:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTaskRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask825); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getDependsOnTaskCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }

                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:389:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==21) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:389:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleTask838); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:393:1: ( (otherlv_5= RULE_ID ) )
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:394:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:394:1: (otherlv_5= RULE_ID )
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:395:3: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTaskRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask858); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getDependsOnTaskCrossReference_2_2_1_0()); 
                    	      	
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
                    break;

            }

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:406:6: ( (lv_action_6_0= ruleXBlockExpression ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:407:1: (lv_action_6_0= ruleXBlockExpression )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:407:1: (lv_action_6_0= ruleXBlockExpression )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:408:3: lv_action_6_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTaskAccess().getActionXBlockExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleTask883);
            lv_action_6_0=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTaskRule());
              	        }
                     		set(
                     			current, 
                     			"action",
                      		lv_action_6_0, 
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


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:432:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:433:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:434:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall919);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall929); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:441:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( () ( ( ruleNavigationLiteral ) ) ) )=> ( () ( (lv_rightOperand_7_0= ruleNavigationLiteral ) ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) ) ) (otherlv_12= '<' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )* otherlv_16= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_9=null;
        Token lv_nullSafe_10_0=null;
        Token lv_spreading_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token lv_explicitOperationCall_18_0=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_rightOperand_7_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_typeArguments_15_0 = null;

        EObject lv_memberCallArguments_19_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;

        EObject lv_memberCallArguments_24_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:444:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( () ( ( ruleNavigationLiteral ) ) ) )=> ( () ( (lv_rightOperand_7_0= ruleNavigationLiteral ) ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) ) ) (otherlv_12= '<' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )* otherlv_16= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:445:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( () ( ( ruleNavigationLiteral ) ) ) )=> ( () ( (lv_rightOperand_7_0= ruleNavigationLiteral ) ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) ) ) (otherlv_12= '<' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )* otherlv_16= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:445:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( () ( ( ruleNavigationLiteral ) ) ) )=> ( () ( (lv_rightOperand_7_0= ruleNavigationLiteral ) ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) ) ) (otherlv_12= '<' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )* otherlv_16= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:446:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( () ( ( ruleNavigationLiteral ) ) ) )=> ( () ( (lv_rightOperand_7_0= ruleNavigationLiteral ) ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) ) ) (otherlv_12= '<' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )* otherlv_16= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall976);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:454:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( () ( ( ruleNavigationLiteral ) ) ) )=> ( () ( (lv_rightOperand_7_0= ruleNavigationLiteral ) ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) ) ) (otherlv_12= '<' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )* otherlv_16= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure ) )? ) )*
            loop17:
            do {
                int alt17=4;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    int LA17_2 = input.LA(2);

                    if ( (synpred1_InternalCradle()) ) {
                        alt17=1;
                    }
                    else if ( (synpred3_InternalCradle()) ) {
                        alt17=3;
                    }


                    }
                    break;
                case RULE_FILE:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (synpred2_InternalCradle()) ) {
                        alt17=2;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA17_4 = input.LA(2);

                    if ( (synpred3_InternalCradle()) ) {
                        alt17=3;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA17_5 = input.LA(2);

                    if ( (synpred3_InternalCradle()) ) {
                        alt17=3;
                    }


                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:454:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:454:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:454:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:454:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:454:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:460:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:460:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:460:26: ()
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:461:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleXMemberFeatureCall1025); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:470:1: ( ( ruleValidID ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:471:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:471:1: ( ruleValidID )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:472:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall1048);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall1064);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:493:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:494:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:494:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:495:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall1086);
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
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:512:6: ( ( ( () ( ( ruleNavigationLiteral ) ) ) )=> ( () ( (lv_rightOperand_7_0= ruleNavigationLiteral ) ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:512:6: ( ( ( () ( ( ruleNavigationLiteral ) ) ) )=> ( () ( (lv_rightOperand_7_0= ruleNavigationLiteral ) ) ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:512:7: ( ( () ( ( ruleNavigationLiteral ) ) ) )=> ( () ( (lv_rightOperand_7_0= ruleNavigationLiteral ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:517:6: ( () ( (lv_rightOperand_7_0= ruleNavigationLiteral ) ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:517:7: () ( (lv_rightOperand_7_0= ruleNavigationLiteral ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:517:7: ()
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:518:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXBinaryOperationLeftOperandAction_1_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:523:2: ( (lv_rightOperand_7_0= ruleNavigationLiteral ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:524:1: (lv_rightOperand_7_0= ruleNavigationLiteral )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:524:1: (lv_rightOperand_7_0= ruleNavigationLiteral )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:525:3: lv_rightOperand_7_0= ruleNavigationLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getRightOperandNavigationLiteralParserRuleCall_1_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNavigationLiteral_in_ruleXMemberFeatureCall1142);
            	    lv_rightOperand_7_0=ruleNavigationLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_7_0, 
            	              		"NavigationLiteral");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:542:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) ) ) (otherlv_12= '<' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )* otherlv_16= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:542:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) ) ) (otherlv_12= '<' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )* otherlv_16= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure ) )? )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:542:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) ) ) (otherlv_12= '<' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )* otherlv_16= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:542:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:542:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:558:7: ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:558:8: () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:558:8: ()
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:559:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:564:2: (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) )
            	    int alt10=3;
            	    switch ( input.LA(1) ) {
            	    case 15:
            	        {
            	        alt10=1;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt10=2;
            	        }
            	        break;
            	    case 23:
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
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:564:4: otherlv_9= '.'
            	            {
            	            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleXMemberFeatureCall1229); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_9, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_2_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:569:6: ( (lv_nullSafe_10_0= '?.' ) )
            	            {
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:569:6: ( (lv_nullSafe_10_0= '?.' ) )
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:570:1: (lv_nullSafe_10_0= '?.' )
            	            {
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:570:1: (lv_nullSafe_10_0= '?.' )
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:571:3: lv_nullSafe_10_0= '?.'
            	            {
            	            lv_nullSafe_10_0=(Token)match(input,22,FOLLOW_22_in_ruleXMemberFeatureCall1253); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_10_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_2_0_0_1_1_0());
            	                  
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
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:585:6: ( (lv_spreading_11_0= '*.' ) )
            	            {
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:585:6: ( (lv_spreading_11_0= '*.' ) )
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:586:1: (lv_spreading_11_0= '*.' )
            	            {
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:586:1: (lv_spreading_11_0= '*.' )
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:587:3: lv_spreading_11_0= '*.'
            	            {
            	            lv_spreading_11_0=(Token)match(input,23,FOLLOW_23_in_ruleXMemberFeatureCall1290); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_11_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_2_0_0_1_2_0());
            	                  
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

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:600:5: (otherlv_12= '<' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )* otherlv_16= '>' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==24) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:600:7: otherlv_12= '<' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )* otherlv_16= '>'
            	            {
            	            otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleXMemberFeatureCall1319); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_2_1_0());
            	                  
            	            }
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:604:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:605:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:605:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:606:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall1340);
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

            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:622:2: (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop11:
            	            do {
            	                int alt11=2;
            	                int LA11_0 = input.LA(1);

            	                if ( (LA11_0==21) ) {
            	                    alt11=1;
            	                }


            	                switch (alt11) {
            	            	case 1 :
            	            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:622:4: otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_14=(Token)match(input,21,FOLLOW_21_in_ruleXMemberFeatureCall1353); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_2_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:626:1: ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:627:1: (lv_typeArguments_15_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:627:1: (lv_typeArguments_15_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:628:3: lv_typeArguments_15_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall1374);
            	            	    lv_typeArguments_15_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_15_0, 
            	            	              		"JvmArgumentTypeReference");
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

            	            otherlv_16=(Token)match(input,25,FOLLOW_25_in_ruleXMemberFeatureCall1388); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_16, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_2_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:648:3: ( ( ruleValidID ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:649:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:649:1: ( ruleValidID )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:650:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_2_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall1413);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:663:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')' )?
            	    int alt15=2;
            	    alt15 = dfa15.predict(input);
            	    switch (alt15) {
            	        case 1 :
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:663:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')'
            	            {
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:663:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) )
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:663:4: ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' )
            	            {
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:670:1: (lv_explicitOperationCall_18_0= '(' )
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:671:3: lv_explicitOperationCall_18_0= '('
            	            {
            	            lv_explicitOperationCall_18_0=(Token)match(input,26,FOLLOW_26_in_ruleXMemberFeatureCall1447); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_18_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_2_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:684:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )?
            	            int alt14=3;
            	            alt14 = dfa14.predict(input);
            	            switch (alt14) {
            	                case 1 :
            	                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:684:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:684:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) )
            	                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:684:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:701:1: (lv_memberCallArguments_19_0= ruleXShortClosure )
            	                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:702:3: lv_memberCallArguments_19_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_2_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall1532);
            	                    lv_memberCallArguments_19_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_19_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:719:6: ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:719:6: ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:719:7: ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:719:7: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:720:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:720:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:721:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_2_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall1560);
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

            	                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:737:2: (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )*
            	                    loop13:
            	                    do {
            	                        int alt13=2;
            	                        int LA13_0 = input.LA(1);

            	                        if ( (LA13_0==21) ) {
            	                            alt13=1;
            	                        }


            	                        switch (alt13) {
            	                    	case 1 :
            	                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:737:4: otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_21=(Token)match(input,21,FOLLOW_21_in_ruleXMemberFeatureCall1573); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_2_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:741:1: ( (lv_memberCallArguments_22_0= ruleXExpression ) )
            	                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:742:1: (lv_memberCallArguments_22_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:742:1: (lv_memberCallArguments_22_0= ruleXExpression )
            	                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:743:3: lv_memberCallArguments_22_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_2_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall1594);
            	                    	    lv_memberCallArguments_22_0=ruleXExpression();

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
            	                    	              		"XExpression");
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
            	                    break;

            	            }

            	            otherlv_23=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall1611); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_23, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_2_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:763:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure ) )?
            	    int alt16=2;
            	    alt16 = dfa16.predict(input);
            	    switch (alt16) {
            	        case 1 :
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:763:4: ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure )
            	            {
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:766:1: (lv_memberCallArguments_24_0= ruleXClosure )
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:767:3: lv_memberCallArguments_24_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_2_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall1646);
            	            lv_memberCallArguments_24_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_24_0, 
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleNavigationLiteral"
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:791:1: entryRuleNavigationLiteral returns [EObject current=null] : iv_ruleNavigationLiteral= ruleNavigationLiteral EOF ;
    public final EObject entryRuleNavigationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationLiteral = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:792:2: (iv_ruleNavigationLiteral= ruleNavigationLiteral EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:793:2: iv_ruleNavigationLiteral= ruleNavigationLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNavigationLiteral_in_entryRuleNavigationLiteral1686);
            iv_ruleNavigationLiteral=ruleNavigationLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavigationLiteral1696); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigationLiteral"


    // $ANTLR start "ruleNavigationLiteral"
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:800:1: ruleNavigationLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FILE ) ) ) ;
    public final EObject ruleNavigationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:803:28: ( ( () ( (lv_value_1_0= RULE_FILE ) ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:804:1: ( () ( (lv_value_1_0= RULE_FILE ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:804:1: ( () ( (lv_value_1_0= RULE_FILE ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:804:2: () ( (lv_value_1_0= RULE_FILE ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:804:2: ()
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:805:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNavigationLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:810:2: ( (lv_value_1_0= RULE_FILE ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:811:1: (lv_value_1_0= RULE_FILE )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:811:1: (lv_value_1_0= RULE_FILE )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:812:3: lv_value_1_0= RULE_FILE
            {
            lv_value_1_0=(Token)match(input,RULE_FILE,FOLLOW_RULE_FILE_in_ruleNavigationLiteral1747); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getNavigationLiteralAccess().getValueFILETerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNavigationLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"FILE");
              	    
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
    // $ANTLR end "ruleNavigationLiteral"


    // $ANTLR start "entryRuleXExpression"
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:836:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:837:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:838:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1788);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1798); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:845:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:848:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:850:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1844);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:866:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:867:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:868:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1878);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1888); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:875:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:878:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:879:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:879:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==EOF||(LA19_1>=RULE_ID && LA19_1<=RULE_DECIMAL)||LA19_1==15||LA19_1==17||LA19_1==19||(LA19_1>=21 && LA19_1<=50)||(LA19_1>=52 && LA19_1<=78)) ) {
                    alt19=2;
                }
                else if ( (LA19_1==18) ) {
                    alt19=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_DECIMAL)||LA19_0==24||LA19_0==26||(LA19_0>=42 && LA19_0<=43)||LA19_0==48||LA19_0==50||LA19_0==54||LA19_0==56||LA19_0==58||(LA19_0>=62 && LA19_0<=64)||LA19_0==67||(LA19_0>=69 && LA19_0<=76)) ) {
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:879:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:879:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:879:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:879:3: ()
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:880:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:885:2: ( ( ruleValidID ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:886:1: ( ruleValidID )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:886:1: ( ruleValidID )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:887:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1946);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1962);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:908:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:909:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:909:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:910:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1982);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:927:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:927:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:928:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment2012);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:936:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==28) ) {
                        int LA18_1 = input.LA(2);

                        if ( (synpred7_InternalCradle()) ) {
                            alt18=1;
                        }
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:936:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:936:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:936:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:941:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:941:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:941:7: ()
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:942:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:947:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:948:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:948:1: ( ruleOpMultiAssign )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:949:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2065);
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

                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:962:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:963:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:963:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:964:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2088);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:988:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:989:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:990:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2128);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign2139); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:997:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1000:28: (kw= '=' )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1002:2: kw= '='
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpSingleAssign2176); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1015:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1016:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1017:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2216);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign2227); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1024:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1027:28: (kw= '+=' )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1029:2: kw= '+='
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpMultiAssign2264); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1042:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1043:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1044:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2303);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression2313); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1051:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1054:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1055:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1055:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1056:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2360);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1064:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    int LA20_2 = input.LA(2);

                    if ( (synpred8_InternalCradle()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1064:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1064:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1064:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1069:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1069:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1069:7: ()
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1070:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1075:2: ( ( ruleOpOr ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1076:1: ( ruleOpOr )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1076:1: ( ruleOpOr )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1077:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression2413);
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

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1090:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1091:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1091:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1092:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2436);
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1116:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1117:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1118:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2475);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2486); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1125:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1128:28: (kw= '||' )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1130:2: kw= '||'
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOr2523); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1143:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1144:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1145:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2562);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2572); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1152:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1155:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1156:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1156:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1157:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2619);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1165:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred9_InternalCradle()) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1165:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1165:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1165:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1170:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1170:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1170:7: ()
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1171:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1176:2: ( ( ruleOpAnd ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1177:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1177:1: ( ruleOpAnd )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1178:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2672);
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

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1191:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1192:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1192:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1193:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2695);
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1217:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1218:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1219:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2734);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2745); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1226:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1229:28: (kw= '&&' )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1231:2: kw= '&&'
            {
            kw=(Token)match(input,30,FOLLOW_30_in_ruleOpAnd2782); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1244:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1245:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1246:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2821);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2831); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1253:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1256:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1257:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1257:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1258:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2878);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1266:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred10_InternalCradle()) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==32) ) {
                    int LA22_3 = input.LA(2);

                    if ( (synpred10_InternalCradle()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1266:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1266:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1266:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1271:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1271:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1271:7: ()
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1272:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1277:2: ( ( ruleOpEquality ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1278:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1278:1: ( ruleOpEquality )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1279:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2931);
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

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1292:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1293:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1293:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1294:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2954);
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1318:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1319:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1320:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2993);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality3004); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1327:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1330:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1331:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1331:1: (kw= '==' | kw= '!=' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            else if ( (LA23_0==32) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1332:2: kw= '=='
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpEquality3042); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1339:2: kw= '!='
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpEquality3061); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1352:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1353:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1354:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3101);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression3111); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1361:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1364:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1365:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1365:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1366:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3158);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1374:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop24:
            do {
                int alt24=3;
                switch ( input.LA(1) ) {
                case 25:
                    {
                    int LA24_2 = input.LA(2);

                    if ( (synpred12_InternalCradle()) ) {
                        alt24=2;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA24_3 = input.LA(2);

                    if ( (synpred12_InternalCradle()) ) {
                        alt24=2;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA24_4 = input.LA(2);

                    if ( (synpred11_InternalCradle()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA24_5 = input.LA(2);

                    if ( (synpred12_InternalCradle()) ) {
                        alt24=2;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA24_6 = input.LA(2);

                    if ( (synpred12_InternalCradle()) ) {
                        alt24=2;
                    }


                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1374:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1374:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1374:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1374:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1374:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1376:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1376:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1376:6: ()
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1377:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleXRelationalExpression3194); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1386:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1387:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1387:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1388:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression3217);
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
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1405:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1405:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1405:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1405:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1405:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1410:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1410:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1410:7: ()
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1411:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1416:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1417:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1417:1: ( ruleOpCompare )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1418:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3278);
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

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1431:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1432:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1432:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1433:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3301);
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1457:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1458:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1459:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare3341);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare3352); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1466:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1469:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1470:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1470:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt25=1;
                }
                break;
            case 35:
                {
                alt25=2;
                }
                break;
            case 25:
                {
                alt25=3;
                }
                break;
            case 24:
                {
                alt25=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1471:2: kw= '>='
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpCompare3390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1478:2: kw= '<='
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpCompare3409); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1485:2: kw= '>'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare3428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1492:2: kw= '<'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpCompare3447); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1505:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1506:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1507:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3487);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3497); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1514:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1517:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1518:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1518:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1519:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3544);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1527:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1527:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1527:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1527:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1532:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1532:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1532:7: ()
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1533:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1538:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1539:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1539:1: ( ruleOpOther )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1540:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3597);
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

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1553:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1554:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1554:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1555:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3620);
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1579:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1580:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1581:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3659);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3670); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1588:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1591:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1592:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1592:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt29=8;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt29=1;
                }
                break;
            case 37:
                {
                alt29=2;
                }
                break;
            case 38:
                {
                alt29=3;
                }
                break;
            case 25:
                {
                alt29=4;
                }
                break;
            case 24:
                {
                alt29=5;
                }
                break;
            case 39:
                {
                alt29=6;
                }
                break;
            case 40:
                {
                alt29=7;
                }
                break;
            case 41:
                {
                alt29=8;
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1593:2: kw= '->'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther3708); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1600:2: kw= '..'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpOther3727); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1607:2: kw= '=>'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpOther3746); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1613:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1613:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1614:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther3766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1619:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==25) ) {
                        int LA27_1 = input.LA(2);

                        if ( (LA27_1==25) && (synpred14_InternalCradle())) {
                            alt27=1;
                        }
                        else if ( (LA27_1==EOF||LA27_1==RULE_ID||(LA27_1>=RULE_STRING && LA27_1<=RULE_DECIMAL)||LA27_1==24||LA27_1==26||(LA27_1>=42 && LA27_1<=43)||LA27_1==48||LA27_1==50||LA27_1==54||LA27_1==56||LA27_1==58||(LA27_1>=62 && LA27_1<=64)||LA27_1==67||(LA27_1>=69 && LA27_1<=76)) ) {
                            alt27=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 27, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1619:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1619:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1619:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1623:5: (kw= '>' kw= '>' )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1624:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther3797); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther3810); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1637:2: kw= '>'
                            {
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther3831); if (state.failed) return current;
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1643:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1643:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1644:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOther3853); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1649:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==24) ) {
                        int LA28_1 = input.LA(2);

                        if ( (synpred15_InternalCradle()) ) {
                            alt28=1;
                        }
                        else if ( (true) ) {
                            alt28=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 28, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1649:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1649:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1649:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1653:5: (kw= '<' kw= '<' )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1654:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOther3884); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOther3897); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1667:2: kw= '<'
                            {
                            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOther3918); if (state.failed) return current;
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1674:2: kw= '<>'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpOther3939); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1681:2: kw= '?:'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpOther3958); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1688:2: kw= '<=>'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpOther3977); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1701:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1702:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1703:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4017);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression4027); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1710:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1713:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1714:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1714:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1715:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4074);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1723:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==42) ) {
                    int LA30_2 = input.LA(2);

                    if ( (synpred16_InternalCradle()) ) {
                        alt30=1;
                    }


                }
                else if ( (LA30_0==43) ) {
                    int LA30_3 = input.LA(2);

                    if ( (synpred16_InternalCradle()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1723:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1723:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1723:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1728:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1728:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1728:7: ()
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1729:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1734:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1735:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1735:1: ( ruleOpAdd )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1736:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4127);
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

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1749:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1750:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1750:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1751:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4150);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1775:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1776:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1777:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd4189);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd4200); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1784:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1787:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1788:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1788:1: (kw= '+' | kw= '-' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            else if ( (LA31_0==43) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1789:2: kw= '+'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpAdd4238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1796:2: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpAdd4257); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1809:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1810:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1811:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4297);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4307); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1818:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1821:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1822:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1822:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1823:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4354);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1831:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop32:
            do {
                int alt32=2;
                switch ( input.LA(1) ) {
                case 44:
                    {
                    int LA32_2 = input.LA(2);

                    if ( (synpred17_InternalCradle()) ) {
                        alt32=1;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA32_3 = input.LA(2);

                    if ( (synpred17_InternalCradle()) ) {
                        alt32=1;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA32_4 = input.LA(2);

                    if ( (synpred17_InternalCradle()) ) {
                        alt32=1;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA32_5 = input.LA(2);

                    if ( (synpred17_InternalCradle()) ) {
                        alt32=1;
                    }


                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1831:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1831:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1831:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1836:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1836:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1836:7: ()
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1837:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1842:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1843:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1843:1: ( ruleOpMulti )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1844:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4407);
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

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1857:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1858:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1858:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1859:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4430);
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
            	    break loop32;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1883:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1884:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1885:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti4469);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti4480); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1892:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1895:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1896:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1896:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt33=1;
                }
                break;
            case 45:
                {
                alt33=2;
                }
                break;
            case 46:
                {
                alt33=3;
                }
                break;
            case 47:
                {
                alt33=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1897:2: kw= '*'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpMulti4518); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1904:2: kw= '**'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpMulti4537); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1911:2: kw= '/'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpMulti4556); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1918:2: kw= '%'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOpMulti4575); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1931:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1932:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1933:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4615);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation4625); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1940:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1943:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1944:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1944:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=42 && LA34_0<=43)||LA34_0==48) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_ID||(LA34_0>=RULE_STRING && LA34_0<=RULE_DECIMAL)||LA34_0==24||LA34_0==26||LA34_0==50||LA34_0==54||LA34_0==56||LA34_0==58||(LA34_0>=62 && LA34_0<=64)||LA34_0==67||(LA34_0>=69 && LA34_0<=76)) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1944:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1944:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1944:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1944:3: ()
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1945:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1950:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1951:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1951:1: ( ruleOpUnary )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1952:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4683);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1965:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1966:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1966:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1967:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4704);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1985:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4733);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2001:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2002:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2003:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4769);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4780); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2010:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2013:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2014:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2014:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt35=1;
                }
                break;
            case 43:
                {
                alt35=2;
                }
                break;
            case 42:
                {
                alt35=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2015:2: kw= '!'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOpUnary4818); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2022:2: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpUnary4837); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2029:2: kw= '+'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpUnary4856); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2042:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2043:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2044:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4896);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4906); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2051:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2054:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2055:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2055:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2056:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4953);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2064:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==49) ) {
                    int LA36_2 = input.LA(2);

                    if ( (synpred18_InternalCradle()) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2064:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2064:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2064:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2066:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2066:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2066:6: ()
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2067:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXCastedExpression4988); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2076:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2077:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2077:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2078:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5011);
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2102:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2103:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2104:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5049);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression5059); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2111:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2114:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2115:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2115:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt37=13;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2116:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5106);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2126:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5133);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2136:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5160);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2146:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5187);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2156:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5214);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2166:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5241);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2176:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5268);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2186:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5295);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2196:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5322);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2206:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5349);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2216:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5376);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2226:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5403);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2236:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5430);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2252:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2253:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2254:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5465);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5475); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2261:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2264:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2265:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2265:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt38=6;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==50) && (synpred19_InternalCradle())) {
                alt38=1;
            }
            else if ( ((LA38_0>=70 && LA38_0<=71)) ) {
                alt38=2;
            }
            else if ( ((LA38_0>=RULE_HEX && LA38_0<=RULE_DECIMAL)) ) {
                alt38=3;
            }
            else if ( (LA38_0==72) ) {
                alt38=4;
            }
            else if ( (LA38_0==RULE_STRING) ) {
                alt38=5;
            }
            else if ( (LA38_0==73) ) {
                alt38=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2265:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2265:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2265:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5535);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2278:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5563);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2288:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5590);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2298:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5617);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2308:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5644);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2318:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5671);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2334:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2335:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2336:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5706);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5716); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2343:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2346:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2347:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2347:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2347:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2347:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2347:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2349:5: ( () otherlv_1= '[' )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2349:6: () otherlv_1= '['
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2349:6: ()
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2350:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXClosure5776); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2359:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2359:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2374:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2374:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2374:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID||LA40_0==26||LA40_0==38) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2374:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2374:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2375:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2375:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2376:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5849);
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

                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2392:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==21) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
                            	case 1 :
                            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2392:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleXClosure5862); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2396:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2397:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2397:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2398:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5883);
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

                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2414:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2415:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2415:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2416:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,51,FOLLOW_51_in_ruleXClosure5905); if (state.failed) return current;
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

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2429:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2430:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2430:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2431:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5942);
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

            otherlv_7=(Token)match(input,52,FOLLOW_52_in_ruleXClosure5954); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2459:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2460:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2461:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5990);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure6000); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2468:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2471:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2472:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2472:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2472:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2472:2: ()
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2473:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2478:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID||(LA43_0>=RULE_STRING && LA43_0<=RULE_DECIMAL)||LA43_0==24||LA43_0==26||(LA43_0>=42 && LA43_0<=43)||LA43_0==48||LA43_0==50||LA43_0==54||LA43_0==56||LA43_0==58||(LA43_0>=62 && LA43_0<=67)||(LA43_0>=69 && LA43_0<=76)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2478:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2478:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2479:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2479:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2480:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6056);
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

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2496:2: (otherlv_2= ';' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==53) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2496:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleXExpressionInClosure6069); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2508:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2509:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2510:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6109);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6119); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2517:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2520:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2521:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2521:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2521:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2521:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2521:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2537:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2537:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2537:7: ()
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2538:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2543:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==26||LA45_0==38) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2543:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2543:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2544:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2544:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2545:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6227);
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

                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2561:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==21) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2561:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXShortClosure6240); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2565:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2566:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2566:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2567:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6261);
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

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2583:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2584:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2584:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2585:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,51,FOLLOW_51_in_ruleXShortClosure6283); if (state.failed) return current;
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

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2598:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2599:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2599:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2600:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6319);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2624:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2625:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2626:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6355);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6365); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2633:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2636:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2637:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2637:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2637:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleXParenthesizedExpression6402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6424);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXParenthesizedExpression6435); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2662:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2663:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2664:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6471);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6481); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2671:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2674:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2675:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2675:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2675:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2675:2: ()
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2676:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXIfExpression6527); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleXIfExpression6539); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2689:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2690:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2690:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2691:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6560);
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

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleXIfExpression6572); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2711:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2712:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2712:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2713:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6593);
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

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2729:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==55) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred23_InternalCradle()) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2729:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2729:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2729:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleXIfExpression6614); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2734:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2735:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2735:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2736:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6636);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2760:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2761:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2762:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6674);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6684); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2769:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2772:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2773:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2773:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2773:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2773:2: ()
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2774:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6730); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2783:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||(LA48_0>=RULE_STRING && LA48_0<=RULE_DECIMAL)||LA48_0==24||(LA48_0>=42 && LA48_0<=43)||LA48_0==48||LA48_0==50||LA48_0==54||LA48_0==56||LA48_0==58||(LA48_0>=62 && LA48_0<=64)||LA48_0==67||(LA48_0>=69 && LA48_0<=76)) ) {
                alt48=1;
            }
            else if ( (LA48_0==26) ) {
                int LA48_2 = input.LA(2);

                if ( (LA48_2==RULE_ID) ) {
                    int LA48_3 = input.LA(3);

                    if ( (LA48_3==RULE_FILE||LA48_3==15||LA48_3==18||(LA48_3>=22 && LA48_3<=47)||(LA48_3>=49 && LA48_3<=50)||LA48_3==68) ) {
                        alt48=1;
                    }
                    else if ( (LA48_3==57) && (synpred25_InternalCradle())) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA48_2>=RULE_STRING && LA48_2<=RULE_DECIMAL)||LA48_2==24||LA48_2==26||(LA48_2>=42 && LA48_2<=43)||LA48_2==48||LA48_2==50||LA48_2==54||LA48_2==56||LA48_2==58||(LA48_2>=62 && LA48_2<=64)||LA48_2==67||(LA48_2>=69 && LA48_2<=76)) ) {
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2783:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2783:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2783:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2783:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_ID) ) {
                        int LA47_1 = input.LA(2);

                        if ( (LA47_1==57) && (synpred24_InternalCradle())) {
                            alt47=1;
                        }
                    }
                    switch (alt47) {
                        case 1 :
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2783:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2788:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2788:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2788:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2789:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2789:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2790:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6773);
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

                            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6785); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2810:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2811:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2811:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2812:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6809);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2829:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2829:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2829:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2829:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2829:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2835:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2835:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleXSwitchExpression6853); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2839:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2840:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2840:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2841:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6874);
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

                    otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6886); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2861:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2862:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2862:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2863:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6909);
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

                    otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleXSwitchExpression6921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,58,FOLLOW_58_in_ruleXSwitchExpression6935); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2887:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID||LA49_0==26||LA49_0==38||LA49_0==57||LA49_0==61) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2888:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2888:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2889:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6956);
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

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2905:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==59) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2905:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,59,FOLLOW_59_in_ruleXSwitchExpression6970); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2913:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2914:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2914:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2915:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7003);
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

            otherlv_15=(Token)match(input,60,FOLLOW_60_in_ruleXSwitchExpression7017); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2943:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2944:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2945:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7053);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7063); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2952:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2955:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2956:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2956:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2956:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2956:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||LA51_0==26||LA51_0==38) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2957:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2957:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2958:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7109);
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

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2974:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==61) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2974:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXCasePart7123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2978:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2979:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2979:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2980:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7144);
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

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleXCasePart7158); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3000:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3001:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3001:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3002:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7179);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3026:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3027:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3028:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7215);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7225); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3035:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3038:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3039:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3039:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3039:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3039:2: ()
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3040:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXForLoopExpression7271); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleXForLoopExpression7283); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3053:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3054:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3054:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3055:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7304);
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

            otherlv_4=(Token)match(input,57,FOLLOW_57_in_ruleXForLoopExpression7316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3075:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3076:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3076:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3077:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7337);
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

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleXForLoopExpression7349); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3097:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3098:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3098:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3099:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7370);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3123:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3124:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3125:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7406);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7416); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3132:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3135:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3136:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3136:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3136:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3136:2: ()
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3137:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXWhileExpression7462); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleXWhileExpression7474); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3150:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3151:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3151:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3152:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7495);
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

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleXWhileExpression7507); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3172:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3173:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3173:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3174:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7528);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3198:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3199:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3200:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7564);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7574); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3207:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3210:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3211:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3211:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3211:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3211:2: ()
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3212:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXDoWhileExpression7620); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3221:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3222:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3222:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3223:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7641);
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

            otherlv_3=(Token)match(input,63,FOLLOW_63_in_ruleXDoWhileExpression7653); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleXDoWhileExpression7665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3247:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3248:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3248:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3249:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7686);
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

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleXDoWhileExpression7698); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3277:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3278:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3279:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7734);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7744); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3286:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3289:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3290:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3290:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3290:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3290:2: ()
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3291:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXBlockExpression7790); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3300:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_ID||(LA54_0>=RULE_STRING && LA54_0<=RULE_DECIMAL)||LA54_0==24||LA54_0==26||(LA54_0>=42 && LA54_0<=43)||LA54_0==48||LA54_0==50||LA54_0==54||LA54_0==56||LA54_0==58||(LA54_0>=62 && LA54_0<=67)||(LA54_0>=69 && LA54_0<=76)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3300:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3300:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3301:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3301:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3302:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7812);
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

            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3318:2: (otherlv_3= ';' )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==53) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3318:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleXBlockExpression7825); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,60,FOLLOW_60_in_ruleXBlockExpression7841); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3334:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3335:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3336:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7877);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7887); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3343:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3346:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3347:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3347:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=65 && LA55_0<=66)) ) {
                alt55=1;
            }
            else if ( (LA55_0==RULE_ID||(LA55_0>=RULE_STRING && LA55_0<=RULE_DECIMAL)||LA55_0==24||LA55_0==26||(LA55_0>=42 && LA55_0<=43)||LA55_0==48||LA55_0==50||LA55_0==54||LA55_0==56||LA55_0==58||(LA55_0>=62 && LA55_0<=64)||LA55_0==67||(LA55_0>=69 && LA55_0<=76)) ) {
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3348:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7934);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3358:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7961);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3374:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3375:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3376:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7996);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8006); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3383:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3386:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3387:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3387:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3387:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3387:2: ()
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3388:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3393:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==65) ) {
                alt56=1;
            }
            else if ( (LA56_0==66) ) {
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3393:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3393:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3394:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3394:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3395:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,65,FOLLOW_65_in_ruleXVariableDeclaration8059); if (state.failed) return current;
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3409:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,66,FOLLOW_66_in_ruleXVariableDeclaration8090); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3413:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (synpred26_InternalCradle()) ) {
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
            else if ( (LA57_0==26) && (synpred26_InternalCradle())) {
                alt57=1;
            }
            else if ( (LA57_0==38) && (synpred26_InternalCradle())) {
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3413:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3413:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3413:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3421:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3421:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3421:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3422:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3422:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3423:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8138);
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

                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3439:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3440:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3440:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3441:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8159);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3458:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3458:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3459:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3459:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3460:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8188);
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

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3476:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==18) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3476:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleXVariableDeclaration8202); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3480:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3481:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3481:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3482:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8223);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3506:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3507:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3508:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8261);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8271); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3515:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3518:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3519:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3519:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3519:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3519:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==RULE_ID||LA59_1==15||LA59_1==24||LA59_1==50) ) {
                    alt59=1;
                }
            }
            else if ( (LA59_0==26||LA59_0==38) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3520:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3520:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3521:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8317);
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

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3537:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3538:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3538:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3539:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8339);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3563:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3564:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3565:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8375);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8385); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3572:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3575:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3576:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3576:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3576:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3576:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3577:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3577:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3578:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8431);
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

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3594:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3595:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3595:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3596:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8452);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3620:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3621:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3622:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8488);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8498); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3629:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3632:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3633:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3633:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3633:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3633:2: ()
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3634:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3639:2: ( ( ruleStaticQualifier ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==68) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3640:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3640:1: ( ruleStaticQualifier )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3641:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8555);
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

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3654:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==24) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3654:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXFeatureCall8569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3658:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3659:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3659:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3660:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8590);
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

                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3676:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==21) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3676:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXFeatureCall8603); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3680:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3681:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3681:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3682:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8624);
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

                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleXFeatureCall8638); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3702:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3703:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3703:1: ( ruleIdOrSuper )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3704:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8663);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3717:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3717:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3717:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3717:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3724:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3725:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,26,FOLLOW_26_in_ruleXFeatureCall8697); if (state.failed) return current;
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

                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3738:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt64=3;
                    alt64 = dfa64.predict(input);
                    switch (alt64) {
                        case 1 :
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3738:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3738:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3738:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3755:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3756:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8782);
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
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3773:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3773:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3773:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3773:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3774:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3774:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3775:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8810);
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

                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3791:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==21) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3791:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleXFeatureCall8823); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3795:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3796:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3796:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3797:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8844);
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

                    otherlv_13=(Token)match(input,27,FOLLOW_27_in_ruleXFeatureCall8861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3817:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3817:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3820:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3821:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8896);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3845:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3846:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3847:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8934);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8945); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3854:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3857:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3858:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3858:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                alt67=1;
            }
            else if ( (LA67_0==67) ) {
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3859:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8992);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3871:2: kw= 'super'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleIdOrSuper9016); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3884:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3885:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3886:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9057);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier9068); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3893:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3896:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3897:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3897:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_ID) ) {
                    int LA68_2 = input.LA(2);

                    if ( (LA68_2==68) ) {
                        alt68=1;
                    }


                }


                switch (alt68) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3898:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier9115);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,68,FOLLOW_68_in_ruleStaticQualifier9133); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3922:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3923:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3924:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9174);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9184); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3931:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3934:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3935:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3935:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3935:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3935:2: ()
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3936:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXConstructorCall9230); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3945:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3946:1: ( ruleQualifiedName )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3946:1: ( ruleQualifiedName )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3947:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9253);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3960:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3960:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3960:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3960:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleXConstructorCall9274); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3965:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3966:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3966:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3967:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9296);
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

                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3983:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==21) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3983:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleXConstructorCall9309); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3987:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3988:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3988:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3989:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9330);
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

                    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleXConstructorCall9344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4009:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4009:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4009:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4009:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleXConstructorCall9367); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4014:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt72=3;
                    alt72 = dfa72.predict(input);
                    switch (alt72) {
                        case 1 :
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4014:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4014:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4014:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4031:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4032:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9440);
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
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4049:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4049:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4049:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4049:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4050:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4050:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4051:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9468);
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

                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4067:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( (LA71_0==21) ) {
                                    alt71=1;
                                }


                                switch (alt71) {
                            	case 1 :
                            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4067:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleXConstructorCall9481); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4071:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4072:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4072:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4073:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9502);
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

                    otherlv_13=(Token)match(input,27,FOLLOW_27_in_ruleXConstructorCall9519); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4093:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4093:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4096:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4097:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9554);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4121:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4122:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4123:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9591);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9601); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4130:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4133:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4134:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4134:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4134:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4134:2: ()
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4135:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4140:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==70) ) {
                alt75=1;
            }
            else if ( (LA75_0==71) ) {
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4140:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXBooleanLiteral9648); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4145:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4145:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4146:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4146:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4147:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,71,FOLLOW_71_in_ruleXBooleanLiteral9672); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4168:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4169:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4170:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9722);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9732); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4177:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4180:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4181:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4181:1: ( () otherlv_1= 'null' )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4181:2: () otherlv_1= 'null'
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4181:2: ()
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4182:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXNullLiteral9778); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4199:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4200:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4201:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9814);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9824); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4208:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4211:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4212:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4212:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4212:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4212:2: ()
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4213:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4218:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4219:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4219:1: (lv_value_1_0= ruleNumber )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4220:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9879);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4244:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4245:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4246:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9915);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9925); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4253:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4256:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4257:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4257:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4257:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4257:2: ()
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4258:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4263:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4264:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4264:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4265:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9976); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4289:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4290:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4291:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10017);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral10027); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4298:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4301:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4302:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4302:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4302:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4302:2: ()
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4303:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXTypeLiteral10073); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleXTypeLiteral10085); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4316:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4317:1: ( ruleQualifiedName )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4317:1: ( ruleQualifiedName )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4318:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10108);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleXTypeLiteral10120); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4343:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4344:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4345:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10156);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10166); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4352:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4355:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4356:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4356:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4356:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4356:2: ()
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4357:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXThrowExpression10212); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4366:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4367:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4367:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4368:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10233);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4392:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4393:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4394:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10269);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10279); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4401:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4404:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4405:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4405:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4405:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4405:2: ()
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4406:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXReturnExpression10325); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4415:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4415:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4420:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4421:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10356);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4445:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4446:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4447:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10393);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10403); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4454:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4457:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4458:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4458:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4458:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4458:2: ()
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4459:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleXTryCatchFinallyExpression10449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4468:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4469:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4469:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4470:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10470);
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

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4486:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==78) ) {
                alt79=1;
            }
            else if ( (LA79_0==77) ) {
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4486:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4486:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4486:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4486:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==78) ) {
                            int LA77_2 = input.LA(2);

                            if ( (synpred35_InternalCradle()) ) {
                                alt77=1;
                            }


                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4486:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4488:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4489:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10500);
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
                    	    if ( cnt77 >= 1 ) break loop77;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(77, input);
                                throw eee;
                        }
                        cnt77++;
                    } while (true);

                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4505:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==77) ) {
                        int LA78_1 = input.LA(2);

                        if ( (synpred36_InternalCradle()) ) {
                            alt78=1;
                        }
                    }
                    switch (alt78) {
                        case 1 :
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4505:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4505:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4505:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,77,FOLLOW_77_in_ruleXTryCatchFinallyExpression10522); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4510:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4511:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4511:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4512:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10544);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4529:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4529:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4529:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,77,FOLLOW_77_in_ruleXTryCatchFinallyExpression10566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4533:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4534:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4534:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4535:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10587);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4559:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4560:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4561:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10625);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10635); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4568:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4571:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4572:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4572:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4572:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4572:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4572:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleXCatchClause10680); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleXCatchClause10693); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4581:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4582:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4582:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4583:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10714);
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

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleXCatchClause10726); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4603:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4604:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4604:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4605:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10747);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4629:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4630:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4631:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10784);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10795); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4638:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4641:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4642:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4642:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4643:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10842);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4653:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==15) ) {
                    int LA80_2 = input.LA(2);

                    if ( (LA80_2==RULE_ID) ) {
                        int LA80_3 = input.LA(3);

                        if ( (synpred38_InternalCradle()) ) {
                            alt80=1;
                        }


                    }


                }


                switch (alt80) {
            	case 1 :
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4653:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4653:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4653:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedName10870); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10893);
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
            	    break loop80;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4680:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4684:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4685:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10947);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10958); if (state.failed) return current;

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4695:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4699:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4700:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4700:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_HEX) ) {
                alt84=1;
            }
            else if ( ((LA84_0>=RULE_INT && LA84_0<=RULE_DECIMAL)) ) {
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4700:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber11002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4708:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4708:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4708:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4708:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==RULE_INT) ) {
                        alt81=1;
                    }
                    else if ( (LA81_0==RULE_DECIMAL) ) {
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
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4708:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11030); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4716:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11056); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4723:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==15) ) {
                        int LA83_1 = input.LA(2);

                        if ( ((LA83_1>=RULE_INT && LA83_1<=RULE_DECIMAL)) ) {
                            alt83=1;
                        }
                    }
                    switch (alt83) {
                        case 1 :
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4724:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,15,FOLLOW_15_in_ruleNumber11076); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4729:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
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
                                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4729:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11092); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4737:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11118); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4755:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4756:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4757:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11171);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference11181); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4764:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4767:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4768:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4768:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_ID) ) {
                alt86=1;
            }
            else if ( (LA86_0==26||LA86_0==38) ) {
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4768:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4768:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4769:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11229);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4777:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==50) ) {
                            int LA85_2 = input.LA(2);

                            if ( (LA85_2==52) ) {
                                int LA85_3 = input.LA(3);

                                if ( (synpred39_InternalCradle()) ) {
                                    alt85=1;
                                }


                            }


                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4777:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4780:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4780:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4780:6: ()
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4781:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleJvmTypeReference11267); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleJvmTypeReference11279); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4796:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11311);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4812:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4813:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4814:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11346);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11356); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4821:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4824:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4825:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4825:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4825:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4825:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==26) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4825:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleXFunctionTypeRef11394); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4829:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==RULE_ID||LA88_0==26||LA88_0==38) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4829:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4829:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4830:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4830:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4831:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11416);
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

                            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4847:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop87:
                            do {
                                int alt87=2;
                                int LA87_0 = input.LA(1);

                                if ( (LA87_0==21) ) {
                                    alt87=1;
                                }


                                switch (alt87) {
                            	case 1 :
                            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4847:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXFunctionTypeRef11429); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4851:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4852:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4852:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4853:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11450);
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
                            	    break loop87;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleXFunctionTypeRef11466); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleXFunctionTypeRef11480); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4877:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4878:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4878:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4879:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11501);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4903:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4904:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4905:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11537);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11547); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4912:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4915:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4916:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4916:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4916:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4916:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4917:1: ( ruleQualifiedName )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4917:1: ( ruleQualifiedName )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4918:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11595);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4931:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt91=2;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4931:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4931:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4931:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleJvmParameterizedTypeReference11616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4936:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4937:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4937:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4938:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11638);
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

                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4954:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==21) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4954:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleJvmParameterizedTypeReference11651); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4958:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4959:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4959:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4960:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11672);
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
                    	    break loop90;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleJvmParameterizedTypeReference11686); if (state.failed) return current;
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4988:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4989:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4990:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11724);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11734); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4997:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5000:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5001:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5001:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_ID||LA92_0==26||LA92_0==38) ) {
                alt92=1;
            }
            else if ( (LA92_0==79) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5002:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11781);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5012:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11808);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5028:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5029:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5030:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11843);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11853); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5037:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5040:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5041:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5041:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5041:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5041:2: ()
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5042:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleJvmWildcardTypeReference11899); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5051:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt93=3;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==80) ) {
                alt93=1;
            }
            else if ( (LA93_0==67) ) {
                alt93=2;
            }
            switch (alt93) {
                case 1 :
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5051:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5051:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5052:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5052:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5053:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11921);
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
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5070:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5070:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5071:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5071:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5072:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11948);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5096:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5097:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5098:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11986);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11996); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5105:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5108:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5109:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5109:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5109:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleJvmUpperBound12033); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5113:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5114:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5114:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5115:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12054);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5139:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5140:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5141:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12090);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12100); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5148:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5151:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5152:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5152:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5152:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleJvmUpperBoundAnded12137); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5156:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5157:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5157:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5158:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12158);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5182:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5183:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5184:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12194);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12204); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5191:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5194:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5195:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5195:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5195:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleJvmLowerBound12241); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5199:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5200:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5200:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5201:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12262);
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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5227:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5228:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5229:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12301);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12312); if (state.failed) return current;

            }

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
    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5236:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5239:28: (this_ID_0= RULE_ID )
            // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:5240:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12351); if (state.failed) return current;
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
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:454:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:454:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:454:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:454:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:454:6: ()
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:455:1: 
        {
        }

        match(input,15,FOLLOW_15_in_synpred1_InternalCradle993); if (state.failed) return ;
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:456:1: ( ( ruleValidID ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:457:1: ( ruleValidID )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:457:1: ( ruleValidID )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:458:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred1_InternalCradle1002);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred1_InternalCradle1008);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalCradle

    // $ANTLR start synpred2_InternalCradle
    public final void synpred2_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:512:7: ( ( () ( ( ruleNavigationLiteral ) ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:512:8: ( () ( ( ruleNavigationLiteral ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:512:8: ( () ( ( ruleNavigationLiteral ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:512:9: () ( ( ruleNavigationLiteral ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:512:9: ()
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:513:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:513:2: ( ( ruleNavigationLiteral ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:514:1: ( ruleNavigationLiteral )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:514:1: ( ruleNavigationLiteral )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:515:1: ruleNavigationLiteral
        {
        pushFollow(FOLLOW_ruleNavigationLiteral_in_synpred2_InternalCradle1112);
        ruleNavigationLiteral();

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
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:542:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:542:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:542:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:542:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:542:10: ()
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:543:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:543:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt94=3;
        switch ( input.LA(1) ) {
        case 15:
            {
            alt94=1;
            }
            break;
        case 22:
            {
            alt94=2;
            }
            break;
        case 23:
            {
            alt94=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 94, 0, input);

            throw nvae;
        }

        switch (alt94) {
            case 1 :
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:543:4: '.'
                {
                match(input,15,FOLLOW_15_in_synpred3_InternalCradle1168); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:545:6: ( ( '?.' ) )
                {
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:545:6: ( ( '?.' ) )
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:546:1: ( '?.' )
                {
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:546:1: ( '?.' )
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:547:2: '?.'
                {
                match(input,22,FOLLOW_22_in_synpred3_InternalCradle1182); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:552:6: ( ( '*.' ) )
                {
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:552:6: ( ( '*.' ) )
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:553:1: ( '*.' )
                {
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:553:1: ( '*.' )
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:554:2: '*.'
                {
                match(input,23,FOLLOW_23_in_synpred3_InternalCradle1202); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred3_InternalCradle

    // $ANTLR start synpred4_InternalCradle
    public final void synpred4_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:663:4: ( ( '(' ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:664:1: ( '(' )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:664:1: ( '(' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:665:2: '('
        {
        match(input,26,FOLLOW_26_in_synpred4_InternalCradle1429); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalCradle

    // $ANTLR start synpred5_InternalCradle
    public final void synpred5_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:684:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:684:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:684:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:684:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:684:6: ()
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:685:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:685:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==RULE_ID||LA96_0==26||LA96_0==38) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:685:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:685:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:686:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:686:1: ( ruleJvmFormalParameter )
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:687:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred5_InternalCradle1481);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:689:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==21) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:689:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,21,FOLLOW_21_in_synpred5_InternalCradle1488); if (state.failed) return ;
                	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:690:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:691:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:691:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:692:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred5_InternalCradle1495);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop95;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:694:6: ( ( '|' ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:695:1: ( '|' )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:695:1: ( '|' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:696:2: '|'
        {
        match(input,51,FOLLOW_51_in_synpred5_InternalCradle1509); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalCradle

    // $ANTLR start synpred6_InternalCradle
    public final void synpred6_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:763:4: ( ( () '[' ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:763:5: ( () '[' )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:763:5: ( () '[' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:763:6: () '['
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:763:6: ()
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:764:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred6_InternalCradle1629); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalCradle

    // $ANTLR start synpred7_InternalCradle
    public final void synpred7_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:936:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:936:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:936:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:936:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:936:5: ()
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:937:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:937:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:938:1: ( ruleOpMultiAssign )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:938:1: ( ruleOpMultiAssign )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:939:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred7_InternalCradle2033);
        ruleOpMultiAssign();

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
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1064:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1064:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1064:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1064:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1064:5: ()
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1065:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1065:2: ( ( ruleOpOr ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1066:1: ( ruleOpOr )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1066:1: ( ruleOpOr )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1067:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred8_InternalCradle2381);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalCradle

    // $ANTLR start synpred9_InternalCradle
    public final void synpred9_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1165:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1165:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1165:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1165:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1165:5: ()
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1166:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1166:2: ( ( ruleOpAnd ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1167:1: ( ruleOpAnd )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1167:1: ( ruleOpAnd )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1168:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred9_InternalCradle2640);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalCradle

    // $ANTLR start synpred10_InternalCradle
    public final void synpred10_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1266:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1266:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1266:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1266:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1266:5: ()
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1267:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1267:2: ( ( ruleOpEquality ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1268:1: ( ruleOpEquality )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1268:1: ( ruleOpEquality )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1269:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred10_InternalCradle2899);
        ruleOpEquality();

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
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1374:4: ( ( () 'instanceof' ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1374:5: ( () 'instanceof' )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1374:5: ( () 'instanceof' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1374:6: () 'instanceof'
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1374:6: ()
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1375:1: 
        {
        }

        match(input,33,FOLLOW_33_in_synpred11_InternalCradle3175); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalCradle

    // $ANTLR start synpred12_InternalCradle
    public final void synpred12_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1405:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1405:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1405:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1405:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1405:10: ()
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1406:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1406:2: ( ( ruleOpCompare ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1407:1: ( ruleOpCompare )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1407:1: ( ruleOpCompare )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1408:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred12_InternalCradle3246);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred12_InternalCradle

    // $ANTLR start synpred13_InternalCradle
    public final void synpred13_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1527:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1527:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1527:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1527:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1527:5: ()
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1528:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1528:2: ( ( ruleOpOther ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1529:1: ( ruleOpOther )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1529:1: ( ruleOpOther )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1530:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred13_InternalCradle3565);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred13_InternalCradle

    // $ANTLR start synpred14_InternalCradle
    public final void synpred14_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1619:3: ( ( '>' '>' ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1619:4: ( '>' '>' )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1619:4: ( '>' '>' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1620:2: '>' '>'
        {
        match(input,25,FOLLOW_25_in_synpred14_InternalCradle3781); if (state.failed) return ;
        match(input,25,FOLLOW_25_in_synpred14_InternalCradle3786); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalCradle

    // $ANTLR start synpred15_InternalCradle
    public final void synpred15_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1649:3: ( ( '<' '<' ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1649:4: ( '<' '<' )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1649:4: ( '<' '<' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1650:2: '<' '<'
        {
        match(input,24,FOLLOW_24_in_synpred15_InternalCradle3868); if (state.failed) return ;
        match(input,24,FOLLOW_24_in_synpred15_InternalCradle3873); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalCradle

    // $ANTLR start synpred16_InternalCradle
    public final void synpred16_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1723:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1723:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1723:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1723:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1723:5: ()
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1724:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1724:2: ( ( ruleOpAdd ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1725:1: ( ruleOpAdd )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1725:1: ( ruleOpAdd )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1726:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred16_InternalCradle4095);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalCradle

    // $ANTLR start synpred17_InternalCradle
    public final void synpred17_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1831:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1831:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1831:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1831:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1831:5: ()
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1832:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1832:2: ( ( ruleOpMulti ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1833:1: ( ruleOpMulti )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1833:1: ( ruleOpMulti )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:1834:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred17_InternalCradle4375);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalCradle

    // $ANTLR start synpred18_InternalCradle
    public final void synpred18_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2064:3: ( ( () 'as' ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2064:4: ( () 'as' )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2064:4: ( () 'as' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2064:5: () 'as'
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2064:5: ()
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2065:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred18_InternalCradle4969); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalCradle

    // $ANTLR start synpred19_InternalCradle
    public final void synpred19_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2265:3: ( ( () '[' ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2265:4: ( () '[' )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2265:4: ( () '[' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2265:5: () '['
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2265:5: ()
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2266:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred19_InternalCradle5516); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalCradle

    // $ANTLR start synpred21_InternalCradle
    public final void synpred21_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2359:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2359:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2359:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2359:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2359:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt98=2;
        int LA98_0 = input.LA(1);

        if ( (LA98_0==RULE_ID||LA98_0==26||LA98_0==38) ) {
            alt98=1;
        }
        switch (alt98) {
            case 1 :
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2359:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2359:7: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2360:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2360:1: ( ruleJvmFormalParameter )
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2361:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred21_InternalCradle5795);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2363:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop97:
                do {
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==21) ) {
                        alt97=1;
                    }


                    switch (alt97) {
                	case 1 :
                	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2363:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,21,FOLLOW_21_in_synpred21_InternalCradle5802); if (state.failed) return ;
                	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2364:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2365:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2365:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2366:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred21_InternalCradle5809);
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

        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2368:6: ( ( '|' ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2369:1: ( '|' )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2369:1: ( '|' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2370:2: '|'
        {
        match(input,51,FOLLOW_51_in_synpred21_InternalCradle5823); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred21_InternalCradle

    // $ANTLR start synpred23_InternalCradle
    public final void synpred23_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2729:4: ( 'else' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2729:6: 'else'
        {
        match(input,55,FOLLOW_55_in_synpred23_InternalCradle6606); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalCradle

    // $ANTLR start synpred24_InternalCradle
    public final void synpred24_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2783:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2783:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2783:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2783:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2783:6: ( ( ruleValidID ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2784:1: ( ruleValidID )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2784:1: ( ruleValidID )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2785:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalCradle6748);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,57,FOLLOW_57_in_synpred24_InternalCradle6754); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalCradle

    // $ANTLR start synpred25_InternalCradle
    public final void synpred25_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2829:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2829:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2829:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2829:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,26,FOLLOW_26_in_synpred25_InternalCradle6830); if (state.failed) return ;
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2830:1: ( ( ruleValidID ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2831:1: ( ruleValidID )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2831:1: ( ruleValidID )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:2832:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalCradle6837);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,57,FOLLOW_57_in_synpred25_InternalCradle6843); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalCradle

    // $ANTLR start synpred26_InternalCradle
    public final void synpred26_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3413:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3413:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3413:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3413:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3413:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3414:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3414:1: ( ruleJvmTypeReference )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3415:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred26_InternalCradle8108);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3417:2: ( ( ruleValidID ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3418:1: ( ruleValidID )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3418:1: ( ruleValidID )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3419:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred26_InternalCradle8117);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred26_InternalCradle

    // $ANTLR start synpred27_InternalCradle
    public final void synpred27_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3717:4: ( ( '(' ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3718:1: ( '(' )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3718:1: ( '(' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3719:2: '('
        {
        match(input,26,FOLLOW_26_in_synpred27_InternalCradle8679); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred27_InternalCradle

    // $ANTLR start synpred28_InternalCradle
    public final void synpred28_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3738:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3738:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3738:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3738:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3738:6: ()
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3739:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3739:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt102=2;
        int LA102_0 = input.LA(1);

        if ( (LA102_0==RULE_ID||LA102_0==26||LA102_0==38) ) {
            alt102=1;
        }
        switch (alt102) {
            case 1 :
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3739:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3739:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3740:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3740:1: ( ruleJvmFormalParameter )
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3741:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred28_InternalCradle8731);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3743:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop101:
                do {
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==21) ) {
                        alt101=1;
                    }


                    switch (alt101) {
                	case 1 :
                	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3743:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,21,FOLLOW_21_in_synpred28_InternalCradle8738); if (state.failed) return ;
                	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3744:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3745:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3745:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3746:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred28_InternalCradle8745);
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

        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3748:6: ( ( '|' ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3749:1: ( '|' )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3749:1: ( '|' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3750:2: '|'
        {
        match(input,51,FOLLOW_51_in_synpred28_InternalCradle8759); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred28_InternalCradle

    // $ANTLR start synpred29_InternalCradle
    public final void synpred29_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3817:4: ( ( () '[' ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3817:5: ( () '[' )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3817:5: ( () '[' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3817:6: () '['
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3817:6: ()
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3818:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred29_InternalCradle8879); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred29_InternalCradle

    // $ANTLR start synpred30_InternalCradle
    public final void synpred30_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3960:4: ( '<' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:3960:6: '<'
        {
        match(input,24,FOLLOW_24_in_synpred30_InternalCradle9266); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalCradle

    // $ANTLR start synpred31_InternalCradle
    public final void synpred31_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4009:5: ( '(' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4009:7: '('
        {
        match(input,26,FOLLOW_26_in_synpred31_InternalCradle9359); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalCradle

    // $ANTLR start synpred32_InternalCradle
    public final void synpred32_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4014:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4014:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4014:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4014:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4014:6: ()
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4015:1: 
        {
        }

        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4015:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt104=2;
        int LA104_0 = input.LA(1);

        if ( (LA104_0==RULE_ID||LA104_0==26||LA104_0==38) ) {
            alt104=1;
        }
        switch (alt104) {
            case 1 :
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4015:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4015:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4016:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4016:1: ( ruleJvmFormalParameter )
                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4017:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred32_InternalCradle9389);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4019:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop103:
                do {
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==21) ) {
                        alt103=1;
                    }


                    switch (alt103) {
                	case 1 :
                	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4019:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,21,FOLLOW_21_in_synpred32_InternalCradle9396); if (state.failed) return ;
                	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4020:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4021:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4021:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4022:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred32_InternalCradle9403);
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

        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4024:6: ( ( '|' ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4025:1: ( '|' )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4025:1: ( '|' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4026:2: '|'
        {
        match(input,51,FOLLOW_51_in_synpred32_InternalCradle9417); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred32_InternalCradle

    // $ANTLR start synpred33_InternalCradle
    public final void synpred33_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4093:4: ( ( () '[' ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4093:5: ( () '[' )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4093:5: ( () '[' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4093:6: () '['
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4093:6: ()
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4094:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred33_InternalCradle9537); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalCradle

    // $ANTLR start synpred34_InternalCradle
    public final void synpred34_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4415:2: ( ( ruleXExpression ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4416:1: ( ruleXExpression )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4416:1: ( ruleXExpression )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4417:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred34_InternalCradle10339);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred34_InternalCradle

    // $ANTLR start synpred35_InternalCradle
    public final void synpred35_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4486:5: ( 'catch' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4486:7: 'catch'
        {
        match(input,78,FOLLOW_78_in_synpred35_InternalCradle10484); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalCradle

    // $ANTLR start synpred36_InternalCradle
    public final void synpred36_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4505:5: ( 'finally' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4505:7: 'finally'
        {
        match(input,77,FOLLOW_77_in_synpred36_InternalCradle10514); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalCradle

    // $ANTLR start synpred38_InternalCradle
    public final void synpred38_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4653:3: ( '.' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4654:2: '.'
        {
        match(input,15,FOLLOW_15_in_synpred38_InternalCradle10861); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_InternalCradle

    // $ANTLR start synpred39_InternalCradle
    public final void synpred39_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4777:2: ( ( () '[' ']' ) )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4777:3: ( () '[' ']' )
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4777:3: ( () '[' ']' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4777:4: () '[' ']'
        {
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4777:4: ()
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4778:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred39_InternalCradle11244); if (state.failed) return ;
        match(input,52,FOLLOW_52_in_synpred39_InternalCradle11248); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred39_InternalCradle

    // $ANTLR start synpred40_InternalCradle
    public final void synpred40_InternalCradle_fragment() throws RecognitionException {   
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4931:4: ( '<' )
        // ../org.xtext.cradle/src-gen/org/xtext/cradle/parser/antlr/internal/InternalCradle.g:4931:6: '<'
        {
        match(input,24,FOLLOW_24_in_synpred40_InternalCradle11608); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalCradle

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
    public final boolean synpred19_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalCradle_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalCradle_fragment(); // can never throw exception
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
    public final boolean synpred40_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalCradle_fragment(); // can never throw exception
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
    public final boolean synpred21_InternalCradle() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalCradle_fragment(); // can never throw exception
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


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA91 dfa91 = new DFA91(this);
    static final String DFA15_eotS =
        "\104\uffff";
    static final String DFA15_eofS =
        "\1\2\103\uffff";
    static final String DFA15_minS =
        "\1\4\1\0\102\uffff";
    static final String DFA15_maxS =
        "\1\116\1\0\102\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA15_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA15_transitionS = {
            "\6\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\5\2\1\1\30"+
            "\2\1\uffff\20\2\1\uffff\12\2",
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
            return "663:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA14_eotS =
        "\36\uffff";
    static final String DFA14_eofS =
        "\36\uffff";
    static final String DFA14_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA14_maxS =
        "\1\114\2\0\33\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA14_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\1\uffff\4\5\16\uffff\1\5\1\uffff\1\2\1\35\12\uffff\1\3"+
            "\3\uffff\2\5\4\uffff\1\5\1\uffff\1\5\1\4\2\uffff\1\5\1\uffff"+
            "\1\5\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "684:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                         
                        int index14_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_0==RULE_ID) ) {s = 1;}

                        else if ( (LA14_0==26) ) {s = 2;}

                        else if ( (LA14_0==38) && (synpred5_InternalCradle())) {s = 3;}

                        else if ( (LA14_0==51) && (synpred5_InternalCradle())) {s = 4;}

                        else if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_DECIMAL)||LA14_0==24||(LA14_0>=42 && LA14_0<=43)||LA14_0==48||LA14_0==50||LA14_0==54||LA14_0==56||LA14_0==58||(LA14_0>=62 && LA14_0<=64)||LA14_0==67||(LA14_0>=69 && LA14_0<=76)) ) {s = 5;}

                        else if ( (LA14_0==27) ) {s = 29;}

                         
                        input.seek(index14_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_1 = input.LA(1);

                         
                        int index14_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalCradle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index14_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalCradle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA16_eotS =
        "\104\uffff";
    static final String DFA16_eofS =
        "\1\2\103\uffff";
    static final String DFA16_minS =
        "\1\4\1\0\102\uffff";
    static final String DFA16_maxS =
        "\1\116\1\0\102\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA16_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA16_transitionS = {
            "\6\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\35\2\1\1\1"+
            "\uffff\20\2\1\uffff\12\2",
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
            return "763:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_1 = input.LA(1);

                         
                        int index16_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index16_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\13\uffff";
    static final String DFA26_eofS =
        "\1\1\12\uffff";
    static final String DFA26_minS =
        "\1\4\1\uffff\10\0\1\uffff";
    static final String DFA26_maxS =
        "\1\116\1\uffff\10\0\1\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA26_specialS =
        "\2\uffff\1\0\1\5\1\6\1\2\1\7\1\1\1\3\1\4\1\uffff}>";
    static final String[] DFA26_transitionS = {
            "\6\1\5\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\3\1\1\3\1\2"+
            "\12\1\1\4\1\5\1\6\1\7\1\10\1\11\11\1\1\uffff\20\1\1\uffff\12"+
            "\1",
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
            return "()* loopback of 1527:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_2 = input.LA(1);

                         
                        int index26_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalCradle()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_7 = input.LA(1);

                         
                        int index26_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalCradle()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_5 = input.LA(1);

                         
                        int index26_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalCradle()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_8 = input.LA(1);

                         
                        int index26_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalCradle()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA26_9 = input.LA(1);

                         
                        int index26_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalCradle()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA26_3 = input.LA(1);

                         
                        int index26_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalCradle()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA26_4 = input.LA(1);

                         
                        int index26_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalCradle()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_4);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA26_6 = input.LA(1);

                         
                        int index26_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalCradle()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_6);
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
    static final String DFA37_eotS =
        "\16\uffff";
    static final String DFA37_eofS =
        "\16\uffff";
    static final String DFA37_minS =
        "\1\4\15\uffff";
    static final String DFA37_maxS =
        "\1\114\15\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA37_specialS =
        "\16\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\4\1\uffff\4\5\16\uffff\1\4\1\uffff\1\15\27\uffff\1\5\3\uffff"+
            "\1\6\1\uffff\1\3\1\uffff\1\2\3\uffff\1\7\1\10\1\11\2\uffff\1"+
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
            return "2115:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA41_eotS =
        "\40\uffff";
    static final String DFA41_eofS =
        "\40\uffff";
    static final String DFA41_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA41_maxS =
        "\1\114\2\0\35\uffff";
    static final String DFA41_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA41_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\1\1\uffff\4\5\16\uffff\1\5\1\uffff\1\2\13\uffff\1\3\3\uffff"+
            "\2\5\4\uffff\1\5\1\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff\1\5"+
            "\1\uffff\1\5\3\uffff\6\5\1\uffff\10\5",
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
            return "2359:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
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

                        else if ( (LA41_0==26) ) {s = 2;}

                        else if ( (LA41_0==38) && (synpred21_InternalCradle())) {s = 3;}

                        else if ( (LA41_0==51) && (synpred21_InternalCradle())) {s = 4;}

                        else if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_DECIMAL)||LA41_0==24||(LA41_0>=42 && LA41_0<=43)||LA41_0==48||LA41_0==50||LA41_0==52||LA41_0==54||LA41_0==56||LA41_0==58||(LA41_0>=62 && LA41_0<=67)||(LA41_0>=69 && LA41_0<=76)) ) {s = 5;}

                         
                        input.seek(index41_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_1 = input.LA(1);

                         
                        int index41_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalCradle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index41_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA41_2 = input.LA(1);

                         
                        int index41_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalCradle()) ) {s = 4;}

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
        "\104\uffff";
    static final String DFA65_eofS =
        "\1\2\103\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\102\uffff";
    static final String DFA65_maxS =
        "\1\116\1\0\102\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA65_transitionS = {
            "\6\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\5\2\1\1\30"+
            "\2\1\uffff\20\2\1\uffff\12\2",
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
            return "3717:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred27_InternalCradle()) ) {s = 67;}

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
        "\36\uffff";
    static final String DFA64_eofS =
        "\36\uffff";
    static final String DFA64_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA64_maxS =
        "\1\114\2\0\33\uffff";
    static final String DFA64_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA64_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\1\1\uffff\4\5\16\uffff\1\5\1\uffff\1\2\1\35\12\uffff\1\3"+
            "\3\uffff\2\5\4\uffff\1\5\1\uffff\1\5\1\4\2\uffff\1\5\1\uffff"+
            "\1\5\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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
            return "3738:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA64_0==26) ) {s = 2;}

                        else if ( (LA64_0==38) && (synpred28_InternalCradle())) {s = 3;}

                        else if ( (LA64_0==51) && (synpred28_InternalCradle())) {s = 4;}

                        else if ( ((LA64_0>=RULE_STRING && LA64_0<=RULE_DECIMAL)||LA64_0==24||(LA64_0>=42 && LA64_0<=43)||LA64_0==48||LA64_0==50||LA64_0==54||LA64_0==56||LA64_0==58||(LA64_0>=62 && LA64_0<=64)||LA64_0==67||(LA64_0>=69 && LA64_0<=76)) ) {s = 5;}

                        else if ( (LA64_0==27) ) {s = 29;}

                         
                        input.seek(index64_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalCradle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalCradle()) ) {s = 4;}

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
        "\104\uffff";
    static final String DFA66_eofS =
        "\1\2\103\uffff";
    static final String DFA66_minS =
        "\1\4\1\0\102\uffff";
    static final String DFA66_maxS =
        "\1\116\1\0\102\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA66_transitionS = {
            "\6\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\35\2\1\1\1"+
            "\uffff\20\2\1\uffff\12\2",
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
            return "3817:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred29_InternalCradle()) ) {s = 67;}

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
        "\104\uffff";
    static final String DFA70_eofS =
        "\1\2\103\uffff";
    static final String DFA70_minS =
        "\1\4\1\0\102\uffff";
    static final String DFA70_maxS =
        "\1\116\1\0\102\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA70_transitionS = {
            "\6\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\3\2\1\1\32"+
            "\2\1\uffff\20\2\1\uffff\12\2",
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
            return "3960:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
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
                        if ( (synpred30_InternalCradle()) ) {s = 67;}

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
        "\104\uffff";
    static final String DFA73_eofS =
        "\1\2\103\uffff";
    static final String DFA73_minS =
        "\1\4\1\0\102\uffff";
    static final String DFA73_maxS =
        "\1\116\1\0\102\uffff";
    static final String DFA73_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA73_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA73_transitionS = {
            "\6\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\5\2\1\1\30"+
            "\2\1\uffff\20\2\1\uffff\12\2",
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
            return "4009:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred31_InternalCradle()) ) {s = 67;}

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
        "\36\uffff";
    static final String DFA72_eofS =
        "\36\uffff";
    static final String DFA72_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA72_maxS =
        "\1\114\2\0\33\uffff";
    static final String DFA72_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA72_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\1\1\uffff\4\5\16\uffff\1\5\1\uffff\1\2\1\35\12\uffff\1\3"+
            "\3\uffff\2\5\4\uffff\1\5\1\uffff\1\5\1\4\2\uffff\1\5\1\uffff"+
            "\1\5\1\uffff\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
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
            return "4014:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA72_0==26) ) {s = 2;}

                        else if ( (LA72_0==38) && (synpred32_InternalCradle())) {s = 3;}

                        else if ( (LA72_0==51) && (synpred32_InternalCradle())) {s = 4;}

                        else if ( ((LA72_0>=RULE_STRING && LA72_0<=RULE_DECIMAL)||LA72_0==24||(LA72_0>=42 && LA72_0<=43)||LA72_0==48||LA72_0==50||LA72_0==54||LA72_0==56||LA72_0==58||(LA72_0>=62 && LA72_0<=64)||LA72_0==67||(LA72_0>=69 && LA72_0<=76)) ) {s = 5;}

                        else if ( (LA72_0==27) ) {s = 29;}

                         
                        input.seek(index72_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCradle()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA72_2 = input.LA(1);

                         
                        int index72_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalCradle()) ) {s = 4;}

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
        "\104\uffff";
    static final String DFA74_eofS =
        "\1\2\103\uffff";
    static final String DFA74_minS =
        "\1\4\1\0\102\uffff";
    static final String DFA74_maxS =
        "\1\116\1\0\102\uffff";
    static final String DFA74_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA74_transitionS = {
            "\6\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\35\2\1\1\1"+
            "\uffff\20\2\1\uffff\12\2",
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
            return "4093:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred33_InternalCradle()) ) {s = 67;}

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
    static final String DFA76_eotS =
        "\104\uffff";
    static final String DFA76_eofS =
        "\1\33\103\uffff";
    static final String DFA76_minS =
        "\1\4\32\0\51\uffff";
    static final String DFA76_maxS =
        "\1\116\32\0\51\uffff";
    static final String DFA76_acceptS =
        "\33\uffff\1\2\47\uffff\1\1";
    static final String DFA76_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\51\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\1\1\33\1\21\1\15\1\16\1\17\5\uffff\1\33\1\uffff\1\33\1\uffff"+
            "\1\33\1\uffff\3\33\1\10\1\33\1\32\17\33\1\4\1\3\4\33\1\2\1\33"+
            "\1\12\1\uffff\2\33\1\23\1\33\1\7\1\33\1\6\3\33\1\24\1\25\1\26"+
            "\2\33\1\11\1\uffff\1\5\1\13\1\14\1\20\1\22\1\27\1\30\1\31\2"+
            "\33",
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
            return "4415:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA76_2 = input.LA(1);

                         
                        int index76_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA76_3 = input.LA(1);

                         
                        int index76_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA76_4 = input.LA(1);

                         
                        int index76_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA76_5 = input.LA(1);

                         
                        int index76_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA76_6 = input.LA(1);

                         
                        int index76_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA76_7 = input.LA(1);

                         
                        int index76_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA76_8 = input.LA(1);

                         
                        int index76_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA76_9 = input.LA(1);

                         
                        int index76_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA76_10 = input.LA(1);

                         
                        int index76_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA76_11 = input.LA(1);

                         
                        int index76_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA76_12 = input.LA(1);

                         
                        int index76_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA76_13 = input.LA(1);

                         
                        int index76_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA76_14 = input.LA(1);

                         
                        int index76_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA76_15 = input.LA(1);

                         
                        int index76_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA76_16 = input.LA(1);

                         
                        int index76_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA76_17 = input.LA(1);

                         
                        int index76_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA76_18 = input.LA(1);

                         
                        int index76_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA76_19 = input.LA(1);

                         
                        int index76_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA76_20 = input.LA(1);

                         
                        int index76_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA76_21 = input.LA(1);

                         
                        int index76_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA76_22 = input.LA(1);

                         
                        int index76_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA76_23 = input.LA(1);

                         
                        int index76_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA76_24 = input.LA(1);

                         
                        int index76_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA76_25 = input.LA(1);

                         
                        int index76_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA76_26 = input.LA(1);

                         
                        int index76_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_26);
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
    static final String DFA91_eotS =
        "\104\uffff";
    static final String DFA91_eofS =
        "\1\2\103\uffff";
    static final String DFA91_minS =
        "\1\4\1\0\102\uffff";
    static final String DFA91_maxS =
        "\1\116\1\0\102\uffff";
    static final String DFA91_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA91_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA91_transitionS = {
            "\6\2\5\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\3\2\1\1\32"+
            "\2\1\uffff\20\2\1\uffff\12\2",
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
            ""
    };

    static final short[] DFA91_eot = DFA.unpackEncodedString(DFA91_eotS);
    static final short[] DFA91_eof = DFA.unpackEncodedString(DFA91_eofS);
    static final char[] DFA91_min = DFA.unpackEncodedStringToUnsignedChars(DFA91_minS);
    static final char[] DFA91_max = DFA.unpackEncodedStringToUnsignedChars(DFA91_maxS);
    static final short[] DFA91_accept = DFA.unpackEncodedString(DFA91_acceptS);
    static final short[] DFA91_special = DFA.unpackEncodedString(DFA91_specialS);
    static final short[][] DFA91_transition;

    static {
        int numStates = DFA91_transitionS.length;
        DFA91_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA91_transition[i] = DFA.unpackEncodedString(DFA91_transitionS[i]);
        }
    }

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = DFA91_eot;
            this.eof = DFA91_eof;
            this.min = DFA91_min;
            this.max = DFA91_max;
            this.accept = DFA91_accept;
            this.special = DFA91_special;
            this.transition = DFA91_transition;
        }
        public String getDescription() {
            return "4931:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA91_1 = input.LA(1);

                         
                        int index91_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalCradle()) ) {s = 67;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index91_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 91, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleCradleFile_in_entryRuleCradleFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCradleFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_ruleCradleFile131 = new BitSet(new long[]{0x00000000000A4002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleCradleFile153 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDeclaration200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImportDeclaration237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImportDeclaration258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedNameWithWildCard346 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNameWithWildCard365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedNameWithWildCard380 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedNameWithWildCard401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_ruleDeclaration500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDeclaration527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleParameter609 = new BitSet(new long[]{0x0000004004000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleParameter630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleParameter652 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleParameter665 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleParameter686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTask771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleTask792 = new BitSet(new long[]{0x0400000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTask805 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask825 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTask838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask858 = new BitSet(new long[]{0x0400000000200000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleTask883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall976 = new BitSet(new long[]{0x0000000000C08022L});
    public static final BitSet FOLLOW_15_in_ruleXMemberFeatureCall1025 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall1048 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall1064 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall1086 = new BitSet(new long[]{0x0000000000C08022L});
    public static final BitSet FOLLOW_ruleNavigationLiteral_in_ruleXMemberFeatureCall1142 = new BitSet(new long[]{0x0000000000C08022L});
    public static final BitSet FOLLOW_15_in_ruleXMemberFeatureCall1229 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_22_in_ruleXMemberFeatureCall1253 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_23_in_ruleXMemberFeatureCall1290 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleXMemberFeatureCall1319 = new BitSet(new long[]{0x0000004004000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall1340 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleXMemberFeatureCall1353 = new BitSet(new long[]{0x0000004004000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall1374 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25_in_ruleXMemberFeatureCall1388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall1413 = new BitSet(new long[]{0x0004000004C08022L});
    public static final BitSet FOLLOW_26_in_ruleXMemberFeatureCall1447 = new BitSet(new long[]{0xC54D0C400D0003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall1532 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall1560 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_21_in_ruleXMemberFeatureCall1573 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall1594 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall1611 = new BitSet(new long[]{0x0004000000C08022L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall1646 = new BitSet(new long[]{0x0000000000C08022L});
    public static final BitSet FOLLOW_ruleNavigationLiteral_in_entryRuleNavigationLiteral1686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavigationLiteral1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FILE_in_ruleNavigationLiteral1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1946 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1962 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment2012 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2065 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpSingleAssign2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpMultiAssign2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2360 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression2413 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2436 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOr2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2619 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2672 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2695 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpAnd2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2878 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2931 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2954 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpEquality3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpEquality3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3158 = new BitSet(new long[]{0x0000000E03000002L});
    public static final BitSet FOLLOW_33_in_ruleXRelationalExpression3194 = new BitSet(new long[]{0x0000004004000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression3217 = new BitSet(new long[]{0x0000000E03000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3278 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3301 = new BitSet(new long[]{0x0000000E03000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare3341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpCompare3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpCompare3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpCompare3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3544 = new BitSet(new long[]{0x000003F003000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3597 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3620 = new BitSet(new long[]{0x000003F003000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpOther3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpOther3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpOther3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOther3766 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOpOther3797 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOpOther3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOther3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpOther3853 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOpOther3884 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOpOther3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpOther3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpOther3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpOther3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpOther3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4074 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4127 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4150 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd4189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpAdd4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpAdd4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4354 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4407 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4430 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti4469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpMulti4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpMulti4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpMulti4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpMulti4575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation4625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4683 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOpUnary4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpUnary4837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpUnary4856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4953 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXCastedExpression4988 = new BitSet(new long[]{0x0000004004000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5011 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXClosure5776 = new BitSet(new long[]{0xC55D0C40050003D0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5849 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXClosure5862 = new BitSet(new long[]{0x0000004004000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5883 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_51_in_ruleXClosure5905 = new BitSet(new long[]{0xC5550C00050003D0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5942 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXClosure5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure6000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6056 = new BitSet(new long[]{0xC5650C00050003D2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_53_in_ruleXExpressionInClosure6069 = new BitSet(new long[]{0xC5450C00050003D2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6227 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXShortClosure6240 = new BitSet(new long[]{0x0000004004000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6261 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_51_in_ruleXShortClosure6283 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleXParenthesizedExpression6402 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6424 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXParenthesizedExpression6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXIfExpression6527 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXIfExpression6539 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6560 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXIfExpression6572 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6593 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXIfExpression6614 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6730 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6773 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6785 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6809 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_26_in_ruleXSwitchExpression6853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6874 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6886 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6909 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXSwitchExpression6921 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXSwitchExpression6935 = new BitSet(new long[]{0x2200004004000010L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6956 = new BitSet(new long[]{0x3A00004004000010L});
    public static final BitSet FOLLOW_59_in_ruleXSwitchExpression6970 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6982 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7003 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXSwitchExpression7017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7109 = new BitSet(new long[]{0x2200000000000000L});
    public static final BitSet FOLLOW_61_in_ruleXCasePart7123 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7144 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXCasePart7158 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXForLoopExpression7271 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXForLoopExpression7283 = new BitSet(new long[]{0x0000004004000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7304 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXForLoopExpression7316 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7337 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXForLoopExpression7349 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXWhileExpression7462 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXWhileExpression7474 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7495 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXWhileExpression7507 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXDoWhileExpression7620 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7641 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleXDoWhileExpression7653 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXDoWhileExpression7665 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7686 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXDoWhileExpression7698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXBlockExpression7790 = new BitSet(new long[]{0xD5450C00050003D0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7812 = new BitSet(new long[]{0xD5650C00050003D0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_53_in_ruleXBlockExpression7825 = new BitSet(new long[]{0xD5450C00050003D0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_60_in_ruleXBlockExpression7841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXVariableDeclaration8059 = new BitSet(new long[]{0x0000004004000010L});
    public static final BitSet FOLLOW_66_in_ruleXVariableDeclaration8090 = new BitSet(new long[]{0x0000004004000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8138 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8159 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8188 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleXVariableDeclaration8202 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8555 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_24_in_ruleXFeatureCall8569 = new BitSet(new long[]{0x0000004004000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8590 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleXFeatureCall8603 = new BitSet(new long[]{0x0000004004000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8624 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25_in_ruleXFeatureCall8638 = new BitSet(new long[]{0x0000000001000010L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8663 = new BitSet(new long[]{0x0004000004000002L});
    public static final BitSet FOLLOW_26_in_ruleXFeatureCall8697 = new BitSet(new long[]{0xC54D0C400D0003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8782 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8810 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_21_in_ruleXFeatureCall8823 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8844 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_27_in_ruleXFeatureCall8861 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleIdOrSuper9016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier9068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier9115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleStaticQualifier9133 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXConstructorCall9230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9253 = new BitSet(new long[]{0x0004000005000002L});
    public static final BitSet FOLLOW_24_in_ruleXConstructorCall9274 = new BitSet(new long[]{0x0000004004000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9296 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleXConstructorCall9309 = new BitSet(new long[]{0x0000004004000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9330 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25_in_ruleXConstructorCall9344 = new BitSet(new long[]{0x0004000004000002L});
    public static final BitSet FOLLOW_26_in_ruleXConstructorCall9367 = new BitSet(new long[]{0xC54D0C400D0003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9440 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9468 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_21_in_ruleXConstructorCall9481 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9502 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_27_in_ruleXConstructorCall9519 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXBooleanLiteral9648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXBooleanLiteral9672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXNullLiteral9778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral10027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXTypeLiteral10073 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXTypeLiteral10085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10108 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXTypeLiteral10120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXThrowExpression10212 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXReturnExpression10325 = new BitSet(new long[]{0xC5450C00050003D2L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXTryCatchFinallyExpression10449 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10500 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_77_in_ruleXTryCatchFinallyExpression10522 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXTryCatchFinallyExpression10566 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleXCatchClause10680 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXCatchClause10693 = new BitSet(new long[]{0x0000004004000010L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10714 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXCatchClause10726 = new BitSet(new long[]{0xC5450C00050003D0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10842 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedName10870 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10893 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber11002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11030 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11056 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleNumber11076 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference11181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11229 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleJvmTypeReference11267 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleJvmTypeReference11279 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleXFunctionTypeRef11394 = new BitSet(new long[]{0x000000400C000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11416 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_21_in_ruleXFunctionTypeRef11429 = new BitSet(new long[]{0x0000004004000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11450 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_27_in_ruleXFunctionTypeRef11466 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleXFunctionTypeRef11480 = new BitSet(new long[]{0x0000004004000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11595 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleJvmParameterizedTypeReference11616 = new BitSet(new long[]{0x0000004004000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11638 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleJvmParameterizedTypeReference11651 = new BitSet(new long[]{0x0000004004000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11672 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25_in_ruleJvmParameterizedTypeReference11686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleJvmWildcardTypeReference11899 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010008L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleJvmUpperBound12033 = new BitSet(new long[]{0x0000004004000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleJvmUpperBoundAnded12137 = new BitSet(new long[]{0x0000004004000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleJvmLowerBound12241 = new BitSet(new long[]{0x0000004004000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred1_InternalCradle993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred1_InternalCradle1002 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred1_InternalCradle1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationLiteral_in_synpred2_InternalCradle1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred3_InternalCradle1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred3_InternalCradle1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred3_InternalCradle1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred4_InternalCradle1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred5_InternalCradle1481 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_21_in_synpred5_InternalCradle1488 = new BitSet(new long[]{0x0000004004000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred5_InternalCradle1495 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_51_in_synpred5_InternalCradle1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred6_InternalCradle1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred7_InternalCradle2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred8_InternalCradle2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred9_InternalCradle2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred10_InternalCradle2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred11_InternalCradle3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred12_InternalCradle3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred13_InternalCradle3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred14_InternalCradle3781 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_synpred14_InternalCradle3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred15_InternalCradle3868 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_synpred15_InternalCradle3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred16_InternalCradle4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred17_InternalCradle4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred18_InternalCradle4969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred19_InternalCradle5516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred21_InternalCradle5795 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_21_in_synpred21_InternalCradle5802 = new BitSet(new long[]{0x0000004004000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred21_InternalCradle5809 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_51_in_synpred21_InternalCradle5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred23_InternalCradle6606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalCradle6748 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred24_InternalCradle6754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred25_InternalCradle6830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalCradle6837 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred25_InternalCradle6843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred26_InternalCradle8108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred26_InternalCradle8117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred27_InternalCradle8679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred28_InternalCradle8731 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_21_in_synpred28_InternalCradle8738 = new BitSet(new long[]{0x0000004004000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred28_InternalCradle8745 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_51_in_synpred28_InternalCradle8759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred29_InternalCradle8879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred30_InternalCradle9266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred31_InternalCradle9359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred32_InternalCradle9389 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_21_in_synpred32_InternalCradle9396 = new BitSet(new long[]{0x0000004004000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred32_InternalCradle9403 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_51_in_synpred32_InternalCradle9417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred33_InternalCradle9537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred34_InternalCradle10339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_synpred35_InternalCradle10484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred36_InternalCradle10514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred38_InternalCradle10861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred39_InternalCradle11244 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred39_InternalCradle11248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred40_InternalCradle11608 = new BitSet(new long[]{0x0000000000000002L});

}