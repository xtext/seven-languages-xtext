package org.xtext.builddsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.builddsl.services.BuildDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBuildDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'.*'", "'param'", "'='", "'task'", "'dependsOn'", "','", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
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


        public InternalBuildDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBuildDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBuildDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g"; }



     	private BuildDSLGrammarAccess grammarAccess;
     	
        public InternalBuildDSLParser(TokenStream input, BuildDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "BuildFile";	
       	}
       	
       	@Override
       	protected BuildDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleBuildFile"
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:67:1: entryRuleBuildFile returns [EObject current=null] : iv_ruleBuildFile= ruleBuildFile EOF ;
    public final EObject entryRuleBuildFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildFile = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:68:2: (iv_ruleBuildFile= ruleBuildFile EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:69:2: iv_ruleBuildFile= ruleBuildFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuildFileRule()); 
            }
            pushFollow(FOLLOW_ruleBuildFile_in_entryRuleBuildFile75);
            iv_ruleBuildFile=ruleBuildFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuildFile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuildFile85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBuildFile"


    // $ANTLR start "ruleBuildFile"
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:76:1: ruleBuildFile returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImportDeclaration ) )* ( (lv_declarations_3_0= ruleDeclaration ) )* ) ;
    public final EObject ruleBuildFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_declarations_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:79:28: ( ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImportDeclaration ) )* ( (lv_declarations_3_0= ruleDeclaration ) )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:80:1: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImportDeclaration ) )* ( (lv_declarations_3_0= ruleDeclaration ) )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:80:1: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImportDeclaration ) )* ( (lv_declarations_3_0= ruleDeclaration ) )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:80:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImportDeclaration ) )* ( (lv_declarations_3_0= ruleDeclaration ) )*
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:80:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:80:4: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleBuildFile123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getBuildFileAccess().getPackageKeyword_0_0());
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:85:1: (lv_name_1_0= ruleQualifiedName )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:85:1: (lv_name_1_0= ruleQualifiedName )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:86:3: lv_name_1_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBuildFileAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleBuildFile144);
                    lv_name_1_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBuildFileRule());
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


                    }
                    break;

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:102:4: ( (lv_imports_2_0= ruleImportDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:103:1: (lv_imports_2_0= ruleImportDeclaration )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:103:1: (lv_imports_2_0= ruleImportDeclaration )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:104:3: lv_imports_2_0= ruleImportDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBuildFileAccess().getImportsImportDeclarationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportDeclaration_in_ruleBuildFile167);
            	    lv_imports_2_0=ruleImportDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBuildFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_2_0, 
            	              		"ImportDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:120:3: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:121:1: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:121:1: (lv_declarations_3_0= ruleDeclaration )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:122:3: lv_declarations_3_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBuildFileAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleBuildFile189);
            	    lv_declarations_3_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBuildFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_3_0, 
            	              		"Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleBuildFile"


    // $ANTLR start "entryRuleImportDeclaration"
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:146:1: entryRuleImportDeclaration returns [EObject current=null] : iv_ruleImportDeclaration= ruleImportDeclaration EOF ;
    public final EObject entryRuleImportDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDeclaration = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:147:2: (iv_ruleImportDeclaration= ruleImportDeclaration EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:148:2: iv_ruleImportDeclaration= ruleImportDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration226);
            iv_ruleImportDeclaration=ruleImportDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDeclaration236); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:155:1: ruleImportDeclaration returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImportDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:158:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:159:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:159:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:159:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImportDeclaration273); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportDeclarationAccess().getImportKeyword_0());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:163:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:164:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:164:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:165:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImportDeclaration294);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:189:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:190:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:191:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard331);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard342); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:198:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:201:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:202:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:202:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:203:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard389);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:213:1: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:214:2: kw= '.*'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNameWithWildCard408); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
                          
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:227:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:228:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:229:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration450);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration460); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:236:1: ruleDeclaration returns [EObject current=null] : (this_Task_0= ruleTask | this_Parameter_1= ruleParameter ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Task_0 = null;

        EObject this_Parameter_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:239:28: ( (this_Task_0= ruleTask | this_Parameter_1= ruleParameter ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:240:1: (this_Task_0= ruleTask | this_Parameter_1= ruleParameter )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:240:1: (this_Task_0= ruleTask | this_Parameter_1= ruleParameter )
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:241:5: this_Task_0= ruleTask
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getTaskParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTask_in_ruleDeclaration507);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:251:5: this_Parameter_1= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getParameterParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleDeclaration534);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:267:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:268:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:269:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter569);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter579); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:276:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'param' ( (lv_type_1_0= ruleJvmTypeReference ) )? ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_init_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:279:28: ( (otherlv_0= 'param' ( (lv_type_1_0= ruleJvmTypeReference ) )? ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:280:1: (otherlv_0= 'param' ( (lv_type_1_0= ruleJvmTypeReference ) )? ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:280:1: (otherlv_0= 'param' ( (lv_type_1_0= ruleJvmTypeReference ) )? ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )? )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:280:3: otherlv_0= 'param' ( (lv_type_1_0= ruleJvmTypeReference ) )? ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleParameter616); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParamKeyword_0());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:284:1: ( (lv_type_1_0= ruleJvmTypeReference ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID||LA6_1==30||LA6_1==45||LA6_1==50) ) {
                    alt6=1;
                }
            }
            else if ( (LA6_0==33||LA6_0==48) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:285:1: (lv_type_1_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:285:1: (lv_type_1_0= ruleJvmTypeReference )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:286:3: lv_type_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getTypeJvmTypeReferenceParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleParameter637);
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:302:3: ( (lv_name_2_0= ruleValidID ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:303:1: (lv_name_2_0= ruleValidID )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:303:1: (lv_name_2_0= ruleValidID )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:304:3: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getNameValidIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleParameter659);
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:320:2: (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:320:4: otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleParameter672); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:324:1: ( (lv_init_4_0= ruleXExpression ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:325:1: (lv_init_4_0= ruleXExpression )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:325:1: (lv_init_4_0= ruleXExpression )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:326:3: lv_init_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getInitXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleParameter693);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:350:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:351:2: (iv_ruleTask= ruleTask EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:352:2: iv_ruleTask= ruleTask EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTaskRule()); 
            }
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask731);
            iv_ruleTask=ruleTask();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTask; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask741); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:359:1: ruleTask returns [EObject current=null] : (otherlv_0= 'task' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'dependsOn' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_action_6_0= ruleXBlockExpression ) ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_action_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:362:28: ( (otherlv_0= 'task' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'dependsOn' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_action_6_0= ruleXBlockExpression ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:363:1: (otherlv_0= 'task' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'dependsOn' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_action_6_0= ruleXBlockExpression ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:363:1: (otherlv_0= 'task' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'dependsOn' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_action_6_0= ruleXBlockExpression ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:363:3: otherlv_0= 'task' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'dependsOn' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? ( (lv_action_6_0= ruleXBlockExpression ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleTask778); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:367:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:368:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:368:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:369:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTaskAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleTask799);
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:385:2: (otherlv_2= 'dependsOn' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:385:4: otherlv_2= 'dependsOn' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleTask812); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getDependsOnKeyword_2_0());
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:389:1: ( ( ruleQualifiedName ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:390:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:390:1: ( ruleQualifiedName )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:391:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTaskRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTaskAccess().getDependsOnTaskCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTask835);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:404:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==20) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:404:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleTask848); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:408:1: ( ( ruleQualifiedName ) )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:409:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:409:1: ( ruleQualifiedName )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:410:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTaskRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTaskAccess().getDependsOnTaskCrossReference_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTask871);
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

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:423:6: ( (lv_action_6_0= ruleXBlockExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:424:1: (lv_action_6_0= ruleXBlockExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:424:1: (lv_action_6_0= ruleXBlockExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:425:3: lv_action_6_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTaskAccess().getActionXBlockExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleTask896);
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


    // $ANTLR start "entryRuleXExpression"
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:449:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:450:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:451:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression932);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression942); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:458:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:461:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:463:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression988);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:479:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:480:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:481:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1022);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1032); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:488:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:491:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:492:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:492:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==EOF||(LA11_1>=RULE_STRING && LA11_1<=RULE_ID)||LA11_1==16||LA11_1==18||(LA11_1>=20 && LA11_1<=50)||(LA11_1>=52 && LA11_1<=78)) ) {
                    alt11=2;
                }
                else if ( (LA11_1==17) ) {
                    alt11=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_DECIMAL)||LA11_0==30||(LA11_0>=37 && LA11_0<=38)||LA11_0==43||LA11_0==48||LA11_0==50||LA11_0==54||LA11_0==56||LA11_0==58||(LA11_0>=62 && LA11_0<=64)||LA11_0==67||(LA11_0>=69 && LA11_0<=76)) ) {
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:492:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:492:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:492:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:492:3: ()
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:493:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:498:2: ( ( ruleValidID ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:499:1: ( ruleValidID )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:499:1: ( ruleValidID )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:500:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1090);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1106);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:521:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:522:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:522:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:523:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1126);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:540:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:540:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:541:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1156);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:549:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==21) ) {
                        int LA10_1 = input.LA(2);

                        if ( (synpred1_InternalBuildDSL()) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:549:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:549:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:549:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:554:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:554:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:554:7: ()
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:555:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:560:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:561:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:561:1: ( ruleOpMultiAssign )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:562:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1209);
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

                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:575:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:576:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:576:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:577:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1232);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:601:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:602:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:603:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1272);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1283); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:610:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:613:28: (kw= '=' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:615:2: kw= '='
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleOpSingleAssign1320); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:628:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:629:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:630:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1360);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1371); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:637:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:640:28: (kw= '+=' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:642:2: kw= '+='
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleOpMultiAssign1408); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:655:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:656:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:657:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1447);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1457); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:664:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:667:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:668:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:668:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:669:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1504);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:677:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred2_InternalBuildDSL()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:677:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:677:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:677:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:682:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:682:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:682:7: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:683:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:688:2: ( ( ruleOpOr ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:689:1: ( ruleOpOr )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:689:1: ( ruleOpOr )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:690:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1557);
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

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:703:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:704:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:704:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:705:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1580);
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:729:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:730:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:731:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1619);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1630); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:738:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:741:28: (kw= '||' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:743:2: kw= '||'
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleOpOr1667); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:756:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:757:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:758:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1706);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1716); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:765:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:768:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:769:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:769:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:770:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1763);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:778:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred3_InternalBuildDSL()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:778:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:778:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:778:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:783:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:783:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:783:7: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:784:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:789:2: ( ( ruleOpAnd ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:790:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:790:1: ( ruleOpAnd )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:791:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1816);
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

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:804:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:805:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:805:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:806:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1839);
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:830:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:831:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:832:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1878);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1889); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:839:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:842:28: (kw= '&&' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:844:2: kw= '&&'
            {
            kw=(Token)match(input,23,FOLLOW_23_in_ruleOpAnd1926); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:857:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:858:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:859:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1965);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1975); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:866:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:869:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:870:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:870:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:871:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2022);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:879:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred4_InternalBuildDSL()) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==25) ) {
                    int LA14_3 = input.LA(2);

                    if ( (synpred4_InternalBuildDSL()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:879:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:879:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:879:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:884:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:884:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:884:7: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:885:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:890:2: ( ( ruleOpEquality ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:891:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:891:1: ( ruleOpEquality )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:892:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2075);
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

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:905:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:906:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:906:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:907:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2098);
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:931:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:932:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:933:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2137);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2148); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:940:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:943:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:944:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:944:1: (kw= '==' | kw= '!=' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            else if ( (LA15_0==25) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:945:2: kw= '=='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpEquality2186); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:952:2: kw= '!='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpEquality2205); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:965:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:966:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:967:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2245);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2255); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:974:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:977:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:978:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:978:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:979:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2302);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:987:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop16:
            do {
                int alt16=3;
                switch ( input.LA(1) ) {
                case 29:
                    {
                    int LA16_2 = input.LA(2);

                    if ( (synpred6_InternalBuildDSL()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (synpred6_InternalBuildDSL()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA16_4 = input.LA(2);

                    if ( (synpred5_InternalBuildDSL()) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA16_5 = input.LA(2);

                    if ( (synpred6_InternalBuildDSL()) ) {
                        alt16=2;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA16_6 = input.LA(2);

                    if ( (synpred6_InternalBuildDSL()) ) {
                        alt16=2;
                    }


                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:987:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:987:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:987:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:987:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:987:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:989:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:989:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:989:6: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:990:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleXRelationalExpression2338); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:999:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1000:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1000:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1001:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2361);
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
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1018:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1018:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1018:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1018:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1018:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1023:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1023:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1023:7: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1024:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1029:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1030:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1030:1: ( ruleOpCompare )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1031:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2422);
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

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1044:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1045:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1045:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1046:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2445);
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1070:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1071:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1072:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2485);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2496); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1079:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1082:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1083:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1083:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt17=1;
                }
                break;
            case 28:
                {
                alt17=2;
                }
                break;
            case 29:
                {
                alt17=3;
                }
                break;
            case 30:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1084:2: kw= '>='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2534); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1091:2: kw= '<='
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpCompare2553); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1098:2: kw= '>'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpCompare2572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1105:2: kw= '<'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpCompare2591); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1118:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1119:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1120:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2631);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2641); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1127:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1130:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1131:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1131:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1132:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2688);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1140:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1140:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1140:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1140:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1145:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1145:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1145:7: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1146:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1151:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1152:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1152:1: ( ruleOpOther )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1153:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2741);
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

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1166:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1167:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1167:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1168:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2764);
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1192:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1193:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1194:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2803);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2814); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1201:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1204:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1205:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1205:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt21=8;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt21=1;
                }
                break;
            case 32:
                {
                alt21=2;
                }
                break;
            case 33:
                {
                alt21=3;
                }
                break;
            case 29:
                {
                alt21=4;
                }
                break;
            case 30:
                {
                alt21=5;
                }
                break;
            case 34:
                {
                alt21=6;
                }
                break;
            case 35:
                {
                alt21=7;
                }
                break;
            case 36:
                {
                alt21=8;
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1206:2: kw= '->'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2852); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1213:2: kw= '..'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2871); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1220:2: kw= '=>'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2890); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1226:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1226:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1227:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1232:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==29) ) {
                        int LA19_1 = input.LA(2);

                        if ( (LA19_1==EOF||(LA19_1>=RULE_STRING && LA19_1<=RULE_ID)||LA19_1==30||(LA19_1>=37 && LA19_1<=38)||LA19_1==43||LA19_1==48||LA19_1==50||LA19_1==54||LA19_1==56||LA19_1==58||(LA19_1>=62 && LA19_1<=64)||LA19_1==67||(LA19_1>=69 && LA19_1<=76)) ) {
                            alt19=2;
                        }
                        else if ( (LA19_1==29) && (synpred8_InternalBuildDSL())) {
                            alt19=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1232:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1232:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1232:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1236:5: (kw= '>' kw= '>' )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1237:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2941); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2954); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1250:2: kw= '>'
                            {
                            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2975); if (state.failed) return current;
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1256:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1256:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1257:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2997); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1262:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==30) ) {
                        int LA20_1 = input.LA(2);

                        if ( (synpred9_InternalBuildDSL()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1262:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1262:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1262:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1266:5: (kw= '<' kw= '<' )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1267:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther3028); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther3041); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1280:2: kw= '<'
                            {
                            kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther3062); if (state.failed) return current;
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1287:2: kw= '<>'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpOther3083); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1294:2: kw= '?:'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpOther3102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1301:2: kw= '<=>'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOther3121); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1314:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1315:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1316:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3161);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression3171); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1323:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1326:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1327:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1327:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1328:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3218);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1336:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred10_InternalBuildDSL()) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==38) ) {
                    int LA22_3 = input.LA(2);

                    if ( (synpred10_InternalBuildDSL()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1336:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1336:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1336:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1341:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1341:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1341:7: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1342:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1347:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1348:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1348:1: ( ruleOpAdd )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1349:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3271);
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

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1362:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1363:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1363:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1364:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3294);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1388:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1389:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1390:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3333);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3344); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1397:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1400:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1401:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1401:1: (kw= '+' | kw= '-' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            else if ( (LA23_0==38) ) {
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1402:2: kw= '+'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpAdd3382); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1409:2: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpAdd3401); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1422:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1423:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1424:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3441);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3451); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1431:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1434:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1435:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1435:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1436:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3498);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1444:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    int LA24_2 = input.LA(2);

                    if ( (synpred11_InternalBuildDSL()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA24_3 = input.LA(2);

                    if ( (synpred11_InternalBuildDSL()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA24_4 = input.LA(2);

                    if ( (synpred11_InternalBuildDSL()) ) {
                        alt24=1;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA24_5 = input.LA(2);

                    if ( (synpred11_InternalBuildDSL()) ) {
                        alt24=1;
                    }


                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1444:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1444:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1444:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1449:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1449:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1449:7: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1450:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1455:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1456:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1456:1: ( ruleOpMulti )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1457:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3551);
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

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1470:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1471:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1471:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1472:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3574);
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1496:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1497:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1498:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3613);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3624); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1505:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1508:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1509:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1509:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt25=1;
                }
                break;
            case 40:
                {
                alt25=2;
                }
                break;
            case 41:
                {
                alt25=3;
                }
                break;
            case 42:
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1510:2: kw= '*'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpMulti3662); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1517:2: kw= '**'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpMulti3681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1524:2: kw= '/'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpMulti3700); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1531:2: kw= '%'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpMulti3719); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1544:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1545:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1546:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3759);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3769); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1553:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1556:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1557:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1557:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=37 && LA26_0<=38)||LA26_0==43) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)||LA26_0==30||LA26_0==48||LA26_0==50||LA26_0==54||LA26_0==56||LA26_0==58||(LA26_0>=62 && LA26_0<=64)||LA26_0==67||(LA26_0>=69 && LA26_0<=76)) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1557:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1557:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1557:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1557:3: ()
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1558:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1563:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1564:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1564:1: ( ruleOpUnary )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1565:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3827);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1578:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1579:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1579:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1580:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3848);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1598:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3877);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1614:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1615:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1616:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3913);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3924); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1623:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1626:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1627:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1627:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt27=1;
                }
                break;
            case 38:
                {
                alt27=2;
                }
                break;
            case 37:
                {
                alt27=3;
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1628:2: kw= '!'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpUnary3962); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1635:2: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpUnary3981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1642:2: kw= '+'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpUnary4000); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1655:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1656:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1657:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4040);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4050); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1664:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1667:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1668:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1668:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1669:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4097);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1677:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==44) ) {
                    int LA28_2 = input.LA(2);

                    if ( (synpred12_InternalBuildDSL()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1677:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1677:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1677:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1679:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1679:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1679:6: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1680:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXCastedExpression4132); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1689:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1690:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1690:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1691:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4155);
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
            	    break loop28;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1715:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1716:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1717:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4193);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4203); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1724:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1727:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1728:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1728:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1729:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4250);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1737:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop36:
            do {
                int alt36=3;
                switch ( input.LA(1) ) {
                case 45:
                    {
                    int LA36_2 = input.LA(2);

                    if ( (synpred13_InternalBuildDSL()) ) {
                        alt36=1;
                    }
                    else if ( (synpred14_InternalBuildDSL()) ) {
                        alt36=2;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA36_3 = input.LA(2);

                    if ( (synpred14_InternalBuildDSL()) ) {
                        alt36=2;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA36_4 = input.LA(2);

                    if ( (synpred14_InternalBuildDSL()) ) {
                        alt36=2;
                    }


                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1737:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1737:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1737:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1737:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1737:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1743:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1743:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1743:26: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1744:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4299); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1753:1: ( ( ruleValidID ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1754:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1754:1: ( ruleValidID )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1755:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4322);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4338);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1776:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1777:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1777:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1778:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4360);
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
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1795:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1795:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1795:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1795:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1795:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1811:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1811:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1811:8: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1812:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1817:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case 45:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 47:
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
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1817:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4446); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1822:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1822:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1823:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1823:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1824:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall4470); if (state.failed) return current;
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
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1838:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1838:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1839:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1839:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1840:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall4507); if (state.failed) return current;
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

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1853:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==30) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1853:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleXMemberFeatureCall4536); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1857:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1858:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1858:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1859:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4557);
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

            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1875:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop30:
            	            do {
            	                int alt30=2;
            	                int LA30_0 = input.LA(1);

            	                if ( (LA30_0==20) ) {
            	                    alt30=1;
            	                }


            	                switch (alt30) {
            	            	case 1 :
            	            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1875:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleXMemberFeatureCall4570); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1879:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1880:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1880:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1881:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4591);
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
            	            	    break loop30;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,29,FOLLOW_29_in_ruleXMemberFeatureCall4605); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1901:3: ( ( ruleValidID ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1902:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1902:1: ( ruleValidID )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1903:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4630);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1916:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt34=2;
            	    alt34 = dfa34.predict(input);
            	    switch (alt34) {
            	        case 1 :
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1916:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1916:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1916:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1923:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1924:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall4664); if (state.failed) return current;
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

            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1937:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt33=3;
            	            alt33 = dfa33.predict(input);
            	            switch (alt33) {
            	                case 1 :
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1937:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1937:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1937:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1954:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1955:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4749);
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
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1972:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1972:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1972:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1972:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1973:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1973:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1974:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4777);
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

            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1990:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop32:
            	                    do {
            	                        int alt32=2;
            	                        int LA32_0 = input.LA(1);

            	                        if ( (LA32_0==20) ) {
            	                            alt32=1;
            	                        }


            	                        switch (alt32) {
            	                    	case 1 :
            	                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1990:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,20,FOLLOW_20_in_ruleXMemberFeatureCall4790); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1994:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1995:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1995:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1996:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4811);
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
            	                    	    break loop32;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,49,FOLLOW_49_in_ruleXMemberFeatureCall4828); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2016:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt35=2;
            	    alt35 = dfa35.predict(input);
            	    switch (alt35) {
            	        case 1 :
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2016:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2019:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2020:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4863);
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2044:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2045:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2046:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4903);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4913); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2053:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2056:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2057:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2057:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt37=13;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2058:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4960);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2068:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4987);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2078:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5014);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2088:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5041);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2098:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5068);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2108:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5095);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2118:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5122);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2128:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5149);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2138:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5176);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2148:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5203);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2158:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5230);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2168:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5257);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2178:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5284);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2194:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2195:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2196:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5319);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5329); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2203:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2206:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2207:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2207:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt38=6;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==50) && (synpred18_InternalBuildDSL())) {
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2207:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2207:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2207:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5389);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2220:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5417);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2230:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5444);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2240:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5471);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2250:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5498);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2260:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5525);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2276:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2277:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2278:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5560);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5570); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2285:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2288:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2289:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2289:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2289:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2289:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2289:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2291:5: ( () otherlv_1= '[' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2291:6: () otherlv_1= '['
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2291:6: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2292:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXClosure5630); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2301:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2301:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2316:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2316:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2316:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID||LA40_0==33||LA40_0==48) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2316:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2316:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2317:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2317:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2318:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5703);
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

                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2334:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==20) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
                            	case 1 :
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2334:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleXClosure5716); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2338:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2339:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2339:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2340:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5737);
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

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2356:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2357:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2357:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2358:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,51,FOLLOW_51_in_ruleXClosure5759); if (state.failed) return current;
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2371:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2372:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2372:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2373:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5796);
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

            otherlv_7=(Token)match(input,52,FOLLOW_52_in_ruleXClosure5808); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2401:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2402:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2403:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5844);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5854); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2410:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2413:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2414:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2414:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2414:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2414:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2415:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2420:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_ID)||LA43_0==30||(LA43_0>=37 && LA43_0<=38)||LA43_0==43||LA43_0==48||LA43_0==50||LA43_0==54||LA43_0==56||LA43_0==58||(LA43_0>=62 && LA43_0<=67)||(LA43_0>=69 && LA43_0<=76)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2420:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2420:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2421:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2421:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2422:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5910);
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

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2438:2: (otherlv_2= ';' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==53) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2438:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleXExpressionInClosure5923); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2450:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2451:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2452:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5963);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5973); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2459:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2462:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2463:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2463:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2463:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2463:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2463:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2479:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2479:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2479:7: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2480:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2485:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==33||LA45_0==48) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2485:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2485:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2486:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2486:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2487:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6081);
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

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2503:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==20) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2503:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleXShortClosure6094); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2507:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2508:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2508:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2509:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6115);
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2525:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2526:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2526:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2527:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,51,FOLLOW_51_in_ruleXShortClosure6137); if (state.failed) return current;
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2540:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2541:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2541:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2542:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6173);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2566:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2567:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2568:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6209);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6219); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2575:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2578:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2579:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2579:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2579:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleXParenthesizedExpression6256); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6278);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleXParenthesizedExpression6289); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2604:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2605:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2606:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6325);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6335); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2613:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2616:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2617:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2617:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2617:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2617:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2618:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXIfExpression6381); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXIfExpression6393); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2631:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2632:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2632:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2633:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6414);
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

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXIfExpression6426); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2653:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2654:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2654:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2655:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6447);
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2671:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==55) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred22_InternalBuildDSL()) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2671:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2671:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2671:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,55,FOLLOW_55_in_ruleXIfExpression6468); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2676:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2677:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2677:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2678:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6490);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2702:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2703:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2704:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6528);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6538); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2711:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2714:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2715:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2715:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2715:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2715:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2716:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6584); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2725:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_STRING && LA48_0<=RULE_ID)||LA48_0==30||(LA48_0>=37 && LA48_0<=38)||LA48_0==43||LA48_0==50||LA48_0==54||LA48_0==56||LA48_0==58||(LA48_0>=62 && LA48_0<=64)||LA48_0==67||(LA48_0>=69 && LA48_0<=76)) ) {
                alt48=1;
            }
            else if ( (LA48_0==48) ) {
                int LA48_2 = input.LA(2);

                if ( (LA48_2==RULE_ID) ) {
                    int LA48_3 = input.LA(3);

                    if ( (LA48_3==17||(LA48_3>=21 && LA48_3<=42)||(LA48_3>=44 && LA48_3<=50)||LA48_3==68) ) {
                        alt48=1;
                    }
                    else if ( (LA48_3==57) && (synpred24_InternalBuildDSL())) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA48_2>=RULE_STRING && LA48_2<=RULE_DECIMAL)||LA48_2==30||(LA48_2>=37 && LA48_2<=38)||LA48_2==43||LA48_2==48||LA48_2==50||LA48_2==54||LA48_2==56||LA48_2==58||(LA48_2>=62 && LA48_2<=64)||LA48_2==67||(LA48_2>=69 && LA48_2<=76)) ) {
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2725:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2725:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2725:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2725:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_ID) ) {
                        int LA47_1 = input.LA(2);

                        if ( (LA47_1==57) && (synpred23_InternalBuildDSL())) {
                            alt47=1;
                        }
                    }
                    switch (alt47) {
                        case 1 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2725:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2730:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2730:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2730:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2731:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2731:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2732:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6627);
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

                            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6639); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2752:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2753:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2753:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2754:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6663);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2771:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2771:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2771:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2771:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2771:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2777:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2777:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression6707); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2781:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2782:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2782:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2783:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6728);
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

                    otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6740); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2803:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2804:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2804:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2805:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6763);
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

                    otherlv_9=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression6775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,58,FOLLOW_58_in_ruleXSwitchExpression6789); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2829:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID||LA49_0==33||LA49_0==48||LA49_0==57||LA49_0==61) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2830:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2830:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2831:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6810);
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2847:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==59) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2847:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,59,FOLLOW_59_in_ruleXSwitchExpression6824); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2855:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2856:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2856:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2857:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6857);
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

            otherlv_15=(Token)match(input,60,FOLLOW_60_in_ruleXSwitchExpression6871); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2885:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2886:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2887:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6907);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6917); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2894:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2897:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2898:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2898:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2898:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2898:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||LA51_0==33||LA51_0==48) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2899:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2899:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2900:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6963);
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2916:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==61) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2916:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXCasePart6977); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2920:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2921:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2921:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2922:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6998);
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

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleXCasePart7012); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2942:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2943:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2943:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2944:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7033);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2968:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2969:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2970:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7069);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7079); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2977:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2980:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2981:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2981:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2981:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2981:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2982:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXForLoopExpression7125); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXForLoopExpression7137); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2995:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2996:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2996:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2997:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7158);
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

            otherlv_4=(Token)match(input,57,FOLLOW_57_in_ruleXForLoopExpression7170); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3017:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3018:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3018:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3019:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7191);
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

            otherlv_6=(Token)match(input,49,FOLLOW_49_in_ruleXForLoopExpression7203); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3039:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3040:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3040:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3041:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7224);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3065:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3066:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3067:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7260);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7270); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3074:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3077:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3078:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3078:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3078:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3078:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3079:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXWhileExpression7316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXWhileExpression7328); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3092:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3093:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3093:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3094:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7349);
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

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXWhileExpression7361); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3114:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3115:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3115:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3116:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7382);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3140:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3141:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3142:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7418);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7428); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3149:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3152:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3153:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3153:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3153:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3153:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3154:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXDoWhileExpression7474); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3163:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3164:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3164:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3165:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7495);
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

            otherlv_3=(Token)match(input,63,FOLLOW_63_in_ruleXDoWhileExpression7507); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXDoWhileExpression7519); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3189:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3190:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3190:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3191:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7540);
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

            otherlv_6=(Token)match(input,49,FOLLOW_49_in_ruleXDoWhileExpression7552); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3219:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3220:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3221:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7588);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7598); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3228:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3231:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3232:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3232:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3232:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3232:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3233:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXBlockExpression7644); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3242:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_STRING && LA54_0<=RULE_ID)||LA54_0==30||(LA54_0>=37 && LA54_0<=38)||LA54_0==43||LA54_0==48||LA54_0==50||LA54_0==54||LA54_0==56||LA54_0==58||(LA54_0>=62 && LA54_0<=67)||(LA54_0>=69 && LA54_0<=76)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3242:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3242:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3243:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3243:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3244:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7666);
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

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3260:2: (otherlv_3= ';' )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==53) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3260:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleXBlockExpression7679); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,60,FOLLOW_60_in_ruleXBlockExpression7695); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3276:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3277:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3278:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7731);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7741); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3285:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3288:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3289:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3289:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=65 && LA55_0<=66)) ) {
                alt55=1;
            }
            else if ( ((LA55_0>=RULE_STRING && LA55_0<=RULE_ID)||LA55_0==30||(LA55_0>=37 && LA55_0<=38)||LA55_0==43||LA55_0==48||LA55_0==50||LA55_0==54||LA55_0==56||LA55_0==58||(LA55_0>=62 && LA55_0<=64)||LA55_0==67||(LA55_0>=69 && LA55_0<=76)) ) {
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3290:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7788);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3300:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7815);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3316:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3317:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3318:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7850);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7860); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3325:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3328:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3329:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3329:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3329:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3329:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3330:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3335:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3335:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3335:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3336:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3336:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3337:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,65,FOLLOW_65_in_ruleXVariableDeclaration7913); if (state.failed) return current;
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3351:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,66,FOLLOW_66_in_ruleXVariableDeclaration7944); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3355:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (synpred25_InternalBuildDSL()) ) {
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
            else if ( (LA57_0==48) && (synpred25_InternalBuildDSL())) {
                alt57=1;
            }
            else if ( (LA57_0==33) && (synpred25_InternalBuildDSL())) {
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3355:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3355:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3355:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3363:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3363:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3363:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3364:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3364:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3365:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7992);
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

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3381:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3382:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3382:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3383:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8013);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3400:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3400:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3401:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3401:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3402:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8042);
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3418:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==17) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3418:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleXVariableDeclaration8056); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3422:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3423:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3423:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3424:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8077);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3448:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3449:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3450:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8115);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8125); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3457:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3460:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3461:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3461:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3461:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3461:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==RULE_ID||LA59_1==30||LA59_1==45||LA59_1==50) ) {
                    alt59=1;
                }
            }
            else if ( (LA59_0==33||LA59_0==48) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3462:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3462:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3463:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8171);
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3479:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3480:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3480:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3481:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8193);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3505:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3506:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3507:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8229);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8239); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3514:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3517:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3518:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3518:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3518:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3518:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3519:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3519:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3520:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8285);
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3536:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3537:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3537:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3538:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8306);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3562:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3563:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3564:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8342);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8352); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3571:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3574:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3575:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3575:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3575:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3575:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3576:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3581:2: ( ( ruleStaticQualifier ) )?
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3582:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3582:1: ( ruleStaticQualifier )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3583:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8409);
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3596:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==30) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3596:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleXFeatureCall8423); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3600:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3601:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3601:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3602:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8444);
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

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3618:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==20) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3618:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleXFeatureCall8457); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3622:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3623:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3623:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3624:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8478);
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

                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleXFeatureCall8492); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3644:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3645:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3645:1: ( ruleIdOrSuper )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3646:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8517);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3659:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3659:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3659:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3659:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3666:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3667:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,48,FOLLOW_48_in_ruleXFeatureCall8551); if (state.failed) return current;
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

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3680:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt64=3;
                    alt64 = dfa64.predict(input);
                    switch (alt64) {
                        case 1 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3680:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3680:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3680:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3697:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3698:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8636);
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
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3715:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3715:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3715:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3715:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3716:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3716:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3717:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8664);
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

                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3733:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==20) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3733:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleXFeatureCall8677); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3737:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3738:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3738:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3739:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8698);
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

                    otherlv_13=(Token)match(input,49,FOLLOW_49_in_ruleXFeatureCall8715); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3759:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3759:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3762:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3763:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8750);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3787:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3788:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3789:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8788);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8799); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3796:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3799:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3800:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3800:1: (this_ValidID_0= ruleValidID | kw= 'super' )
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3801:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8846);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3813:2: kw= 'super'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleIdOrSuper8870); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3826:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3827:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3828:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8911);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8922); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3835:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3838:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3839:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3839:1: (this_ValidID_0= ruleValidID kw= '::' )+
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
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3840:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8969);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,68,FOLLOW_68_in_ruleStaticQualifier8987); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3864:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3865:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3866:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9028);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9038); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3873:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3876:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3877:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3877:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3877:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3877:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3878:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXConstructorCall9084); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3887:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3888:1: ( ruleQualifiedName )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3888:1: ( ruleQualifiedName )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3889:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9107);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3902:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3902:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3902:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3902:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleXConstructorCall9128); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3907:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3908:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3908:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3909:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9150);
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

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3925:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==20) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3925:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleXConstructorCall9163); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3929:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3930:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3930:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3931:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9184);
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

                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleXConstructorCall9198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3951:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3951:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3951:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3951:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleXConstructorCall9221); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3956:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt72=3;
                    alt72 = dfa72.predict(input);
                    switch (alt72) {
                        case 1 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3956:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3956:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3956:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3973:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3974:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9294);
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
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3991:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3991:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3991:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3991:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3992:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3992:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3993:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9322);
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

                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4009:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( (LA71_0==20) ) {
                                    alt71=1;
                                }


                                switch (alt71) {
                            	case 1 :
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4009:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleXConstructorCall9335); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4013:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4014:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4014:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4015:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9356);
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

                    otherlv_13=(Token)match(input,49,FOLLOW_49_in_ruleXConstructorCall9373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4035:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4035:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4038:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4039:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9408);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4063:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4064:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4065:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9445);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9455); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4072:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4075:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4076:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4076:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4076:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4076:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4077:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4082:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4082:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXBooleanLiteral9502); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4087:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4087:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4088:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4088:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4089:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,71,FOLLOW_71_in_ruleXBooleanLiteral9526); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4110:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4111:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4112:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9576);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9586); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4119:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4122:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4123:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4123:1: ( () otherlv_1= 'null' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4123:2: () otherlv_1= 'null'
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4123:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4124:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXNullLiteral9632); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4141:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4142:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4143:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9668);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9678); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4150:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4153:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4154:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4154:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4154:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4154:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4155:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4160:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4161:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4161:1: (lv_value_1_0= ruleNumber )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4162:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9733);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4186:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4187:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4188:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9769);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9779); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4195:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4198:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4199:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4199:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4199:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4199:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4200:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4205:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4206:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4206:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4207:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9830); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4231:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4232:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4233:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9871);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9881); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4240:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4243:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4244:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4244:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4244:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4244:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4245:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXTypeLiteral9927); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXTypeLiteral9939); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4258:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4259:1: ( ruleQualifiedName )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4259:1: ( ruleQualifiedName )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4260:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9962);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXTypeLiteral9974); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4285:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4286:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4287:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10010);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10020); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4294:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4297:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4298:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4298:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4298:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4298:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4299:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXThrowExpression10066); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4308:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4309:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4309:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4310:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10087);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4334:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4335:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4336:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10123);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10133); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4343:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4346:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4347:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4347:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4347:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4347:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4348:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXReturnExpression10179); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4357:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4357:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4362:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4363:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10210);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4387:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4388:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4389:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10247);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10257); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4396:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4399:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4400:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4400:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4400:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4400:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4401:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleXTryCatchFinallyExpression10303); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4410:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4411:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4411:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4412:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10324);
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4428:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4428:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4428:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4428:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4428:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==78) ) {
                            int LA77_2 = input.LA(2);

                            if ( (synpred34_InternalBuildDSL()) ) {
                                alt77=1;
                            }


                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4428:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4430:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4431:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10354);
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

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4447:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==77) ) {
                        int LA78_1 = input.LA(2);

                        if ( (synpred35_InternalBuildDSL()) ) {
                            alt78=1;
                        }
                    }
                    switch (alt78) {
                        case 1 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4447:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4447:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4447:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,77,FOLLOW_77_in_ruleXTryCatchFinallyExpression10376); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4452:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4453:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4453:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4454:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10398);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4471:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4471:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4471:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,77,FOLLOW_77_in_ruleXTryCatchFinallyExpression10420); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4475:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4476:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4476:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4477:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10441);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4501:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4502:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4503:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10479);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10489); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4510:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4513:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4514:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4514:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4514:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4514:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4514:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleXCatchClause10534); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXCatchClause10547); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4523:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4524:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4524:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4525:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10568);
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

            otherlv_3=(Token)match(input,49,FOLLOW_49_in_ruleXCatchClause10580); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4545:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4546:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4546:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4547:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10601);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4571:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4572:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4573:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10638);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10649); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4580:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4583:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4584:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4584:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4585:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10696);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4595:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==45) ) {
                    int LA80_2 = input.LA(2);

                    if ( (LA80_2==RULE_ID) ) {
                        int LA80_3 = input.LA(3);

                        if ( (synpred37_InternalBuildDSL()) ) {
                            alt80=1;
                        }


                    }


                }


                switch (alt80) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4595:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4595:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4595:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,45,FOLLOW_45_in_ruleQualifiedName10724); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10747);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4622:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4626:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4627:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10801);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10812); if (state.failed) return current;

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4637:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4641:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4642:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4642:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4642:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10856); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4650:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4650:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4650:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4650:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
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
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4650:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10884); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4658:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10910); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4665:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==45) ) {
                        int LA83_1 = input.LA(2);

                        if ( ((LA83_1>=RULE_INT && LA83_1<=RULE_DECIMAL)) ) {
                            alt83=1;
                        }
                    }
                    switch (alt83) {
                        case 1 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4666:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,45,FOLLOW_45_in_ruleNumber10930); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4671:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
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
                                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4671:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10946); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4679:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10972); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4697:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4698:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4699:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11025);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference11035); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4706:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4709:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4710:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4710:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_ID) ) {
                alt86=1;
            }
            else if ( (LA86_0==33||LA86_0==48) ) {
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4710:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4710:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4711:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11083);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4719:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==50) ) {
                            int LA85_2 = input.LA(2);

                            if ( (LA85_2==52) ) {
                                int LA85_3 = input.LA(3);

                                if ( (synpred38_InternalBuildDSL()) ) {
                                    alt85=1;
                                }


                            }


                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4719:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4722:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4722:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4722:6: ()
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4723:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleJvmTypeReference11121); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleJvmTypeReference11133); if (state.failed) return current;
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4738:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11165);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4754:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4755:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4756:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11200);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11210); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4763:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4766:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4767:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4767:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4767:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4767:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==48) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4767:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleXFunctionTypeRef11248); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4771:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==RULE_ID||LA88_0==33||LA88_0==48) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4771:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4771:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4772:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4772:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4773:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11270);
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

                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4789:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop87:
                            do {
                                int alt87=2;
                                int LA87_0 = input.LA(1);

                                if ( (LA87_0==20) ) {
                                    alt87=1;
                                }


                                switch (alt87) {
                            	case 1 :
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4789:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleXFunctionTypeRef11283); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4793:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4794:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4794:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4795:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11304);
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

                    otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleXFunctionTypeRef11320); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleXFunctionTypeRef11334); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4819:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4820:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4820:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4821:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11355);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4845:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4846:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4847:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11391);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11401); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4854:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4857:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4858:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4858:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4858:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4858:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4859:1: ( ruleQualifiedName )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4859:1: ( ruleQualifiedName )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4860:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11449);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4873:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt91=2;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4873:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4873:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4873:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleJvmParameterizedTypeReference11470); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4878:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4879:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4879:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4880:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11492);
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

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4896:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==20) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4896:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleJvmParameterizedTypeReference11505); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4900:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4901:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4901:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4902:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11526);
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

                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleJvmParameterizedTypeReference11540); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4930:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4931:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4932:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11578);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11588); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4939:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4942:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4943:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4943:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_ID||LA92_0==33||LA92_0==48) ) {
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4944:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11635);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4954:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11662);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4970:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4971:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4972:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11697);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11707); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4979:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4982:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4983:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4983:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4983:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4983:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4984:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleJvmWildcardTypeReference11753); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4993:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4993:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4993:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4994:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4994:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4995:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11775);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5012:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5012:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5013:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5013:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5014:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11802);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5038:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5039:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5040:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11840);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11850); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5047:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5050:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5051:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5051:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5051:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleJvmUpperBound11887); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5055:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5056:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5056:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5057:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11908);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5081:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5082:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5083:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11944);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11954); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5090:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5093:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5094:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5094:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5094:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleJvmUpperBoundAnded11991); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5098:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5099:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5099:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5100:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12012);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5124:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5125:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5126:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12048);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12058); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5133:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5136:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5137:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5137:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5137:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleJvmLowerBound12095); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5141:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5142:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5142:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5143:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12116);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5169:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5170:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5171:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12155);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12166); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5178:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5181:28: (this_ID_0= RULE_ID )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5182:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12205); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalBuildDSL
    public final void synpred1_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:549:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:549:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:549:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:549:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:549:5: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:550:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:550:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:551:1: ( ruleOpMultiAssign )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:551:1: ( ruleOpMultiAssign )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:552:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalBuildDSL1177);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalBuildDSL

    // $ANTLR start synpred2_InternalBuildDSL
    public final void synpred2_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:677:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:677:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:677:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:677:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:677:5: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:678:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:678:2: ( ( ruleOpOr ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:679:1: ( ruleOpOr )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:679:1: ( ruleOpOr )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:680:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalBuildDSL1525);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalBuildDSL

    // $ANTLR start synpred3_InternalBuildDSL
    public final void synpred3_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:778:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:778:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:778:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:778:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:778:5: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:779:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:779:2: ( ( ruleOpAnd ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:780:1: ( ruleOpAnd )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:780:1: ( ruleOpAnd )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:781:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalBuildDSL1784);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalBuildDSL

    // $ANTLR start synpred4_InternalBuildDSL
    public final void synpred4_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:879:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:879:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:879:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:879:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:879:5: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:880:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:880:2: ( ( ruleOpEquality ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:881:1: ( ruleOpEquality )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:881:1: ( ruleOpEquality )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:882:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalBuildDSL2043);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalBuildDSL

    // $ANTLR start synpred5_InternalBuildDSL
    public final void synpred5_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:987:4: ( ( () 'instanceof' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:987:5: ( () 'instanceof' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:987:5: ( () 'instanceof' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:987:6: () 'instanceof'
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:987:6: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:988:1: 
        {
        }

        match(input,26,FOLLOW_26_in_synpred5_InternalBuildDSL2319); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalBuildDSL

    // $ANTLR start synpred6_InternalBuildDSL
    public final void synpred6_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1018:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1018:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1018:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1018:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1018:10: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1019:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1019:2: ( ( ruleOpCompare ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1020:1: ( ruleOpCompare )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1020:1: ( ruleOpCompare )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1021:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalBuildDSL2390);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalBuildDSL

    // $ANTLR start synpred7_InternalBuildDSL
    public final void synpred7_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1140:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1140:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1140:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1140:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1140:5: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1141:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1141:2: ( ( ruleOpOther ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1142:1: ( ruleOpOther )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1142:1: ( ruleOpOther )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1143:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalBuildDSL2709);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalBuildDSL

    // $ANTLR start synpred8_InternalBuildDSL
    public final void synpred8_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1232:3: ( ( '>' '>' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1232:4: ( '>' '>' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1232:4: ( '>' '>' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1233:2: '>' '>'
        {
        match(input,29,FOLLOW_29_in_synpred8_InternalBuildDSL2925); if (state.failed) return ;
        match(input,29,FOLLOW_29_in_synpred8_InternalBuildDSL2930); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalBuildDSL

    // $ANTLR start synpred9_InternalBuildDSL
    public final void synpred9_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1262:3: ( ( '<' '<' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1262:4: ( '<' '<' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1262:4: ( '<' '<' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1263:2: '<' '<'
        {
        match(input,30,FOLLOW_30_in_synpred9_InternalBuildDSL3012); if (state.failed) return ;
        match(input,30,FOLLOW_30_in_synpred9_InternalBuildDSL3017); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalBuildDSL

    // $ANTLR start synpred10_InternalBuildDSL
    public final void synpred10_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1336:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1336:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1336:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1336:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1336:5: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1337:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1337:2: ( ( ruleOpAdd ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1338:1: ( ruleOpAdd )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1338:1: ( ruleOpAdd )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1339:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalBuildDSL3239);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalBuildDSL

    // $ANTLR start synpred11_InternalBuildDSL
    public final void synpred11_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1444:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1444:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1444:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1444:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1444:5: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1445:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1445:2: ( ( ruleOpMulti ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1446:1: ( ruleOpMulti )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1446:1: ( ruleOpMulti )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1447:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalBuildDSL3519);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalBuildDSL

    // $ANTLR start synpred12_InternalBuildDSL
    public final void synpred12_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1677:3: ( ( () 'as' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1677:4: ( () 'as' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1677:4: ( () 'as' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1677:5: () 'as'
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1677:5: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1678:1: 
        {
        }

        match(input,44,FOLLOW_44_in_synpred12_InternalBuildDSL4113); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalBuildDSL

    // $ANTLR start synpred13_InternalBuildDSL
    public final void synpred13_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1737:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1737:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1737:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1737:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1737:6: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1738:1: 
        {
        }

        match(input,45,FOLLOW_45_in_synpred13_InternalBuildDSL4267); if (state.failed) return ;
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1739:1: ( ( ruleValidID ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1740:1: ( ruleValidID )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1740:1: ( ruleValidID )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1741:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred13_InternalBuildDSL4276);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalBuildDSL4282);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalBuildDSL

    // $ANTLR start synpred14_InternalBuildDSL
    public final void synpred14_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1795:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1795:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1795:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1795:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1795:10: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1796:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1796:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt94=3;
        switch ( input.LA(1) ) {
        case 45:
            {
            alt94=1;
            }
            break;
        case 46:
            {
            alt94=2;
            }
            break;
        case 47:
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
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1796:4: '.'
                {
                match(input,45,FOLLOW_45_in_synpred14_InternalBuildDSL4385); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1798:6: ( ( '?.' ) )
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1798:6: ( ( '?.' ) )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1799:1: ( '?.' )
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1799:1: ( '?.' )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1800:2: '?.'
                {
                match(input,46,FOLLOW_46_in_synpred14_InternalBuildDSL4399); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1805:6: ( ( '*.' ) )
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1805:6: ( ( '*.' ) )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1806:1: ( '*.' )
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1806:1: ( '*.' )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1807:2: '*.'
                {
                match(input,47,FOLLOW_47_in_synpred14_InternalBuildDSL4419); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalBuildDSL

    // $ANTLR start synpred15_InternalBuildDSL
    public final void synpred15_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1916:4: ( ( '(' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1917:1: ( '(' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1917:1: ( '(' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1918:2: '('
        {
        match(input,48,FOLLOW_48_in_synpred15_InternalBuildDSL4646); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalBuildDSL

    // $ANTLR start synpred16_InternalBuildDSL
    public final void synpred16_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1937:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1937:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1937:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1937:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1937:6: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1938:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1938:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==RULE_ID||LA96_0==33||LA96_0==48) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1938:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1938:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1939:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1939:1: ( ruleJvmFormalParameter )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1940:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalBuildDSL4698);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1942:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==20) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1942:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred16_InternalBuildDSL4705); if (state.failed) return ;
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1943:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1944:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1944:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1945:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalBuildDSL4712);
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

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1947:6: ( ( '|' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1948:1: ( '|' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1948:1: ( '|' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1949:2: '|'
        {
        match(input,51,FOLLOW_51_in_synpred16_InternalBuildDSL4726); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalBuildDSL

    // $ANTLR start synpred17_InternalBuildDSL
    public final void synpred17_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2016:4: ( ( () '[' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2016:5: ( () '[' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2016:5: ( () '[' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2016:6: () '['
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2016:6: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2017:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred17_InternalBuildDSL4846); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalBuildDSL

    // $ANTLR start synpred18_InternalBuildDSL
    public final void synpred18_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2207:3: ( ( () '[' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2207:4: ( () '[' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2207:4: ( () '[' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2207:5: () '['
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2207:5: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2208:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred18_InternalBuildDSL5370); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalBuildDSL

    // $ANTLR start synpred20_InternalBuildDSL
    public final void synpred20_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2301:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2301:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2301:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2301:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2301:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt98=2;
        int LA98_0 = input.LA(1);

        if ( (LA98_0==RULE_ID||LA98_0==33||LA98_0==48) ) {
            alt98=1;
        }
        switch (alt98) {
            case 1 :
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2301:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2301:7: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2302:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2302:1: ( ruleJvmFormalParameter )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2303:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalBuildDSL5649);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2305:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop97:
                do {
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==20) ) {
                        alt97=1;
                    }


                    switch (alt97) {
                	case 1 :
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2305:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred20_InternalBuildDSL5656); if (state.failed) return ;
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2306:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2307:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2307:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2308:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalBuildDSL5663);
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

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2310:6: ( ( '|' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2311:1: ( '|' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2311:1: ( '|' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2312:2: '|'
        {
        match(input,51,FOLLOW_51_in_synpred20_InternalBuildDSL5677); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalBuildDSL

    // $ANTLR start synpred22_InternalBuildDSL
    public final void synpred22_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2671:4: ( 'else' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2671:6: 'else'
        {
        match(input,55,FOLLOW_55_in_synpred22_InternalBuildDSL6460); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalBuildDSL

    // $ANTLR start synpred23_InternalBuildDSL
    public final void synpred23_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2725:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2725:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2725:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2725:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2725:6: ( ( ruleValidID ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2726:1: ( ruleValidID )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2726:1: ( ruleValidID )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2727:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalBuildDSL6602);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,57,FOLLOW_57_in_synpred23_InternalBuildDSL6608); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalBuildDSL

    // $ANTLR start synpred24_InternalBuildDSL
    public final void synpred24_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2771:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2771:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2771:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2771:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,48,FOLLOW_48_in_synpred24_InternalBuildDSL6684); if (state.failed) return ;
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2772:1: ( ( ruleValidID ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2773:1: ( ruleValidID )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2773:1: ( ruleValidID )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2774:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalBuildDSL6691);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,57,FOLLOW_57_in_synpred24_InternalBuildDSL6697); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalBuildDSL

    // $ANTLR start synpred25_InternalBuildDSL
    public final void synpred25_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3355:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3355:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3355:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3355:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3355:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3356:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3356:1: ( ruleJvmTypeReference )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3357:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalBuildDSL7962);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3359:2: ( ( ruleValidID ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3360:1: ( ruleValidID )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3360:1: ( ruleValidID )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3361:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalBuildDSL7971);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalBuildDSL

    // $ANTLR start synpred26_InternalBuildDSL
    public final void synpred26_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3659:4: ( ( '(' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3660:1: ( '(' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3660:1: ( '(' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3661:2: '('
        {
        match(input,48,FOLLOW_48_in_synpred26_InternalBuildDSL8533); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalBuildDSL

    // $ANTLR start synpred27_InternalBuildDSL
    public final void synpred27_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3680:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3680:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3680:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3680:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3680:6: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3681:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3681:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt102=2;
        int LA102_0 = input.LA(1);

        if ( (LA102_0==RULE_ID||LA102_0==33||LA102_0==48) ) {
            alt102=1;
        }
        switch (alt102) {
            case 1 :
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3681:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3681:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3682:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3682:1: ( ruleJvmFormalParameter )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3683:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalBuildDSL8585);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3685:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop101:
                do {
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==20) ) {
                        alt101=1;
                    }


                    switch (alt101) {
                	case 1 :
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3685:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred27_InternalBuildDSL8592); if (state.failed) return ;
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3686:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3687:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3687:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3688:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalBuildDSL8599);
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

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3690:6: ( ( '|' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3691:1: ( '|' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3691:1: ( '|' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3692:2: '|'
        {
        match(input,51,FOLLOW_51_in_synpred27_InternalBuildDSL8613); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalBuildDSL

    // $ANTLR start synpred28_InternalBuildDSL
    public final void synpred28_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3759:4: ( ( () '[' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3759:5: ( () '[' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3759:5: ( () '[' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3759:6: () '['
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3759:6: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3760:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred28_InternalBuildDSL8733); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalBuildDSL

    // $ANTLR start synpred29_InternalBuildDSL
    public final void synpred29_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3902:4: ( '<' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3902:6: '<'
        {
        match(input,30,FOLLOW_30_in_synpred29_InternalBuildDSL9120); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalBuildDSL

    // $ANTLR start synpred30_InternalBuildDSL
    public final void synpred30_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3951:5: ( '(' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3951:7: '('
        {
        match(input,48,FOLLOW_48_in_synpred30_InternalBuildDSL9213); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalBuildDSL

    // $ANTLR start synpred31_InternalBuildDSL
    public final void synpred31_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3956:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3956:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3956:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3956:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3956:6: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3957:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3957:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt104=2;
        int LA104_0 = input.LA(1);

        if ( (LA104_0==RULE_ID||LA104_0==33||LA104_0==48) ) {
            alt104=1;
        }
        switch (alt104) {
            case 1 :
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3957:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3957:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3958:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3958:1: ( ruleJvmFormalParameter )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3959:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalBuildDSL9243);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3961:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop103:
                do {
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==20) ) {
                        alt103=1;
                    }


                    switch (alt103) {
                	case 1 :
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3961:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred31_InternalBuildDSL9250); if (state.failed) return ;
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3962:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3963:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3963:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3964:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalBuildDSL9257);
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

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3966:6: ( ( '|' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3967:1: ( '|' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3967:1: ( '|' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3968:2: '|'
        {
        match(input,51,FOLLOW_51_in_synpred31_InternalBuildDSL9271); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalBuildDSL

    // $ANTLR start synpred32_InternalBuildDSL
    public final void synpred32_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4035:4: ( ( () '[' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4035:5: ( () '[' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4035:5: ( () '[' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4035:6: () '['
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4035:6: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4036:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred32_InternalBuildDSL9391); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalBuildDSL

    // $ANTLR start synpred33_InternalBuildDSL
    public final void synpred33_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4357:2: ( ( ruleXExpression ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4358:1: ( ruleXExpression )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4358:1: ( ruleXExpression )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4359:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalBuildDSL10193);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalBuildDSL

    // $ANTLR start synpred34_InternalBuildDSL
    public final void synpred34_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4428:5: ( 'catch' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4428:7: 'catch'
        {
        match(input,78,FOLLOW_78_in_synpred34_InternalBuildDSL10338); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalBuildDSL

    // $ANTLR start synpred35_InternalBuildDSL
    public final void synpred35_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4447:5: ( 'finally' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4447:7: 'finally'
        {
        match(input,77,FOLLOW_77_in_synpred35_InternalBuildDSL10368); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalBuildDSL

    // $ANTLR start synpred37_InternalBuildDSL
    public final void synpred37_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4595:3: ( '.' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4596:2: '.'
        {
        match(input,45,FOLLOW_45_in_synpred37_InternalBuildDSL10715); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalBuildDSL

    // $ANTLR start synpred38_InternalBuildDSL
    public final void synpred38_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4719:2: ( ( () '[' ']' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4719:3: ( () '[' ']' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4719:3: ( () '[' ']' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4719:4: () '[' ']'
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4719:4: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4720:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred38_InternalBuildDSL11098); if (state.failed) return ;
        match(input,52,FOLLOW_52_in_synpred38_InternalBuildDSL11102); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalBuildDSL

    // $ANTLR start synpred39_InternalBuildDSL
    public final void synpred39_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4873:4: ( '<' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4873:6: '<'
        {
        match(input,30,FOLLOW_30_in_synpred39_InternalBuildDSL11462); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalBuildDSL

    // Delegated rules

    public final boolean synpred16_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA35 dfa35 = new DFA35(this);
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
    static final String DFA18_eotS =
        "\13\uffff";
    static final String DFA18_eofS =
        "\1\1\12\uffff";
    static final String DFA18_minS =
        "\1\4\1\uffff\10\0\1\uffff";
    static final String DFA18_maxS =
        "\1\116\1\uffff\10\0\1\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA18_specialS =
        "\2\uffff\1\0\1\7\1\4\1\6\1\5\1\3\1\2\1\1\1\uffff}>";
    static final String[] DFA18_transitionS = {
            "\5\1\7\uffff\1\1\1\uffff\1\1\1\uffff\11\1\1\2\1\3\1\4\1\5\1"+
            "\6\1\7\1\10\1\11\16\1\1\uffff\20\1\1\uffff\12\1",
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

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()* loopback of 1140:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalBuildDSL()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_9 = input.LA(1);

                         
                        int index18_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalBuildDSL()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_8 = input.LA(1);

                         
                        int index18_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalBuildDSL()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_7 = input.LA(1);

                         
                        int index18_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalBuildDSL()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalBuildDSL()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_6 = input.LA(1);

                         
                        int index18_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalBuildDSL()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_5 = input.LA(1);

                         
                        int index18_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalBuildDSL()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_5);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_3 = input.LA(1);

                         
                        int index18_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalBuildDSL()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\103\uffff";
    static final String DFA34_eofS =
        "\1\2\102\uffff";
    static final String DFA34_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA34_maxS =
        "\1\116\1\0\101\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA34_transitionS = {
            "\5\2\7\uffff\1\2\1\uffff\1\2\1\uffff\34\2\1\1\2\2\1\uffff\20"+
            "\2\1\uffff\12\2",
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
            return "1916:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index34_1);
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
    static final String DFA33_eotS =
        "\36\uffff";
    static final String DFA33_eofS =
        "\36\uffff";
    static final String DFA33_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA33_maxS =
        "\1\114\2\0\33\uffff";
    static final String DFA33_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA33_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA33_transitionS = {
            "\4\5\1\1\25\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\4"+
            "\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
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

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "1937:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_0 = input.LA(1);

                         
                        int index33_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA33_0==RULE_ID) ) {s = 1;}

                        else if ( (LA33_0==48) ) {s = 2;}

                        else if ( (LA33_0==33) && (synpred16_InternalBuildDSL())) {s = 3;}

                        else if ( (LA33_0==51) && (synpred16_InternalBuildDSL())) {s = 4;}

                        else if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_DECIMAL)||LA33_0==30||(LA33_0>=37 && LA33_0<=38)||LA33_0==43||LA33_0==50||LA33_0==54||LA33_0==56||LA33_0==58||(LA33_0>=62 && LA33_0<=64)||LA33_0==67||(LA33_0>=69 && LA33_0<=76)) ) {s = 5;}

                        else if ( (LA33_0==49) ) {s = 29;}

                         
                        input.seek(index33_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalBuildDSL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalBuildDSL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index33_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA35_eotS =
        "\103\uffff";
    static final String DFA35_eofS =
        "\1\2\102\uffff";
    static final String DFA35_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA35_maxS =
        "\1\116\1\0\101\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA35_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA35_transitionS = {
            "\5\2\7\uffff\1\2\1\uffff\1\2\1\uffff\36\2\1\1\1\uffff\20\2\1"+
            "\uffff\12\2",
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
            return "2016:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index35_1);
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
            "\4\5\1\4\25\uffff\1\4\21\uffff\1\15\1\uffff\1\5\3\uffff\1\6"+
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
            return "2057:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
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
            "\4\5\1\1\25\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\4"+
            "\uffff\1\2\1\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff"+
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
            return "2301:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
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

                        else if ( (LA41_0==48) ) {s = 2;}

                        else if ( (LA41_0==33) && (synpred20_InternalBuildDSL())) {s = 3;}

                        else if ( (LA41_0==51) && (synpred20_InternalBuildDSL())) {s = 4;}

                        else if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_DECIMAL)||LA41_0==30||(LA41_0>=37 && LA41_0<=38)||LA41_0==43||LA41_0==50||LA41_0==52||LA41_0==54||LA41_0==56||LA41_0==58||(LA41_0>=62 && LA41_0<=67)||(LA41_0>=69 && LA41_0<=76)) ) {s = 5;}

                         
                        input.seek(index41_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_1 = input.LA(1);

                         
                        int index41_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalBuildDSL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index41_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA41_2 = input.LA(1);

                         
                        int index41_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalBuildDSL()) ) {s = 4;}

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
        "\103\uffff";
    static final String DFA65_eofS =
        "\1\2\102\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA65_maxS =
        "\1\116\1\0\101\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA65_transitionS = {
            "\5\2\7\uffff\1\2\1\uffff\1\2\1\uffff\34\2\1\1\2\2\1\uffff\20"+
            "\2\1\uffff\12\2",
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
            return "3659:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred26_InternalBuildDSL()) ) {s = 66;}

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
            "\4\5\1\1\25\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\4"+
            "\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
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
            return "3680:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA64_0==48) ) {s = 2;}

                        else if ( (LA64_0==33) && (synpred27_InternalBuildDSL())) {s = 3;}

                        else if ( (LA64_0==51) && (synpred27_InternalBuildDSL())) {s = 4;}

                        else if ( ((LA64_0>=RULE_STRING && LA64_0<=RULE_DECIMAL)||LA64_0==30||(LA64_0>=37 && LA64_0<=38)||LA64_0==43||LA64_0==50||LA64_0==54||LA64_0==56||LA64_0==58||(LA64_0>=62 && LA64_0<=64)||LA64_0==67||(LA64_0>=69 && LA64_0<=76)) ) {s = 5;}

                        else if ( (LA64_0==49) ) {s = 29;}

                         
                        input.seek(index64_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalBuildDSL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalBuildDSL()) ) {s = 4;}

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
        "\103\uffff";
    static final String DFA66_eofS =
        "\1\2\102\uffff";
    static final String DFA66_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA66_maxS =
        "\1\116\1\0\101\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA66_transitionS = {
            "\5\2\7\uffff\1\2\1\uffff\1\2\1\uffff\36\2\1\1\1\uffff\20\2\1"+
            "\uffff\12\2",
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
            return "3759:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred28_InternalBuildDSL()) ) {s = 66;}

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
        "\103\uffff";
    static final String DFA70_eofS =
        "\1\2\102\uffff";
    static final String DFA70_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA70_maxS =
        "\1\116\1\0\101\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA70_transitionS = {
            "\5\2\7\uffff\1\2\1\uffff\1\2\1\uffff\12\2\1\1\24\2\1\uffff\20"+
            "\2\1\uffff\12\2",
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
            return "3902:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
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
                        if ( (synpred29_InternalBuildDSL()) ) {s = 66;}

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
        "\103\uffff";
    static final String DFA73_eofS =
        "\1\2\102\uffff";
    static final String DFA73_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA73_maxS =
        "\1\116\1\0\101\uffff";
    static final String DFA73_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA73_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA73_transitionS = {
            "\5\2\7\uffff\1\2\1\uffff\1\2\1\uffff\34\2\1\1\2\2\1\uffff\20"+
            "\2\1\uffff\12\2",
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
            return "3951:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred30_InternalBuildDSL()) ) {s = 66;}

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
            "\4\5\1\1\25\uffff\1\5\2\uffff\1\3\3\uffff\2\5\4\uffff\1\5\4"+
            "\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5"+
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
            return "3956:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA72_0==48) ) {s = 2;}

                        else if ( (LA72_0==33) && (synpred31_InternalBuildDSL())) {s = 3;}

                        else if ( (LA72_0==51) && (synpred31_InternalBuildDSL())) {s = 4;}

                        else if ( ((LA72_0>=RULE_STRING && LA72_0<=RULE_DECIMAL)||LA72_0==30||(LA72_0>=37 && LA72_0<=38)||LA72_0==43||LA72_0==50||LA72_0==54||LA72_0==56||LA72_0==58||(LA72_0>=62 && LA72_0<=64)||LA72_0==67||(LA72_0>=69 && LA72_0<=76)) ) {s = 5;}

                        else if ( (LA72_0==49) ) {s = 29;}

                         
                        input.seek(index72_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalBuildDSL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA72_2 = input.LA(1);

                         
                        int index72_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalBuildDSL()) ) {s = 4;}

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
        "\103\uffff";
    static final String DFA74_eofS =
        "\1\2\102\uffff";
    static final String DFA74_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA74_maxS =
        "\1\116\1\0\101\uffff";
    static final String DFA74_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA74_transitionS = {
            "\5\2\7\uffff\1\2\1\uffff\1\2\1\uffff\36\2\1\1\1\uffff\20\2\1"+
            "\uffff\12\2",
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
            return "4035:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred32_InternalBuildDSL()) ) {s = 66;}

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
        "\103\uffff";
    static final String DFA76_eofS =
        "\1\33\102\uffff";
    static final String DFA76_minS =
        "\1\4\32\0\50\uffff";
    static final String DFA76_maxS =
        "\1\116\32\0\50\uffff";
    static final String DFA76_acceptS =
        "\33\uffff\1\2\46\uffff\1\1";
    static final String DFA76_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\50\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\21\1\15\1\16\1\17\1\1\7\uffff\1\33\1\uffff\1\33\1\uffff\12"+
            "\33\1\10\6\33\1\4\1\3\4\33\1\2\4\33\1\32\1\33\1\12\1\uffff\2"+
            "\33\1\23\1\33\1\7\1\33\1\6\3\33\1\24\1\25\1\26\2\33\1\11\1\uffff"+
            "\1\5\1\13\1\14\1\20\1\22\1\27\1\30\1\31\2\33",
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
            return "4357:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA76_2 = input.LA(1);

                         
                        int index76_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA76_3 = input.LA(1);

                         
                        int index76_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA76_4 = input.LA(1);

                         
                        int index76_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA76_5 = input.LA(1);

                         
                        int index76_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA76_6 = input.LA(1);

                         
                        int index76_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA76_7 = input.LA(1);

                         
                        int index76_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA76_8 = input.LA(1);

                         
                        int index76_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA76_9 = input.LA(1);

                         
                        int index76_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA76_10 = input.LA(1);

                         
                        int index76_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA76_11 = input.LA(1);

                         
                        int index76_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA76_12 = input.LA(1);

                         
                        int index76_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA76_13 = input.LA(1);

                         
                        int index76_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA76_14 = input.LA(1);

                         
                        int index76_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA76_15 = input.LA(1);

                         
                        int index76_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA76_16 = input.LA(1);

                         
                        int index76_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA76_17 = input.LA(1);

                         
                        int index76_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA76_18 = input.LA(1);

                         
                        int index76_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA76_19 = input.LA(1);

                         
                        int index76_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA76_20 = input.LA(1);

                         
                        int index76_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA76_21 = input.LA(1);

                         
                        int index76_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA76_22 = input.LA(1);

                         
                        int index76_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA76_23 = input.LA(1);

                         
                        int index76_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA76_24 = input.LA(1);

                         
                        int index76_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA76_25 = input.LA(1);

                         
                        int index76_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index76_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA76_26 = input.LA(1);

                         
                        int index76_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalBuildDSL()) ) {s = 66;}

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
        "\103\uffff";
    static final String DFA91_eofS =
        "\1\2\102\uffff";
    static final String DFA91_minS =
        "\1\4\1\0\101\uffff";
    static final String DFA91_maxS =
        "\1\116\1\0\101\uffff";
    static final String DFA91_acceptS =
        "\2\uffff\1\2\77\uffff\1\1";
    static final String DFA91_specialS =
        "\1\uffff\1\0\101\uffff}>";
    static final String[] DFA91_transitionS = {
            "\5\2\7\uffff\1\2\1\uffff\1\2\1\uffff\12\2\1\1\24\2\1\uffff\20"+
            "\2\1\uffff\12\2",
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
            return "4873:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
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
                        if ( (synpred39_InternalBuildDSL()) ) {s = 66;}

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
 

    public static final BitSet FOLLOW_ruleBuildFile_in_entryRuleBuildFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuildFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleBuildFile123 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBuildFile144 = new BitSet(new long[]{0x0000000000054002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_ruleBuildFile167 = new BitSet(new long[]{0x0000000000054002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleBuildFile189 = new BitSet(new long[]{0x0000000000050002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDeclaration236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImportDeclaration273 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImportDeclaration294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard389 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNameWithWildCard408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_ruleDeclaration507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDeclaration534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleParameter616 = new BitSet(new long[]{0x0001000200000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleParameter637 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleParameter659 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleParameter672 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleParameter693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTask778 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleTask799 = new BitSet(new long[]{0x0400000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask812 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTask835 = new BitSet(new long[]{0x0400000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTask848 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTask871 = new BitSet(new long[]{0x0400000000100000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleTask896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1090 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1106 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1156 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1209 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpSingleAssign1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpMultiAssign1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1504 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1557 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1580 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpOr1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1763 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1816 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1839 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpAnd1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2022 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2075 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2098 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpEquality2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpEquality2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2302 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_26_in_ruleXRelationalExpression2338 = new BitSet(new long[]{0x0001000200000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2361 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2422 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2445 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpCompare2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpCompare2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2688 = new BitSet(new long[]{0x0000001FE0000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2741 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2764 = new BitSet(new long[]{0x0000001FE0000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2910 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2941 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2997 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleOpOther3028 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleOpOther3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpOther3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpOther3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpOther3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression3161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3218 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3271 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3294 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpAdd3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpAdd3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3498 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3551 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3574 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpMulti3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpMulti3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpMulti3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpMulti3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3827 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpUnary3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpUnary3981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpUnary4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4097 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleXCastedExpression4132 = new BitSet(new long[]{0x0001000200000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression4155 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4250 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4299 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4322 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4338 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4360 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4446 = new BitSet(new long[]{0x0000000040000100L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall4470 = new BitSet(new long[]{0x0000000040000100L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall4507 = new BitSet(new long[]{0x0000000040000100L});
    public static final BitSet FOLLOW_30_in_ruleXMemberFeatureCall4536 = new BitSet(new long[]{0x0001000200000100L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4557 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_20_in_ruleXMemberFeatureCall4570 = new BitSet(new long[]{0x0001000200000100L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4591 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_29_in_ruleXMemberFeatureCall4605 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4630 = new BitSet(new long[]{0x0005E00000000002L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall4664 = new BitSet(new long[]{0xC54F0862400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4749 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4777 = new BitSet(new long[]{0x0002000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXMemberFeatureCall4790 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4811 = new BitSet(new long[]{0x0002000000100000L});
    public static final BitSet FOLLOW_49_in_ruleXMemberFeatureCall4828 = new BitSet(new long[]{0x0004E00000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4863 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXClosure5630 = new BitSet(new long[]{0xC55D0862400001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5703 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXClosure5716 = new BitSet(new long[]{0x0001000200000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5737 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_51_in_ruleXClosure5759 = new BitSet(new long[]{0xC5550860400001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5796 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXClosure5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5910 = new BitSet(new long[]{0xC5650860400001F2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_53_in_ruleXExpressionInClosure5923 = new BitSet(new long[]{0xC5450860400001F2L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6081 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXShortClosure6094 = new BitSet(new long[]{0x0001000200000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6115 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_51_in_ruleXShortClosure6137 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXParenthesizedExpression6256 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6278 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXParenthesizedExpression6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXIfExpression6381 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXIfExpression6393 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6414 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXIfExpression6426 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6447 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXIfExpression6468 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6584 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6627 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6639 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6663 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression6707 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6728 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6740 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6763 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression6775 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXSwitchExpression6789 = new BitSet(new long[]{0x2201000200000100L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6810 = new BitSet(new long[]{0x3A01000200000100L});
    public static final BitSet FOLLOW_59_in_ruleXSwitchExpression6824 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6836 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6857 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXSwitchExpression6871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6963 = new BitSet(new long[]{0x2200000000000000L});
    public static final BitSet FOLLOW_61_in_ruleXCasePart6977 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6998 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXCasePart7012 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXForLoopExpression7125 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXForLoopExpression7137 = new BitSet(new long[]{0x0001000200000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7158 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleXForLoopExpression7170 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7191 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXForLoopExpression7203 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXWhileExpression7316 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXWhileExpression7328 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7349 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXWhileExpression7361 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXDoWhileExpression7474 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7495 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleXDoWhileExpression7507 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXDoWhileExpression7519 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7540 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXDoWhileExpression7552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXBlockExpression7644 = new BitSet(new long[]{0xD5450860400001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7666 = new BitSet(new long[]{0xD5650860400001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_53_in_ruleXBlockExpression7679 = new BitSet(new long[]{0xD5450860400001F0L,0x0000000000001FEFL});
    public static final BitSet FOLLOW_60_in_ruleXBlockExpression7695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXVariableDeclaration7913 = new BitSet(new long[]{0x0001000200000100L});
    public static final BitSet FOLLOW_66_in_ruleXVariableDeclaration7944 = new BitSet(new long[]{0x0001000200000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7992 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8013 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8042 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleXVariableDeclaration8056 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8171 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8285 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8409 = new BitSet(new long[]{0x0000000040000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_30_in_ruleXFeatureCall8423 = new BitSet(new long[]{0x0001000200000100L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8444 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_20_in_ruleXFeatureCall8457 = new BitSet(new long[]{0x0001000200000100L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8478 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_29_in_ruleXFeatureCall8492 = new BitSet(new long[]{0x0000000040000100L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8517 = new BitSet(new long[]{0x0005000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXFeatureCall8551 = new BitSet(new long[]{0xC54F0862400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8636 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8664 = new BitSet(new long[]{0x0002000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXFeatureCall8677 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8698 = new BitSet(new long[]{0x0002000000100000L});
    public static final BitSet FOLLOW_49_in_ruleXFeatureCall8715 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleIdOrSuper8870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleStaticQualifier8987 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXConstructorCall9084 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9107 = new BitSet(new long[]{0x0005000040000002L});
    public static final BitSet FOLLOW_30_in_ruleXConstructorCall9128 = new BitSet(new long[]{0x0001000200000100L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9150 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_20_in_ruleXConstructorCall9163 = new BitSet(new long[]{0x0001000200000100L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9184 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_29_in_ruleXConstructorCall9198 = new BitSet(new long[]{0x0005000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXConstructorCall9221 = new BitSet(new long[]{0xC54F0862400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9294 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9322 = new BitSet(new long[]{0x0002000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXConstructorCall9335 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9356 = new BitSet(new long[]{0x0002000000100000L});
    public static final BitSet FOLLOW_49_in_ruleXConstructorCall9373 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXBooleanLiteral9502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXBooleanLiteral9526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXNullLiteral9632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXTypeLiteral9927 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXTypeLiteral9939 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9962 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXTypeLiteral9974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXThrowExpression10066 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXReturnExpression10179 = new BitSet(new long[]{0xC5450860400001F2L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXTryCatchFinallyExpression10303 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10354 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_77_in_ruleXTryCatchFinallyExpression10376 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXTryCatchFinallyExpression10420 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleXCatchClause10534 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXCatchClause10547 = new BitSet(new long[]{0x0001000200000100L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10568 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleXCatchClause10580 = new BitSet(new long[]{0xC5450860400001F0L,0x0000000000001FE9L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10696 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleQualifiedName10724 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10747 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10884 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10910 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleNumber10930 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference11035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11083 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleJvmTypeReference11121 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleJvmTypeReference11133 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXFunctionTypeRef11248 = new BitSet(new long[]{0x0003000200000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11270 = new BitSet(new long[]{0x0002000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXFunctionTypeRef11283 = new BitSet(new long[]{0x0001000200000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11304 = new BitSet(new long[]{0x0002000000100000L});
    public static final BitSet FOLLOW_49_in_ruleXFunctionTypeRef11320 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleXFunctionTypeRef11334 = new BitSet(new long[]{0x0001000200000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11449 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleJvmParameterizedTypeReference11470 = new BitSet(new long[]{0x0001000200000100L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11492 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_20_in_ruleJvmParameterizedTypeReference11505 = new BitSet(new long[]{0x0001000200000100L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11526 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_29_in_ruleJvmParameterizedTypeReference11540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleJvmWildcardTypeReference11753 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010008L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleJvmUpperBound11887 = new BitSet(new long[]{0x0001000200000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleJvmUpperBoundAnded11991 = new BitSet(new long[]{0x0001000200000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleJvmLowerBound12095 = new BitSet(new long[]{0x0001000200000100L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalBuildDSL1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalBuildDSL1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalBuildDSL1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalBuildDSL2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred5_InternalBuildDSL2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalBuildDSL2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalBuildDSL2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred8_InternalBuildDSL2925 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_synpred8_InternalBuildDSL2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred9_InternalBuildDSL3012 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_synpred9_InternalBuildDSL3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalBuildDSL3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalBuildDSL3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred12_InternalBuildDSL4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred13_InternalBuildDSL4267 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred13_InternalBuildDSL4276 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalBuildDSL4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred14_InternalBuildDSL4385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred14_InternalBuildDSL4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred14_InternalBuildDSL4419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred15_InternalBuildDSL4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalBuildDSL4698 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_20_in_synpred16_InternalBuildDSL4705 = new BitSet(new long[]{0x0001000200000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalBuildDSL4712 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_51_in_synpred16_InternalBuildDSL4726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred17_InternalBuildDSL4846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred18_InternalBuildDSL5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalBuildDSL5649 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_20_in_synpred20_InternalBuildDSL5656 = new BitSet(new long[]{0x0001000200000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalBuildDSL5663 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_51_in_synpred20_InternalBuildDSL5677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred22_InternalBuildDSL6460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalBuildDSL6602 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred23_InternalBuildDSL6608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred24_InternalBuildDSL6684 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalBuildDSL6691 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_synpred24_InternalBuildDSL6697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalBuildDSL7962 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalBuildDSL7971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred26_InternalBuildDSL8533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalBuildDSL8585 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_20_in_synpred27_InternalBuildDSL8592 = new BitSet(new long[]{0x0001000200000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalBuildDSL8599 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_51_in_synpred27_InternalBuildDSL8613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred28_InternalBuildDSL8733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred29_InternalBuildDSL9120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred30_InternalBuildDSL9213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalBuildDSL9243 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_20_in_synpred31_InternalBuildDSL9250 = new BitSet(new long[]{0x0001000200000100L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalBuildDSL9257 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_51_in_synpred31_InternalBuildDSL9271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred32_InternalBuildDSL9391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalBuildDSL10193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_synpred34_InternalBuildDSL10338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred35_InternalBuildDSL10368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred37_InternalBuildDSL10715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred38_InternalBuildDSL11098 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred38_InternalBuildDSL11102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred39_InternalBuildDSL11462 = new BitSet(new long[]{0x0000000000000002L});

}