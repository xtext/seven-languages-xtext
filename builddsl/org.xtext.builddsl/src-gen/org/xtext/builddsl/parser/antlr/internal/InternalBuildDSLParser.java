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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_FILE", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'.'", "'.*'", "'param'", "'='", "'task'", "'dependsOn'", "','", "'?.'", "'*.'", "'<'", "'>'", "'('", "')'", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'{'", "'default'", "'}'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
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
    public static final int T__82=82;
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

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:80:4: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleBuildFile123); if (state.failed) return current;
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

                if ( (LA2_0==15) ) {
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

                if ( (LA3_0==18||LA3_0==20) ) {
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
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleImportDeclaration273); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:198:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:201:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.*' )? ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:202:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.*' )? )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:202:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.*' )? )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:202:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* (kw= '.*' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedNameWithWildCard382); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameWithWildCardAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:209:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:210:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedNameWithWildCard401); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedNameWithWildCard416); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameWithWildCardAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:222:3: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:223:2: kw= '.*'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedNameWithWildCard437); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:236:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:237:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:238:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration479);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration489); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:245:1: ruleDeclaration returns [EObject current=null] : (this_Task_0= ruleTask | this_Parameter_1= ruleParameter ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Task_0 = null;

        EObject this_Parameter_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:248:28: ( (this_Task_0= ruleTask | this_Parameter_1= ruleParameter ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:249:1: (this_Task_0= ruleTask | this_Parameter_1= ruleParameter )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:249:1: (this_Task_0= ruleTask | this_Parameter_1= ruleParameter )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:250:5: this_Task_0= ruleTask
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getTaskParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTask_in_ruleDeclaration536);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:260:5: this_Parameter_1= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getParameterParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleDeclaration563);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:276:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:277:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:278:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter598);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter608); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:285:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'param' ( (lv_type_1_0= ruleJvmTypeReference ) )? ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_init_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:288:28: ( (otherlv_0= 'param' ( (lv_type_1_0= ruleJvmTypeReference ) )? ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:289:1: (otherlv_0= 'param' ( (lv_type_1_0= ruleJvmTypeReference ) )? ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:289:1: (otherlv_0= 'param' ( (lv_type_1_0= ruleJvmTypeReference ) )? ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )? )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:289:3: otherlv_0= 'param' ( (lv_type_1_0= ruleJvmTypeReference ) )? ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleParameter645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParamKeyword_0());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:293:1: ( (lv_type_1_0= ruleJvmTypeReference ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID||LA7_1==16||LA7_1==25||LA7_1==51) ) {
                    alt7=1;
                }
            }
            else if ( (LA7_0==27||LA7_0==39) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:294:1: (lv_type_1_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:294:1: (lv_type_1_0= ruleJvmTypeReference )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:295:3: lv_type_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getTypeJvmTypeReferenceParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleParameter666);
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:311:3: ( (lv_name_2_0= ruleValidID ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:312:1: (lv_name_2_0= ruleValidID )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:312:1: (lv_name_2_0= ruleValidID )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:313:3: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getNameValidIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleParameter688);
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:329:2: (otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:329:4: otherlv_3= '=' ( (lv_init_4_0= ruleXExpression ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleParameter701); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:333:1: ( (lv_init_4_0= ruleXExpression ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:334:1: (lv_init_4_0= ruleXExpression )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:334:1: (lv_init_4_0= ruleXExpression )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:335:3: lv_init_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getInitXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleParameter722);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:359:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:360:2: (iv_ruleTask= ruleTask EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:361:2: iv_ruleTask= ruleTask EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTaskRule()); 
            }
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask760);
            iv_ruleTask=ruleTask();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTask; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask770); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:368:1: ruleTask returns [EObject current=null] : (otherlv_0= 'task' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'dependsOn' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ( (lv_action_6_0= ruleXBlockExpression ) ) ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:371:28: ( (otherlv_0= 'task' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'dependsOn' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ( (lv_action_6_0= ruleXBlockExpression ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:372:1: (otherlv_0= 'task' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'dependsOn' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ( (lv_action_6_0= ruleXBlockExpression ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:372:1: (otherlv_0= 'task' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'dependsOn' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ( (lv_action_6_0= ruleXBlockExpression ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:372:3: otherlv_0= 'task' ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= 'dependsOn' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ( (lv_action_6_0= ruleXBlockExpression ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleTask807); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:376:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:377:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:377:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:378:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTaskAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleTask828);
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:394:2: (otherlv_2= 'dependsOn' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:394:4: otherlv_2= 'dependsOn' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleTask841); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getDependsOnKeyword_2_0());
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:398:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:399:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:399:1: (otherlv_3= RULE_ID )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:400:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTaskRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getDependsOnTaskCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:411:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==22) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:411:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleTask874); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:415:1: ( (otherlv_5= RULE_ID ) )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:416:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:416:1: (otherlv_5= RULE_ID )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:417:3: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTaskRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask894); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getDependsOnTaskCrossReference_2_2_1_0()); 
                    	      	
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:428:6: ( (lv_action_6_0= ruleXBlockExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:429:1: (lv_action_6_0= ruleXBlockExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:429:1: (lv_action_6_0= ruleXBlockExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:430:3: lv_action_6_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTaskAccess().getActionXBlockExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleTask919);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:454:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:455:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:456:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall955);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall965); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:463:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( () ( ( ruleNavigationLiteral ) ) ) )=> ( () ( (lv_rightOperand_7_0= ruleNavigationLiteral ) ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) ) ) (otherlv_12= '<' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )* otherlv_16= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure ) )? ) )* ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:466:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( () ( ( ruleNavigationLiteral ) ) ) )=> ( () ( (lv_rightOperand_7_0= ruleNavigationLiteral ) ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) ) ) (otherlv_12= '<' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )* otherlv_16= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:467:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( () ( ( ruleNavigationLiteral ) ) ) )=> ( () ( (lv_rightOperand_7_0= ruleNavigationLiteral ) ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) ) ) (otherlv_12= '<' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )* otherlv_16= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:467:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( () ( ( ruleNavigationLiteral ) ) ) )=> ( () ( (lv_rightOperand_7_0= ruleNavigationLiteral ) ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) ) ) (otherlv_12= '<' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )* otherlv_16= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:468:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( () ( ( ruleNavigationLiteral ) ) ) )=> ( () ( (lv_rightOperand_7_0= ruleNavigationLiteral ) ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) ) ) (otherlv_12= '<' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )* otherlv_16= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall1012);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:476:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( () ( ( ruleNavigationLiteral ) ) ) )=> ( () ( (lv_rightOperand_7_0= ruleNavigationLiteral ) ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) ) ) (otherlv_12= '<' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )* otherlv_16= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure ) )? ) )*
            loop18:
            do {
                int alt18=4;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (synpred1_InternalBuildDSL()) ) {
                        alt18=1;
                    }
                    else if ( (synpred3_InternalBuildDSL()) ) {
                        alt18=3;
                    }


                    }
                    break;
                case RULE_FILE:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (synpred2_InternalBuildDSL()) ) {
                        alt18=2;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (synpred3_InternalBuildDSL()) ) {
                        alt18=3;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA18_5 = input.LA(2);

                    if ( (synpred3_InternalBuildDSL()) ) {
                        alt18=3;
                    }


                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:476:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:476:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:476:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:476:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:476:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:482:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:482:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:482:26: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:483:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXMemberFeatureCall1061); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:492:1: ( ( ruleValidID ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:493:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:493:1: ( ruleValidID )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:494:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall1084);
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
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall1100);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:515:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:516:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:516:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:517:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall1122);
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
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:534:6: ( ( ( () ( ( ruleNavigationLiteral ) ) ) )=> ( () ( (lv_rightOperand_7_0= ruleNavigationLiteral ) ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:534:6: ( ( ( () ( ( ruleNavigationLiteral ) ) ) )=> ( () ( (lv_rightOperand_7_0= ruleNavigationLiteral ) ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:534:7: ( ( () ( ( ruleNavigationLiteral ) ) ) )=> ( () ( (lv_rightOperand_7_0= ruleNavigationLiteral ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:539:6: ( () ( (lv_rightOperand_7_0= ruleNavigationLiteral ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:539:7: () ( (lv_rightOperand_7_0= ruleNavigationLiteral ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:539:7: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:540:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXBinaryOperationLeftOperandAction_1_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:545:2: ( (lv_rightOperand_7_0= ruleNavigationLiteral ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:546:1: (lv_rightOperand_7_0= ruleNavigationLiteral )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:546:1: (lv_rightOperand_7_0= ruleNavigationLiteral )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:547:3: lv_rightOperand_7_0= ruleNavigationLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getRightOperandNavigationLiteralParserRuleCall_1_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNavigationLiteral_in_ruleXMemberFeatureCall1178);
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
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:564:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) ) ) (otherlv_12= '<' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )* otherlv_16= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:564:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) ) ) (otherlv_12= '<' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )* otherlv_16= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure ) )? )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:564:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) ) ) (otherlv_12= '<' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )* otherlv_16= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:564:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:564:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:580:7: ( () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:580:8: () (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:580:8: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:581:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_2_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:586:2: (otherlv_9= '.' | ( (lv_nullSafe_10_0= '?.' ) ) | ( (lv_spreading_11_0= '*.' ) ) )
            	    int alt11=3;
            	    switch ( input.LA(1) ) {
            	    case 16:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt11=3;
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
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:586:4: otherlv_9= '.'
            	            {
            	            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleXMemberFeatureCall1265); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_9, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_2_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:591:6: ( (lv_nullSafe_10_0= '?.' ) )
            	            {
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:591:6: ( (lv_nullSafe_10_0= '?.' ) )
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:592:1: (lv_nullSafe_10_0= '?.' )
            	            {
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:592:1: (lv_nullSafe_10_0= '?.' )
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:593:3: lv_nullSafe_10_0= '?.'
            	            {
            	            lv_nullSafe_10_0=(Token)match(input,23,FOLLOW_23_in_ruleXMemberFeatureCall1289); if (state.failed) return current;
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
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:607:6: ( (lv_spreading_11_0= '*.' ) )
            	            {
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:607:6: ( (lv_spreading_11_0= '*.' ) )
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:608:1: (lv_spreading_11_0= '*.' )
            	            {
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:608:1: (lv_spreading_11_0= '*.' )
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:609:3: lv_spreading_11_0= '*.'
            	            {
            	            lv_spreading_11_0=(Token)match(input,24,FOLLOW_24_in_ruleXMemberFeatureCall1326); if (state.failed) return current;
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

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:622:5: (otherlv_12= '<' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )* otherlv_16= '>' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==25) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:622:7: otherlv_12= '<' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )* otherlv_16= '>'
            	            {
            	            otherlv_12=(Token)match(input,25,FOLLOW_25_in_ruleXMemberFeatureCall1355); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_2_1_0());
            	                  
            	            }
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:626:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:627:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:627:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:628:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall1376);
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

            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:644:2: (otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop12:
            	            do {
            	                int alt12=2;
            	                int LA12_0 = input.LA(1);

            	                if ( (LA12_0==22) ) {
            	                    alt12=1;
            	                }


            	                switch (alt12) {
            	            	case 1 :
            	            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:644:4: otherlv_14= ',' ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleXMemberFeatureCall1389); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_2_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:648:1: ( (lv_typeArguments_15_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:649:1: (lv_typeArguments_15_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:649:1: (lv_typeArguments_15_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:650:3: lv_typeArguments_15_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall1410);
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
            	            	    break loop12;
            	                }
            	            } while (true);

            	            otherlv_16=(Token)match(input,26,FOLLOW_26_in_ruleXMemberFeatureCall1424); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_16, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_2_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:670:3: ( ( ruleValidID ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:671:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:671:1: ( ruleValidID )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:672:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_2_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall1449);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:685:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')' )?
            	    int alt16=2;
            	    alt16 = dfa16.predict(input);
            	    switch (alt16) {
            	        case 1 :
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:685:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')'
            	            {
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:685:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) )
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:685:4: ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' )
            	            {
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:692:1: (lv_explicitOperationCall_18_0= '(' )
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:693:3: lv_explicitOperationCall_18_0= '('
            	            {
            	            lv_explicitOperationCall_18_0=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall1483); if (state.failed) return current;
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

            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:706:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )?
            	            int alt15=3;
            	            alt15 = dfa15.predict(input);
            	            switch (alt15) {
            	                case 1 :
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:706:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:706:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) )
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:706:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:723:1: (lv_memberCallArguments_19_0= ruleXShortClosure )
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:724:3: lv_memberCallArguments_19_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_2_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall1568);
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
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:741:6: ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:741:6: ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:741:7: ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:741:7: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:742:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:742:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:743:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_2_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall1596);
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

            	                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:759:2: (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )*
            	                    loop14:
            	                    do {
            	                        int alt14=2;
            	                        int LA14_0 = input.LA(1);

            	                        if ( (LA14_0==22) ) {
            	                            alt14=1;
            	                        }


            	                        switch (alt14) {
            	                    	case 1 :
            	                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:759:4: otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_21=(Token)match(input,22,FOLLOW_22_in_ruleXMemberFeatureCall1609); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_2_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:763:1: ( (lv_memberCallArguments_22_0= ruleXExpression ) )
            	                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:764:1: (lv_memberCallArguments_22_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:764:1: (lv_memberCallArguments_22_0= ruleXExpression )
            	                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:765:3: lv_memberCallArguments_22_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_2_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall1630);
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
            	                    	    break loop14;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_23=(Token)match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall1647); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_23, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_2_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:785:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure ) )?
            	    int alt17=2;
            	    alt17 = dfa17.predict(input);
            	    switch (alt17) {
            	        case 1 :
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:785:4: ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure )
            	            {
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:788:1: (lv_memberCallArguments_24_0= ruleXClosure )
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:789:3: lv_memberCallArguments_24_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_2_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall1682);
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleNavigationLiteral"
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:813:1: entryRuleNavigationLiteral returns [EObject current=null] : iv_ruleNavigationLiteral= ruleNavigationLiteral EOF ;
    public final EObject entryRuleNavigationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationLiteral = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:814:2: (iv_ruleNavigationLiteral= ruleNavigationLiteral EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:815:2: iv_ruleNavigationLiteral= ruleNavigationLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNavigationLiteral_in_entryRuleNavigationLiteral1722);
            iv_ruleNavigationLiteral=ruleNavigationLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNavigationLiteral1732); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:822:1: ruleNavigationLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FILE ) ) ) ;
    public final EObject ruleNavigationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:825:28: ( ( () ( (lv_value_1_0= RULE_FILE ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:826:1: ( () ( (lv_value_1_0= RULE_FILE ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:826:1: ( () ( (lv_value_1_0= RULE_FILE ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:826:2: () ( (lv_value_1_0= RULE_FILE ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:826:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:827:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNavigationLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:832:2: ( (lv_value_1_0= RULE_FILE ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:833:1: (lv_value_1_0= RULE_FILE )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:833:1: (lv_value_1_0= RULE_FILE )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:834:3: lv_value_1_0= RULE_FILE
            {
            lv_value_1_0=(Token)match(input,RULE_FILE,FOLLOW_RULE_FILE_in_ruleNavigationLiteral1783); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:858:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:859:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:860:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1824);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1834); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:867:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:870:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:872:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1880);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:888:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:889:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:890:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1914);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1924); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:897:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:900:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:901:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:901:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==EOF||(LA20_1>=RULE_ID && LA20_1<=RULE_DECIMAL)||LA20_1==16||LA20_1==18||LA20_1==20||(LA20_1>=22 && LA20_1<=51)||(LA20_1>=53 && LA20_1<=79)) ) {
                    alt20=2;
                }
                else if ( (LA20_1==19) ) {
                    alt20=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_DECIMAL)||LA20_0==25||LA20_0==27||(LA20_0>=43 && LA20_0<=44)||LA20_0==49||LA20_0==51||LA20_0==55||LA20_0==57||LA20_0==59||(LA20_0>=63 && LA20_0<=65)||LA20_0==68||(LA20_0>=70 && LA20_0<=77)) ) {
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:901:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:901:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:901:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:901:3: ()
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:902:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:907:2: ( ( ruleValidID ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:908:1: ( ruleValidID )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:908:1: ( ruleValidID )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:909:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1982);
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
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1998);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:930:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:931:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:931:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:932:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2018);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:949:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:949:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:950:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment2048);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:958:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==29) ) {
                        int LA19_1 = input.LA(2);

                        if ( (synpred7_InternalBuildDSL()) ) {
                            alt19=1;
                        }
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:958:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:958:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:958:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:963:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:963:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:963:7: ()
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:964:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:969:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:970:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:970:1: ( ruleOpMultiAssign )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:971:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2101);
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

                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:984:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:985:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:985:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:986:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2124);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1010:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1011:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1012:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2164);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign2175); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1019:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1022:28: (kw= '=' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1024:2: kw= '='
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpSingleAssign2212); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1037:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1038:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1039:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2252);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign2263); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1046:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1049:28: (kw= '+=' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1051:2: kw= '+='
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpMultiAssign2300); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1064:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1065:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1066:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2339);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression2349); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1073:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1076:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1077:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1077:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1078:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2396);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1086:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred8_InternalBuildDSL()) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1086:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1086:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1086:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1091:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1091:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1091:7: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1092:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1097:2: ( ( ruleOpOr ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1098:1: ( ruleOpOr )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1098:1: ( ruleOpOr )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1099:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression2449);
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

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1112:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1113:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1113:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1114:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression2472);
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1138:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1139:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1140:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr2511);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr2522); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1147:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1150:28: (kw= '||' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1152:2: kw= '||'
            {
            kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOr2559); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1165:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1166:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1167:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2598);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression2608); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1174:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1177:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1178:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1178:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1179:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2655);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1187:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred9_InternalBuildDSL()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1187:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1187:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1187:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1192:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1192:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1192:7: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1193:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1198:2: ( ( ruleOpAnd ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1199:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1199:1: ( ruleOpAnd )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1200:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression2708);
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

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1213:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1214:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1214:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1215:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2731);
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1239:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1240:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1241:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd2770);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd2781); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1248:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1251:28: (kw= '&&' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1253:2: kw= '&&'
            {
            kw=(Token)match(input,31,FOLLOW_31_in_ruleOpAnd2818); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1266:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1267:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1268:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2857);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2867); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1275:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1278:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1279:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1279:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1280:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2914);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1288:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    int LA23_2 = input.LA(2);

                    if ( (synpred10_InternalBuildDSL()) ) {
                        alt23=1;
                    }


                }
                else if ( (LA23_0==33) ) {
                    int LA23_3 = input.LA(2);

                    if ( (synpred10_InternalBuildDSL()) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1288:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1288:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1288:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1293:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1293:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1293:7: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1294:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1299:2: ( ( ruleOpEquality ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1300:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1300:1: ( ruleOpEquality )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1301:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2967);
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

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1314:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1315:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1315:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1316:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2990);
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1340:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1341:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1342:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality3029);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality3040); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1349:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1352:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1353:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1353:1: (kw= '==' | kw= '!=' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            else if ( (LA24_0==33) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1354:2: kw= '=='
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpEquality3078); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1361:2: kw= '!='
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpEquality3097); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1374:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1375:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1376:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3137);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression3147); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1383:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1386:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1387:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1387:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1388:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3194);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1396:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop25:
            do {
                int alt25=3;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    int LA25_2 = input.LA(2);

                    if ( (synpred12_InternalBuildDSL()) ) {
                        alt25=2;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA25_3 = input.LA(2);

                    if ( (synpred12_InternalBuildDSL()) ) {
                        alt25=2;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA25_4 = input.LA(2);

                    if ( (synpred11_InternalBuildDSL()) ) {
                        alt25=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA25_5 = input.LA(2);

                    if ( (synpred12_InternalBuildDSL()) ) {
                        alt25=2;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA25_6 = input.LA(2);

                    if ( (synpred12_InternalBuildDSL()) ) {
                        alt25=2;
                    }


                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1396:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1396:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1396:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1396:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1396:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1398:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1398:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1398:6: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1399:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleXRelationalExpression3230); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1408:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1409:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1409:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1410:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression3253);
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
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1427:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1427:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1427:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1427:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1427:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1432:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1432:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1432:7: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1433:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1438:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1439:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1439:1: ( ruleOpCompare )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1440:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3314);
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

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1453:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1454:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1454:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1455:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3337);
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
            	    break loop25;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1479:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1480:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1481:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare3377);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare3388); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1488:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1491:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1492:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1492:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt26=1;
                }
                break;
            case 36:
                {
                alt26=2;
                }
                break;
            case 26:
                {
                alt26=3;
                }
                break;
            case 25:
                {
                alt26=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1493:2: kw= '>='
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpCompare3426); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1500:2: kw= '<='
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpCompare3445); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1507:2: kw= '>'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare3464); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1514:2: kw= '<'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare3483); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1527:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1528:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1529:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3523);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3533); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1536:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1539:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1540:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1540:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1541:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3580);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1549:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1549:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1549:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1549:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1554:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1554:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1554:7: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1555:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1560:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1561:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1561:1: ( ruleOpOther )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1562:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3633);
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

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1575:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1576:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1576:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1577:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3656);
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
            	    break loop27;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1601:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1602:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1603:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther3695);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther3706); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1610:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1613:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1614:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1614:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt30=8;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt30=1;
                }
                break;
            case 38:
                {
                alt30=2;
                }
                break;
            case 39:
                {
                alt30=3;
                }
                break;
            case 26:
                {
                alt30=4;
                }
                break;
            case 25:
                {
                alt30=5;
                }
                break;
            case 40:
                {
                alt30=6;
                }
                break;
            case 41:
                {
                alt30=7;
                }
                break;
            case 42:
                {
                alt30=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1615:2: kw= '->'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpOther3744); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1622:2: kw= '..'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpOther3763); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1629:2: kw= '=>'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpOther3782); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1635:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1635:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1636:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther3802); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1641:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==26) ) {
                        int LA28_1 = input.LA(2);

                        if ( (LA28_1==26) && (synpred14_InternalBuildDSL())) {
                            alt28=1;
                        }
                        else if ( (LA28_1==EOF||LA28_1==RULE_ID||(LA28_1>=RULE_STRING && LA28_1<=RULE_DECIMAL)||LA28_1==25||LA28_1==27||(LA28_1>=43 && LA28_1<=44)||LA28_1==49||LA28_1==51||LA28_1==55||LA28_1==57||LA28_1==59||(LA28_1>=63 && LA28_1<=65)||LA28_1==68||(LA28_1>=70 && LA28_1<=77)) ) {
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
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1641:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1641:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1641:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1645:5: (kw= '>' kw= '>' )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1646:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther3833); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther3846); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1659:2: kw= '>'
                            {
                            kw=(Token)match(input,26,FOLLOW_26_in_ruleOpOther3867); if (state.failed) return current;
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1665:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1665:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1666:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther3889); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1671:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==25) ) {
                        int LA29_1 = input.LA(2);

                        if ( (synpred15_InternalBuildDSL()) ) {
                            alt29=1;
                        }
                        else if ( (true) ) {
                            alt29=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 29, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1671:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1671:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1671:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1675:5: (kw= '<' kw= '<' )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1676:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther3920); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther3933); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1689:2: kw= '<'
                            {
                            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpOther3954); if (state.failed) return current;
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1696:2: kw= '<>'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpOther3975); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1703:2: kw= '?:'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpOther3994); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1710:2: kw= '<=>'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpOther4013); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1723:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1724:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1725:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4053);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression4063); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1732:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1735:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1736:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1736:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1737:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4110);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1745:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==43) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred16_InternalBuildDSL()) ) {
                        alt31=1;
                    }


                }
                else if ( (LA31_0==44) ) {
                    int LA31_3 = input.LA(2);

                    if ( (synpred16_InternalBuildDSL()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1745:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1745:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1745:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1750:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1750:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1750:7: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1751:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1756:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1757:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1757:1: ( ruleOpAdd )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1758:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4163);
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

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1771:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1772:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1772:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1773:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4186);
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1797:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1798:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1799:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd4225);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd4236); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1806:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1809:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1810:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1810:1: (kw= '+' | kw= '-' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==43) ) {
                alt32=1;
            }
            else if ( (LA32_0==44) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1811:2: kw= '+'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpAdd4274); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1818:2: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpAdd4293); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1831:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1832:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1833:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4333);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4343); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1840:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1843:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1844:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1844:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1845:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4390);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1853:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop33:
            do {
                int alt33=2;
                switch ( input.LA(1) ) {
                case 45:
                    {
                    int LA33_2 = input.LA(2);

                    if ( (synpred17_InternalBuildDSL()) ) {
                        alt33=1;
                    }


                    }
                    break;
                case 46:
                    {
                    int LA33_3 = input.LA(2);

                    if ( (synpred17_InternalBuildDSL()) ) {
                        alt33=1;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA33_4 = input.LA(2);

                    if ( (synpred17_InternalBuildDSL()) ) {
                        alt33=1;
                    }


                    }
                    break;
                case 48:
                    {
                    int LA33_5 = input.LA(2);

                    if ( (synpred17_InternalBuildDSL()) ) {
                        alt33=1;
                    }


                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1853:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1853:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1853:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1858:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1858:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1858:7: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1859:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1864:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1865:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1865:1: ( ruleOpMulti )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1866:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4443);
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

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1879:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1880:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1880:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1881:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4466);
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
            	    break loop33;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1905:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1906:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1907:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti4505);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti4516); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1914:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1917:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1918:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1918:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt34=1;
                }
                break;
            case 46:
                {
                alt34=2;
                }
                break;
            case 47:
                {
                alt34=3;
                }
                break;
            case 48:
                {
                alt34=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1919:2: kw= '*'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpMulti4554); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1926:2: kw= '**'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpMulti4573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1933:2: kw= '/'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOpMulti4592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1940:2: kw= '%'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOpMulti4611); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1953:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1954:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1955:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4651);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation4661); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1962:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1965:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1966:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1966:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=43 && LA35_0<=44)||LA35_0==49) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_ID||(LA35_0>=RULE_STRING && LA35_0<=RULE_DECIMAL)||LA35_0==25||LA35_0==27||LA35_0==51||LA35_0==55||LA35_0==57||LA35_0==59||(LA35_0>=63 && LA35_0<=65)||LA35_0==68||(LA35_0>=70 && LA35_0<=77)) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1966:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1966:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1966:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1966:3: ()
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1967:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1972:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1973:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1973:1: ( ruleOpUnary )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1974:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4719);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1987:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1988:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1988:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1989:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4740);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2007:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4769);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2023:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2024:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2025:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary4805);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary4816); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2032:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2035:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2036:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2036:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt36=1;
                }
                break;
            case 44:
                {
                alt36=2;
                }
                break;
            case 43:
                {
                alt36=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2037:2: kw= '!'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleOpUnary4854); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2044:2: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpUnary4873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2051:2: kw= '+'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpUnary4892); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2064:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2065:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2066:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4932);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression4942); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2073:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2076:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2077:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2077:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2078:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4989);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2086:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==50) ) {
                    int LA37_2 = input.LA(2);

                    if ( (synpred18_InternalBuildDSL()) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2086:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2086:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2086:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2088:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2088:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2088:6: ()
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2089:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleXCastedExpression5024); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2098:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2099:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2099:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2100:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5047);
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
            	    break loop37;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2124:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2125:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2126:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5085);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression5095); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2133:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2136:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2137:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2137:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt38=13;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2138:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5142);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2148:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5169);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2158:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5196);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2168:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5223);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2178:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5250);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2188:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5277);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2198:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5304);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2208:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5331);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2218:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5358);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2228:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5385);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2238:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5412);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2248:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5439);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2258:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5466);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2274:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2275:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2276:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5501);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5511); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2283:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2286:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2287:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2287:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt39=6;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==51) && (synpred19_InternalBuildDSL())) {
                alt39=1;
            }
            else if ( ((LA39_0>=71 && LA39_0<=72)) ) {
                alt39=2;
            }
            else if ( ((LA39_0>=RULE_HEX && LA39_0<=RULE_DECIMAL)) ) {
                alt39=3;
            }
            else if ( (LA39_0==73) ) {
                alt39=4;
            }
            else if ( (LA39_0==RULE_STRING) ) {
                alt39=5;
            }
            else if ( (LA39_0==74) ) {
                alt39=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2287:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2287:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2287:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5571);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2300:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5599);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2310:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5626);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2320:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5653);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2330:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5680);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2340:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5707);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2356:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2357:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2358:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5742);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5752); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2365:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2368:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2369:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2369:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2369:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2369:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2369:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2371:5: ( () otherlv_1= '[' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2371:6: () otherlv_1= '['
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2371:6: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2372:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXClosure5812); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2381:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2381:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2396:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2396:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2396:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ID||LA41_0==27||LA41_0==39) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2396:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2396:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2397:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2397:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2398:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5885);
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

                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2414:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==22) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2414:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleXClosure5898); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2418:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2419:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2419:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2420:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5919);
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
                            	    break loop40;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2436:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2437:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2437:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2438:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,52,FOLLOW_52_in_ruleXClosure5941); if (state.failed) return current;
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2451:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2452:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2452:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2453:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5978);
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

            otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleXClosure5990); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2481:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2482:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2483:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6026);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure6036); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2490:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2493:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2494:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2494:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2494:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2494:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2495:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2500:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID||(LA44_0>=RULE_STRING && LA44_0<=RULE_DECIMAL)||LA44_0==25||LA44_0==27||(LA44_0>=43 && LA44_0<=44)||LA44_0==49||LA44_0==51||LA44_0==55||LA44_0==57||LA44_0==59||(LA44_0>=63 && LA44_0<=68)||(LA44_0>=70 && LA44_0<=77)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2500:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2500:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2501:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2501:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2502:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6092);
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

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2518:2: (otherlv_2= ';' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==54) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2518:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleXExpressionInClosure6105); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2530:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2531:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2532:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6145);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure6155); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2539:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2542:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2543:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2543:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2543:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2543:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2543:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2559:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2559:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2559:7: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2560:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2565:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==27||LA46_0==39) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2565:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2565:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2566:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2566:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2567:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6263);
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

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2583:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==22) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2583:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXShortClosure6276); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2587:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2588:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2588:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2589:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6297);
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
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2605:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2606:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2606:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2607:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,52,FOLLOW_52_in_ruleXShortClosure6319); if (state.failed) return current;
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2620:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2621:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2621:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2622:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure6355);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2646:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2647:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2648:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6391);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6401); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2655:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2658:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2659:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2659:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2659:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleXParenthesizedExpression6438); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6460);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleXParenthesizedExpression6471); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2684:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2685:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2686:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6507);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6517); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2693:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2696:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2697:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2697:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2697:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2697:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2698:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXIfExpression6563); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXIfExpression6575); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2711:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2712:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2712:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2713:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6596);
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleXIfExpression6608); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2733:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2734:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2734:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2735:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6629);
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2751:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==56) ) {
                int LA47_1 = input.LA(2);

                if ( (synpred23_InternalBuildDSL()) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2751:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2751:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2751:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,56,FOLLOW_56_in_ruleXIfExpression6650); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2756:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2757:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2757:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2758:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6672);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2782:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2783:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2784:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6710);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6720); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2791:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2794:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2795:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2795:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2795:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2795:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2796:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6766); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2805:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID||(LA49_0>=RULE_STRING && LA49_0<=RULE_DECIMAL)||LA49_0==25||(LA49_0>=43 && LA49_0<=44)||LA49_0==49||LA49_0==51||LA49_0==55||LA49_0==57||LA49_0==59||(LA49_0>=63 && LA49_0<=65)||LA49_0==68||(LA49_0>=70 && LA49_0<=77)) ) {
                alt49=1;
            }
            else if ( (LA49_0==27) ) {
                int LA49_2 = input.LA(2);

                if ( (LA49_2==RULE_ID) ) {
                    int LA49_3 = input.LA(3);

                    if ( (LA49_3==58) && (synpred25_InternalBuildDSL())) {
                        alt49=2;
                    }
                    else if ( (LA49_3==RULE_FILE||LA49_3==16||LA49_3==19||(LA49_3>=23 && LA49_3<=48)||(LA49_3>=50 && LA49_3<=51)||LA49_3==69) ) {
                        alt49=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA49_2>=RULE_STRING && LA49_2<=RULE_DECIMAL)||LA49_2==25||LA49_2==27||(LA49_2>=43 && LA49_2<=44)||LA49_2==49||LA49_2==51||LA49_2==55||LA49_2==57||LA49_2==59||(LA49_2>=63 && LA49_2<=65)||LA49_2==68||(LA49_2>=70 && LA49_2<=77)) ) {
                    alt49=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2805:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2805:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2805:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2805:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_ID) ) {
                        int LA48_1 = input.LA(2);

                        if ( (LA48_1==58) && (synpred24_InternalBuildDSL())) {
                            alt48=1;
                        }
                    }
                    switch (alt48) {
                        case 1 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2805:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2810:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2810:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2810:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2811:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2811:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2812:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6809);
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

                            otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleXSwitchExpression6821); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2832:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2833:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2833:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2834:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6845);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2851:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2851:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2851:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2851:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2851:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2857:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2857:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleXSwitchExpression6889); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2861:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2862:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2862:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2863:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6910);
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

                    otherlv_7=(Token)match(input,58,FOLLOW_58_in_ruleXSwitchExpression6922); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2883:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2884:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2884:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2885:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6945);
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

                    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleXSwitchExpression6957); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,59,FOLLOW_59_in_ruleXSwitchExpression6971); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2909:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID||LA50_0==27||LA50_0==39||LA50_0==58||LA50_0==62) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2910:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2910:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2911:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6992);
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
            	    if ( cnt50 >= 1 ) break loop50;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2927:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==60) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2927:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,60,FOLLOW_60_in_ruleXSwitchExpression7006); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,58,FOLLOW_58_in_ruleXSwitchExpression7018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2935:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2936:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2936:1: (lv_default_14_0= ruleXExpression )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2937:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7039);
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

            otherlv_15=(Token)match(input,61,FOLLOW_61_in_ruleXSwitchExpression7053); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2965:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2966:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2967:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart7089);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart7099); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2974:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2977:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2978:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2978:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2978:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2978:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID||LA52_0==27||LA52_0==39) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2979:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2979:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2980:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7145);
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2996:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==62) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2996:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXCasePart7159); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3000:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3001:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3001:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3002:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7180);
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

            otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleXCasePart7194); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3022:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3023:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3023:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3024:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart7215);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3048:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3049:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3050:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7251);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression7261); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3057:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3060:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3061:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3061:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3061:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3061:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3062:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXForLoopExpression7307); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXForLoopExpression7319); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3075:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3076:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3076:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3077:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7340);
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

            otherlv_4=(Token)match(input,58,FOLLOW_58_in_ruleXForLoopExpression7352); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3097:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3098:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3098:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3099:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7373);
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

            otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleXForLoopExpression7385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3119:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3120:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3120:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3121:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression7406);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3145:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3146:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3147:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7442);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression7452); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3154:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3157:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3158:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3158:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3158:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3158:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3159:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXWhileExpression7498); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXWhileExpression7510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3172:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3173:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3173:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3174:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7531);
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleXWhileExpression7543); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3194:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3195:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3195:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3196:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7564);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3220:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3221:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3222:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7600);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7610); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3229:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3232:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3233:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3233:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3233:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3233:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3234:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXDoWhileExpression7656); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3243:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3244:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3244:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3245:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7677);
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

            otherlv_3=(Token)match(input,64,FOLLOW_64_in_ruleXDoWhileExpression7689); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleXDoWhileExpression7701); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3269:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3270:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3270:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3271:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7722);
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

            otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleXDoWhileExpression7734); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3299:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3300:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3301:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7770);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7780); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3308:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3311:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3312:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3312:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3312:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3312:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3313:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXBlockExpression7826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3322:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ID||(LA55_0>=RULE_STRING && LA55_0<=RULE_DECIMAL)||LA55_0==25||LA55_0==27||(LA55_0>=43 && LA55_0<=44)||LA55_0==49||LA55_0==51||LA55_0==55||LA55_0==57||LA55_0==59||(LA55_0>=63 && LA55_0<=68)||(LA55_0>=70 && LA55_0<=77)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3322:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3322:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3323:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3323:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3324:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7848);
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

            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3340:2: (otherlv_3= ';' )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==54) ) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3340:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXBlockExpression7861); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_4=(Token)match(input,61,FOLLOW_61_in_ruleXBlockExpression7877); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3356:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3357:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3358:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7913);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7923); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3365:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3368:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3369:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3369:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=66 && LA56_0<=67)) ) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_ID||(LA56_0>=RULE_STRING && LA56_0<=RULE_DECIMAL)||LA56_0==25||LA56_0==27||(LA56_0>=43 && LA56_0<=44)||LA56_0==49||LA56_0==51||LA56_0==55||LA56_0==57||LA56_0==59||(LA56_0>=63 && LA56_0<=65)||LA56_0==68||(LA56_0>=70 && LA56_0<=77)) ) {
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3370:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7970);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3380:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7997);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3396:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3397:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3398:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8032);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8042); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3405:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3408:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3409:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3409:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3409:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3409:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3410:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3415:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==66) ) {
                alt57=1;
            }
            else if ( (LA57_0==67) ) {
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3415:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3415:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3416:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3416:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3417:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,66,FOLLOW_66_in_ruleXVariableDeclaration8095); if (state.failed) return current;
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3431:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleXVariableDeclaration8126); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3435:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                int LA58_1 = input.LA(2);

                if ( (synpred26_InternalBuildDSL()) ) {
                    alt58=1;
                }
                else if ( (true) ) {
                    alt58=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA58_0==27) && (synpred26_InternalBuildDSL())) {
                alt58=1;
            }
            else if ( (LA58_0==39) && (synpred26_InternalBuildDSL())) {
                alt58=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3435:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3435:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3435:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3443:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3443:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3443:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3444:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3444:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3445:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8174);
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

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3461:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3462:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3462:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3463:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8195);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3480:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3480:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3481:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3481:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3482:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration8224);
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3498:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==19) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3498:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleXVariableDeclaration8238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3502:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3503:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3503:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3504:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8259);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3528:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3529:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3530:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8297);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter8307); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3537:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3540:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3541:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3541:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3541:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3541:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==RULE_ID||LA60_1==16||LA60_1==25||LA60_1==51) ) {
                    alt60=1;
                }
            }
            else if ( (LA60_0==27||LA60_0==39) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3542:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3542:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3543:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8353);
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3559:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3560:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3560:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3561:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter8375);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3585:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3586:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3587:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8411);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8421); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3594:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3597:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3598:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3598:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3598:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3598:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3599:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3599:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3600:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8467);
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3616:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3617:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3617:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3618:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8488);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3642:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3643:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3644:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8524);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8534); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3651:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3654:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3655:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3655:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3655:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3655:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3656:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3661:2: ( ( ruleStaticQualifier ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==69) ) {
                    alt61=1;
                }
            }
            switch (alt61) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3662:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3662:1: ( ruleStaticQualifier )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3663:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8591);
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3676:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==25) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3676:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleXFeatureCall8605); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3680:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3681:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3681:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3682:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8626);
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

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3698:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==22) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3698:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleXFeatureCall8639); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3702:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3703:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3703:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3704:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8660);
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
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleXFeatureCall8674); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3724:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3725:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3725:1: ( ruleIdOrSuper )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3726:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8699);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3739:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3739:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3739:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3739:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3746:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3747:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,27,FOLLOW_27_in_ruleXFeatureCall8733); if (state.failed) return current;
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

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3760:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt65=3;
                    alt65 = dfa65.predict(input);
                    switch (alt65) {
                        case 1 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3760:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3760:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3760:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3777:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3778:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8818);
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
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3795:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3795:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3795:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3795:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3796:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3796:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3797:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8846);
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

                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3813:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop64:
                            do {
                                int alt64=2;
                                int LA64_0 = input.LA(1);

                                if ( (LA64_0==22) ) {
                                    alt64=1;
                                }


                                switch (alt64) {
                            	case 1 :
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3813:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleXFeatureCall8859); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3817:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3818:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3818:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3819:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8880);
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
                            	    break loop64;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,28,FOLLOW_28_in_ruleXFeatureCall8897); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3839:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3839:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3842:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3843:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8932);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3867:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3868:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3869:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8970);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8981); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3876:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3879:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3880:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3880:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                alt68=1;
            }
            else if ( (LA68_0==68) ) {
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3881:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper9028);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3893:2: kw= 'super'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleIdOrSuper9052); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3906:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3907:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3908:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9093);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier9104); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3915:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3918:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3919:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3919:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt69=0;
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_ID) ) {
                    int LA69_2 = input.LA(2);

                    if ( (LA69_2==69) ) {
                        alt69=1;
                    }


                }


                switch (alt69) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3920:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier9151);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,69,FOLLOW_69_in_ruleStaticQualifier9169); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt69 >= 1 ) break loop69;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(69, input);
                        throw eee;
                }
                cnt69++;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3944:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3945:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3946:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9210);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9220); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3953:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3956:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3957:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3957:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3957:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3957:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3958:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXConstructorCall9266); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3967:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3968:1: ( ruleQualifiedName )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3968:1: ( ruleQualifiedName )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3969:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9289);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3982:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3982:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3982:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3982:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleXConstructorCall9310); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3987:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3988:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3988:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3989:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9332);
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

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4005:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==22) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4005:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleXConstructorCall9345); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4009:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4010:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4010:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4011:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9366);
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
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleXConstructorCall9380); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4031:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4031:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4031:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4031:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleXConstructorCall9403); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4036:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt73=3;
                    alt73 = dfa73.predict(input);
                    switch (alt73) {
                        case 1 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4036:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4036:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4036:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4053:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4054:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9476);
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
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4071:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4071:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4071:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4071:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4072:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4072:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4073:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9504);
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

                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4089:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop72:
                            do {
                                int alt72=2;
                                int LA72_0 = input.LA(1);

                                if ( (LA72_0==22) ) {
                                    alt72=1;
                                }


                                switch (alt72) {
                            	case 1 :
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4089:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleXConstructorCall9517); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4093:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4094:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4094:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4095:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9538);
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
                            	    break loop72;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,28,FOLLOW_28_in_ruleXConstructorCall9555); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4115:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt75=2;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4115:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4118:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4119:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9590);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4143:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4144:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4145:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9627);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9637); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4152:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4155:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4156:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4156:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4156:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4156:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4157:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4162:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==71) ) {
                alt76=1;
            }
            else if ( (LA76_0==72) ) {
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4162:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXBooleanLiteral9684); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4167:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4167:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4168:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4168:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4169:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,72,FOLLOW_72_in_ruleXBooleanLiteral9708); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4190:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4191:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4192:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9758);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9768); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4199:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4202:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4203:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4203:1: ( () otherlv_1= 'null' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4203:2: () otherlv_1= 'null'
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4203:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4204:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXNullLiteral9814); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4221:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4222:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4223:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9850);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9860); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4230:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4233:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4234:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4234:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4234:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4234:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4235:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4240:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4241:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4241:1: (lv_value_1_0= ruleNumber )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4242:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9915);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4266:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4267:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4268:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9951);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9961); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4275:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4278:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4279:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4279:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4279:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4279:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4280:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4285:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4286:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4286:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4287:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral10012); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4311:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4312:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4313:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10053);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral10063); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4320:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4323:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4324:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4324:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4324:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4324:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4325:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleXTypeLiteral10109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleXTypeLiteral10121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4338:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4339:1: ( ruleQualifiedName )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4339:1: ( ruleQualifiedName )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4340:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10144);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleXTypeLiteral10156); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4365:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4366:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4367:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10192);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10202); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4374:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4377:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4378:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4378:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4378:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4378:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4379:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleXThrowExpression10248); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4388:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4389:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4389:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4390:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10269);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4414:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4415:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4416:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10305);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression10315); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4423:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4426:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4427:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4427:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4427:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4427:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4428:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleXReturnExpression10361); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4437:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt77=2;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4437:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4442:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4443:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression10392);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4467:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4468:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4469:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10429);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10439); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4476:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4479:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4480:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4480:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4480:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4480:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4481:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleXTryCatchFinallyExpression10485); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4490:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4491:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4491:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4492:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10506);
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

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4508:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4508:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4508:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4508:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4508:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt78=0;
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==79) ) {
                            int LA78_2 = input.LA(2);

                            if ( (synpred35_InternalBuildDSL()) ) {
                                alt78=1;
                            }


                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4508:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4510:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4511:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10536);
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

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4527:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==78) ) {
                        int LA79_1 = input.LA(2);

                        if ( (synpred36_InternalBuildDSL()) ) {
                            alt79=1;
                        }
                    }
                    switch (alt79) {
                        case 1 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4527:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4527:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4527:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,78,FOLLOW_78_in_ruleXTryCatchFinallyExpression10558); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4532:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4533:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4533:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4534:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10580);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4551:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4551:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4551:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,78,FOLLOW_78_in_ruleXTryCatchFinallyExpression10602); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4555:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4556:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4556:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4557:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10623);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4581:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4582:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4583:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10661);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10671); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4590:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4593:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4594:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4594:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4594:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4594:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4594:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleXCatchClause10716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleXCatchClause10729); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4603:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4604:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4604:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4605:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10750);
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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleXCatchClause10762); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4625:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4626:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4626:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4627:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10783);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4651:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4652:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4653:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10820);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10831); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4660:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4663:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4664:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4664:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4665:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10878);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4675:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==16) ) {
                    int LA81_2 = input.LA(2);

                    if ( (LA81_2==RULE_ID) ) {
                        int LA81_3 = input.LA(3);

                        if ( (synpred38_InternalBuildDSL()) ) {
                            alt81=1;
                        }


                    }


                }


                switch (alt81) {
            	case 1 :
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4675:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4675:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4675:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedName10906); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10929);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4702:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4706:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4707:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10983);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10994); if (state.failed) return current;

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4717:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4721:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4722:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4722:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4722:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber11038); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4730:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4730:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4730:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4730:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
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
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4730:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11066); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4738:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11092); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4745:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==16) ) {
                        int LA84_1 = input.LA(2);

                        if ( ((LA84_1>=RULE_INT && LA84_1<=RULE_DECIMAL)) ) {
                            alt84=1;
                        }
                    }
                    switch (alt84) {
                        case 1 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4746:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,16,FOLLOW_16_in_ruleNumber11112); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4751:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
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
                                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4751:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber11128); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4759:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber11154); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4777:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4778:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4779:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11207);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference11217); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4786:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4789:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4790:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4790:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_ID) ) {
                alt87=1;
            }
            else if ( (LA87_0==27||LA87_0==39) ) {
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4790:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4790:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4791:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11265);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4799:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==51) ) {
                            int LA86_2 = input.LA(2);

                            if ( (LA86_2==53) ) {
                                int LA86_3 = input.LA(3);

                                if ( (synpred39_InternalBuildDSL()) ) {
                                    alt86=1;
                                }


                            }


                        }


                        switch (alt86) {
                    	case 1 :
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4799:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4802:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4802:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4802:6: ()
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4803:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleJvmTypeReference11303); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,53,FOLLOW_53_in_ruleJvmTypeReference11315); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4818:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11347);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4834:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4835:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4836:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11382);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11392); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4843:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
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
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4846:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4847:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4847:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4847:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4847:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==27) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4847:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleXFunctionTypeRef11430); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4851:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==RULE_ID||LA89_0==27||LA89_0==39) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4851:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4851:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4852:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4852:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4853:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11452);
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

                            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4869:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop88:
                            do {
                                int alt88=2;
                                int LA88_0 = input.LA(1);

                                if ( (LA88_0==22) ) {
                                    alt88=1;
                                }


                                switch (alt88) {
                            	case 1 :
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4869:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXFunctionTypeRef11465); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4873:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4874:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4874:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4875:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11486);
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

                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleXFunctionTypeRef11502); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleXFunctionTypeRef11516); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4899:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4900:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4900:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4901:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11537);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4925:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4926:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4927:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11573);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11583); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4934:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4937:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4938:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4938:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4938:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4938:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4939:1: ( ruleQualifiedName )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4939:1: ( ruleQualifiedName )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4940:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11631);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4953:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt92=2;
            alt92 = dfa92.predict(input);
            switch (alt92) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4953:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4953:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4953:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleJvmParameterizedTypeReference11652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4958:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4959:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4959:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4960:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11674);
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

                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4976:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==22) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4976:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleJvmParameterizedTypeReference11687); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4980:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4981:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4981:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4982:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11708);
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

                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleJvmParameterizedTypeReference11722); if (state.failed) return current;
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5010:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5011:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5012:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11760);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11770); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5019:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5022:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5023:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5023:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_ID||LA93_0==27||LA93_0==39) ) {
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5024:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11817);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5034:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11844);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5050:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5051:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5052:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11879);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11889); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5059:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5062:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5063:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5063:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5063:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5063:2: ()
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5064:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleJvmWildcardTypeReference11935); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5073:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt94=3;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==81) ) {
                alt94=1;
            }
            else if ( (LA94_0==68) ) {
                alt94=2;
            }
            switch (alt94) {
                case 1 :
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5073:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5073:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5074:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5074:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5075:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11957);
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
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5092:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5092:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5093:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5093:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5094:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11984);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5118:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5119:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5120:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12022);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound12032); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5127:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5130:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5131:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5131:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5131:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleJvmUpperBound12069); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5135:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5136:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5136:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5137:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12090);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5161:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5162:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5163:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12126);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12136); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5170:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5173:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5174:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5174:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5174:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleJvmUpperBoundAnded12173); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5178:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5179:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5179:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5180:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12194);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5204:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5205:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5206:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12230);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12240); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5213:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5216:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5217:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5217:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5217:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleJvmLowerBound12277); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5221:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5222:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5222:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5223:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12298);
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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5249:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5250:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5251:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12337);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12348); if (state.failed) return current;

            }

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
    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5258:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5261:28: (this_ID_0= RULE_ID )
            // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:5262:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12387); if (state.failed) return current;
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
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:476:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:476:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:476:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:476:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:476:6: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:477:1: 
        {
        }

        match(input,16,FOLLOW_16_in_synpred1_InternalBuildDSL1029); if (state.failed) return ;
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:478:1: ( ( ruleValidID ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:479:1: ( ruleValidID )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:479:1: ( ruleValidID )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:480:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred1_InternalBuildDSL1038);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred1_InternalBuildDSL1044);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalBuildDSL

    // $ANTLR start synpred2_InternalBuildDSL
    public final void synpred2_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:534:7: ( ( () ( ( ruleNavigationLiteral ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:534:8: ( () ( ( ruleNavigationLiteral ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:534:8: ( () ( ( ruleNavigationLiteral ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:534:9: () ( ( ruleNavigationLiteral ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:534:9: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:535:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:535:2: ( ( ruleNavigationLiteral ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:536:1: ( ruleNavigationLiteral )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:536:1: ( ruleNavigationLiteral )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:537:1: ruleNavigationLiteral
        {
        pushFollow(FOLLOW_ruleNavigationLiteral_in_synpred2_InternalBuildDSL1148);
        ruleNavigationLiteral();

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
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:564:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:564:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:564:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:564:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:564:10: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:565:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:565:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt95=3;
        switch ( input.LA(1) ) {
        case 16:
            {
            alt95=1;
            }
            break;
        case 23:
            {
            alt95=2;
            }
            break;
        case 24:
            {
            alt95=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 95, 0, input);

            throw nvae;
        }

        switch (alt95) {
            case 1 :
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:565:4: '.'
                {
                match(input,16,FOLLOW_16_in_synpred3_InternalBuildDSL1204); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:567:6: ( ( '?.' ) )
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:567:6: ( ( '?.' ) )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:568:1: ( '?.' )
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:568:1: ( '?.' )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:569:2: '?.'
                {
                match(input,23,FOLLOW_23_in_synpred3_InternalBuildDSL1218); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:574:6: ( ( '*.' ) )
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:574:6: ( ( '*.' ) )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:575:1: ( '*.' )
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:575:1: ( '*.' )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:576:2: '*.'
                {
                match(input,24,FOLLOW_24_in_synpred3_InternalBuildDSL1238); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred3_InternalBuildDSL

    // $ANTLR start synpred4_InternalBuildDSL
    public final void synpred4_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:685:4: ( ( '(' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:686:1: ( '(' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:686:1: ( '(' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:687:2: '('
        {
        match(input,27,FOLLOW_27_in_synpred4_InternalBuildDSL1465); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalBuildDSL

    // $ANTLR start synpred5_InternalBuildDSL
    public final void synpred5_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:706:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:706:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:706:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:706:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:706:6: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:707:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:707:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt97=2;
        int LA97_0 = input.LA(1);

        if ( (LA97_0==RULE_ID||LA97_0==27||LA97_0==39) ) {
            alt97=1;
        }
        switch (alt97) {
            case 1 :
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:707:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:707:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:708:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:708:1: ( ruleJvmFormalParameter )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:709:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred5_InternalBuildDSL1517);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:711:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop96:
                do {
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==22) ) {
                        alt96=1;
                    }


                    switch (alt96) {
                	case 1 :
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:711:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred5_InternalBuildDSL1524); if (state.failed) return ;
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:712:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:713:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:713:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:714:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred5_InternalBuildDSL1531);
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

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:716:6: ( ( '|' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:717:1: ( '|' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:717:1: ( '|' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:718:2: '|'
        {
        match(input,52,FOLLOW_52_in_synpred5_InternalBuildDSL1545); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalBuildDSL

    // $ANTLR start synpred6_InternalBuildDSL
    public final void synpred6_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:785:4: ( ( () '[' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:785:5: ( () '[' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:785:5: ( () '[' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:785:6: () '['
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:785:6: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:786:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred6_InternalBuildDSL1665); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalBuildDSL

    // $ANTLR start synpred7_InternalBuildDSL
    public final void synpred7_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:958:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:958:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:958:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:958:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:958:5: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:959:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:959:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:960:1: ( ruleOpMultiAssign )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:960:1: ( ruleOpMultiAssign )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:961:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred7_InternalBuildDSL2069);
        ruleOpMultiAssign();

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
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1086:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1086:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1086:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1086:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1086:5: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1087:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1087:2: ( ( ruleOpOr ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1088:1: ( ruleOpOr )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1088:1: ( ruleOpOr )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1089:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred8_InternalBuildDSL2417);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalBuildDSL

    // $ANTLR start synpred9_InternalBuildDSL
    public final void synpred9_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1187:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1187:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1187:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1187:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1187:5: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1188:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1188:2: ( ( ruleOpAnd ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1189:1: ( ruleOpAnd )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1189:1: ( ruleOpAnd )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1190:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred9_InternalBuildDSL2676);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalBuildDSL

    // $ANTLR start synpred10_InternalBuildDSL
    public final void synpred10_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1288:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1288:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1288:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1288:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1288:5: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1289:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1289:2: ( ( ruleOpEquality ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1290:1: ( ruleOpEquality )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1290:1: ( ruleOpEquality )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1291:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred10_InternalBuildDSL2935);
        ruleOpEquality();

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
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1396:4: ( ( () 'instanceof' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1396:5: ( () 'instanceof' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1396:5: ( () 'instanceof' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1396:6: () 'instanceof'
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1396:6: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1397:1: 
        {
        }

        match(input,34,FOLLOW_34_in_synpred11_InternalBuildDSL3211); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalBuildDSL

    // $ANTLR start synpred12_InternalBuildDSL
    public final void synpred12_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1427:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1427:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1427:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1427:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1427:10: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1428:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1428:2: ( ( ruleOpCompare ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1429:1: ( ruleOpCompare )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1429:1: ( ruleOpCompare )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1430:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred12_InternalBuildDSL3282);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred12_InternalBuildDSL

    // $ANTLR start synpred13_InternalBuildDSL
    public final void synpred13_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1549:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1549:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1549:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1549:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1549:5: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1550:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1550:2: ( ( ruleOpOther ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1551:1: ( ruleOpOther )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1551:1: ( ruleOpOther )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1552:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred13_InternalBuildDSL3601);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred13_InternalBuildDSL

    // $ANTLR start synpred14_InternalBuildDSL
    public final void synpred14_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1641:3: ( ( '>' '>' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1641:4: ( '>' '>' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1641:4: ( '>' '>' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1642:2: '>' '>'
        {
        match(input,26,FOLLOW_26_in_synpred14_InternalBuildDSL3817); if (state.failed) return ;
        match(input,26,FOLLOW_26_in_synpred14_InternalBuildDSL3822); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalBuildDSL

    // $ANTLR start synpred15_InternalBuildDSL
    public final void synpred15_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1671:3: ( ( '<' '<' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1671:4: ( '<' '<' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1671:4: ( '<' '<' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1672:2: '<' '<'
        {
        match(input,25,FOLLOW_25_in_synpred15_InternalBuildDSL3904); if (state.failed) return ;
        match(input,25,FOLLOW_25_in_synpred15_InternalBuildDSL3909); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalBuildDSL

    // $ANTLR start synpred16_InternalBuildDSL
    public final void synpred16_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1745:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1745:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1745:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1745:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1745:5: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1746:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1746:2: ( ( ruleOpAdd ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1747:1: ( ruleOpAdd )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1747:1: ( ruleOpAdd )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1748:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred16_InternalBuildDSL4131);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalBuildDSL

    // $ANTLR start synpred17_InternalBuildDSL
    public final void synpred17_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1853:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1853:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1853:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1853:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1853:5: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1854:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1854:2: ( ( ruleOpMulti ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1855:1: ( ruleOpMulti )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1855:1: ( ruleOpMulti )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:1856:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred17_InternalBuildDSL4411);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalBuildDSL

    // $ANTLR start synpred18_InternalBuildDSL
    public final void synpred18_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2086:3: ( ( () 'as' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2086:4: ( () 'as' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2086:4: ( () 'as' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2086:5: () 'as'
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2086:5: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2087:1: 
        {
        }

        match(input,50,FOLLOW_50_in_synpred18_InternalBuildDSL5005); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalBuildDSL

    // $ANTLR start synpred19_InternalBuildDSL
    public final void synpred19_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2287:3: ( ( () '[' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2287:4: ( () '[' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2287:4: ( () '[' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2287:5: () '['
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2287:5: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2288:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred19_InternalBuildDSL5552); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalBuildDSL

    // $ANTLR start synpred21_InternalBuildDSL
    public final void synpred21_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2381:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2381:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2381:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2381:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2381:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( (LA99_0==RULE_ID||LA99_0==27||LA99_0==39) ) {
            alt99=1;
        }
        switch (alt99) {
            case 1 :
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2381:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2381:7: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2382:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2382:1: ( ruleJvmFormalParameter )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2383:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred21_InternalBuildDSL5831);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2385:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop98:
                do {
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==22) ) {
                        alt98=1;
                    }


                    switch (alt98) {
                	case 1 :
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2385:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred21_InternalBuildDSL5838); if (state.failed) return ;
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2386:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2387:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2387:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2388:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred21_InternalBuildDSL5845);
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

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2390:6: ( ( '|' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2391:1: ( '|' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2391:1: ( '|' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2392:2: '|'
        {
        match(input,52,FOLLOW_52_in_synpred21_InternalBuildDSL5859); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred21_InternalBuildDSL

    // $ANTLR start synpred23_InternalBuildDSL
    public final void synpred23_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2751:4: ( 'else' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2751:6: 'else'
        {
        match(input,56,FOLLOW_56_in_synpred23_InternalBuildDSL6642); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalBuildDSL

    // $ANTLR start synpred24_InternalBuildDSL
    public final void synpred24_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2805:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2805:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2805:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2805:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2805:6: ( ( ruleValidID ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2806:1: ( ruleValidID )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2806:1: ( ruleValidID )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2807:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalBuildDSL6784);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,58,FOLLOW_58_in_synpred24_InternalBuildDSL6790); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalBuildDSL

    // $ANTLR start synpred25_InternalBuildDSL
    public final void synpred25_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2851:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2851:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2851:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2851:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,27,FOLLOW_27_in_synpred25_InternalBuildDSL6866); if (state.failed) return ;
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2852:1: ( ( ruleValidID ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2853:1: ( ruleValidID )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2853:1: ( ruleValidID )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:2854:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalBuildDSL6873);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,58,FOLLOW_58_in_synpred25_InternalBuildDSL6879); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalBuildDSL

    // $ANTLR start synpred26_InternalBuildDSL
    public final void synpred26_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3435:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3435:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3435:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3435:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3435:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3436:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3436:1: ( ruleJvmTypeReference )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3437:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred26_InternalBuildDSL8144);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3439:2: ( ( ruleValidID ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3440:1: ( ruleValidID )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3440:1: ( ruleValidID )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3441:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred26_InternalBuildDSL8153);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred26_InternalBuildDSL

    // $ANTLR start synpred27_InternalBuildDSL
    public final void synpred27_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3739:4: ( ( '(' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3740:1: ( '(' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3740:1: ( '(' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3741:2: '('
        {
        match(input,27,FOLLOW_27_in_synpred27_InternalBuildDSL8715); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred27_InternalBuildDSL

    // $ANTLR start synpred28_InternalBuildDSL
    public final void synpred28_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3760:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3760:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3760:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3760:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3760:6: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3761:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3761:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt103=2;
        int LA103_0 = input.LA(1);

        if ( (LA103_0==RULE_ID||LA103_0==27||LA103_0==39) ) {
            alt103=1;
        }
        switch (alt103) {
            case 1 :
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3761:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3761:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3762:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3762:1: ( ruleJvmFormalParameter )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3763:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred28_InternalBuildDSL8767);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3765:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop102:
                do {
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==22) ) {
                        alt102=1;
                    }


                    switch (alt102) {
                	case 1 :
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3765:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred28_InternalBuildDSL8774); if (state.failed) return ;
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3766:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3767:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3767:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3768:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred28_InternalBuildDSL8781);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop102;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3770:6: ( ( '|' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3771:1: ( '|' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3771:1: ( '|' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3772:2: '|'
        {
        match(input,52,FOLLOW_52_in_synpred28_InternalBuildDSL8795); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred28_InternalBuildDSL

    // $ANTLR start synpred29_InternalBuildDSL
    public final void synpred29_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3839:4: ( ( () '[' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3839:5: ( () '[' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3839:5: ( () '[' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3839:6: () '['
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3839:6: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3840:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred29_InternalBuildDSL8915); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred29_InternalBuildDSL

    // $ANTLR start synpred30_InternalBuildDSL
    public final void synpred30_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3982:4: ( '<' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:3982:6: '<'
        {
        match(input,25,FOLLOW_25_in_synpred30_InternalBuildDSL9302); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalBuildDSL

    // $ANTLR start synpred31_InternalBuildDSL
    public final void synpred31_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4031:5: ( '(' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4031:7: '('
        {
        match(input,27,FOLLOW_27_in_synpred31_InternalBuildDSL9395); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalBuildDSL

    // $ANTLR start synpred32_InternalBuildDSL
    public final void synpred32_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4036:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4036:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4036:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4036:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4036:6: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4037:1: 
        {
        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4037:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt105=2;
        int LA105_0 = input.LA(1);

        if ( (LA105_0==RULE_ID||LA105_0==27||LA105_0==39) ) {
            alt105=1;
        }
        switch (alt105) {
            case 1 :
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4037:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4037:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4038:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4038:1: ( ruleJvmFormalParameter )
                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4039:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred32_InternalBuildDSL9425);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4041:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop104:
                do {
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==22) ) {
                        alt104=1;
                    }


                    switch (alt104) {
                	case 1 :
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4041:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,22,FOLLOW_22_in_synpred32_InternalBuildDSL9432); if (state.failed) return ;
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4042:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4043:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4043:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4044:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred32_InternalBuildDSL9439);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop104;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4046:6: ( ( '|' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4047:1: ( '|' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4047:1: ( '|' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4048:2: '|'
        {
        match(input,52,FOLLOW_52_in_synpred32_InternalBuildDSL9453); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred32_InternalBuildDSL

    // $ANTLR start synpred33_InternalBuildDSL
    public final void synpred33_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4115:4: ( ( () '[' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4115:5: ( () '[' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4115:5: ( () '[' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4115:6: () '['
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4115:6: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4116:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred33_InternalBuildDSL9573); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalBuildDSL

    // $ANTLR start synpred34_InternalBuildDSL
    public final void synpred34_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4437:2: ( ( ruleXExpression ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4438:1: ( ruleXExpression )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4438:1: ( ruleXExpression )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4439:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred34_InternalBuildDSL10375);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred34_InternalBuildDSL

    // $ANTLR start synpred35_InternalBuildDSL
    public final void synpred35_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4508:5: ( 'catch' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4508:7: 'catch'
        {
        match(input,79,FOLLOW_79_in_synpred35_InternalBuildDSL10520); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalBuildDSL

    // $ANTLR start synpred36_InternalBuildDSL
    public final void synpred36_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4527:5: ( 'finally' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4527:7: 'finally'
        {
        match(input,78,FOLLOW_78_in_synpred36_InternalBuildDSL10550); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalBuildDSL

    // $ANTLR start synpred38_InternalBuildDSL
    public final void synpred38_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4675:3: ( '.' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4676:2: '.'
        {
        match(input,16,FOLLOW_16_in_synpred38_InternalBuildDSL10897); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_InternalBuildDSL

    // $ANTLR start synpred39_InternalBuildDSL
    public final void synpred39_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4799:2: ( ( () '[' ']' ) )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4799:3: ( () '[' ']' )
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4799:3: ( () '[' ']' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4799:4: () '[' ']'
        {
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4799:4: ()
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4800:1: 
        {
        }

        match(input,51,FOLLOW_51_in_synpred39_InternalBuildDSL11280); if (state.failed) return ;
        match(input,53,FOLLOW_53_in_synpred39_InternalBuildDSL11284); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred39_InternalBuildDSL

    // $ANTLR start synpred40_InternalBuildDSL
    public final void synpred40_InternalBuildDSL_fragment() throws RecognitionException {   
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4953:4: ( '<' )
        // ../org.xtext.builddsl/src-gen/org/xtext/builddsl/parser/antlr/internal/InternalBuildDSL.g:4953:6: '<'
        {
        match(input,25,FOLLOW_25_in_synpred40_InternalBuildDSL11644); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalBuildDSL

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
    public final boolean synpred21_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalBuildDSL_fragment(); // can never throw exception
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
    public final boolean synpred40_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalBuildDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalBuildDSL_fragment(); // can never throw exception
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
    public final boolean synpred36_InternalBuildDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalBuildDSL_fragment(); // can never throw exception
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


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA92 dfa92 = new DFA92(this);
    static final String DFA16_eotS =
        "\104\uffff";
    static final String DFA16_eofS =
        "\1\2\103\uffff";
    static final String DFA16_minS =
        "\1\4\1\0\102\uffff";
    static final String DFA16_maxS =
        "\1\117\1\0\102\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA16_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA16_transitionS = {
            "\6\2\6\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\5\2\1\1\30"+
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
            return "685:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_18_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )? otherlv_23= ')' )?";
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
                        if ( (synpred4_InternalBuildDSL()) ) {s = 67;}

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
    static final String DFA15_eotS =
        "\36\uffff";
    static final String DFA15_eofS =
        "\36\uffff";
    static final String DFA15_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA15_maxS =
        "\1\115\2\0\33\uffff";
    static final String DFA15_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA15_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1\1\uffff\4\5\17\uffff\1\5\1\uffff\1\2\1\35\12\uffff\1\3"+
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
            return "706:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_19_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_20_0= ruleXExpression ) ) (otherlv_21= ',' ( (lv_memberCallArguments_22_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                         
                        int index15_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_0==RULE_ID) ) {s = 1;}

                        else if ( (LA15_0==27) ) {s = 2;}

                        else if ( (LA15_0==39) && (synpred5_InternalBuildDSL())) {s = 3;}

                        else if ( (LA15_0==52) && (synpred5_InternalBuildDSL())) {s = 4;}

                        else if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_DECIMAL)||LA15_0==25||(LA15_0>=43 && LA15_0<=44)||LA15_0==49||LA15_0==51||LA15_0==55||LA15_0==57||LA15_0==59||(LA15_0>=63 && LA15_0<=65)||LA15_0==68||(LA15_0>=70 && LA15_0<=77)) ) {s = 5;}

                        else if ( (LA15_0==28) ) {s = 29;}

                         
                        input.seek(index15_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalBuildDSL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalBuildDSL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index15_2);
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
    static final String DFA17_eotS =
        "\104\uffff";
    static final String DFA17_eofS =
        "\1\2\103\uffff";
    static final String DFA17_minS =
        "\1\4\1\0\102\uffff";
    static final String DFA17_maxS =
        "\1\117\1\0\102\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA17_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA17_transitionS = {
            "\6\2\6\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\35\2\1\1\1"+
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

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "785:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_24_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_1 = input.LA(1);

                         
                        int index17_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index17_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\13\uffff";
    static final String DFA27_eofS =
        "\1\1\12\uffff";
    static final String DFA27_minS =
        "\1\4\1\uffff\10\0\1\uffff";
    static final String DFA27_maxS =
        "\1\117\1\uffff\10\0\1\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA27_specialS =
        "\2\uffff\1\7\1\0\1\1\1\4\1\3\1\2\1\5\1\6\1\uffff}>";
    static final String[] DFA27_transitionS = {
            "\6\1\6\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\3\1\1\3\1\2"+
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
            return "()* loopback of 1549:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_3 = input.LA(1);

                         
                        int index27_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalBuildDSL()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_4 = input.LA(1);

                         
                        int index27_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalBuildDSL()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_7 = input.LA(1);

                         
                        int index27_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalBuildDSL()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA27_6 = input.LA(1);

                         
                        int index27_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalBuildDSL()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA27_5 = input.LA(1);

                         
                        int index27_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalBuildDSL()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA27_8 = input.LA(1);

                         
                        int index27_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalBuildDSL()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA27_9 = input.LA(1);

                         
                        int index27_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalBuildDSL()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA27_2 = input.LA(1);

                         
                        int index27_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalBuildDSL()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
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
    static final String DFA38_eotS =
        "\16\uffff";
    static final String DFA38_eofS =
        "\16\uffff";
    static final String DFA38_minS =
        "\1\4\15\uffff";
    static final String DFA38_maxS =
        "\1\115\15\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA38_specialS =
        "\16\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\4\1\uffff\4\5\17\uffff\1\4\1\uffff\1\15\27\uffff\1\5\3\uffff"+
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

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "2137:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA42_eotS =
        "\40\uffff";
    static final String DFA42_eofS =
        "\40\uffff";
    static final String DFA42_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA42_maxS =
        "\1\115\2\0\35\uffff";
    static final String DFA42_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA42_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\1\1\uffff\4\5\17\uffff\1\5\1\uffff\1\2\13\uffff\1\3\3\uffff"+
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

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "2381:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_0 = input.LA(1);

                         
                        int index42_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA42_0==RULE_ID) ) {s = 1;}

                        else if ( (LA42_0==27) ) {s = 2;}

                        else if ( (LA42_0==39) && (synpred21_InternalBuildDSL())) {s = 3;}

                        else if ( (LA42_0==52) && (synpred21_InternalBuildDSL())) {s = 4;}

                        else if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_DECIMAL)||LA42_0==25||(LA42_0>=43 && LA42_0<=44)||LA42_0==49||LA42_0==51||LA42_0==53||LA42_0==55||LA42_0==57||LA42_0==59||(LA42_0>=63 && LA42_0<=68)||(LA42_0>=70 && LA42_0<=77)) ) {s = 5;}

                         
                        input.seek(index42_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_1 = input.LA(1);

                         
                        int index42_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalBuildDSL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index42_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA42_2 = input.LA(1);

                         
                        int index42_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalBuildDSL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index42_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
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
        "\1\117\1\0\102\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA66_transitionS = {
            "\6\2\6\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\5\2\1\1\30"+
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
            return "3739:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred27_InternalBuildDSL()) ) {s = 67;}

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
        "\1\115\2\0\33\uffff";
    static final String DFA65_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA65_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA65_transitionS = {
            "\1\1\1\uffff\4\5\17\uffff\1\5\1\uffff\1\2\1\35\12\uffff\1\3"+
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
            return "3760:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
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

                        else if ( (LA65_0==27) ) {s = 2;}

                        else if ( (LA65_0==39) && (synpred28_InternalBuildDSL())) {s = 3;}

                        else if ( (LA65_0==52) && (synpred28_InternalBuildDSL())) {s = 4;}

                        else if ( ((LA65_0>=RULE_STRING && LA65_0<=RULE_DECIMAL)||LA65_0==25||(LA65_0>=43 && LA65_0<=44)||LA65_0==49||LA65_0==51||LA65_0==55||LA65_0==57||LA65_0==59||(LA65_0>=63 && LA65_0<=65)||LA65_0==68||(LA65_0>=70 && LA65_0<=77)) ) {s = 5;}

                        else if ( (LA65_0==28) ) {s = 29;}

                         
                        input.seek(index65_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalBuildDSL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA65_2 = input.LA(1);

                         
                        int index65_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalBuildDSL()) ) {s = 4;}

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
        "\104\uffff";
    static final String DFA67_eofS =
        "\1\2\103\uffff";
    static final String DFA67_minS =
        "\1\4\1\0\102\uffff";
    static final String DFA67_maxS =
        "\1\117\1\0\102\uffff";
    static final String DFA67_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA67_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA67_transitionS = {
            "\6\2\6\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\35\2\1\1\1"+
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
            return "3839:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred29_InternalBuildDSL()) ) {s = 67;}

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
    static final String DFA71_eotS =
        "\104\uffff";
    static final String DFA71_eofS =
        "\1\2\103\uffff";
    static final String DFA71_minS =
        "\1\4\1\0\102\uffff";
    static final String DFA71_maxS =
        "\1\117\1\0\102\uffff";
    static final String DFA71_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA71_transitionS = {
            "\6\2\6\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\3\2\1\1\32"+
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
            return "3982:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
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
                        if ( (synpred30_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index71_1);
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
    static final String DFA74_eotS =
        "\104\uffff";
    static final String DFA74_eofS =
        "\1\2\103\uffff";
    static final String DFA74_minS =
        "\1\4\1\0\102\uffff";
    static final String DFA74_maxS =
        "\1\117\1\0\102\uffff";
    static final String DFA74_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA74_transitionS = {
            "\6\2\6\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\5\2\1\1\30"+
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
            return "4031:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
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
                        if ( (synpred31_InternalBuildDSL()) ) {s = 67;}

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
    static final String DFA73_eotS =
        "\36\uffff";
    static final String DFA73_eofS =
        "\36\uffff";
    static final String DFA73_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA73_maxS =
        "\1\115\2\0\33\uffff";
    static final String DFA73_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA73_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\1\1\uffff\4\5\17\uffff\1\5\1\uffff\1\2\1\35\12\uffff\1\3"+
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
            return "4036:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_0 = input.LA(1);

                         
                        int index73_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA73_0==RULE_ID) ) {s = 1;}

                        else if ( (LA73_0==27) ) {s = 2;}

                        else if ( (LA73_0==39) && (synpred32_InternalBuildDSL())) {s = 3;}

                        else if ( (LA73_0==52) && (synpred32_InternalBuildDSL())) {s = 4;}

                        else if ( ((LA73_0>=RULE_STRING && LA73_0<=RULE_DECIMAL)||LA73_0==25||(LA73_0>=43 && LA73_0<=44)||LA73_0==49||LA73_0==51||LA73_0==55||LA73_0==57||LA73_0==59||(LA73_0>=63 && LA73_0<=65)||LA73_0==68||(LA73_0>=70 && LA73_0<=77)) ) {s = 5;}

                        else if ( (LA73_0==28) ) {s = 29;}

                         
                        input.seek(index73_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalBuildDSL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index73_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_2 = input.LA(1);

                         
                        int index73_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalBuildDSL()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index73_2);
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
    static final String DFA75_eotS =
        "\104\uffff";
    static final String DFA75_eofS =
        "\1\2\103\uffff";
    static final String DFA75_minS =
        "\1\4\1\0\102\uffff";
    static final String DFA75_maxS =
        "\1\117\1\0\102\uffff";
    static final String DFA75_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA75_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA75_transitionS = {
            "\6\2\6\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\35\2\1\1\1"+
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
            return "4115:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
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
                        if ( (synpred33_InternalBuildDSL()) ) {s = 67;}

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
    static final String DFA77_eotS =
        "\104\uffff";
    static final String DFA77_eofS =
        "\1\33\103\uffff";
    static final String DFA77_minS =
        "\1\4\32\0\51\uffff";
    static final String DFA77_maxS =
        "\1\117\32\0\51\uffff";
    static final String DFA77_acceptS =
        "\33\uffff\1\2\47\uffff\1\1";
    static final String DFA77_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\51\uffff}>";
    static final String[] DFA77_transitionS = {
            "\1\1\1\33\1\21\1\15\1\16\1\17\6\uffff\1\33\1\uffff\1\33\1\uffff"+
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
            return "4437:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
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
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA77_2 = input.LA(1);

                         
                        int index77_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA77_3 = input.LA(1);

                         
                        int index77_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA77_4 = input.LA(1);

                         
                        int index77_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA77_5 = input.LA(1);

                         
                        int index77_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA77_6 = input.LA(1);

                         
                        int index77_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA77_7 = input.LA(1);

                         
                        int index77_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA77_8 = input.LA(1);

                         
                        int index77_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA77_9 = input.LA(1);

                         
                        int index77_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA77_10 = input.LA(1);

                         
                        int index77_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA77_11 = input.LA(1);

                         
                        int index77_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA77_12 = input.LA(1);

                         
                        int index77_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA77_13 = input.LA(1);

                         
                        int index77_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA77_14 = input.LA(1);

                         
                        int index77_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA77_15 = input.LA(1);

                         
                        int index77_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA77_16 = input.LA(1);

                         
                        int index77_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA77_17 = input.LA(1);

                         
                        int index77_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA77_18 = input.LA(1);

                         
                        int index77_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA77_19 = input.LA(1);

                         
                        int index77_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA77_20 = input.LA(1);

                         
                        int index77_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA77_21 = input.LA(1);

                         
                        int index77_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA77_22 = input.LA(1);

                         
                        int index77_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA77_23 = input.LA(1);

                         
                        int index77_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA77_24 = input.LA(1);

                         
                        int index77_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA77_25 = input.LA(1);

                         
                        int index77_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA77_26 = input.LA(1);

                         
                        int index77_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalBuildDSL()) ) {s = 67;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index77_26);
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
        "\104\uffff";
    static final String DFA92_eofS =
        "\1\2\103\uffff";
    static final String DFA92_minS =
        "\1\4\1\0\102\uffff";
    static final String DFA92_maxS =
        "\1\117\1\0\102\uffff";
    static final String DFA92_acceptS =
        "\2\uffff\1\2\100\uffff\1\1";
    static final String DFA92_specialS =
        "\1\uffff\1\0\102\uffff}>";
    static final String[] DFA92_transitionS = {
            "\6\2\6\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff\3\2\1\1\32"+
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
            return "4953:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
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
                        if ( (synpred40_InternalBuildDSL()) ) {s = 67;}

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
 

    public static final BitSet FOLLOW_ruleBuildFile_in_entryRuleBuildFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuildFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleBuildFile123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBuildFile144 = new BitSet(new long[]{0x0000000000148002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_ruleBuildFile167 = new BitSet(new long[]{0x0000000000148002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleBuildFile189 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_ruleImportDeclaration_in_entryRuleImportDeclaration226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDeclaration236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImportDeclaration273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImportDeclaration294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedNameWithWildCard382 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedNameWithWildCard401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedNameWithWildCard416 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedNameWithWildCard437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_ruleDeclaration536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleDeclaration563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleParameter645 = new BitSet(new long[]{0x0000008008000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleParameter666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleParameter688 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleParameter701 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleParameter722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleTask807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleTask828 = new BitSet(new long[]{0x0800000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTask841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask861 = new BitSet(new long[]{0x0800000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTask874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask894 = new BitSet(new long[]{0x0800000000400000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleTask919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall1012 = new BitSet(new long[]{0x0000000001810022L});
    public static final BitSet FOLLOW_16_in_ruleXMemberFeatureCall1061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall1084 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall1100 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall1122 = new BitSet(new long[]{0x0000000001810022L});
    public static final BitSet FOLLOW_ruleNavigationLiteral_in_ruleXMemberFeatureCall1178 = new BitSet(new long[]{0x0000000001810022L});
    public static final BitSet FOLLOW_16_in_ruleXMemberFeatureCall1265 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_23_in_ruleXMemberFeatureCall1289 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_24_in_ruleXMemberFeatureCall1326 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_25_in_ruleXMemberFeatureCall1355 = new BitSet(new long[]{0x0000008008000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall1376 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_22_in_ruleXMemberFeatureCall1389 = new BitSet(new long[]{0x0000008008000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall1410 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_26_in_ruleXMemberFeatureCall1424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall1449 = new BitSet(new long[]{0x0008000009810022L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall1483 = new BitSet(new long[]{0x8A9A18801A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall1568 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall1596 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_22_in_ruleXMemberFeatureCall1609 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall1630 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall1647 = new BitSet(new long[]{0x0008000001810022L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall1682 = new BitSet(new long[]{0x0000000001810022L});
    public static final BitSet FOLLOW_ruleNavigationLiteral_in_entryRuleNavigationLiteral1722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNavigationLiteral1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FILE_in_ruleNavigationLiteral1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1982 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1998 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment2048 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment2101 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign2164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpSingleAssign2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign2252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpMultiAssign2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression2339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2396 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression2449 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression2472 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr2511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOr2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression2598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2655 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression2708 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression2731 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd2770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpAnd2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2914 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2967 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2990 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality3029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpEquality3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpEquality3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression3137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3194 = new BitSet(new long[]{0x0000001C06000002L});
    public static final BitSet FOLLOW_34_in_ruleXRelationalExpression3230 = new BitSet(new long[]{0x0000008008000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression3253 = new BitSet(new long[]{0x0000001C06000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression3314 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression3337 = new BitSet(new long[]{0x0000001C06000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare3377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpCompare3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpCompare3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression3523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3580 = new BitSet(new long[]{0x000007E006000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression3633 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression3656 = new BitSet(new long[]{0x000007E006000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther3695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpOther3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpOther3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpOther3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther3802 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOpOther3833 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOpOther3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpOther3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOther3889 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOpOther3920 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOpOther3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpOther3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpOther3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpOther3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpOther4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4110 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4163 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4186 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd4225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpAdd4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpAdd4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4390 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression4443 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression4466 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti4505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpMulti4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpMulti4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpMulti4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOpMulti4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation4651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation4719 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation4769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary4805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOpUnary4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpUnary4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpUnary4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression4932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression4989 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXCastedExpression5024 = new BitSet(new long[]{0x0000008008000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5047 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression5085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression5095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression5169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression5196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression5304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression5358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXClosure5812 = new BitSet(new long[]{0x8ABA18800A0003D0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5885 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXClosure5898 = new BitSet(new long[]{0x0000008008000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5919 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_52_in_ruleXClosure5941 = new BitSet(new long[]{0x8AAA18000A0003D0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5978 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleXClosure5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure6026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure6036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure6092 = new BitSet(new long[]{0x8ACA18000A0003D2L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_54_in_ruleXExpressionInClosure6105 = new BitSet(new long[]{0x8A8A18000A0003D2L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure6145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6263 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXShortClosure6276 = new BitSet(new long[]{0x0000008008000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure6297 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_52_in_ruleXShortClosure6319 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure6355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleXParenthesizedExpression6438 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6460 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXParenthesizedExpression6471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXIfExpression6563 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXIfExpression6575 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6596 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXIfExpression6608 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6629 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXIfExpression6650 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6766 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6809 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXSwitchExpression6821 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6845 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_27_in_ruleXSwitchExpression6889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6910 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXSwitchExpression6922 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6945 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXSwitchExpression6957 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleXSwitchExpression6971 = new BitSet(new long[]{0x4400008008000010L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6992 = new BitSet(new long[]{0x7400008008000010L});
    public static final BitSet FOLLOW_60_in_ruleXSwitchExpression7006 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXSwitchExpression7018 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7039 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleXSwitchExpression7053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart7089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart7099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart7145 = new BitSet(new long[]{0x4400000000000000L});
    public static final BitSet FOLLOW_62_in_ruleXCasePart7159 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7180 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXCasePart7194 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart7215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression7251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression7261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXForLoopExpression7307 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXForLoopExpression7319 = new BitSet(new long[]{0x0000008008000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression7340 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXForLoopExpression7352 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7373 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXForLoopExpression7385 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression7406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression7442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression7452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXWhileExpression7498 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXWhileExpression7510 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7531 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXWhileExpression7543 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXDoWhileExpression7656 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleXDoWhileExpression7689 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXDoWhileExpression7701 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7722 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXDoWhileExpression7734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXBlockExpression7826 = new BitSet(new long[]{0xAA8A18000A0003D0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7848 = new BitSet(new long[]{0xAACA18000A0003D0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_54_in_ruleXBlockExpression7861 = new BitSet(new long[]{0xAA8A18000A0003D0L,0x0000000000003FDFL});
    public static final BitSet FOLLOW_61_in_ruleXBlockExpression7877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXVariableDeclaration8095 = new BitSet(new long[]{0x0000008008000010L});
    public static final BitSet FOLLOW_67_in_ruleXVariableDeclaration8126 = new BitSet(new long[]{0x0000008008000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration8174 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8195 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration8224 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleXVariableDeclaration8238 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration8259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter8297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter8307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter8353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter8375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter8411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter8421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter8467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8591 = new BitSet(new long[]{0x0000000002000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_25_in_ruleXFeatureCall8605 = new BitSet(new long[]{0x0000008008000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8626 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_22_in_ruleXFeatureCall8639 = new BitSet(new long[]{0x0000008008000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8660 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_26_in_ruleXFeatureCall8674 = new BitSet(new long[]{0x0000000002000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8699 = new BitSet(new long[]{0x0008000008000002L});
    public static final BitSet FOLLOW_27_in_ruleXFeatureCall8733 = new BitSet(new long[]{0x8A9A18801A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8818 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8846 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_22_in_ruleXFeatureCall8859 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8880 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall8897 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper9028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleIdOrSuper9052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier9104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier9151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleStaticQualifier9169 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXConstructorCall9266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall9289 = new BitSet(new long[]{0x000800000A000002L});
    public static final BitSet FOLLOW_25_in_ruleXConstructorCall9310 = new BitSet(new long[]{0x0000008008000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9332 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_22_in_ruleXConstructorCall9345 = new BitSet(new long[]{0x0000008008000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall9366 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_26_in_ruleXConstructorCall9380 = new BitSet(new long[]{0x0008000008000002L});
    public static final BitSet FOLLOW_27_in_ruleXConstructorCall9403 = new BitSet(new long[]{0x8A9A18801A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9476 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9504 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_22_in_ruleXConstructorCall9517 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9538 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_28_in_ruleXConstructorCall9555 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXBooleanLiteral9684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXBooleanLiteral9708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXNullLiteral9814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral10012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral10063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXTypeLiteral10109 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXTypeLiteral10121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10144 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXTypeLiteral10156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXThrowExpression10248 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression10305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression10315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleXReturnExpression10361 = new BitSet(new long[]{0x8A8A18000A0003D2L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression10392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression10429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression10439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleXTryCatchFinallyExpression10485 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10506 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10536 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_78_in_ruleXTryCatchFinallyExpression10558 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleXTryCatchFinallyExpression10602 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleXCatchClause10716 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXCatchClause10729 = new BitSet(new long[]{0x0000008008000010L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10750 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXCatchClause10762 = new BitSet(new long[]{0x8A8A18000A0003D0L,0x0000000000003FD3L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10878 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedName10906 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10929 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber11038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11066 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11092 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleNumber11112 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber11128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber11154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference11217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11265 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleJvmTypeReference11303 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleJvmTypeReference11315 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleXFunctionTypeRef11430 = new BitSet(new long[]{0x0000008018000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11452 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_22_in_ruleXFunctionTypeRef11465 = new BitSet(new long[]{0x0000008008000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11486 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_28_in_ruleXFunctionTypeRef11502 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleXFunctionTypeRef11516 = new BitSet(new long[]{0x0000008008000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11631 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleJvmParameterizedTypeReference11652 = new BitSet(new long[]{0x0000008008000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11674 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_22_in_ruleJvmParameterizedTypeReference11687 = new BitSet(new long[]{0x0000008008000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11708 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_26_in_ruleJvmParameterizedTypeReference11722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleJvmWildcardTypeReference11935 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020010L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound12032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleJvmUpperBound12069 = new BitSet(new long[]{0x0000008008000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleJvmUpperBoundAnded12173 = new BitSet(new long[]{0x0000008008000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleJvmLowerBound12277 = new BitSet(new long[]{0x0000008008000010L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred1_InternalBuildDSL1029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred1_InternalBuildDSL1038 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred1_InternalBuildDSL1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNavigationLiteral_in_synpred2_InternalBuildDSL1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred3_InternalBuildDSL1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred3_InternalBuildDSL1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred3_InternalBuildDSL1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred4_InternalBuildDSL1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred5_InternalBuildDSL1517 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_22_in_synpred5_InternalBuildDSL1524 = new BitSet(new long[]{0x0000008008000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred5_InternalBuildDSL1531 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_52_in_synpred5_InternalBuildDSL1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred6_InternalBuildDSL1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred7_InternalBuildDSL2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred8_InternalBuildDSL2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred9_InternalBuildDSL2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred10_InternalBuildDSL2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_synpred11_InternalBuildDSL3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred12_InternalBuildDSL3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred13_InternalBuildDSL3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred14_InternalBuildDSL3817 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_synpred14_InternalBuildDSL3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred15_InternalBuildDSL3904 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_synpred15_InternalBuildDSL3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred16_InternalBuildDSL4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred17_InternalBuildDSL4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_synpred18_InternalBuildDSL5005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred19_InternalBuildDSL5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred21_InternalBuildDSL5831 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_22_in_synpred21_InternalBuildDSL5838 = new BitSet(new long[]{0x0000008008000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred21_InternalBuildDSL5845 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_52_in_synpred21_InternalBuildDSL5859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred23_InternalBuildDSL6642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalBuildDSL6784 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_synpred24_InternalBuildDSL6790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred25_InternalBuildDSL6866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalBuildDSL6873 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_synpred25_InternalBuildDSL6879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred26_InternalBuildDSL8144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred26_InternalBuildDSL8153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred27_InternalBuildDSL8715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred28_InternalBuildDSL8767 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_22_in_synpred28_InternalBuildDSL8774 = new BitSet(new long[]{0x0000008008000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred28_InternalBuildDSL8781 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_52_in_synpred28_InternalBuildDSL8795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred29_InternalBuildDSL8915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred30_InternalBuildDSL9302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred31_InternalBuildDSL9395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred32_InternalBuildDSL9425 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_22_in_synpred32_InternalBuildDSL9432 = new BitSet(new long[]{0x0000008008000010L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred32_InternalBuildDSL9439 = new BitSet(new long[]{0x0010000000400000L});
    public static final BitSet FOLLOW_52_in_synpred32_InternalBuildDSL9453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred33_InternalBuildDSL9573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred34_InternalBuildDSL10375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_synpred35_InternalBuildDSL10520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_synpred36_InternalBuildDSL10550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred38_InternalBuildDSL10897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred39_InternalBuildDSL11280 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_synpred39_InternalBuildDSL11284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred40_InternalBuildDSL11644 = new BitSet(new long[]{0x0000000000000002L});

}